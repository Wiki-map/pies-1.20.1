package net.wiki.pies.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.wiki.pies.entity.animations.ModAnimations;
import net.wiki.pies.entity.custom.FireflyEntity;

import javax.swing.text.html.parser.Entity;

public class FireflyModel<T extends FireflyEntity> extends SinglePartEntityModel<T> {
    private final ModelPart root;
    private final ModelPart right;
    private final ModelPart left;

    public FireflyModel(ModelPart root) {
        this.root = root.getChild("root");
        this.right = root.getChild("right");
        this.left = root.getChild("left");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create(), ModelTransform.pivot(1.0F, 24.0F, 0.0F));

        ModelPartData right = root.addChild("right", ModelPartBuilder.create().uv(0, 3).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -6.0F, 0.0F));

        ModelPartData left = root.addChild("left", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -6.0F, 0.0F));
        return TexturedModelData.of(modelData, 16, 16);
    }
    @Override
    public void setAngles(FireflyEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);

        this.animateMovement(ModAnimations.walk,limbSwing, limbSwingAmount, 2f, 2.5f);
        this.updateAnimation(entity.idleAnimationState, ModAnimations.idle, ageInTicks, 1f);
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        root.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart getPart() {
        return root;
    }
}
