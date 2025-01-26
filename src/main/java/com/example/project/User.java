package com.example.project;

public class User {
    private String name;
    private String id;
    private Book[] books = new Book[5];

    public User(String name, String id) {
        this.name = name;
        this.id = id;
    }
 
    // Returns the name of the user
    public String getName() {
        return this.name;
    }

    // Sets the name of the user to a specified String
    public void setName(String newName) {
        this.name = newName;
    }

    // Returns the ID of the user
    public String getId() {
        return this.id;
    }

    // Sets the ID of the user to a specified String
    public void setId(String newId) {
        this.id = newId;
    }

    // Returns the books held by this user
    public Book[] getBooks() {
        return this.books;
    }

    // Sets the books held by this user to a new array of books
    public void setBooks(Book[] newBooks) {
        this.books = newBooks;
    }

    // Returns a String containing info about each of the books held
    // by the user. Any empty spaces with no book are marked as "empty"
    public String bookListInfo() {
        String info = "Books: \n";
        for (Book book : books) {
            if (book == null) { 
                info += "empty\n";
                continue;
            }
            info += book.bookInfo() + "\n";
        }
        return info;
    }

    // Returns a String containing information about the user, including
    // name, ID, and information about the books held.
    public String userInfo() {
        return "Name: " + this.name + "\nId: " + this.id + "\n" + this.bookListInfo();
    }
}