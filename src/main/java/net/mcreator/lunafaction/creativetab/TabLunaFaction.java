
package net.mcreator.lunafaction.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.lunafaction.item.ItemLunaniumGem;
import net.mcreator.lunafaction.ElementsLunafaction;

@ElementsLunafaction.ModElement.Tag
public class TabLunaFaction extends ElementsLunafaction.ModElement {
	public TabLunaFaction(ElementsLunafaction instance) {
		super(instance, 107);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tablunafaction") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemLunaniumGem.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
