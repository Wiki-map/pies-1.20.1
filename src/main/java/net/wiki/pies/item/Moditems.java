package net.wiki.pies.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wiki.pies.Pies;
import net.wiki.pies.block.ModBlocks;
import net.wiki.pies.item.custom.ModHelthSwordItem;

public class Moditems {

    public static final Item StrawberryPie = registerItem("strawberry_pie", new Item(new Item.Settings().food(ModFoodComponents.Pies)));
    public static final Item WildBerryPie = registerItem("wildberry_pie", new Item(new Item.Settings().food(ModFoodComponents.Pies)));

    public static final Item SuspiciousPie = registerItem("suspicious_pie", new Item(new Item.Settings().food(ModFoodComponents.Suspicios_Pies)));

    public static final Item Strawberry = registerItem("strawberry", new Item(new Item.Settings().food(ModFoodComponents.Strawberry)));

    public static final Item Lemon = registerItem("lemon", new Item(new Item.Settings().food(ModFoodComponents.Lemon)));

    public static final Item Lemonade = registerItem("lemonade", new Item(new Item.Settings().food(ModFoodComponents.Lemonade)));

    public static final Item Strawberry_IceCram = registerItem("strawberry_ice_cream", new Item(new Item.Settings().food(ModFoodComponents.Strawberry_IceCream)));

    public static final Item Strawberry_Seeds = registerItem("strawberry_seeds", new AliasedBlockItem(ModBlocks.Strawberry_Crop,new FabricItemSettings()));

    public static final Item StrawberrySword = registerItem("strawberry_sword", new ModHelthSwordItem(ModToolMaterial.Strawberry, 2, 3f, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Pies.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Pies.LOGGER.info("Registering Mod Items for " + Pies.MOD_ID);
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(Moditems::addItemsToIngredientItemGroup);
    }
}
