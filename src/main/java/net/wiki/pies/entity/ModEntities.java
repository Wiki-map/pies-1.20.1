package net.wiki.pies.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.wiki.pies.Pies;
import net.wiki.pies.entity.custom.FireflyEntity;

public class ModEntities {

    public static final EntityType<FireflyEntity> FIREFLY = Registry.register(Registries.ENTITY_TYPE, new Identifier(Pies.MOD_ID, "firefly"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, FireflyEntity::new).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).build());

    public static void  registerModEntities() {
        Pies.LOGGER.info("Registering Mod Entities for " + Pies.MOD_ID);
    }
}
