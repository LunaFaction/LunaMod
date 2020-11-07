package net.mcreator.lunafaction.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.entity.Entity;

import net.mcreator.lunafaction.ElementsLunafaction;

@ElementsLunafaction.ModElement.Tag
public class ProcedureTitaneHammerPickaxeBlockDestroyedWithTool extends ElementsLunafaction.ModElement {
	public ProcedureTitaneHammerPickaxeBlockDestroyedWithTool(ElementsLunafaction instance) {
		super(instance, 103);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TitaneHammerPickaxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure TitaneHammerPickaxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure TitaneHammerPickaxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure TitaneHammerPickaxeBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure TitaneHammerPickaxeBlockDestroyedWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((y < (entity.posY))) {
			world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
					world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), 1);
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))), 1);
			world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)));
			world.getBlockState(new BlockPos((int) (x + 0), (int) y, (int) (z + 1))).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x + 0), (int) y, (int) (z + 1))), 1);
			world.setBlockToAir(new BlockPos((int) (x + 0), (int) y, (int) (z + 1)));
			world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1))).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1))), 1);
			world.setBlockToAir(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)));
			world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 0))).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 0))), 1);
			world.setBlockToAir(new BlockPos((int) (x - 1), (int) y, (int) (z + 0)));
			world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1))).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1))), 1);
			world.setBlockToAir(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)));
			world.getBlockState(new BlockPos((int) (x - 0), (int) y, (int) (z - 1))).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x - 0), (int) y, (int) (z - 1))), 1);
			world.setBlockToAir(new BlockPos((int) (x - 0), (int) y, (int) (z - 1)));
			world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))), 1);
			world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)));
			world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 0))).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 0))), 1);
			world.setBlockToAir(new BlockPos((int) (x + 1), (int) y, (int) (z - 0)));
		} else if ((((entity.getHorizontalFacing()) == EnumFacing.NORTH) || ((entity.getHorizontalFacing()) == EnumFacing.SOUTH))) {
			world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
					world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), 1);
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)), 1);
			world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y + 1), (int) z));
			world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) z)).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 0), (int) z)), 1);
			world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y + 0), (int) z));
			world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)), 1);
			world.setBlockToAir(new BlockPos((int) (x + 1), (int) (y - 1), (int) z));
			world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x + 0), (int) (y - 1), (int) z)), 1);
			world.setBlockToAir(new BlockPos((int) (x + 0), (int) (y - 1), (int) z));
			world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)), 1);
			world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y - 1), (int) z));
			world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) z)).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 0), (int) z)), 1);
			world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y - 0), (int) z));
			world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)), 1);
			world.setBlockToAir(new BlockPos((int) (x - 1), (int) (y + 1), (int) z));
			world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) z)).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) (x - 0), (int) (y + 1), (int) z)), 1);
			world.setBlockToAir(new BlockPos((int) (x - 0), (int) (y + 1), (int) z));
		} else if ((((entity.getHorizontalFacing()) == EnumFacing.WEST) || ((entity.getHorizontalFacing()) == EnumFacing.EAST))) {
			world.getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock().dropBlockAsItem(world, new BlockPos((int) x, (int) y, (int) z),
					world.getBlockState(new BlockPos((int) x, (int) y, (int) z)), 1);
			world.setBlockToAir(new BlockPos((int) x, (int) y, (int) z));
			world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))), 1);
			world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)));
			world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) (z + 1))).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + 0), (int) (z + 1))), 1);
			world.setBlockToAir(new BlockPos((int) x, (int) (y + 0), (int) (z + 1)));
			world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))), 1);
			world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)));
			world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 0))).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 0))), 1);
			world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z + 0)));
			world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))), 1);
			world.setBlockToAir(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)));
			world.getBlockState(new BlockPos((int) x, (int) (y - 0), (int) (z - 1))).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) (y - 0), (int) (z - 1))), 1);
			world.setBlockToAir(new BlockPos((int) x, (int) (y - 0), (int) (z - 1)));
			world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))), 1);
			world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)));
			world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 0))).getBlock().dropBlockAsItem(world,
					new BlockPos((int) x, (int) y, (int) z), world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 0))), 1);
			world.setBlockToAir(new BlockPos((int) x, (int) (y + 1), (int) (z - 0)));
		}
	}
}
