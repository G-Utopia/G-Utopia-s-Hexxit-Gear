
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.g_utopia.hexxitgear.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.g_utopia.hexxitgear.block.HexbiscusBlock;
import net.g_utopia.hexxitgear.HexxitgearMod;

public class HexxitgearModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HexxitgearMod.MODID);
	public static final RegistryObject<Block> HEXBISCUS = REGISTRY.register("hexbiscus", () -> new HexbiscusBlock());
}
