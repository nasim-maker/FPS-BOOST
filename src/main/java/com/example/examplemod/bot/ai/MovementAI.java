package com.example.examplemod.bot.ai;

import com.example.examplemod.bot.TrainingBotEntity;

public class MovementAI {

    public void tick(TrainingBotEntity bot) {

        if (bot.getTarget() == null) {
            bot.setSprinting(false);
            return;
        }

        bot.setSprinting(true);
    }
}
