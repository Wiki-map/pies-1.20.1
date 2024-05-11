package net.wiki.pies;

import net.fabricmc.api.ModInitializer;

import net.wiki.pies.entity.ModEntities;
import net.wiki.pies.item.ModItemGroups;
import net.wiki.pies.item.Moditems;
import net.wiki.pies.util.ModLootTableModifiers;
import net.wiki.pies.util.ModRegistries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pies implements ModInitializer {

	public static final String MOD_ID="pies";

    public static final Logger LOGGER = LoggerFactory.getLogger("pies");

	@Override
	public void onInitialize() {
		Moditems.registerModItems();
		ModItemGroups.registerItemGroups();

		ModRegistries.registerModStuff();
		ModLootTableModifiers.modifyLootTables();

		ModEntities.registerModEntities();
	}
}