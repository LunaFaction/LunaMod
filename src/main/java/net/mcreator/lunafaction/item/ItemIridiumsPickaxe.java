
package net.mcreator.lunafaction.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.lunafaction.creativetab.TabLunaFaction;
import net.mcreator.lunafaction.ElementsLunafaction;

import java.util.Set;
import java.util.HashMap;

@ElementsLunafaction.ModElement.Tag
public class ItemIridiumsPickaxe extends ElementsLunafaction.ModElement {
	@GameRegistry.ObjectHolder("lunafaction:iridiumspickaxe")
	public static final Item block = null;
	public ItemIridiumsPickaxe(ElementsLunafaction instance) {
		super(instance, 70);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("IRIDIUMSPICKAXE", 2, 250, 12.5f, -2f, 14)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 2);
				return ret.keySet();
			}
		}.setUnlocalizedName("iridiumspickaxe").setRegistryName("iridiumspickaxe").setCreativeTab(TabLunaFaction.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lunafaction:iridiumspickaxe", "inventory"));
	}
}
