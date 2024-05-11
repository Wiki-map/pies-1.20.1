package net.wiki.pies.datagenn;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.MinecartItem;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.wiki.pies.block.ModBlocks;
import net.wiki.pies.item.Moditems;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        //ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Moditems.StrawberryPie).input(Moditems.Strawberry).input(Items.SUGAR).input(Items.EGG).criterion(FabricRecipeProvider.hasItem(Moditems.Strawberry),
        //        FabricRecipeProvider.conditionsFromItem(Moditems.Strawberry)).criterion(FabricRecipeProvider.hasItem(Moditems.Strawberry),
        //        FabricRecipeProvider.conditionsFromItem(Moditems.Strawberry)).offerTo(exporter);

        //ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Moditems.SweetBerryPie).input(Items.SWEET_BERRIES).input(Items.SUGAR).input(Items.EGG).criterion(FabricRecipeProvider.hasItem(Items.SWEET_BERRIES),
        //        FabricRecipeProvider.conditionsFromItem(Items.SWEET_BERRIES)).criterion(FabricRecipeProvider.hasItem(Items.SWEET_BERRIES),
        //        FabricRecipeProvider.conditionsFromItem(Items.SWEET_BERRIES)).offerTo(exporter);

        //ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Moditems.SuspiciousPie).input(Items.RED_MUSHROOM).input(Items.SUGAR).input(Items.EGG).criterion(FabricRecipeProvider.hasItem(Items.RED_MUSHROOM),
        //        FabricRecipeProvider.conditionsFromItem(Items.RED_MUSHROOM)).criterion(FabricRecipeProvider.hasItem(Items.RED_MUSHROOM),
        //        FabricRecipeProvider.conditionsFromItem(Items.RED_MUSHROOM)).offerTo(exporter);

        //ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Moditems.Strawberry_Seeds).input(Items.SWEET_BERRIES).input(Items.PUMPKIN_SEEDS).criterion(FabricRecipeProvider.hasItem(Items.SWEET_BERRIES),
        //        FabricRecipeProvider.conditionsFromItem(Items.SWEET_BERRIES)).criterion(FabricRecipeProvider.hasItem(Items.SWEET_BERRIES),
        //        FabricRecipeProvider.conditionsFromItem(Items.SWEET_BERRIES)).offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.StrawberryPie, 1).pattern("RTS").input('R', Moditems.Strawberry).input('T', Items.SUGAR).input('S', Items.EGG).criterion(hasItem(Moditems.Strawberry),conditionsFromItem(Moditems.Strawberry)).offerTo(exporter, new Identifier(getRecipeName(Moditems.StrawberryPie)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.WildBerryPie, 1).pattern("RTS").input('R', Items.SWEET_BERRIES).input('T', Items.SUGAR).input('S', Items.EGG).criterion(hasItem(Items.SWEET_BERRIES),conditionsFromItem(Items.SWEET_BERRIES)).offerTo(exporter, new Identifier(getRecipeName(Items.SWEET_BERRIES)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.SuspiciousPie, 1).pattern("RTS").input('R', Items.RED_MUSHROOM).input('T', Items.SUGAR).input('S', Items.EGG).criterion(hasItem(Items.RED_MUSHROOM),conditionsFromItem(Items.RED_MUSHROOM)).offerTo(exporter, new Identifier(getRecipeName(Items.RED_MUSHROOM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.SuspiciousPie, 1).pattern("RTS").input('R', Items.BROWN_MUSHROOM).input('T', Items.SUGAR).input('S', Items.EGG).criterion(hasItem(Items.BROWN_MUSHROOM),conditionsFromItem(Items.BROWN_MUSHROOM)).offerTo(exporter, new Identifier(getRecipeName(Items.BROWN_MUSHROOM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.Strawberry_Seeds, 4).pattern("RTR").pattern("TRT").pattern("RTR").input('R', Items.SWEET_BERRIES).input('T', Items.PUMPKIN_SEEDS).criterion(hasItem(Items.SWEET_BERRIES),conditionsFromItem(Items.SWEET_BERRIES)).offerTo(exporter, new Identifier(getRecipeName(Moditems.Strawberry_Seeds)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Moditems.Strawberry_IceCram, 4).pattern("RRR").pattern("RTR").pattern("RRR").input('R', Moditems.Strawberry).input('T', Items.ICE).criterion(hasItem(Moditems.Strawberry),conditionsFromItem(Moditems.Strawberry)).offerTo(exporter, new Identifier(getRecipeName(Moditems.Strawberry_IceCram)));



    }
}
