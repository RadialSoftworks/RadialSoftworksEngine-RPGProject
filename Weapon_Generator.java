package com.RadialSoftworks.www;

public class Weapon_Generator {
	static void genWeapon() {
		int wepSelect = 1 + (int) (Math.random() * 9);

		switch (wepSelect) {
		case 1: Axe_Generator.getAxe();                        break;
		case 2: BluntWeapon_Generator.getbluntWeapon();        break;
		case 3: Bow_Generator.getBow();                        break;
		case 4: Dagger_Generator.getDagger();                   break;
		case 5: Polearm_Generator.getPolearm();                break;
		case 6: Spear_Generator.getSpear();                    break;
		case 7: Staff_Generator.getStaff();                    break;
		case 8: Sword_Generator.getSword();                    break;
		case 9: TwoHandedSword_Generator.getTwoHandedSword(); break;
		}
	}
}
