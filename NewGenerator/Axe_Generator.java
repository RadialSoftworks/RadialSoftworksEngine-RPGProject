public class Axe_Generator {
	
	static void getAxe() {

		// The Hobo of Power's Weapon Generator 2.0

		int axeTypePicker = 1 + (int) (Math.random() * 3);
		int axeDamage = 50 + (int) (Math.random() * 50);
		String axeRarity = null;
		String axeType = null;
		String axeTier = null;


		// Selecting an axe type

		switch (axeTypePicker) {
		case 1: axeType = "Broad Axe";  break;
		case 2: axeType = "Battle Axe"; break;
		case 3: axeType = "Shephard's Axe";   break;
		}

		// Calculating axe tier & rarity

		if (axeDamage <= 60) { 
			axeTier = "Copper";
			axeRarity = "Common";
		} else if (axeDamage <= 70)  { 
			axeTier = "Bronze";
			axeRarity = "Uncommon";
		} else if (axeDamage <= 80)  {
			axeTier = "Iron";
			axeRarity = "Rare";
		} else if (axeDamage <= 90)  {
			axeTier = "Steel";
			axeRarity = "Ultra Rare";
		} else if (axeDamage <= 100) {
			axeTier = "Mithril";
			axeRarity = "Legendary";
		}
		
		// Getting a prefix & enchantment
		Prefix_Generator.getPrefix();
		Enchantment_Generator.getEnchantment();
		
		

		// Console item information
		System.out.println("Axe: " + Prefix_Generator.prefixPicked + " " + axeTier + " " + axeType);
		System.out.println("Damage: " + axeDamage);
		System.out.println("Rarity: " + axeRarity);
		System.out.println("Enchantment: " + Enchantment_Generator.enchantmentPicked);
	}
}