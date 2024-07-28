package dev.dekay.moredefaultarmor;


import lombok.Getter;

public class Config {

    @Getter
    public enum DefaultMaterial {
        DIRT("dirt",  1, 1, 1, 1, 0, 0, 0),
        OAK("oak", 1, 2, 2, 1, 0, 0, 0),
        STONE("cobblestone", 2, 3, 4, 1, 0, 0, 0);

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
    }
}
