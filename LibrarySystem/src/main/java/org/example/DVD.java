package org.example;

public class DVD extends Item {
    private String director;
    private int duration; // Duration in minutes

    // Constructor
    public DVD(String itemId, String title, String author, String format, String director, int duration) {
        super(itemId, title, author, format);
        this.director = director;
        this.duration = duration;
    }

    // Getters
    public String getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Director: " + director + ", Duration: " + duration + " minutes";
    }

    @Override
    public String toString() {
        return getDetails();
    }
}
