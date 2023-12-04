
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.g_utopia.hexxitgear.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.g_utopia.hexxitgear.world.features.ores.HexbiscusFeature;
import net.g_utopia.hexxitgear.HexxitgearMod;

@Mod.EventBusSubscriber
public class HexxitgearModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, HexxitgearMod.MODID);
	public static final RegistryObject<Feature<?>> HEXBISCUS = REGISTRY.register("hexbiscus", HexbiscusFeature::new);
}
