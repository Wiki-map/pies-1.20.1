package net.wiki.pies.datagenn;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropBlock;
import net.minecraft.item.Items;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.wiki.pies.block.ModBlocks;
import net.wiki.pies.block.custom.StrawberryCropBlock;
import net.wiki.pies.item.Moditems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        BlockStatePropertyLootCondition.Builder builder2 = BlockStatePropertyLootCondition.builder(ModBlocks.Strawberry_Crop).properties(StatePredicate.Builder.create().exactMatch(StrawberryCropBlock.AGE, 6));
        this.addDrop(ModBlocks.Strawberry_Crop, this.cropDrops(ModBlocks.Strawberry_Crop, Moditems.Strawberry, Moditems.Strawberry_Seeds, builder2));

    }
}
