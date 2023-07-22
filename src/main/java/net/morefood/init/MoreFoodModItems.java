
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.morefood.init;

import net.morefood.item.GrilledCheeseItem;
import net.morefood.item.CheeseSandwichItem;
import net.morefood.item.CheeseItem;
import net.morefood.MoreFoodMod;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class MoreFoodModItems {
	public static Item GRILLED_CHEESE;
	public static Item CHEESE;
	public static Item CHEESE_SANDWICH;

	public static void load() {
		GRILLED_CHEESE = Registry.register(Registry.ITEM, new ResourceLocation(MoreFoodMod.MODID, "grilled_cheese"), new GrilledCheeseItem());
		CHEESE = Registry.register(Registry.ITEM, new ResourceLocation(MoreFoodMod.MODID, "cheese"), new CheeseItem());
		CHEESE_SANDWICH = Registry.register(Registry.ITEM, new ResourceLocation(MoreFoodMod.MODID, "cheese_sandwich"), new CheeseSandwichItem());
	}
}
