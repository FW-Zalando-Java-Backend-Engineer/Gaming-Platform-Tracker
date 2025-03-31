package com.gamerverse.model;

public class Gamer {
    // TODO Task 2: Use access modifiers
    public String username;
    private int age;
    protected String email;

    // TODO Task 6: Static field to track total gamers
    static int totalGamers = 0;

    // TODO Task 3: Default constructor
    public Gamer() {
        this.username = "Anonymous";
        this.age = 0;
        this.email = "unknown@example.com";
        totalGamers++;
    }

    // TODO Task 3: Parameterized constructor
    public Gamer(String username, int age, String email) {
        this.username = username;
        this.age = age;
        this.email = email;
        totalGamers++;
    }

    // TODO Task 5: Getter for private field
    public int getAge() {
        return age;
    }

    // TODO Task 4: Method overloading
    public void printProfile() {
        System.out.println("Username: " + username + ", Age: " + age);
    }

    public void printProfile(boolean showEmail) {
        if (showEmail) {
            System.out.println("Username: " + username + ", Age: " + age + ", Email: " + email);
        } else {
            printProfile();
        }
    }

    // TODO Task 6: Static method
    public static void printTotalGamers() {
        System.out.println("Total registered gamers: " + totalGamers);
    }

    // TODO Task 7: Finalize
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Gamer " + username + " has been removed from memory.");
    }
}

