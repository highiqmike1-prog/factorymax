/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.factorymax.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.factorymax.FactorymaxMod;

import java.util.function.Function;

public class FactorymaxModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(FactorymaxMod.MODID);
	public static final DeferredItem<Item> IRONPLATE;
	static {
		IRONPLATE = register("ironplate", IronplateItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, Item.Properties::new);
	}
}