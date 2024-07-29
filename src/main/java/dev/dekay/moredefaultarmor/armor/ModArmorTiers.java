package dev.dekay.moredefaultarmor.armor;

import dev.dekay.moredefaultarmor.MoreDefaultArmor;
import dev.dekay.moredefaultarmor.util.LazyValue;
import dev.dekay.moredefaultarmor.util.ModMaterial;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import org.jetbrains.annotations.NotNull;

import java.util.function.Supplier;

public enum ModArmorTiers implements ArmorMaterial {

    // Overworld
    DIRT("dirt", ModMaterial.DIRT, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.DIRT), new int[]{19, 28, 32, 25}),
    OAK("oak", ModMaterial.OAK, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.OAK_LOG), new int[]{45, 52, 55, 48}),
    COBBLESTONE("cobblestone", ModMaterial.STONE, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.COBBLESTONE), new int[]{79, 84, 81, 68}),
    ANDESITE("andesite", ModMaterial.STONE, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.ANDESITE), new int[]{79, 84, 81, 68}),
    DIORITE("diorite", ModMaterial.STONE, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.DIORITE), new int[]{79, 84, 81, 68}),
    GRANITE("granite", ModMaterial.STONE, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.GRANITE), new int[]{79, 84, 81, 68}),
    DEEPSLATE_COBBLE("deepslate_cobble", ModMaterial.STONE, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.COBBLED_DEEPSLATE), new int[]{79, 84, 81, 68}),

    // Nether
    NETHERRACK("netherrack", ModMaterial.NETHERRACK, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.NETHERRACK), new int[]{19, 28, 32, 25}),

    // End
    END_STONE("end_stone", ModMaterial.END_STONE, SoundEvents.ARMOR_EQUIP_LEATHER, () -> Ingredient.of(Items.END_STONE), new int[]{79, 84, 81, 68});


    private final String name;
    private final int[] baseDurability;
    private final ModMaterial material;
    private final SoundEvent equipSound;
    private final LazyValue<Ingredient> repairMaterial;

    ModArmorTiers(String name, ModMaterial material, SoundEvent equipSound, Supplier<Ingredient> repairMaterial, int[] baseDurability) {
        this.name = name;
        this.material = material;
        this.baseDurability = baseDurability;
        this.equipSound = equipSound;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    @Override
    public int getDurabilityForType(ArmorItem.Type type) {
        return baseDurability[type.getSlot().getIndex()];
    }

    @Override
    public int getDefenseForType(ArmorItem.Type type) {
        return this.material.getProtectionAmounts()[type.getSlot().getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.getEnchantmentValue();
    }

    @Override
    public @NotNull SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public @NotNull Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public @NotNull String getName() {
        return MoreDefaultArmor.MODID + ":" + this.name;
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
