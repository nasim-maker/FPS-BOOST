package com.example.examplemod.bot;

public class TrainingBot {

    private String name = "TrainingBot";
    private int health = 20;
    private boolean spawned = false;

    public void spawn() {
        spawned = true;
        System.out.println(name + " spawned!");
    }

    public void attack() {
        System.out.println(name + " attacks!");
    }

    public void useShield() {
        System.out.println(name + " blocks!");
    }

    public void useMace() {
        System.out.println(name + " uses Mace!");
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public boolean isSpawned() {
        return spawned;
    }
}
