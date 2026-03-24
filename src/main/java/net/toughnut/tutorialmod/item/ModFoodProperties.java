package net.toughnut.tutorialmod.item;

import net.minecraft.client.gui.font.glyphs.BakedGlyph;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static FoodProperties RADISH = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .fast()
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.RAID_OMEN, 400), 0.5f).build();
}
