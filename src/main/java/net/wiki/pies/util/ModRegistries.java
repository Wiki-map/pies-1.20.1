package net.wiki.pies.util;

import net.minecraft.block.ComposterBlock;
import net.wiki.pies.item.Moditems;

public class ModRegistries {
    public static void registerModStuff() {
        registerModCompostable();
    }
    public static void registerModCompostable() {
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(Moditems.Strawberry, 0.55f);
        ComposterBlock.ITEM_TO_LEVEL_INCREASE_CHANCE.put(Moditems.Strawberry_Seeds, 0.25f);
    }
}
