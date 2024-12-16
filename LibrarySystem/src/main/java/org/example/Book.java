package org.example;

public class Book extends Item {
    private String ISBN;
    private String genre;

    // Constructor
    public Book(String itemId, String title, String author, String format, String ISBN, String genre) {
        super(itemId, title, author, format);
        this.ISBN = ISBN;
        this.genre = genre;
    }

    // Getters
    public String getISBN() {
        return ISBN;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", ISBN: " + ISBN + ", Genre: " + genre;
    }

    @Override
    public String toString() {
        return getDetails();
    }
}

