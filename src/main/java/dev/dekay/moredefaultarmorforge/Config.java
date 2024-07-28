package dev.dekay.moredefaultarmorforge;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public class Config {

    public enum DefaultMaterial {
        ANDESITE("andesite", 2, 3, 4, 1, 0, 0, 0),
        COBBLESTONE("cobblestone", 2, 3, 4, 1, 0, 0, 0),
        DIORITE("diorite", 2, 3, 4, 1, 0, 0, 0),
        GRANIT("granit", 2, 3, 4, 1, 0, 0, 0),
        DIRT("dirt",  1, 1, 1, 1, 0, 0, 0),
        OAK("oak", 1, 2, 2, 1, 0, 0, 0);

        private final String name;
        private final int[] protectionAmounts;
        private final int enchantmentValue;
        private final float toughness;
        private final float knockbackResistance;

        DefaultMaterial(String name, int headReduction, int chestReduction, int leggingsReduction, int bootsReduction, int enchantmentValue, float toughness, float knockbackResistance) {
            this.name = name;
            this.protectionAmounts = new int[]{bootsReduction, leggingsReduction, chestReduction, headReduction};
            this.enchantmentValue = enchantmentValue;
            this.toughness = toughness;
            this.knockbackResistance = knockbackResistance;
        }

        public String getName() {
            return this.name;
        }

        public int[] getDamageReduction() {
            return this.protectionAmounts;
        }

        public int getEnchantmentValue() {
            return this.enchantmentValue;
        }

        public float getToughness() {
            return this.toughness;
        }

        public float getKnockbackResistance() {
            return this.knockbackResistance;
        }
    }
}
