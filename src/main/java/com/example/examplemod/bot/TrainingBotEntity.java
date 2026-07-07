package com.example.examplemod.bot;

public class TrainingBotEntity {

    private final TrainingBot bot;

    public TrainingBotEntity() {
        this.bot = new TrainingBot();
    }

    public void spawn() {
        bot.spawn();
    }

    public TrainingBot getBot() {
        return bot;
    }
}
