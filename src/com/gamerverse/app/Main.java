package com.gamerverse.app;

import com.gamerverse.model.Gamer;
import com.gamerverse.model.Game;

public class Main {
    public static void main(String[] args) {
        // TODO Task 1: Object creation using constructors
        Gamer g1 = new Gamer("PixelMaster", 21, "pixel@play.com");
        Gamer g2 = new Gamer();

        Game game1 = new Game("Cyber Clash", "Action", 4.8);
        Game game2 = new Game();

        // TODO Task 4: Method overloading
        g1.printProfile();
        g2.printProfile(true);

        game1.printInfo();
        game2.printInfo();

        // TODO Task 6: Call static methods
        Gamer.printTotalGamers();
        Game.printTotalGames();

        // TODO Task 7: Trigger finalize() by removing references
        g1 = null;
        game1 = null;

        System.gc(); // Suggest JVM to run garbage collection

        try {
            Thread.sleep(1000); // Let GC possibly run
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main method done.");
    }
}

