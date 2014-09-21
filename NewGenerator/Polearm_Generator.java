public class Polearm_Generator {
	
	static void getPolearm() {

		// The Hobo of Power's Weapon Generator 2.0

		int polearmTypePicker = 1 + (int) (Math.random() * 4);
		int polearmDamage = 50 + (int) (Math.random() * 50);
		String polearmRarity = null;
		String polearmType = null;
		String polearmTier = null;


		// Selecting a polearm type

		switch (polearmTypePicker) {
		case 1: polearmType = "Halberd";    break;
		case 2: polearmType = "Sparth";     break;
		case 3: polearmType = "Maul";       break;
		case 4: polearmType = "War Scythe"; break;
		}

		// Calculating polearm tier & rarity

		if (polearmDamage <= 60) { 
			polearmTier = "Copper";
			polearmRarity = "Common";
		} else if (polearmDamage <= 70)  { 
			polearmTier = "Bronze";
			polearmRarity = "Uncommon";
		} else if (polearmDamage <= 80)  {
			polearmTier = "Iron";
			polearmRarity = "Rare";
		} else if (polearmDamage <= 90)  {
			polearmTier = "Steel";
			polearmRarity = "Ultra Rare";
		} else if (polearmDamage <= 100) {
			polearmTier = "Mithril";
			polearmRarity = "Legendary";
		}
		
		// Getting a prefix & enchantment
		Prefix_Generator.getPrefix();
		Enchantment_Generator.getEnchantment();
		
		

		// Console item information
		System.out.println("Polearm: " + Prefix_Generator.prefixPicked + " " + polearmTier + " " + polearmType);
		System.out.println("Damage: " + polearmDamage);
		System.out.println("Rarity: " + polearmRarity);
		System.out.println("Enchantment: " + Enchantment_Generator.enchantmentPicked);
	}
}