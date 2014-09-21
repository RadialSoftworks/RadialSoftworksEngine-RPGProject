package com.RadialSoftworks.www;

public class Prefix_Generator {

	public static String prefixPicked = "Inexpensive";
	
	static void getPrefix() {
		
		//Snailfecher's Prefixes
		
		
		//This selects a Prefix between 0 and 21
		int prefixPicker = 0 + (int) (Math.random() * 21);
	
		//These are the prefixes for now(to be optimized)
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
		
	}

}