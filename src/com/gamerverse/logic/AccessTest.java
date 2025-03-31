package com.gamerverse.logic;

import com.gamerverse.model.Gamer;

public class AccessTest {
    public static void main(String[] args) {
        // TODO Task 2: Access modifiers test
        Gamer gamer = new Gamer("TestUser", 18, "test@game.com");

        // ✅ public - accessible
        System.out.println("Username: " + gamer.username);

        // ❌ private - not accessible directly
        // System.out.println("Age: " + gamer.age);

        // ✅ using getter
        System.out.println("Age via getter: " + gamer.getAge());

        // ❌ protected - not accessible here
        // System.out.println("Email: " + gamer.email);
    }
}

