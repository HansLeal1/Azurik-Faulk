package com.hans.music;

/**
 *
 */
public class MusicRow {

    private static final String MUSIC_ROW = "%4s %4s %4s %4s %4s";

    private final Note note;

    public MusicRow(Note note) {
        this.note = note;
    }

    public MusicRow() {
        this(null);
    }

    public Note getNote() {
        return note;
    }

    public void printRow() {

        Object[] args = new Object[5];

        for (int i = 0; i < 5; i++) {
            args[i] = "|";
        }

        if (getNote() != null) {
            int idx = getNote().getStringIndex();
            args[idx] = getNote().toDisplay();
        }

        String row = String.format(MUSIC_ROW, args);

        System.out.println(row);
    }
}
