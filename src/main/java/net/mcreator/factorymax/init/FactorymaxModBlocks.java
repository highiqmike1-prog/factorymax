/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.factorymax.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import net.mcreator.factorymax.block.IronframeBlock;
import net.mcreator.factorymax.FactorymaxMod;

import java.util.function.Function;

public class FactorymaxModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(FactorymaxMod.MODID);
	public static final DeferredBlock<Block> IRONFRAME;
	static {
		IRONFRAME = register("ironframe", IronframeBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}