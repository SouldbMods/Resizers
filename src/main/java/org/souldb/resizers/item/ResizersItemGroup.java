
package org.souldb.resizers.item;

import org.souldb.resizers.ResizersMod;

import net.minecraft.util.Identifier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public final class ResizersItemGroup {
	public static ItemGroup get() {
		return ITEM_GROUP;
	}
	private static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier("resizers", "resizers")).icon(() -> {
		return new ItemStack(ResizersMod.Eight_ITEM);
	}).build();
}
