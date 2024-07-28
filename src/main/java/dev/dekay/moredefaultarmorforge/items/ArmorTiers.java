package dev.dekay.moredefaultarmorforge.items;

import dev.dekay.moredefaultarmorforge.Config;
import dev.dekay.moredefaultarmorforge.util.LazyValue;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ArmorTiers implements ArmorMaterial {

    ANDESITE(Config.DefaultMaterial.ANDESITE, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.COBBLESTONE), 79, 84, 81, 68),
    COBBLESTONE(Config.DefaultMaterial.COBBLESTONE, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.COBBLESTONE), 79, 84, 81, 68),
    DIORITE(Config.DefaultMaterial.DIORITE, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.COBBLESTONE), 79, 84, 81, 68),
    DIRT(Config.DefaultMaterial.DIRT, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.DIRT), 19, 28, 32, 25),
    OAK(Config.DefaultMaterial.OAK, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.OAK_LOG), 45, 52, 55, 48);

    private final int[] baseDurability;
    private final Config.DefaultMaterial material;
    private final SoundEvents equipSound;
    private final LazyValue<Ingredient> repairMaterial;

    ArmorTiers(Config.DefaultMaterial material, SoundEvents equipSound, Supplier<Ingredient> repairMaterial, int baseDurability) {
        this.material = material;
        this.baseDurability = new int[]{baseDurability};
        this.equipSound = equipSound;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return baseDurability[type.getSlot().getIndex()];
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return this.material.getDamageReduction()[type.getSlot().getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.getEnchantmentValue();
    }

    @Override
    public net.minecraft.sounds.SoundEvent getEquipSound() {
        return this.getEquipSound();
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public String getName() {
        return this.material.getName();
    }

    @Override
    public float getToughness() {
        return this.material.getToughness();
    }

    @Override
    public float getKnockbackResistance() {
        return this.material.getKnockbackResistance();
    }
}
