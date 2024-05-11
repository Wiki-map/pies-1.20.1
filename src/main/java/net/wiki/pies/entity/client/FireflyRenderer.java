package net.wiki.pies.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Identifier;
import net.wiki.pies.Pies;
import net.wiki.pies.entity.custom.FireflyEntity;
import net.wiki.pies.entity.layer.ModModelsLayers;

public class FireflyRenderer extends LivingEntityRenderer<FireflyEntity, FireflyModel<FireflyEntity>> {

    private static final Identifier TEXTURE = new Identifier(Pies.MOD_ID, "textures/entity/firefly.png");

    public FireflyRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new FireflyModel<>(ctx.getPart(ModModelsLayers.FIrefly)), 0.5f);
    }

    @Override
    public Identifier getTexture(FireflyEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(FireflyEntity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {

        if (livingEntity.isBaby()) {
            matrixStack.scale(0.5f,0.5f,0.5f);
        }
        else {
            matrixStack.scale(1f,1f,1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
