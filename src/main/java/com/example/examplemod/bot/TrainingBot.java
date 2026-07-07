package com.example.examplemod.bot;

public class TrainingBot {

    private String name = "TrainingBot";
    private int health = 20;
    private int maxHealth = 20;
    private int attackDamage = 1;

    private boolean hasMace = false;
    private boolean hasShield = false;
    private boolean hasElytra = false;
    private boolean sprinting = false;
    private boolean sneaking = false;
    private boolean blocking = false;
    private boolean spawned = false;

    public TrainingBot() {
    }

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

    public void equipMace() {
        hasMace = true;
    }

    public void equipShield() {
        hasShield = true;
    }

    public void equipElytra() {
        hasElytra = true;
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
