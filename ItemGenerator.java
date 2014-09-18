package com.RadialSoftworks.www;

public class ItemGenerator {
	public static void main(String[] args) {

		// The Hobo of Power's Weapon Generator

		// Calculating weapon properties

		int damage = 2 + (int) (Math.random() * 9);
		int rarity = damage;
		int enchantment = 1 + (int) (Math.random() * 10);
		int modifierChooser = 1 + (int) (Math.random() * 6);
		String modifier = ("Error!");
		String weaponType = ("Error!");
		String weaponQuality = ("n Error ");
		int modified = 0;
		int ranged = 0;

		// Picking a weapon

		int weaponChooser = 1 + (int) (Math.random() * 3);

		// Swords
		if (weaponChooser == 1) {
			if (damage <= 4) {
				weaponQuality = ("n Iron ");
			} else if (damage <= 7) {
				weaponQuality = (" Steel ");
			} else
				weaponQuality = (" Legendary ");
			weaponType = ("Sword");
			System.out
					.println("You found a" + weaponQuality + weaponType + "!");

			// Bows

		} else if (weaponChooser == 2) {
			ranged = 1;
			if (damage <= 4) {
				weaponQuality = (" Shortbow!");
			} else if (damage <= 7) {
				weaponQuality = (" Recurve Bow!");
			} else
				weaponQuality = (" Crossbow!");
			weaponType = ("Bow");
			System.out.println("You found a" + weaponQuality);

			// Daggers
			
		} else if (weaponChooser == 3) {
			if (damage <= 4) {
				weaponQuality = ("n Iron ");
			} else if (damage <= 7) {
				weaponQuality = (" Mithril ");
			} else
				weaponQuality = (" Shadow ");
			weaponType = ("Dagger");

			System.out
					.println("You found a" + weaponQuality + weaponType + "!");
		}

		// Enchantments (1)
		
		if (enchantment == 9)
			rarity = rarity + 4;
		if (enchantment == 8)
			rarity = rarity + 4;
		TheHoboOfPower: // Choosing a modifier
		if (rarity >= 7) {
			if (modifierChooser == 3) {
				if (ranged == 0) {
					modifier = ("Sharpened (+2 Damage)");
					damage = damage + 2;
					modified = 1;
					rarity = rarity + 2;
				} else {
					modifier = ("Accurate (2+ Accuracy)");
					modified = 1;
					rarity = rarity + 2;
				}
			}
			if (modifierChooser == 4) {
				modifier = ("Lightweight (2+ Agility)");
				modified = 1;
				rarity = rarity + 2;
			}
			if (modifierChooser == 5) {
				modifier = ("Heavy (+2 Damage, -2 Agility)");
				rarity = rarity - 1;
				damage = damage + 2;
				modified = 1;
			}
		}

		// Displaying weapon statistics
		
		System.out.println("------------------------");
		System.out.println("Stats: ");
		System.out.println(" ");
		System.out.println(weaponType + " Damage: " + damage);

		// Display modifier
		
		if (modified == 1) {
			System.out.println("Modifier: " + modifier);
		}

		// Enchantments (2)
		
		if (enchantment == 9)
			System.out.println("Enchantment: Fire");
		if (enchantment == 8)
			System.out.println("Enchantment: Ice`");

		// Calculating sword rarity
		
		System.out.println("------------------------");
		if (rarity <= 4) {
			System.out.println("This item is worthless.");
		} else if (rarity <= 6) {
			System.out.println("This item is common.");
		} else if (rarity <= 9) {
			System.out.println("This item is uncommon.");
		} else if (rarity <= 13) {
			System.out.println("This item is rare!");
		} else if (rarity >= 14) {
			System.out.println("This item is ultra rare!");
		}
	}
}
