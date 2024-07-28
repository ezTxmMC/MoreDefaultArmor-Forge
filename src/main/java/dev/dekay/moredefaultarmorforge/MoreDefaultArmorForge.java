package dev.dekay.moredefaultarmorforge;

import com.mojang.logging.LogUtils;
import com.sun.jdi.event.EventSet;
import dev.dekay.moredefaultarmorforge.items.ArmorTiers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(MoreDefaultArmorForge.MODID)
public class MoreDefaultArmorForge {

    public static final String MODID = "mdaf";
    public static final Logger LOGGER = LogUtils.getLogger();

    public MoreDefaultArmorForge() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();


        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
        }

        private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
        }
    }
}