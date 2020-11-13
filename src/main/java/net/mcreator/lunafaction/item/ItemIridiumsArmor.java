
package net.mcreator.lunafaction.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.lunafaction.procedure.ProcedureIridiumsArmorHelmetTickEventsss;
import net.mcreator.lunafaction.creativetab.TabLunaFaction;
import net.mcreator.lunafaction.ElementsLunafaction;

@ElementsLunafaction.ModElement.Tag
public class ItemIridiumsArmor extends ElementsLunafaction.ModElement {
	@GameRegistry.ObjectHolder("lunafaction:iridiumsarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("lunafaction:iridiumsarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("lunafaction:iridiumsarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("lunafaction:iridiumsarmorboots")
	public static final Item boots = null;
	public ItemIridiumsArmor(ElementsLunafaction instance) {
		super(instance, 54);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("IRIDIUMSARMOR", "lunafaction:iridiums", 25, new int[]{2, 6, 6, 2}, 9,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {
			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				super.onArmorTick(world, entity, itemstack);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					java.util.HashMap<String, Object> $_dependencies = new java.util.HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureIridiumsArmorHelmetTickEventsss.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("iridiumsarmorhelmet").setRegistryName("iridiumsarmorhelmet").setCreativeTab(TabLunaFaction.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("iridiumsarmorbody")
				.setRegistryName("iridiumsarmorbody").setCreativeTab(TabLunaFaction.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("iridiumsarmorlegs")
				.setRegistryName("iridiumsarmorlegs").setCreativeTab(TabLunaFaction.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("iridiumsarmorboots")
				.setRegistryName("iridiumsarmorboots").setCreativeTab(TabLunaFaction.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("lunafaction:iridiumsarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("lunafaction:iridiumsarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("lunafaction:iridiumsarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("lunafaction:iridiumsarmorboots", "inventory"));
	}
}
