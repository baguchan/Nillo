package bagu_chan.nillo;

import bagu_chan.nillo.register.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = NilloCore.MODID)
public class TabEvents {

    @SubscribeEvent
    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
            event.accept(ModItems.NILLO_SPAWNEGG);
            event.accept(ModItems.WIND_NILLO_SPAWNEGG);
            event.accept(ModItems.AQUA_NILLO_SPAWNEGG);
            event.accept(ModItems.EARTH_NILLO_SPAWNEGG);
            event.accept(ModItems.FIRE_NILLO_SPAWNEGG);
            event.accept(ModItems.GILLO_SPAWNEGG);
        }
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.AQUA_AMULET);
            event.accept(ModItems.FIRE_AMULET);
            event.accept(ModItems.WIND_AMULET);
            event.accept(ModItems.EARTH_AMULET);
        }
    }
}
