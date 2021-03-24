package org.souldb.resizers.procedures;

import net.minecraft.entity.Entity;

import java.util.Map;

public class ResetsizeProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Resetsize!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isClient()) {
				_ent.world.getServer().getCommandManager().execute(_ent.getCommandSource().withSilent().withLevel(4), "scale reset @p");
			}
		}
	}
}
