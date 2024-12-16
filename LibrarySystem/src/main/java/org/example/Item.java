package org.example;

public class Item {
    private String itemId;
    private String title;
    private String author;
    private String format;

    // Constructor
    public Item(String itemId, String title, String author, String format) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.format = format;
    }

    // Check availability (placeholder logic for demonstration)
    public boolean checkAvailability() {
        // Logic to check if the item is available
        return true;
    }

    // Get details of the item
    public String getDetails() {
        return "Item(ID: " + itemId + ", Title: " + title + ", Author: " + author + ", Format: " + format + ")";
    }

    // Getters
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return getDetails();
    }
}
