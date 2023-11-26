
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.g_utopia.hexxitgear.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.g_utopia.hexxitgear.HexxitgearMod;

public class HexxitgearModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HexxitgearMod.MODID);
	public static final RegistryObject<CreativeModeTab> HEXXIT_GEAR = REGISTRY.register("hexxit_gear",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.hexxitgear.hexxit_gear")).icon(() -> new ItemStack(HexxitgearModItems.SCALE_HELMET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HexxitgearModItems.SCALE_HELMET.get());
				tabData.accept(HexxitgearModItems.SCALE_CHESTPLATE.get());
				tabData.accept(HexxitgearModItems.SCALE_LEGGINGS.get());
				tabData.accept(HexxitgearModItems.SCALE_BOOTS.get());
				tabData.accept(HexxitgearModItems.HEXICALDIAMOND.get());
				tabData.accept(HexxitgearModItems.HEXICALESSENCE.get());
				tabData.accept(HexxitgearModBlocks.HEXBISCUS.get().asItem());
				tabData.accept(HexxitgearModItems.THIEF_HELMET.get());
				tabData.accept(HexxitgearModItems.THIEF_CHESTPLATE.get());
				tabData.accept(HexxitgearModItems.THIEF_LEGGINGS.get());
				tabData.accept(HexxitgearModItems.THIEF_BOOTS.get());
				tabData.accept(HexxitgearModItems.TRIBAL_HELMET.get());
				tabData.accept(HexxitgearModItems.TRIBAL_CHESTPLATE.get());
				tabData.accept(HexxitgearModItems.TRIBAL_LEGGINGS.get());
				tabData.accept(HexxitgearModItems.TRIBAL_BOOTS.get());
			})

					.build());
}
