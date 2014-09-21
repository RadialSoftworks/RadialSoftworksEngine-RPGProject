package com.RadialSoftworks.www;

public class weaponGenerator {
	
	String weaponType = "axe";

	public weaponGenerator(String weaponType, String rarity) {
		
		if (weaponType.equalsIgnoreCase("axe")) {
			
			if (Prefix_Generator.prefixPicked.equalsIgnoreCase("Inexpensive")) {
				
				System.out.println("It works");
				
			}
			
		}
	
	}
	
}
