package net.gui.modteste;

import net.fabricmc.api.ModInitializer;

import net.gui.modteste.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModTeste implements ModInitializer {
	public static final String MOD_ID = "modteste";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}