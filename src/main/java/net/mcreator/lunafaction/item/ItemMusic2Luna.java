
package net.mcreator.lunafaction.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.lunafaction.ElementsLunafaction;

@ElementsLunafaction.ModElement.Tag
public class ItemMusic2Luna extends ElementsLunafaction.ModElement {
	@GameRegistry.ObjectHolder("lunafaction:music2luna")
	public static final Item block = null;
	public ItemMusic2Luna(ElementsLunafaction instance) {
		super(instance, 110);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lunafaction:music2luna", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("music2luna", ElementsLunafaction.sounds.get(new ResourceLocation("lunafaction:music2luna")));
			setUnlocalizedName("music2luna");
			setRegistryName("music2luna");
			setCreativeTab(CreativeTabs.MISC);
		}
	}
}
