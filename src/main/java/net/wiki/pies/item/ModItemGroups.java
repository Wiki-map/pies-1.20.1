package net.wiki.pies.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.wiki.pies.Pies;

public class ModItemGroups {
    public static final ItemGroup Sea_Group = Registry.register(Registries.ITEM_GROUP, new Identifier(Pies.MOD_ID, "apple_pie"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.apple_pie")) .icon(() -> new ItemStack(Moditems.StrawberryPie)).entries((displayContext, entries) -> {
                entries.add(Moditems.StrawberryPie);
                entries.add(Moditems.WildBerryPie);

                entries.add(Moditems.SuspiciousPie);

                entries.add(Moditems.Strawberry);
                entries.add(Moditems.Strawberry_Seeds);

                entries.add(Moditems.Strawberry_IceCram);

                entries.add(Moditems.Lemon);

                entries.add(Moditems.StrawberrySword);

            }).build());


    public static void registerItemGroups() {
        Pies.LOGGER.info("Registering Item Groups for" + Pies.MOD_ID);
    }

}
