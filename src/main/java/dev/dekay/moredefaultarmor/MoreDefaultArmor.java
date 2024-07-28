package dev.dekay.moredefaultarmor;

import com.mojang.logging.LogUtils;
import dev.dekay.moredefaultarmor.item.ModItemTabs;
import dev.dekay.moredefaultarmor.item.ModItems;
import lombok.Getter;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(MoreDefaultArmor.MODID)
public class MoreDefaultArmor {
    public static final String MODID = "moredefaultarmor";
    public static final Logger LOGGER = LogUtils.getLogger();

    @Getter private static ModItems items;
    @Getter private static ModItemTabs itemTabs;

    public MoreDefaultArmor() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        items = new ModItems(eventBus);
        itemTabs = new ModItemTabs(eventBus);
    }
}
