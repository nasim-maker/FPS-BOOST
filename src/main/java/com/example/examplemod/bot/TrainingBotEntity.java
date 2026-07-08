package com.example.examplemod.bot;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import com.example.examplemod.bot.ai.MovementAI;

public class TrainingBotEntity extends PathfinderMob {

    private final TrainingBot bot = new TrainingBot();
    private final MovementAI movementAI = new MovementAI();

    public TrainingBotEntity(EntityType<? extends PathfinderMob> entityType, Level level) {
    super(entityType, level);

    ItemStack mace = new ItemStack(Items.MACE);
this.setItemSlot(EquipmentSlot.MAINHAND, mace);
    this.setItemSlot(EquipmentSlot.OFFHAND, new ItemStack(Items.SHIELD));

    this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(Items.NETHERITE_HELMET));
    this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(Items.NETHERITE_CHESTPLATE));
    this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(Items.NETHERITE_LEGGINGS));
    this.setItemSlot(EquipmentSlot.FEET, new ItemStack(Items.NETHERITE_BOOTS));
    
    }

    @Override
protected void registerGoals() {
    this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2D, false));
    this.goalSelector.addGoal(2, new LookAtPlayerGoal(this, Player.class, 8.0F));
    this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));

    this.targetSelector.addGoal(1,
            new NearestAttackableTargetGoal<>(this, Player.class, true));
}

@Override
public boolean doHurtTarget(Entity target) {
    this.swing(InteractionHand.MAIN_HAND);
    return super.doHurtTarget(target);
}
    @Override
public void tick() {
    super.tick();

    movementAI.tick(this);
        }

    public static AttributeSupplier.Builder createAttributes() {
        return PathfinderMob.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.30D)
                .add(Attributes.ATTACK_DAMAGE, 1.0D);
    }

    public TrainingBot getBot() {
        return bot;
    }
}
