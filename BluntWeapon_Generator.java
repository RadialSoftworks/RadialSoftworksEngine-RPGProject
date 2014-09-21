package com.RadialSoftworks.www;

public class BluntWeapon_Generator {
	
	static void getbluntWeapon() {

		// The Hobo of Power's Weapon Generator 2.0

		int bluntWeaponTypePicker = 1 + (int) (Math.random() * 4);
		int bluntWeaponDamage = 50 + (int) (Math.random() * 50);
		String bluntWeaponRarity = null;
		String bluntWeaponType = null;
		String bluntWeaponTier = null;


		// Selecting an bluntWeapon type

		switch (bluntWeaponTypePicker) {
		case 1: bluntWeaponType = "Mace";         break;
		case 2: bluntWeaponType = "Morning Star"; break;
		case 3: bluntWeaponType = "Flail";        break;
		case 4: bluntWeaponType = "War Hammer";   break;
		}

		// Calculating bluntWeapon tier & rarity

		if (bluntWeaponDamage <= 60) { 
			bluntWeaponTier = "Copper";
			bluntWeaponRarity = "Common";
		} else if (bluntWeaponDamage <= 70)  { 
			bluntWeaponTier = "Bronze";
			bluntWeaponRarity = "Uncommon";
		} else if (bluntWeaponDamage <= 80)  {
			bluntWeaponTier = "Iron";
			bluntWeaponRarity = "Rare";
		} else if (bluntWeaponDamage <= 90)  {
			bluntWeaponTier = "Steel";
			bluntWeaponRarity = "Ultra Rare";
		} else if (bluntWeaponDamage <= 100) {
			bluntWeaponTier = "Mithril";
			bluntWeaponRarity = "Legendary";
		}
		
		// Getting a prefix & enchantment
		Prefix_Generator.getPrefix();
		Enchantment_Generator.getEnchantment();
		
		// Console item information
		System.out.println("Blunt Weapon: " + Prefix_Generator.prefixPicked + " " + bluntWeaponTier + " " + bluntWeaponType);
		System.out.println("Damage: " + bluntWeaponDamage);
		System.out.println("Rarity: " + bluntWeaponRarity);
		System.out.println("Enchantment: " + Enchantment_Generator.enchantmentPicked);
	}
}