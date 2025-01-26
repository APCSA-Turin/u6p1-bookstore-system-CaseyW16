package com.example.project;

public class IdGenerate {
    private static String currentId = "99";

    // Empty constructor; IdGenerate is a static class, so there is no need
    // to initialize objects of it.
    public IdGenerate() { }

    // Gets the current ID of the IdGenerate class
    public static String getCurrentId() {
        return currentId;
    }

    // Sets the current ID of the IdGenerate class to "99" 
    public static void reset() {
        currentId = "99";
    }

    // Increments the current ID of the IdGenerate class by one, while remaining a String.
    public static void generateID() {
        currentId = Integer.toString(Integer.parseInt(currentId) + 1);
    }
}