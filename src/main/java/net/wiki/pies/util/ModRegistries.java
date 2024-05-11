package net.wiki.pies.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.block.ComposterBlock;
import net.wiki.pies.entity.ModEntities;
import net.wiki.pies.entity.custom.FireflyEntity;
import net.wiki.pies.item.Moditems;

public class ModRegistries {
    public static void registerModStuff() {
        registerModCompostable();
        registerAttribute();
    }

    public static void registerAttribute() {
        FabricDefaultAttributeRegistry.register(ModEntities.FIREFLY, FireflyEntity.createFireflyAttributes());
    }

    public static void registerModCompostable() {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(Moditems.Strawberry, 0.55f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(Moditems.Strawberry_Seeds, 0.25f);
    }
}
