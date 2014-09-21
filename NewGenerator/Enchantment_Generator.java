public class Enchantment_Generator {

	public static String enchantmentPicked = "None";
	
	static void getEnchantment() {
		
		//Snailfecher's Enchantments
		
		
		//This selects a Prefix between 0 and 21
		int enchantmentPicker = 0 + (int) (Math.random() * 10);
	
		String en0 = "Fire";
		String en1 = "Ice";
		String en2 = "Electric";
		String en3 = "Vampiric Drain";
		String en4 = "Necrosis";

		switch(enchantmentPicker)
		{
			case 0: enchantmentPicked = en0; break;
			case 1: enchantmentPicked = en1; break;
			case 2: enchantmentPicked = en2; break;
			case 3: enchantmentPicked = en3; break;
			case 4: enchantmentPicked = en4; break;
		}
		
	}

}