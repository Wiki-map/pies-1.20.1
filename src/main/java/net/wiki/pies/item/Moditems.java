package net.wiki.pies.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wiki.pies.Pies;
import net.wiki.pies.block.ModBlocks;

public class Moditems {

    public static final Item ApplePie = registerItem("apple_pie", new Item(new Item.Settings().food(ModFoodComponents.Pies)));
    public static final Item StrawberryPie = registerItem("strawberry_pie", new Item(new Item.Settings().food(ModFoodComponents.Pies)));
    public static final Item SweetBerryPie = registerItem("sweetberry_pie", new Item(new Item.Settings().food(ModFoodComponents.Pies)));

    public static final Item SuspiciousPie = registerItem("suspicious_pie", new Item(new Item.Settings().food(ModFoodComponents.Suspicios_Pies)));

    public static final Item Strawberry = registerItem("strawberry", new Item(new Item.Settings().food(ModFoodComponents.Strawberry)));

    public static final Item Strawberry_Seeds = registerItem("strawberry_seeds", new AliasedBlockItem(ModBlocks.Strawberry_Crop,new FabricItemSettings()));

    public static final Item StrawberrySword = registerItem("strawberry_sword", new SwordItem(ModToolMaterial.Strawberry, 2, 1f, new Item.Settings() ));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Pies.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Pies.LOGGER.info("Registering Mod Items for " + Pies.MOD_ID);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(Moditems::addItemsToIngredientItemGroup);
    }
}
