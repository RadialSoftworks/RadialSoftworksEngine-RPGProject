public class Staff_Generator {
	
	static void getStaff() {

		// The Hobo of Power's Weapon Generator 2.0

		int staffTypePicker = 1 + (int) (Math.random() * 3);
		int staffDamage = 50 + (int) (Math.random() * 50);
		String staffRarity = null;
		String staffType = null;
		String staffTier = null;


		// Selecting a staff type

		switch (staffTypePicker) {
		case 1: staffType = "Staff";   break;
		case 2: staffType = "Scepter"; break;
		case 3: staffType = "Wand";    break;
		}

		// Calculating staff tier & rarity

		if (staffDamage <= 60) { 
			staffTier = "Oak";
			staffRarity = "Common";
		} else if (staffDamage <= 70)  { 
			staffTier = "Bamboo";
			staffRarity = "Uncommon";
		} else if (staffDamage <= 80)  {
			staffTier = "Hickory";
			staffRarity = "Rare";
		} else if (staffDamage <= 90)  {
			staffTier = "Yew";
			staffRarity = "Ultra Rare";
		} else if (staffDamage <= 100) {
			staffTier = "Ebony";
			staffRarity = "Legendary";
		}
		
		// Getting a prefix & enchantment
		Prefix_Generator.getPrefix();
		Enchantment_Generator.getEnchantment();
		
		

		// Console item information
		System.out.println("Staff: " + Prefix_Generator.prefixPicked + " " + staffTier + " " + staffType);
		System.out.println("Damage: " + staffDamage);
		System.out.println("Rarity: " + staffRarity);
		System.out.println("Enchantment: " + Enchantment_Generator.enchantmentPicked);
		
	}
}