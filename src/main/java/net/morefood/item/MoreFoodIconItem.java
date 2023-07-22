
package net.morefood.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class MoreFoodIconItem extends Item {
	public MoreFoodIconItem() {
		super(new Item.Properties().tab(null).stacksTo(0).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
