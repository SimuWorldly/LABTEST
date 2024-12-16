package org.example;

public class CD extends Item {
    private String artist;
    private int tracks; // Number of tracks on the CD

    // Constructor
    public CD(String itemId, String title, String author, String format, String artist, int tracks) {
        super(itemId, title, author, format);
        this.artist = artist;
        this.tracks = tracks;
    }

    // Getters
    public String getArtist() {
        return artist;
    }

    public int getTracks() {
        return tracks;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Artist: " + artist + ", Tracks: " + tracks;
    }

    @Override
    public String toString() {
        return getDetails();
    }
}

