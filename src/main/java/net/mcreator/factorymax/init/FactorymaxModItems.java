/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.factorymax.init;

import net.mcreator.factorymax.item.IronfanItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.factorymax.item.IronrodItem;
import net.mcreator.factorymax.item.IronplateItem;
import net.mcreator.factorymax.FactorymaxMod;

import java.util.function.Function;

public class FactorymaxModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(FactorymaxMod.MODID);
	public static final DeferredItem<Item> IRONPLATE;
	public static final DeferredItem<Item> IRONROD;
	public static final DeferredItem<Item> IRONFRAME;
	public static final DeferredItem<Item> IRONFAN;
	static {
		IRONPLATE = register("ironplate", IronplateItem::new);
		IRONROD = register("ironrod", IronrodItem::new);
		IRONFRAME = block();
		IRONFAN = register("ironfan", IronfanItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, Item.Properties::new);
	}

	private static DeferredItem<Item> block() {
		return block(new Item.Properties());
	}

	private static DeferredItem<Item> block(Item.Properties properties) {
		return REGISTRY.registerItem(FactorymaxModBlocks.IRONFRAME.getId().getPath(), prop -> new BlockItem(FactorymaxModBlocks.IRONFRAME.get(), prop), () -> properties);
	}
}