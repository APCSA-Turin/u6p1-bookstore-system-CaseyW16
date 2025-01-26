package com.example.project;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;
    private int quantity;

    // Initializes the book object with specified values
    public Book(String title, String author, int yearPublished, String isbn, int quantity) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.quantity = quantity;
    }

    // Returns the title of the book
    public String getTitle() {
        return this.title;
    }

    // Sets the title of the book to a specified String
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    // Gets the author of the book
    public String getAuthor() {
        return this.author;
    }

    // Sets the author of the book to a specified String
    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    // Gets the year the book was published
    public int getYearPublished() {
        return this.yearPublished;
    }

    // Sets the year the book was published to a specified int
    public void setYearPublished(int newYearPublished) {
        this.yearPublished = newYearPublished;
    }

    // Gets the ISBN of the book
    public String getIsbn() {
        return this.isbn;
    }

    // Sets the ISBN of the book to a specified String
    public void setIsbn(String newIsbn) {
        this.isbn = newIsbn;
    }

    // Gets the quantity of the book
    public int getQuantity() {
        return this.quantity;
    }

    // Sets the quantity of the book to a specified int
    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    // Returns a string containing info about the book, including
    // its title, author, year, ISBN, and the quantity held.
    public String bookInfo() {
        String info = new String();
        info += "Title: " + this.title + ", ";
        info += "Author: " + this.author + ", ";
        info += "Year: " + this.yearPublished + ", ";
        info += "ISBN: " + this.isbn + ", ";
        info += "Quantity: " + this.quantity;
        return info;
    } 
}