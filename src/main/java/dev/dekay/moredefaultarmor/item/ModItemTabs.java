package dev.dekay.moredefaultarmor.item;

import dev.dekay.moredefaultarmor.MoreDefaultArmor;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModItemTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreDefaultArmor.MODID);

    private final RegistryObject<CreativeModeTab> overworld;
    private final RegistryObject<CreativeModeTab> nether;
    private final RegistryObject<CreativeModeTab> end;

    public ModItemTabs(IEventBus eventBus) {
        this.overworld = CREATIVE_MODE_TABS.register("overworld_tab", () -> CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.moredefaultarmor.overworld"))
                .icon(() -> MoreDefaultArmor.getItems().getOakChestplate().get().getDefaultInstance())
                .displayItems((parameters, output) -> {
                    output.accept(MoreDefaultArmor.getItems().getOakHelmet().get());
                    output.accept(MoreDefaultArmor.getItems().getOakChestplate().get());
                    output.accept(MoreDefaultArmor.getItems().getOakLeggings().get());
                    output.accept(MoreDefaultArmor.getItems().getOakBoots().get());
                }).build()
        );
        this.nether = CREATIVE_MODE_TABS.register("nether_tab", () -> CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.moredefaultarmor.nether"))
                .icon(Items.BARRIER::getDefaultInstance)
                .displayItems((parameters, output) -> {
                    output.accept(MoreDefaultArmor.getItems().getNetherrackHelmet().get());
                    output.accept(MoreDefaultArmor.getItems().getNetherrackChestplate().get());
                    output.accept(MoreDefaultArmor.getItems().getNetherrackLeggings().get());
                    output.accept(MoreDefaultArmor.getItems().getNetherrackBoots().get());
                }).build()
        );
        this.end = CREATIVE_MODE_TABS.register("end_tab", () -> CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.moredefaultarmor.end"))
                .icon(Items.BARRIER::getDefaultInstance)
                .displayItems((parameters, output) -> {

                }).build()
        );
        CREATIVE_MODE_TABS.register(eventBus);
    }

    public RegistryObject<CreativeModeTab> getOverworld() {
        return overworld;
    }

    public RegistryObject<CreativeModeTab> getNether() {
        return nether;
    }

    public RegistryObject<CreativeModeTab> getEnd() {
        return end;
    }
}
