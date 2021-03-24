/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and the proxy files
 *    and they won't get overwritten. If you change your mod package or modid, you
 *    need to apply these changes to this file MANUALLY.
 *
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package org.souldb.resizers;

import org.souldb.resizers.procedures.SixteenoneProcedure;
import org.souldb.resizers.procedures.ResetsizeProcedure;
import org.souldb.resizers.procedures.FouroneProcedure;
import org.souldb.resizers.procedures.EightoneProcedure;
import org.souldb.resizers.item.SixteenItem;
import org.souldb.resizers.item.ResizersItemGroup;
import org.souldb.resizers.item.FourItem;
import org.souldb.resizers.item.EightItem;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.api.ModInitializer;

public class ResizersMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final Item Eight_ITEM = Registry.register(Registry.ITEM, id("eight"), new EightItem());
	public static final Item Four_ITEM = Registry.register(Registry.ITEM, id("four"), new FourItem());
	public static final Item Sixteen_ITEM = Registry.register(Registry.ITEM, id("sixteen"), new SixteenItem());
	public static final ItemGroup Resizers = ResizersItemGroup.get();
	@Override
	public void onInitialize() {
		LOGGER.info("Initializing ResizersMod");
		new EightoneProcedure();
		new FouroneProcedure();
		new SixteenoneProcedure();
		new ResetsizeProcedure();
		CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
		});
	}

	public static final Identifier id(String s) {
		return new Identifier("resizers", s);
	}
}
