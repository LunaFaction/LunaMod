
package net.mcreator.lunafaction.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.lunafaction.item.ItemIridiumsGem;
import net.mcreator.lunafaction.block.BlockIridiumsOre;
import net.mcreator.lunafaction.ElementsLunafaction;

@ElementsLunafaction.ModElement.Tag
public class RecipeIridiumsOreSmelting extends ElementsLunafaction.ModElement {
	public RecipeIridiumsOreSmelting(ElementsLunafaction instance) {
		super(instance, 53);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockIridiumsOre.block, (int) (1)), new ItemStack(ItemIridiumsGem.block, (int) (0)), 0F);
	}
}
