
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.morefood.init;

import net.morefood.item.CheeseItem;
import net.morefood.MoreFoodMod;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class MoreFoodModItems {
	public static Item CHEESE;

	public static void load() {
		CHEESE = Registry.register(Registry.ITEM, new ResourceLocation(MoreFoodMod.MODID, "cheese"), new CheeseItem());
	}
}
