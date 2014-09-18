public class Prefixes {
	public static void main(String[] args) {

		int metalPicker = 0 + (int) (Math.random() * 5);
		int weaponPicker = 0 + (int) (Math.random() * 4);
		int prefixPicker = 0 + (int) (Math.random() * 21);
		int weaponFindChance = 0 + (int) (Math.random() * 100);

		if (weaponFindChance <= 15) {

			String m0 = "Copper";
			String m1 = "Bronze";
			String m2 = "Iron";
			String m3 = "Steel";
			String m4 = "Mithril";
			String metalPicked = "Fill";

			String w0 = "Short Sword";
			String w1 = "Broadsword";
			String w2 = "Falchion";
			String w3 = "Dagger";
			String weaponPicked = "Fill";

			String pf0 = "Inexspensive";
			String pf1 = "Fierce";
			String pf2 = "Mysterious";
			String pf3 = "Precise";
			String pf4 = "Scrawny";
			String pf5 = "Ancient";
			String pf6 = "Swift";
			String pf7 = "Rusty";
			String pf8 = "Lightweight";
			String pf9 = "Filthy";
			String pf10 = "Victorious";
			String pf11 = "Worthless";
			String pf12 = "Superb";
			String pf13 = "Astonishing";
			String pf14 = "Ethereal";
			String pf15 = "Delicate";
			String pf16 = "Durable";
			String pf17 = "Enchanted";
			String pf18 = "Average";
			String pf19 = "Incredible";
			String pf20 = "Thundering";
			String prefixPicked = "Fill";

			if (metalPicker == 0)
				metalPicked = m0;
			else if (metalPicker == 1)
				metalPicked = m1;
			else if (metalPicker == 2)
				metalPicked = m2;
			else if (metalPicker == 3)
				metalPicked = m3;
			else if (metalPicker == 4)
				metalPicked = m4;

			if (weaponPicker == 0)
				weaponPicked = w0;
			else if (weaponPicker == 1)
				weaponPicked = w1;
			else if (weaponPicker == 2)
				weaponPicked = w2;
			else if (weaponPicker == 3)
				weaponPicked = w3;
			
			switch(prefixPicker)
			{
				case 0: prefixPicked = pf0; break;
				case 1: prefixPicked = pf1; break;
				case 2: prefixPicked = pf2; break;
				case 3: prefixPicked = pf3; break;
				case 4: prefixPicked = pf4; break;
				case 5: prefixPicked = pf5; break;
				case 6: prefixPicked = pf6; break;
				case 7: prefixPicked = pf7; break;
				case 8: prefixPicked = pf8; break;
				case 9: prefixPicked = pf9; break;
				case 10:prefixPicked = pf10;break;
				case 11:prefixPicked = pf11;break;
				case 12:prefixPicked = pf12;break;
				case 13:prefixPicked = pf13;break;
				case 14:prefixPicked = pf14;break;
				case 15:prefixPicked = pf15;break;
				case 16:prefixPicked = pf16;break;
				case 17:prefixPicked = pf17;break;
				case 18:prefixPicked = pf18;break;
				case 19:prefixPicked = pf19;break;
				case 20:prefixPicked = pf20;break;
			}
			/*
			if (prefixPicker == 0)
				prefixPicked = pf0;
			else if (prefixPicker == 1)
				prefixPicked = pf1;
			else if (prefixPicker == 2)
				prefixPicked = pf2;
			else if (prefixPicker == 3)
				prefixPicked = pf3;
			else if (prefixPicker == 4)
				prefixPicked = pf4;
			else if (prefixPicker == 5)
				prefixPicked = pf5;
			else if (prefixPicker == 6)
				prefixPicked = pf6;
			else if (prefixPicker == 7)
				prefixPicked = pf7;
			else if (prefixPicker == 8)
				prefixPicked = pf8;
			else if (prefixPicker == 9)
				prefixPicked = pf9;
			else if (prefixPicker == 10)
				prefixPicked = pf10;
			else if (prefixPicker == 11)
				prefixPicked = pf11;
			else if (prefixPicker == 12)
				prefixPicked = pf12;
			else if (prefixPicker == 13)
				prefixPicked = pf13;
			else if (prefixPicker == 14)
				prefixPicked = pf14;
			else if (prefixPicker == 15)
				prefixPicked = pf15;
			else if (prefixPicker == 16)
				prefixPicked = pf16;
			else if (prefixPicker == 17)
				prefixPicked = pf17;
			else if (prefixPicker == 18)
				prefixPicked = pf18;
			else if (prefixPicker == 19)
				prefixPicked = pf19;
			else if (prefixPicker == 20)
				prefixPicked = pf20;
				*/

			System.out.println("You found a " + prefixPicked + " "
					+ metalPicked + " " + weaponPicked + "!");
		} else
			System.out.println("You Didn't find anything!");

	}
}
