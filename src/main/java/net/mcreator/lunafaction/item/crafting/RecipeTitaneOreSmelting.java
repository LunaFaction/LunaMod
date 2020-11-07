
package net.mcreator.lunafaction.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.lunafaction.item.ItemTitaneGem;
import net.mcreator.lunafaction.block.BlockTitaneOre;
import net.mcreator.lunafaction.ElementsLunafaction;

@ElementsLunafaction.ModElement.Tag
public class RecipeTitaneOreSmelting extends ElementsLunafaction.ModElement {
	public RecipeTitaneOreSmelting(ElementsLunafaction instance) {
		super(instance, 18);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockTitaneOre.block, (int) (1)), new ItemStack(ItemTitaneGem.block, (int) (1)), 0F);
	}
}
