package org.example;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String memberId;
    private String name;
    private String address;
    private List<Item> borrowedItems; // List of items borrowed by the member

    // Constructor
    public Member(String memberId, String name, String address) {
        this.memberId = memberId;
        this.name = name;
        this.address = address;
        this.borrowedItems = new ArrayList<>();
    }

    // Borrow an item
    public void borrowItem(Item item) {
        borrowedItems.add(item);
    }

    // Return an item
    public void returnItem(String itemId) {
        borrowedItems.removeIf(item -> item.getItemId().equals(itemId));
    }

    // Getters
    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Item> getBorrowedItems() {
        return borrowedItems;
    }

    @Override
    public String toString() {
        return "Member(ID: " + memberId + ", Name: " + name + ", Address: " + address + ", " +
                "Borrowed Items: " + borrowedItems.size() + ")";
    }
}

