package uk.co.placona.marioplayer;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;

import com.google.android.things.contrib.driver.pwmspeaker.Speaker;
import com.google.android.things.pio.Gpio;
import com.google.android.things.pio.GpioCallback;
import com.google.android.things.pio.PeripheralManagerService;

import java.io.IOException;

public class MainActivity extends Activity {

    private static final long PLAYBACK_NOTE_DELAY = 100L;

    private Speaker mSpeaker;
    private Gpio mButtonGpio;

    private HandlerThread mHandlerThread;
    private Handler mHandler;
    private static final String TAG = MainActivity.class.getSimpleName();
    private static final String GPIO_PIN_NAME = "PWM1";
    private static final String BUTTON_PIN_NAME = "BCM21";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PeripheralManagerService service = new PeripheralManagerService();

        try {
            // Initialise button
            mButtonGpio = service.openGpio(BUTTON_PIN_NAME);
            mButtonGpio.setDirection(Gpio.DIRECTION_IN);
            mButtonGpio.setEdgeTriggerType(Gpio.EDGE_FALLING);
            mButtonGpio.registerGpioCallback(new GpioCallback() {
                @Override
                public boolean onGpioEdge(Gpio gpio) {
                    Log.i(TAG, "GPIO changed, button pressed");
                    // Return true to continue listening to events
                    return true;
                }
            });

            // Initialise speaker
            mSpeaker = new Speaker(GPIO_PIN_NAME);
            mSpeaker.stop(); // in case the PWM pin was enabled already
        } catch (IOException e) {
            Log.e(TAG, "onCreate: ", e);
        }

        mHandlerThread = new HandlerThread("pwm-playback");
        mHandlerThread.start();
        mHandler = new Handler(mHandlerThread.getLooper());
        mHandler.post(mPlaybackRunnable);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        // Remove button callbacks
        if (mButtonGpio != null) {
            // Close the Gpio pin
            Log.i(TAG, "Closing Button GPIO pin");
            try {
                mButtonGpio.close();
            } catch (IOException e) {
                Log.e(TAG, "Error on PeripheralIO API", e);
            } finally {
                mButtonGpio = null;
            }
        }


        // Remove speaker callbacks
        if (mHandler != null) {
            mHandler.removeCallbacks(mPlaybackRunnable);
            mHandlerThread.quitSafely();
        }
        if (mSpeaker != null) {
            try {
                mSpeaker.stop();
                mSpeaker.close();
            } catch (IOException e) {
                Log.e(TAG, "Error closing speaker", e);
            } finally {
                mSpeaker = null;
            }
        }
    }

    private Runnable mPlaybackRunnable = new Runnable() {

        private int index = 0;

        @Override
        public void run() {
            if (mSpeaker == null) {
                return;
            }

            try {
                if (index == MusicNotes.UNDERWORLD_THEME.length) {
                    // reached the end
                    mSpeaker.stop();
                } else {
                    double note = MusicNotes.UNDERWORLD_THEME[index++];
                    if (note > 0) {
                        mSpeaker.play(note);
                    } else {
                        mSpeaker.stop();
                    }
                    mHandler.postDelayed(this, PLAYBACK_NOTE_DELAY);
                }
            } catch (IOException e) {
                Log.e(TAG, "Error playing speaker", e);
            }
        }
    };
}
