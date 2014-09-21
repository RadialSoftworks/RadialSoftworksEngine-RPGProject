package com.RadialSoftworks.www;

public class Spear_Generator {
	
	static void getSpear() {

		// The Hobo of Power's Weapon Generator 2.0

		int spearTypePicker = 1 + (int) (Math.random() * 4);
		int spearDamage = 50 + (int) (Math.random() * 50);
		String spearRarity = null;
		String spearType = null;
		String spearTier = null;


		// Selecting a spear type

		switch (spearTypePicker) {
		case 1: spearType = "Spear";   break;
		case 2: spearType = "Javelin"; break;
		case 3: spearType = "Lance";   break;
		case 4: spearType = "Pike";    break;
		}

		// Calculating spear tier & rarity

		if (spearDamage <= 60) { 
			spearTier = "Copper";
			spearRarity = "Common";
		} else if (spearDamage <= 70)  { 
			spearTier = "Bronze";
			spearRarity = "Uncommon";
		} else if (spearDamage <= 80)  {
			spearTier = "Iron";
			spearRarity = "Rare";
		} else if (spearDamage <= 90)  {
			spearTier = "Steel";
			spearRarity = "Ultra Rare";
		} else if (spearDamage <= 100) {
			spearTier = "Mithril";
			spearRarity = "Legendary";
		}
		
		// Getting a prefix & enchantment
		Prefix_Generator.getPrefix();
		Enchantment_Generator.getEnchantment();
		
		

		// Console item information
		System.out.println("Spear: " + Prefix_Generator.prefixPicked + " " + spearTier + " " + spearType);
		System.out.println("Damage: " + spearDamage);
		System.out.println("Rarity: " + spearRarity);
		System.out.println("Enchantment: " + Enchantment_Generator.enchantmentPicked);
	}
}