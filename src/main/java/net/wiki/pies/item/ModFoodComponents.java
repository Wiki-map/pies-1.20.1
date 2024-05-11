package net.wiki.pies.item;


import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static final FoodComponent Pies = new FoodComponent.Builder().hunger(9).saturationModifier(1.0f).build();

    public static final FoodComponent Suspicios_Pies = new FoodComponent.Builder().hunger(9).saturationModifier(0.5f).statusEffect(new StatusEffectInstance(StatusEffects.POISON, 100, 1), 30).build();

    public static final FoodComponent Strawberry = new FoodComponent.Builder().hunger(5).saturationModifier(1.0f).build();

    public static final FoodComponent Strawberry_IceCream = new FoodComponent.Builder().hunger(5).saturationModifier(1.0f).build();

    public static final FoodComponent Lemon = new FoodComponent.Builder().hunger(5).saturationModifier(1.0f).build();

    public static final FoodComponent Lemonade = new FoodComponent.Builder().hunger(8).saturationModifier(1.5f).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 200,  2),100).statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200,  2),100).build();

}
