package com.RadialSoftworks.www;

public class Sword_Generator {
	public static void main(String[] args) {

		// The Hobo of Power's Weapon Generator 2.0

		int swordTypePicker = 1 + (int) (Math.random() * 4);
		int swordDamage = 50 + (int) (Math.random() * 50);
		String swordRarity = null;
		String swordType = null;
		String swordTier = null;


		// Selecting a sword type

		switch (swordTypePicker) {
		case 1: swordType = "Falchion";   break;
		case 2: swordType = "Rapier";     break;
		case 3: swordType = "Broadsword"; break;
		case 4: swordType = "Shortsword"; break;
		}

		// Calculating sword tier & rarity

		if (swordDamage <= 60) { 
			swordTier = ("Copper");
			swordRarity = ("Common");
		} else if (swordDamage <= 70)  { 
			swordTier = ("Bronze");
			swordRarity = ("Uncommon");
		} else if (swordDamage <= 80)  {
			swordTier = ("Iron");
			swordRarity = ("Rare");
		} else if (swordDamage <= 90)  {
			swordTier = ("Steel");
			swordRarity = ("Ultra Rare");
		} else if (swordDamage <= 100) {
			swordTier = ("Mithril");
			swordRarity = ("Legendary");
		}
		
		Prefix_Generator.getPrefix();
		
		

		// Console item information
		System.out.println("Sword: " + Prefix_Generator.prefixPicked + " " + swordTier + " " + swordType);
		System.out.println("Damage: " + swordDamage);
		System.out.println("Rarity: " + swordRarity);
	}
}