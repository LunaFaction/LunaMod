
package net.mcreator.lunafaction.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.lunafaction.item.ItemLunaniumGem;
import net.mcreator.lunafaction.block.BlockLunaniumOre;
import net.mcreator.lunafaction.ElementsLunafaction;

@ElementsLunafaction.ModElement.Tag
public class RecipeLunaniumOreSmelting extends ElementsLunafaction.ModElement {
	public RecipeLunaniumOreSmelting(ElementsLunafaction instance) {
		super(instance, 6);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockLunaniumOre.block, (int) (1)), new ItemStack(ItemLunaniumGem.block, (int) (1)), 0F);
	}
}
