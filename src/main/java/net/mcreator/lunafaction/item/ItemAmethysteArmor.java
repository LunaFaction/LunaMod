
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
public class ItemAmethysteArmor extends ElementsLunafaction.ModElement {
	@GameRegistry.ObjectHolder("lunafaction:amethystearmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("lunafaction:amethystearmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("lunafaction:amethystearmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("lunafaction:amethystearmorboots")
	public static final Item boots = null;
	public ItemAmethysteArmor(ElementsLunafaction instance) {
		super(instance, 25);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("AMETHYSTEARMOR", "lunafaction:amethyste", 15, new int[]{2, 7, 7, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 0f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("amethystearmorhelmet")
				.setRegistryName("amethystearmorhelmet").setCreativeTab(TabLunaFaction.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("amethystearmorbody")
				.setRegistryName("amethystearmorbody").setCreativeTab(TabLunaFaction.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("amethystearmorlegs")
				.setRegistryName("amethystearmorlegs").setCreativeTab(TabLunaFaction.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("amethystearmorboots")
				.setRegistryName("amethystearmorboots").setCreativeTab(TabLunaFaction.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("lunafaction:amethystearmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("lunafaction:amethystearmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("lunafaction:amethystearmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("lunafaction:amethystearmorboots", "inventory"));
	}
}
