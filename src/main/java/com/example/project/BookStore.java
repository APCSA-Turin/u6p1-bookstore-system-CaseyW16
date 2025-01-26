package com.example.project;

public class BookStore {
    private Book[] books;
    private User[] users = new User[10];

    public BookStore() {}

    // Returns the array of Users in the bookstore
    public User[] getUsers() {
        return users;
    }

    // Sets the array of Users in the bookstore
    public void setUsers(User[] newUsers) {
        this.users = newUsers;
    }

    // Returns the array of Books in the bookstore
    public Book[] getBooks() {
        return books;
    }

    // Adds a User to the users array, filling the first null slot available
    public void addUser(User user) {
        for (int i = 0; i < users.length; i++) {
            // If there is an empty space, assign that space to the user
            if (users[i] == null) {
                users[i] = user;
                return;
            }
        }
    }

    // Removes the specified User from the users array, consolidating afterwards
    public void removeUser(User user) {
        for (int i = 0; i < users.length; i++) {
            // If there is a match between a given user and the specified one, 
            // set that index to null.
            if (users[i] == user) {
                users[i] = null;
                break;
            }
        }
        // Consolidate the array to remove any null spaces between users.
        consolidateUsers();
    }

    // Consolidates the users array by shifting users to the front
    // of the array as necessary, so that there are no null spaces between users
    public void consolidateUsers() {
        User[] organized = new User[users.length];
        int found = 0;
        for (int i = 0; i < users.length; i++) {
            // If this space in the users array is occupied, add it to the next
            // available space in the new array
            if (users[i] != null) {
                organized[found] = users[i];
                found++;
            }
        }
        // Sets the users array to the new array
        users = organized;
    }

    // Adds a Book to the end of the books array, extending its size dynamically 
    public void addBook(Book book) {
        // If the existing books array is null, its length should be treated as 0
        int newLength = 1;
        if (this.books != null) {
            newLength = books.length + 1;
        }
        // Create a new array in order to increase the size dynamically
        Book[] newBooks = new Book[newLength];
        for (int i = 0; i < newLength - 1; i++) {
            // Add each item from the existing book array to the new book array
            newBooks[i] = books[i];
        }
        // Set the last item of the new book array to the specified book to add
        newBooks[newLength - 1] = book;
        // Replace the old book array with the new one
        books = newBooks;
    }

    // Inserts a Book into the books array at a specified index
    public void insertBook(Book book, int index) {
        // If the existing books array is null, it can simply be replaced by a
        // new array containing [book].
        if (this.books == null) {
            books = new Book[1];
            books[0] = book;
            return;
        }
        // Create a new array in order to increase the size dynamically
        Book[] newBooks = new Book[books.length + 1];
        // From 0 to the specified index, the new books array should match the existing array
        for (int i = 0; i < index; i++) {
            newBooks[i] = books[i];
        }
        // At the specified index, that value is set to the book being inserted
        newBooks[index] = book;
        // The rest of the new array should match the rest of the old array,
        // however the indices of the new array must be shifted by one in order
        // to account for the new book
        for (int i = index; i < books.length; i++) {
            newBooks[i + 1] = books[i];
        }
        // Replace the old book array with the new one 
        books = newBooks;
    }

    // Removes a specified book from the books array, decreasing its quantity by one.
    // If its quantity reaches zero, it is removed from
    // the array and the array is consolidated appropriately.
    public void removeBook(Book book) {
        // Decrease the Book's quantity by one.
        book.setQuantity(book.getQuantity() - 1);
        if (book.getQuantity() == 0) {
            // If the book's quantity reaches zero, it must be removed from the 
            // array and the array must be consolidated and trimmed down so that
            // no null values remain.
            for (int i = 0; i < books.length - 1; i++) {
                // Replaces any null spaces or books with 0 quantity with the next book,
                // effectively shifting it down
                if (books[i] == null) {
                    books[i] = books[i + 1];
                    books[i + 1] = null;
                    continue;
                }
                if (books[i].getQuantity() == 0) {
                    books[i] = books[i + 1];
                    books[i + 1] = null;
                    continue;
                }
            }
            // A new array is created with the size decreased by one, and filled with
            // the values of the old array
            Book[] newBooks = new Book[books.length - 1];
            for (int i = 0; i < newBooks.length; i++) {
                newBooks[i] = books[i]; 
            }
            // The old books array is replaced with the new array
            books = newBooks;
        }
    }
}