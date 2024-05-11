package net.wiki.pies;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderer;
import net.wiki.pies.block.ModBlocks;
import net.wiki.pies.entity.ModEntities;
import net.wiki.pies.entity.client.FireflyModel;
import net.wiki.pies.entity.client.FireflyRenderer;
import net.wiki.pies.entity.layer.ModModelsLayers;

public class PiesModClient implements ClientModInitializer {


    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.Strawberry_Crop, RenderLayer.getCutout());

        EntityModelLayerRegistry.registerModelLayer(ModModelsLayers.FIrefly, FireflyModel::getTexturedModelData);

        EntityRendererRegistry.register(ModEntities.FIREFLY, FireflyRenderer::new);
    }
}
