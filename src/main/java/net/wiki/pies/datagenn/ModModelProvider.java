package net.wiki.pies.datagenn;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.wiki.pies.block.ModBlocks;
import net.wiki.pies.block.custom.StrawberryCropBlock;
import net.wiki.pies.item.Moditems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCrop(ModBlocks.Strawberry_Crop, StrawberryCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(Moditems.WildBerryPie, Models.GENERATED);

        itemModelGenerator.register(Moditems.StrawberryPie, Models.GENERATED);

        itemModelGenerator.register(Moditems.SuspiciousPie, Models.GENERATED);

        itemModelGenerator.register(Moditems.Strawberry, Models.GENERATED);

        itemModelGenerator.register(Moditems.Strawberry_IceCram, Models.GENERATED);

        itemModelGenerator.register(Moditems.StrawberrySword, Models.HANDHELD);

        itemModelGenerator.register(Moditems.Lemon, Models.GENERATED);
    }
}
