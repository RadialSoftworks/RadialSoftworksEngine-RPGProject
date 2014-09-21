public class Bow_Generator {
	
	static void getBow() {

		// The Hobo of Power's Weapon Generator 2.0

		int bowTypePicker = 1 + (int) (Math.random() * 4);
		int bowDamage = 50 + (int) (Math.random() * 50);
		String bowRarity = null;
		String bowType = null;
		String bowTier = null;


		// Selecting a bow type

		switch (bowTypePicker) {
		case 1: bowType = "Longbow";            break;
		case 2: bowType = "Recurve Bow";        break;
		case 3: bowType = "Self Bow";           break;
		case 4: bowType = "Repeating Crossbow"; break;
		}

		// Calculating bow tier & rarity

		if (bowDamage <= 60) { 
			bowTier = "Oak";
			bowRarity = "Common";
		} else if (bowDamage <= 70)  { 
			bowTier = "Bamboo";
			bowRarity = "Uncommon";
		} else if (bowDamage <= 80)  {
			bowTier = "Hickory";
			bowRarity = "Rare";
		} else if (bowDamage <= 90)  {
			bowTier = "Yew";
			bowRarity = "Ultra Rare";
		} else if (bowDamage <= 100) {
			bowTier = "Ebony";
			bowRarity = "Legendary";
		}
		
		// Getting a prefix & enchantment
		Prefix_Generator.getPrefix();
		Enchantment_Generator.getEnchantment();
		
		

		// Console item information
		System.out.println("Bow: " + Prefix_Generator.prefixPicked + " " + bowTier + " " + bowType);
		System.out.println("Damage: " + bowDamage);
		System.out.println("Rarity: " + bowRarity);
		System.out.println("Enchantment: " + Enchantment_Generator.enchantmentPicked);
		
	}
}