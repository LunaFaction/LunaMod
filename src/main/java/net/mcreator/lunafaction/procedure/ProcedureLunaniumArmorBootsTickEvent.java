package net.mcreator.lunafaction.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.lunafaction.ElementsLunafaction;

@ElementsLunafaction.ModElement.Tag
public class ProcedureLunaniumArmorBootsTickEvent extends ElementsLunafaction.ModElement {
	public ProcedureLunaniumArmorBootsTickEvent(ElementsLunafaction instance) {
		super(instance, 106);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure LunaniumArmorBootsTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, (int) 3, (int) 1, (true), (false)));
	}
}
