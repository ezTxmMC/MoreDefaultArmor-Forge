package dev.dekay.moredefaultarmor.item;

import dev.dekay.moredefaultarmor.MoreDefaultArmor;
import dev.dekay.moredefaultarmor.armor.ModArmorTiers;
import lombok.Getter;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Getter
public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MoreDefaultArmor.MODID);

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

    public ModItems(IEventBus eventBus) {
        this.dirtHelmet = ITEMS.register("dirt_helmet", () -> new ArmorItem(ModArmorTiers.DIRT, ArmorItem.Type.HELMET, new Item.Properties()));
        this.dirtChestplate = ITEMS.register("dirt_chestplate", () -> new ArmorItem(ModArmorTiers.DIRT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.dirtLeggings = ITEMS.register("dirt_leggings", () -> new ArmorItem(ModArmorTiers.DIRT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.dirtBoots = ITEMS.register("dirt_boots", () -> new ArmorItem(ModArmorTiers.DIRT, ArmorItem.Type.BOOTS, new Item.Properties()));
        
        this.oakHelmet = ITEMS.register("oak_helmet", () -> new ArmorItem(ModArmorTiers.OAK, ArmorItem.Type.HELMET, new Item.Properties()));
        this.oakChestplate = ITEMS.register("oak_chestplate", () -> new ArmorItem(ModArmorTiers.OAK, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.oakLeggings = ITEMS.register("oak_leggings", () -> new ArmorItem(ModArmorTiers.OAK, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.oakBoots = ITEMS.register("oak_boots", () -> new ArmorItem(ModArmorTiers.OAK, ArmorItem.Type.BOOTS, new Item.Properties()));
        
        this.cobblestoneHelmet = ITEMS.register("cobblestone_helmet", () -> new ArmorItem(ModArmorTiers.STONE, ArmorItem.Type.HELMET, new Item.Properties()));
        this.cobblestoneChestplate = ITEMS.register("cobblestone_chestplate", () -> new ArmorItem(ModArmorTiers.STONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.cobblestoneLeggings = ITEMS.register("cobblestone_leggings", () -> new ArmorItem(ModArmorTiers.STONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.cobblestoneBoots = ITEMS.register("cobblestone_boots", () -> new ArmorItem(ModArmorTiers.STONE, ArmorItem.Type.BOOTS, new Item.Properties()));
        
        this.andesiteHelmet = ITEMS.register("andesite_helmet", () -> new ArmorItem(ModArmorTiers.STONE, ArmorItem.Type.HELMET, new Item.Properties()));
        this.andesiteChestplate = ITEMS.register("andesite_chestplate", () -> new ArmorItem(ModArmorTiers.STONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.andesiteLeggings = ITEMS.register("andesite_leggings", () -> new ArmorItem(ModArmorTiers.STONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.andesiteBoots = ITEMS.register("andesite_boots", () -> new ArmorItem(ModArmorTiers.STONE, ArmorItem.Type.BOOTS, new Item.Properties()));
        
        this.dioriteHelmet = ITEMS.register("diorite_helmet", () -> new ArmorItem(ModArmorTiers.STONE, ArmorItem.Type.HELMET, new Item.Properties()));
        this.dioriteChestplate = ITEMS.register("diorite_chestplate", () -> new ArmorItem(ModArmorTiers.STONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.dioriteLeggings = ITEMS.register("diorite_leggings", () -> new ArmorItem(ModArmorTiers.STONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.dioriteBoots = ITEMS.register("diorite_boots", () -> new ArmorItem(ModArmorTiers.STONE, ArmorItem.Type.BOOTS, new Item.Properties()));
        
        this.graniteHelmet = ITEMS.register("granite_helmet", () -> new ArmorItem(ModArmorTiers.STONE, ArmorItem.Type.HELMET, new Item.Properties()));
        this.graniteChestplate = ITEMS.register("granite_chestplate", () -> new ArmorItem(ModArmorTiers.STONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.graniteLeggings = ITEMS.register("granite_leggings", () -> new ArmorItem(ModArmorTiers.STONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.graniteBoots = ITEMS.register("granite_boots", () -> new ArmorItem(ModArmorTiers.STONE, ArmorItem.Type.BOOTS, new Item.Properties()));
        
        this.deepslateCobbleHelmet = ITEMS.register("deepslate_cobble_helmet", () -> new ArmorItem(ModArmorTiers.STONE, ArmorItem.Type.HELMET, new Item.Properties()));
        this.deepslateCobbleChestplate = ITEMS.register("deepslate_cobble_chestplate", () -> new ArmorItem(ModArmorTiers.STONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
        this.deepslateCobbleLeggings = ITEMS.register("deepslate_cobble_leggings", () -> new ArmorItem(ModArmorTiers.STONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
        this.deepslateCobbleBoots = ITEMS.register("deepslate_cobble_boots", () -> new ArmorItem(ModArmorTiers.STONE, ArmorItem.Type.BOOTS, new Item.Properties()));
        
        ITEMS.register(eventBus);
    }
}
