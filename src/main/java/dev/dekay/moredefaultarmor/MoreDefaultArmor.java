package dev.dekay.moredefaultarmor;

import com.mojang.logging.LogUtils;
import dev.dekay.moredefaultarmor.item.ModItemTabs;
import dev.dekay.moredefaultarmor.item.ModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(MoreDefaultArmor.MODID)
public class MoreDefaultArmor {
    public static final String MODID = "moredefaultarmor";
    public static final Logger LOGGER = LogUtils.getLogger();

    private static ModItems items;

    public MoreDefaultArmor() {
        LOGGER.info("Starting eventbus...");
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        LOGGER.info("Started eventbus.");
        LOGGER.info("Register eventbus...");
        MinecraftForge.EVENT_BUS.register(this);
        LOGGER.info("Registered eventbus.");
        LOGGER.info("Register items...");
        items = new ModItems(eventBus);
        LOGGER.info("Registered items.");
        new ModItemTabs(eventBus);
        LOGGER.info("Register itemtabs...");
        LOGGER.info("Registered itemtabs.");
    }

    public static ModItems getItems() {
        return items;
    }
}
