package com.example.examplemod;

import com.example.examplemod.bot.TrainingBotEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(Registries.ENTITY_TYPE, ExampleMod.MODID);

    public static final DeferredHolder<EntityType<?>, EntityType<TrainingBotEntity>> TRAINING_BOT =
            ENTITY_TYPES.register("training_bot",
                    () -> EntityType.Builder.of(
                            TrainingBotEntity::new,
                            MobCategory.MONSTER
                    ).sized(0.6F, 1.6F).build("training_bot"));

    public static void register(IEventBus bus) {
        ENTITY_TYPES.register(bus);
    }
}
