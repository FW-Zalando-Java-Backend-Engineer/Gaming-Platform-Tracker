package com.gamerverse.model;

public class Game {
    public String title;
    private String genre;
    protected double rating;

    static int totalGames = 0;

    public Game() {
        this.title = "Untitled";
        this.genre = "Unknown";
        this.rating = 0.0;
        totalGames++;
    }

    public Game(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        totalGames++;
    }

    public String getGenre() {
        return genre;
    }

    public void printInfo() {
        System.out.println("Game: " + title + ", Genre: " + genre + ", Rating: " + rating);
    }

    public static void printTotalGames() {
        System.out.println("Total games registered: " + totalGames);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Game " + title + " has been removed from memory.");
    }
}

