package com.hans.music;

import java.util.Random;

/**
 *
 *
 */
public class MusicMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String[] notes = new String[5];
        notes[0] = "G";
        notes[1] = "D";
        notes[2] = "E";
        notes[3] = "F";
        notes[4] = "C";

        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int randomNote = rand.nextInt(6);

            MusicRow row = null;
            if (randomNote > 4) {
                row = new MusicRow();
            } else {
                String noteLetter = notes[randomNote];

                Note note = null;
                int noteType = rand.nextInt(4);

                // TODO: better distribution, too mant flats/sharps here
                switch (noteType) {
                    case 0:
                        note = Note.create(noteLetter);
                        break;
                    case 1:
                        note = Note.createFlat(noteLetter);
                        break;
                    case 2:
                        note = Note.createSharp(noteLetter);
                        break;
                }

                row = new MusicRow(note);
            }

            row.printRow();
        }
    }

}
