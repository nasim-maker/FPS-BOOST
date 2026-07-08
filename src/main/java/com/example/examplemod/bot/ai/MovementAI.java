package com.example.examplemod.bot.ai;

import com.example.examplemod.bot.TrainingBotEntity;

public class MovementAI {

    public MovementAI() {

    }

    public void tick(TrainingBotEntity bot) {

        // إذا ما فيه هدف لا يسوي شيء
        if (bot.getTarget() == null) {
            return;
        }

        // هنا سنضيف الذكاء لاحقًا:
        // - Sprint
        // - Jump
        // - Strafing
        // - Pathfinding
    }
}
