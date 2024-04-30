package net.wiki.pies.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.wiki.pies.Pies;
import net.wiki.pies.block.custom.StrawberryCropBlock;

public class ModBlocks {

    public static final Block Strawberry_Crop = registerBlockWithoutBLockItem("strawberry_crop",new StrawberryCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name,block);
        return Registry.register(Registries.BLOCK, new Identifier(Pies.MOD_ID,name),block);
    }

    private static Block registerBlockWithoutBLockItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(Pies.MOD_ID,name),block);
    }

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Pies.MOD_ID, name), new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Pies.LOGGER.info("Registering ModBlocks for " + Pies.MOD_ID);
    }
}
