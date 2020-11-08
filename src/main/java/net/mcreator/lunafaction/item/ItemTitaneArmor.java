
package net.mcreator.lunafaction.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.lunafaction.creativetab.TabLunaFaction;
import net.mcreator.lunafaction.ElementsLunafaction;

@ElementsLunafaction.ModElement.Tag
public class ItemTitaneArmor extends ElementsLunafaction.ModElement {
	@GameRegistry.ObjectHolder("lunafaction:titanearmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("lunafaction:titanearmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("lunafaction:titanearmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("lunafaction:titanearmorboots")
	public static final Item boots = null;
	public ItemTitaneArmor(ElementsLunafaction instance) {
		super(instance, 36);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("TITANEARMOR", "lunafaction:titane", 7, new int[]{2, 6, 6, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("titanearmorhelmet")
				.setRegistryName("titanearmorhelmet").setCreativeTab(TabLunaFaction.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("titanearmorbody")
				.setRegistryName("titanearmorbody").setCreativeTab(TabLunaFaction.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("titanearmorlegs")
				.setRegistryName("titanearmorlegs").setCreativeTab(TabLunaFaction.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("titanearmorboots")
				.setRegistryName("titanearmorboots").setCreativeTab(TabLunaFaction.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("lunafaction:titanearmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("lunafaction:titanearmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("lunafaction:titanearmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("lunafaction:titanearmorboots", "inventory"));
	}
}
