package com.example.examplemod;

import com.example.examplemod.bot.TrainingBot;
import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.RegisterCommandsEvent;

@EventBusSubscriber(modid = ExampleMod.MODID)
public class ModCommands {

    @SubscribeEvent
    public static void registerCommands(RegisterCommandsEvent event) {
        CommandDispatcher<CommandSourceStack> dispatcher = event.getDispatcher();

        dispatcher.register(
                Commands.literal("spawnbot")
                        .executes(context -> {

                            TrainingBot bot = new TrainingBot();

                            bot.spawn();
                            bot.useMace();
                            bot.useShield();

                            context.getSource().sendSuccess(
                                    () -> Component.literal(
                                            bot.getName() + " | HP: " + bot.getHealth()
                                    ),
                                    false
                            );

                            return 1;
                        })
        );
    }
}
