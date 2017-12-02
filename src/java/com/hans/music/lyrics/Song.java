package com.hans.music.lyrics;

/**
 *
 */
public class Song {

    private static final int MAX_DURATION = 400;

    private final String title;
    private final long duration;
    private final String lyrics;

    public Song(String title, long duration, String lyrics) {
        this.title = title;
        this.duration = duration;
        this.lyrics = lyrics;
    }

    public long getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    public String getLyrics() {
        return lyrics;
    }

    public String toDisplay() {
        return getTitle() + ": " + getDuration() + "s : " + getLyrics();
    }

    public static void main(String[] args) {
        Song mySong = new Song("Hans' breaking heart", 60, "Oh my breaking heart");
//        Song mySong = new Song("Hans' breaking heart", 60, "Oh my breaking heart");

        System.out.println(mySong.toDisplay());
    }
}
