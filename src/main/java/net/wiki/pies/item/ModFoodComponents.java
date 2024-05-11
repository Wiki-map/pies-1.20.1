package net.wiki.pies.item;


import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent Pies = new FoodComponent.Builder().hunger(9).saturationModifier(1.5f).build();

    public static final FoodComponent Suspicios_Pies = new FoodComponent.Builder().hunger(9).saturationModifier(1.0f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 1), 30).build();

    public static final FoodComponent Strawberry = new FoodComponent.Builder().hunger(5).saturationModifier(1.5f).build();

    public static final FoodComponent Strawberry_IceCream = new FoodComponent.Builder().hunger(5).saturationModifier(1.5f).build();

    public static final FoodComponent Lemon = new FoodComponent.Builder().hunger(5).saturationModifier(1.5f).build();

}
