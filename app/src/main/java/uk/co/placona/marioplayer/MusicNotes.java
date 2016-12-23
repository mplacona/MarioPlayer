package uk.co.placona.marioplayer;

/**
 * Copyright (C) 2016 mplacona.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

class MusicNotes {
    static final double NOTE_B0 = 31;
    static final double NOTE_C1 = 33;
    static final double NOTE_CS1 = 35;
    static final double NOTE_D1 = 37;
    static final double NOTE_DS1 = 39;
    static final double NOTE_E1 = 41;
    static final double NOTE_F1 = 44;
    static final double NOTE_FS1 = 46;
    static final double NOTE_G1 = 49;
    static final double NOTE_GS1 = 52;
    static final double NOTE_A1 = 55;
    static final double NOTE_AS1 = 58;
    static final double NOTE_B1 = 62;
    static final double NOTE_C2 = 65;
    static final double NOTE_CS2 = 69;
    static final double NOTE_D2 = 73;
    static final double NOTE_DS2 = 78;
    static final double NOTE_E2 = 82;
    static final double NOTE_F2 = 87;
    static final double NOTE_FS2 = 93;
    static final double NOTE_G2 = 98;
    static final double NOTE_GS2 = 104;
    static final double NOTE_A2 = 110;
    static final double NOTE_AS2 = 117;
    static final double NOTE_B2 = 123;
    static final double NOTE_C3 = 131;
    static final double NOTE_CS3 = 139;
    static final double NOTE_D3 = 147;
    static final double NOTE_DS3 = 156;
    static final double NOTE_E3 = 165;
    static final double NOTE_F3 = 175;
    static final double NOTE_FS3 = 185;
    static final double NOTE_G3 = 196;
    static final double NOTE_GS3 = 208;
    static final double NOTE_A3 = 220;
    static final double NOTE_AS3 = 233;
    static final double NOTE_B3 = 247;
    static final double NOTE_C4 = 262;
    static final double NOTE_CS4 = 277;
    static final double NOTE_D4 = 294;
    static final double NOTE_DS4 = 311;
    static final double NOTE_E4 = 330;
    static final double NOTE_F4 = 349;
    static final double NOTE_FS4 = 370;
    static final double NOTE_G4 = 392;
    static final double NOTE_GS4 = 415;
    static final double NOTE_A4 = 440;
    static final double NOTE_AS4 = 466;
    static final double NOTE_B4 = 494;
    static final double NOTE_C5 = 523;
    static final double NOTE_CS5 = 554;
    static final double NOTE_D5 = 587;
    static final double NOTE_DS5 = 622;
    static final double NOTE_E5 = 659;
    static final double NOTE_F5 = 698;
    static final double NOTE_FS5 = 740;
    static final double NOTE_G5 = 784;
    static final double NOTE_GS5 = 831;
    static final double NOTE_A5 = 880;
    static final double NOTE_AS5 = 932;
    static final double NOTE_B5 = 988;
    static final double NOTE_C6 = 1047;
    static final double NOTE_CS6 = 1109;
    static final double NOTE_D6 = 1175;
    static final double NOTE_DS6 = 1245;
    static final double NOTE_E6 = 1319;
    static final double NOTE_F6 = 1397;
    static final double NOTE_FS6 = 1480;
    static final double NOTE_G6 = 1568;
    static final double NOTE_GS6 = 1661;
    static final double NOTE_A6 = 1760;
    static final double NOTE_AS6 = 1865;
    static final double NOTE_B6 = 1976;
    static final double NOTE_C7 = 2093;
    static final double NOTE_CS7 = 2217;
    static final double NOTE_D7 = 2349;
    static final double NOTE_DS7 = 2489;
    static final double NOTE_E7 = 2637;
    static final double NOTE_F7 = 2794;
    static final double NOTE_FS7 = 2960;
    static final double NOTE_G7 = 3136;
    static final double NOTE_GS7 = 3322;
    static final double NOTE_A7 = 3520;
    static final double NOTE_AS7 = 3729;
    static final double NOTE_B7 = 3951;
    static final double NOTE_C8 = 4186;
    static final double NOTE_CS8 = 4435;
    static final double NOTE_D8 = 4699;
    static final double NOTE_DS8 = 4978;



    // MAIN THEME
    static final double[] MARIO_MAIN_THEME = {
            NOTE_E7, NOTE_E7, 0, NOTE_E7,
            0, NOTE_C7, NOTE_E7, 0,
            NOTE_G7, 0, 0,  0,
            NOTE_G6, 0, 0, 0,

            NOTE_C7, 0, 0, NOTE_G6,
            0, 0, NOTE_E6, 0,
            0, NOTE_A6, 0, NOTE_B6,
            0, NOTE_AS6, NOTE_A6, 0,

            NOTE_G6, NOTE_E7, NOTE_G7,
            NOTE_A7, 0, NOTE_F7, NOTE_G7,
            0, NOTE_E7, 0, NOTE_C7,
            NOTE_D7, NOTE_B6, 0, 0,

            NOTE_C7, 0, 0, NOTE_G6,
            0, 0, NOTE_E6, 0,
            0, NOTE_A6, 0, NOTE_B6,
            0, NOTE_AS6, NOTE_A6, 0,

            NOTE_G6, NOTE_E7, NOTE_G7,
            NOTE_A7, 0, NOTE_F7, NOTE_G7,
            0, NOTE_E7, 0, NOTE_C7,
            NOTE_D7, NOTE_B6, 0, 0
    };

    // UNDERWORLD THEME
    static final double[] UNDERWORLD_THEME = {
            NOTE_C4, NOTE_C5, NOTE_A3, NOTE_A4,
            NOTE_AS3, NOTE_AS4, 0,
            0,
            NOTE_C4, NOTE_C5, NOTE_A3, NOTE_A4,
            NOTE_AS3, NOTE_AS4, 0,
            0,
            NOTE_F3, NOTE_F4, NOTE_D3, NOTE_D4,
            NOTE_DS3, NOTE_DS4, 0,
            0,
            NOTE_F3, NOTE_F4, NOTE_D3, NOTE_D4,
            NOTE_DS3, NOTE_DS4, 0,
            0, NOTE_DS4, NOTE_CS4, NOTE_D4,
            NOTE_CS4, NOTE_DS4,
            NOTE_DS4, NOTE_GS3,
            NOTE_G3, NOTE_CS4,
            NOTE_C4, NOTE_FS4, NOTE_F4, NOTE_E3, NOTE_AS4, NOTE_A4,
            NOTE_GS4, NOTE_DS4, NOTE_B3,
            NOTE_AS3, NOTE_A3, NOTE_GS3,
            0, 0, 0
    };

    private MusicNotes() {
        //no instance
    }
}
