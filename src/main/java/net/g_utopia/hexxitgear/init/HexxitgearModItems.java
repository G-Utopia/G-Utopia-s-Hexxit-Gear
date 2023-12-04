
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.g_utopia.hexxitgear.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.g_utopia.hexxitgear.item.TribalItem;
import net.g_utopia.hexxitgear.item.ThiefItem;
import net.g_utopia.hexxitgear.item.ScaleItem;
import net.g_utopia.hexxitgear.item.HexicalessenceItem;
import net.g_utopia.hexxitgear.item.HexicaldiamondItem;
import net.g_utopia.hexxitgear.HexxitgearMod;

public class HexxitgearModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HexxitgearMod.MODID);
	public static final RegistryObject<Item> SCALE_HELMET = REGISTRY.register("scale_helmet", () -> new ScaleItem.Helmet());
	public static final RegistryObject<Item> SCALE_CHESTPLATE = REGISTRY.register("scale_chestplate", () -> new ScaleItem.Chestplate());
	public static final RegistryObject<Item> SCALE_LEGGINGS = REGISTRY.register("scale_leggings", () -> new ScaleItem.Leggings());
	public static final RegistryObject<Item> SCALE_BOOTS = REGISTRY.register("scale_boots", () -> new ScaleItem.Boots());
	public static final RegistryObject<Item> HEXICALDIAMOND = REGISTRY.register("hexicaldiamond", () -> new HexicaldiamondItem());
	public static final RegistryObject<Item> HEXICALESSENCE = REGISTRY.register("hexicalessence", () -> new HexicalessenceItem());
	public static final RegistryObject<Item> HEXBISCUS = block(HexxitgearModBlocks.HEXBISCUS);
	public static final RegistryObject<Item> THIEF_HELMET = REGISTRY.register("thief_helmet", () -> new ThiefItem.Helmet());
	public static final RegistryObject<Item> THIEF_CHESTPLATE = REGISTRY.register("thief_chestplate", () -> new ThiefItem.Chestplate());
	public static final RegistryObject<Item> THIEF_LEGGINGS = REGISTRY.register("thief_leggings", () -> new ThiefItem.Leggings());
	public static final RegistryObject<Item> THIEF_BOOTS = REGISTRY.register("thief_boots", () -> new ThiefItem.Boots());
	public static final RegistryObject<Item> TRIBAL_HELMET = REGISTRY.register("tribal_helmet", () -> new TribalItem.Helmet());
	public static final RegistryObject<Item> TRIBAL_CHESTPLATE = REGISTRY.register("tribal_chestplate", () -> new TribalItem.Chestplate());
	public static final RegistryObject<Item> TRIBAL_LEGGINGS = REGISTRY.register("tribal_leggings", () -> new TribalItem.Leggings());
	public static final RegistryObject<Item> TRIBAL_BOOTS = REGISTRY.register("tribal_boots", () -> new TribalItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
