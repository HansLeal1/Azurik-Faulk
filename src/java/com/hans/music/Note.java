package com.hans.music;

/**
 *
 */
public class Note {

    private final String letter;
    private final boolean flat;
    private final boolean sharp;

    private Note(String letter, boolean flat, boolean sharp) {
        this.letter = letter;
        this.flat = flat;
        this.sharp = sharp;
    }

    public static Note create(String letter) {
        return new Note(letter, false, false);
    }

    public static Note createFlat(String letter) {
        return new Note(letter, true, false);
    }

    public static Note createSharp(String letter) {
        return new Note(letter, false, true);
    }

    public String getLetter() {
        return letter;
    }

    public boolean isFlat() {
        return flat;
    }

    public boolean isSharp() {
        return sharp;
    }

    public String toDisplay() {
        String ctx = isFlat() ? "b" : isSharp() ? "#" : "";

        return getLetter() + ctx;
    }

    public int getStringIndex() {
        switch (getLetter()) {
            case "C":
                if (isFlat()) {
                    return 0;
                } else if (isSharp()) {
                    return 4;
                } else {
                    return 0;
                }

            case "D":
                if (isFlat()) {
                    return 1;
                } else if (isSharp()) {
                    return 1;
                } else {
                    return 1;
                }
            case "E":
                if (isFlat()) {
                    return 2;
                } else if (isSharp()) {
                    return 3;
                } else {
                    return 2;
                }
            case "G":
                if (isFlat()) {
                    return 2;
                } else if (isSharp()) {
                    return 3;
                } else {
                    return 3;
                }
            case "F":
                if (isFlat()) {
                    return 4;
                } else if (isSharp()) {
                    return 0;
                } else {
                    return 4;
                }
            default:
                return -1;
        }
    }
}
