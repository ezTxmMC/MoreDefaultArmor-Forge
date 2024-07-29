package dev.dekay.moredefaultarmor;

import com.mojang.logging.LogUtils;
import dev.dekay.moredefaultarmor.item.ModItemTabs;
import dev.dekay.moredefaultarmor.item.ModItems;
import dev.dekay.moredefaultarmor.util.UpdateChecker;
import net.minecraft.network.chat.Component;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(MoreDefaultArmor.MODID)
public class MoreDefaultArmor {
    public static final String MODID = "moredefaultarmor";
    public static final Logger LOGGER = LogUtils.getLogger();

    private static ModItems items;

    private static UpdateChecker updateChecker;

    public MoreDefaultArmor() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(eventBus);
        items = new ModItems(eventBus);
        new ModItemTabs(eventBus);
        updateChecker = new UpdateChecker(ModLoadingContext.get().getActiveContainer().getModInfo().getVersion().getQualifier());
        System.out.println(updateChecker.getLatestVersion());
    }

    @SubscribeEvent
    public static void playerJoinWorld(PlayerEvent.PlayerLoggedInEvent event) {
        if (updateChecker.latestVersion()) {
            event.getEntity().sendSystemMessage(Component.translatable("message.moredefaultarmor.update"));
        }
    }

    public static ModItems getItems() {
        return items;
    }
}
