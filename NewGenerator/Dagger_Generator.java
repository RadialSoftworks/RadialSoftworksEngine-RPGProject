public class Dagger_Generator {
	
	static void getDagger() {

		// The Hobo of Power's Weapon Generator 2.0

		int daggerTypePicker = 1 + (int) (Math.random() * 5);
		int daggerDamage = 50 + (int) (Math.random() * 50);
		String daggerRarity = null;
		String daggerType = null;
		String daggerTier = null;


		// Selecting a dagger type

		switch (daggerTypePicker) {
		case 1: daggerType = "Bladed-Gauntlets"; break;
		case 2: daggerType = "Sword Gauntlet";   break;
		case 3: daggerType = "Katar";            break;
		case 4: daggerType = "Dirk";             break;
		case 5: daggerType = "Stiletto";         break;
		}

		// Calculating dagger tier & rarity

		if (daggerDamage <= 60) { 
			daggerTier = "Copper";
			daggerRarity = "Common";
		} else if (daggerDamage <= 70)  { 
			daggerTier = "Bronze";
			daggerRarity = "Uncommon";
		} else if (daggerDamage <= 80)  {
			daggerTier = "Iron";
			daggerRarity = "Rare";
		} else if (daggerDamage <= 90)  {
			daggerTier = "Steel";
			daggerRarity = "Ultra Rare";
		} else if (daggerDamage <= 100) {
			daggerTier = "Mithril";
			daggerRarity = "Legendary";
		}
		
		// Getting a prefix & enchantment
		Prefix_Generator.getPrefix();
		Enchantment_Generator.getEnchantment();
		
		

		// Console item information
		System.out.println("Dagger: " + Prefix_Generator.prefixPicked + " " + daggerTier + " " + daggerType);
		System.out.println("Damage: " + daggerDamage);
		System.out.println("Rarity: " + daggerRarity);
		System.out.println("Enchantment: " + Enchantment_Generator.enchantmentPicked);
	}
}