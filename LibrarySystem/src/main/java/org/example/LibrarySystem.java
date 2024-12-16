package org.example;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    private String name;
    private String location;
    private List<Item> collection; // List of items in the library (e.g., books, DVDs, CDs)
    private List<Member> members; // List of library members
    private List<Librarian> librarians; // List of librarians

    // Constructor
    public LibrarySystem(String name, String location) {
        this.name = name;
        this.location = location;
        this.collection = new ArrayList<>();
        this.members = new ArrayList<>();
        this.librarians = new ArrayList<>();
    }

    // Add a new member to the library
    public void addMember(Member member) {
        members.add(member);
    }

    // Remove a member from the library by their member ID
    public void removeMember(String memberId) {
        members.removeIf(member -> member.getMemberId().equals(memberId));
    }

    // Add a new item to the library collection
    public void addItem(Item item) {
        collection.add(item);
    }

    // Remove an item from the library collection by its item ID
    public void removeItem(String itemId) {
        collection.removeIf(item -> item.getItemId().equals(itemId));
    }

    // Return a string representation of the library system
    @Override
    public String toString() {
        return "LibrarySystem(Name: " + name + ", Location: " + location + ", " +
                "Total Items: " + collection.size() + ", Total Members: " + members.size() + ")";
    }
}
