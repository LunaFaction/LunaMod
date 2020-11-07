
package net.mcreator.lunafaction.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.lunafaction.item.ItemAmethysteGem;
import net.mcreator.lunafaction.block.BlockAmethysteOre;
import net.mcreator.lunafaction.ElementsLunafaction;

@ElementsLunafaction.ModElement.Tag
public class RecipeAmethysteOreSmelting extends ElementsLunafaction.ModElement {
	public RecipeAmethysteOreSmelting(ElementsLunafaction instance) {
		super(instance, 12);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockAmethysteOre.block, (int) (1)), new ItemStack(ItemAmethysteGem.block, (int) (1)), 0F);
	}
}
