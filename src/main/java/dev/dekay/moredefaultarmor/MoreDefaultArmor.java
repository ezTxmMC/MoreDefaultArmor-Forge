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
    private static ModItemTabs itemTabs;

    public MoreDefaultArmor() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        items = new ModItems(eventBus);
        itemTabs = new ModItemTabs(eventBus);
    }

    public static ModItems getItems() {
        return items;
    }

    public static ModItemTabs getItemTabs() {
        return itemTabs;
    }
}
