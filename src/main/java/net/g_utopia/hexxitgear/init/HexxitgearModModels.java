
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.g_utopia.hexxitgear.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.g_utopia.hexxitgear.client.model.ModelSkullHelmet;
import net.g_utopia.hexxitgear.client.model.ModelScaleHelmet;
import net.g_utopia.hexxitgear.client.model.ModelHoodHelmet;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class HexxitgearModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelHoodHelmet.LAYER_LOCATION, ModelHoodHelmet::createBodyLayer);
		event.registerLayerDefinition(ModelSkullHelmet.LAYER_LOCATION, ModelSkullHelmet::createBodyLayer);
		event.registerLayerDefinition(ModelScaleHelmet.LAYER_LOCATION, ModelScaleHelmet::createBodyLayer);
	}
}
