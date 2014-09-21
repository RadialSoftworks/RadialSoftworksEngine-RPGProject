public class TwoHandedSword_Generator {
	
	static void getTwoHandedSword() {

		// The Hobo of Power's Weapon Generator 2.0

		int twoHandTypePicker = 1 + (int) (Math.random() * 2);
		int twoHandDamage = 50 + (int) (Math.random() * 50);
		String twoHandRarity = null;
		String twoHandType = null;
		String twoHandTier = null;


		// Selecting a twoHand type

		switch (twoHandTypePicker) {
		case 1: twoHandType = "Long Sword";  break;
		case 2: twoHandType = "Great Sword"; break;
		}

		// Calculating twoHand tier & rarity

		if (twoHandDamage <= 60) { 
			twoHandTier = "Copper";
			twoHandRarity = "Common";
		} else if (twoHandDamage <= 70)  { 
			twoHandTier = "Bronze";
			twoHandRarity = "Uncommon";
		} else if (twoHandDamage <= 80)  {
			twoHandTier = "Iron";
			twoHandRarity = "Rare";
		} else if (twoHandDamage <= 90)  {
			twoHandTier = "Steel";
			twoHandRarity = "Ultra Rare";
		} else if (twoHandDamage <= 100) {
			twoHandTier = "Mithril";
			twoHandRarity = "Legendary";
		}
		
		// Getting a prefix & enchantment
		Prefix_Generator.getPrefix();
		Enchantment_Generator.getEnchantment();
		
		

		// Console item information
		System.out.println("Two Handed Sword: " + Prefix_Generator.prefixPicked + " " + twoHandTier + " " + twoHandType);
		System.out.println("Damage: " + twoHandDamage);
		System.out.println("Rarity: " + twoHandRarity);
		System.out.println("Enchantment: " + Enchantment_Generator.enchantmentPicked);
	}
}