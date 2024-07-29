package dev.dekay.moredefaultarmor.item;

import dev.dekay.moredefaultarmor.MoreDefaultArmor;
import dev.dekay.moredefaultarmor.armor.ModArmorTiers;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreDefaultArmor.MODID);

    // Overworld
    private final RegistryObject<Item> dirtHelmet;
    private final RegistryObject<Item> dirtChestplate;
    private final RegistryObject<Item> dirtLeggings;
    private final RegistryObject<Item> dirtBoots;
    private final RegistryObject<Item> oakHelmet;
    private final RegistryObject<Item> oakChestplate;
    private final RegistryObject<Item> oakLeggings;
    private final RegistryObject<Item> oakBoots;
    private final RegistryObject<Item> cobblestoneHelmet;
    private final RegistryObject<Item> cobblestoneChestplate;
    private final RegistryObject<Item> cobblestoneLeggings;
    private final RegistryObject<Item> cobblestoneBoots;
    private final RegistryObject<Item> andesiteHelmet;
    private final RegistryObject<Item> andesiteChestplate;
    private final RegistryObject<Item> andesiteLeggings;
    private final RegistryObject<Item> andesiteBoots;
    private final RegistryObject<Item> dioriteHelmet;
    private final RegistryObject<Item> dioriteChestplate;
    private final RegistryObject<Item> dioriteLeggings;
    private final RegistryObject<Item> dioriteBoots;
    private final RegistryObject<Item> graniteHelmet;
    private final RegistryObject<Item> graniteChestplate;
    private final RegistryObject<Item> graniteLeggings;
    private final RegistryObject<Item> graniteBoots;
    private final RegistryObject<Item> deepslateCobbleHelmet;
    private final RegistryObject<Item> deepslateCobbleChestplate;
    private final RegistryObject<Item> deepslateCobbleLeggings;
    private final RegistryObject<Item> deepslateCobbleBoots;

    // Nether
    private final RegistryObject<Item> netherrackHelmet;
    private final RegistryObject<Item> netherrackChestplate;
    private final RegistryObject<Item> netherrackLeggings;
    private final RegistryObject<Item> netherrackBoots;

    private final RegistryObject<Item> smoothBasaltHelmet;
    private final RegistryObject<Item> smoothBasaltChestplate;
    private final RegistryObject<Item> smoothBasaltLeggings;
    private final RegistryObject<Item> smoothBasaltBoots;

    // End
    private final RegistryObject<Item> endStoneHelmet;
    private final RegistryObject<Item> endStoneChestplate;
    private final RegistryObject<Item> endStoneLeggings;
    private final RegistryObject<Item> endStoneBoots;

    public ModItems(IEventBus eventBus) {
        this.dirtHelmet = ITEMS.register("dirt_helmet", () -> new ArmorItem(ModArmorTiers.DIRT, ArmorItem.Type.HELMET, new Item.Properties()));
        this.dirtChestplate = ITEMS.register("dirt_chestplate", () -> new ArmorItem(ModArmorTiers.DIRT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.dirtLeggings = ITEMS.register("dirt_leggings", () -> new ArmorItem(ModArmorTiers.DIRT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.dirtBoots = ITEMS.register("dirt_boots", () -> new ArmorItem(ModArmorTiers.DIRT, ArmorItem.Type.BOOTS, new Item.Properties()));
        
        this.oakHelmet = ITEMS.register("oak_helmet", () -> new ArmorItem(ModArmorTiers.OAK, ArmorItem.Type.HELMET, new Item.Properties()));
        this.oakChestplate = ITEMS.register("oak_chestplate", () -> new ArmorItem(ModArmorTiers.OAK, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.oakLeggings = ITEMS.register("oak_leggings", () -> new ArmorItem(ModArmorTiers.OAK, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.oakBoots = ITEMS.register("oak_boots", () -> new ArmorItem(ModArmorTiers.OAK, ArmorItem.Type.BOOTS, new Item.Properties()));
        
        this.cobblestoneHelmet = ITEMS.register("cobblestone_helmet", () -> new ArmorItem(ModArmorTiers.COBBLESTONE, ArmorItem.Type.HELMET, new Item.Properties()));
        this.cobblestoneChestplate = ITEMS.register("cobblestone_chestplate", () -> new ArmorItem(ModArmorTiers.COBBLESTONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.cobblestoneLeggings = ITEMS.register("cobblestone_leggings", () -> new ArmorItem(ModArmorTiers.COBBLESTONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.cobblestoneBoots = ITEMS.register("cobblestone_boots", () -> new ArmorItem(ModArmorTiers.COBBLESTONE, ArmorItem.Type.BOOTS, new Item.Properties()));
        
        this.andesiteHelmet = ITEMS.register("andesite_helmet", () -> new ArmorItem(ModArmorTiers.ANDESITE, ArmorItem.Type.HELMET, new Item.Properties()));
        this.andesiteChestplate = ITEMS.register("andesite_chestplate", () -> new ArmorItem(ModArmorTiers.ANDESITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.andesiteLeggings = ITEMS.register("andesite_leggings", () -> new ArmorItem(ModArmorTiers.ANDESITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.andesiteBoots = ITEMS.register("andesite_boots", () -> new ArmorItem(ModArmorTiers.ANDESITE, ArmorItem.Type.BOOTS, new Item.Properties()));
        
        this.dioriteHelmet = ITEMS.register("diorite_helmet", () -> new ArmorItem(ModArmorTiers.DIORITE, ArmorItem.Type.HELMET, new Item.Properties()));
        this.dioriteChestplate = ITEMS.register("diorite_chestplate", () -> new ArmorItem(ModArmorTiers.DIORITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.dioriteLeggings = ITEMS.register("diorite_leggings", () -> new ArmorItem(ModArmorTiers.DIORITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.dioriteBoots = ITEMS.register("diorite_boots", () -> new ArmorItem(ModArmorTiers.DIORITE, ArmorItem.Type.BOOTS, new Item.Properties()));
        
        this.graniteHelmet = ITEMS.register("granite_helmet", () -> new ArmorItem(ModArmorTiers.GRANITE, ArmorItem.Type.HELMET, new Item.Properties()));
        this.graniteChestplate = ITEMS.register("granite_chestplate", () -> new ArmorItem(ModArmorTiers.GRANITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.graniteLeggings = ITEMS.register("granite_leggings", () -> new ArmorItem(ModArmorTiers.GRANITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.graniteBoots = ITEMS.register("granite_boots", () -> new ArmorItem(ModArmorTiers.GRANITE, ArmorItem.Type.BOOTS, new Item.Properties()));
        
        this.deepslateCobbleHelmet = ITEMS.register("deepslate_cobble_helmet", () -> new ArmorItem(ModArmorTiers.DEEPSLATE_COBBLE, ArmorItem.Type.HELMET, new Item.Properties()));
        this.deepslateCobbleChestplate = ITEMS.register("deepslate_cobble_chestplate", () -> new ArmorItem(ModArmorTiers.DEEPSLATE_COBBLE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.deepslateCobbleLeggings = ITEMS.register("deepslate_cobble_leggings", () -> new ArmorItem(ModArmorTiers.DEEPSLATE_COBBLE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.deepslateCobbleBoots = ITEMS.register("deepslate_cobble_boots", () -> new ArmorItem(ModArmorTiers.DEEPSLATE_COBBLE, ArmorItem.Type.BOOTS, new Item.Properties()));

        this.netherrackHelmet = ITEMS.register("netherrack_helmet", () -> new ArmorItem(ModArmorTiers.NETHERRACK, ArmorItem.Type.HELMET, new Item.Properties()));
        this.netherrackChestplate = ITEMS.register("netherrack_chestplate", () -> new ArmorItem(ModArmorTiers.NETHERRACK, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.netherrackLeggings = ITEMS.register("netherrack_leggings", () -> new ArmorItem(ModArmorTiers.NETHERRACK, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.netherrackBoots = ITEMS.register("netherrack_boots", () -> new ArmorItem(ModArmorTiers.NETHERRACK, ArmorItem.Type.BOOTS, new Item.Properties()));

        this.endStoneHelmet = ITEMS.register("end_stone_helmet", () -> new ArmorItem(ModArmorTiers.END_STONE, ArmorItem.Type.HELMET, new Item.Properties()));
        this.endStoneChestplate = ITEMS.register("end_stone_chestplate", () -> new ArmorItem(ModArmorTiers.END_STONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.endStoneLeggings = ITEMS.register("end_stone_leggings", () -> new ArmorItem(ModArmorTiers.END_STONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.endStoneBoots = ITEMS.register("end_stone_boots", () -> new ArmorItem(ModArmorTiers.END_STONE, ArmorItem.Type.BOOTS, new Item.Properties()));

        this.smoothBasaltHelmet = ITEMS.register("smooth_basalt_helmet", () -> new ArmorItem(ModArmorTiers.SMOOTH_BASALT, ArmorItem.Type.HELMET, new Item.Properties()));
        this.smoothBasaltChestplate = ITEMS.register("smooth_basalt_chestplate", () -> new ArmorItem(ModArmorTiers.SMOOTH_BASALT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.smoothBasaltLeggings = ITEMS.register("smooth_basalt_leggings", () -> new ArmorItem(ModArmorTiers.SMOOTH_BASALT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.smoothBasaltBoots = ITEMS.register("smooth_basalt_boots", () -> new ArmorItem(ModArmorTiers.SMOOTH_BASALT, ArmorItem.Type.BOOTS, new Item.Properties()));

        ITEMS.register(eventBus);
    }

    public RegistryObject<Item> getDirtHelmet() {
        return dirtHelmet;
    }

    public RegistryObject<Item> getDirtChestplate() {
        return dirtChestplate;
    }

    public RegistryObject<Item> getDirtLeggings() {
        return dirtLeggings;
    }

    public RegistryObject<Item> getDirtBoots() {
        return dirtBoots;
    }

    public RegistryObject<Item> getOakHelmet() {
        return oakHelmet;
    }

    public RegistryObject<Item> getOakChestplate() {
        return oakChestplate;
    }

    public RegistryObject<Item> getOakLeggings() {
        return oakLeggings;
    }

    public RegistryObject<Item> getOakBoots() {
        return oakBoots;
    }

    public RegistryObject<Item> getCobblestoneHelmet() {
        return cobblestoneHelmet;
    }

    public RegistryObject<Item> getCobblestoneChestplate() {
        return cobblestoneChestplate;
    }

    public RegistryObject<Item> getCobblestoneLeggings() {
        return cobblestoneLeggings;
    }

    public RegistryObject<Item> getCobblestoneBoots() {
        return cobblestoneBoots;
    }

    public RegistryObject<Item> getAndesiteHelmet() {
        return andesiteHelmet;
    }

    public RegistryObject<Item> getAndesiteChestplate() {
        return andesiteChestplate;
    }

    public RegistryObject<Item> getAndesiteLeggings() {
        return andesiteLeggings;
    }

    public RegistryObject<Item> getAndesiteBoots() {
        return andesiteBoots;
    }

    public RegistryObject<Item> getDioriteHelmet() {
        return dioriteHelmet;
    }

    public RegistryObject<Item> getDioriteChestplate() {
        return dioriteChestplate;
    }

    public RegistryObject<Item> getDioriteLeggings() {
        return dioriteLeggings;
    }

    public RegistryObject<Item> getDioriteBoots() {
        return dioriteBoots;
    }

    public RegistryObject<Item> getGraniteHelmet() {
        return graniteHelmet;
    }

    public RegistryObject<Item> getGraniteChestplate() {
        return graniteChestplate;
    }

    public RegistryObject<Item> getGraniteLeggings() {
        return graniteLeggings;
    }

    public RegistryObject<Item> getGraniteBoots() {
        return graniteBoots;
    }

    public RegistryObject<Item> getDeepslateCobbleHelmet() {
        return deepslateCobbleHelmet;
    }

    public RegistryObject<Item> getDeepslateCobbleChestplate() {
        return deepslateCobbleChestplate;
    }

    public RegistryObject<Item> getDeepslateCobbleLeggings() {
        return deepslateCobbleLeggings;
    }

    public RegistryObject<Item> getDeepslateCobbleBoots() {
        return deepslateCobbleBoots;
    }

    public RegistryObject<Item> getNetherrackHelmet() {
        return netherrackHelmet;
    }

    public RegistryObject<Item> getNetherrackChestplate() {
        return netherrackChestplate;
    }

    public RegistryObject<Item> getNetherrackLeggings() {
        return netherrackLeggings;
    }

    public RegistryObject<Item> getNetherrackBoots() {
        return netherrackBoots;
    }

    public RegistryObject<Item> getEndStoneHelmet() {
        return endStoneHelmet;
    }

    public RegistryObject<Item> getEndStoneChestplate() {
        return endStoneChestplate;
    }

    public RegistryObject<Item> getEndStoneLeggings() {
        return endStoneLeggings;
    }

    public RegistryObject<Item> getEndStoneBoots() {
        return endStoneBoots;
    }

    public RegistryObject<Item> getSmoothBasaltHelmet() {
        return smoothBasaltHelmet;
    }
    public RegistryObject<Item> getSmoothBasaltChestplate() {
        return smoothBasaltChestplate;
    }
    public RegistryObject<Item> getSmoothBasaltLeggings() {
        return smoothBasaltLeggings;
    }
    public RegistryObject<Item> getSmoothBasaltBoots() {
        return smoothBasaltBoots;
    }
}
