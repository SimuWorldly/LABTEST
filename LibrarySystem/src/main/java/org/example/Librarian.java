package org.example;

public class Librarian {
    private String librarianId;
    private String name;
    private String department;

    // Constructor
    public Librarian(String librarianId, String name, String department) {
        this.librarianId = librarianId;
        this.name = name;
        this.department = department;
    }

    // Issue an item to a member
    public void issueItem(Item item, Member member) {
        member.borrowItem(item);
    }

    // Renew an item for a member
    public void renewItem(Item item) {
        // Placeholder for renew logic
        System.out.println("Item renewed: " + item.getDetails());
    }

    // Getters
    public String getLibrarianId() {
        return librarianId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Librarian(ID: " + librarianId + ", Name: " + name + ", Department: " + department + ")";
    }
}
