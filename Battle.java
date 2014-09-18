public class Battle {
	public static void main(String[] args) {
		
		int randomNum = 1 + (int)(Math.random()*9); 
		
		int initiative = 10 + (int)(Math.random()*20); 
		
		double alliesHealth = 30;
		double alliesDefense = .75;
		int alliesAttack = randomNum;
		int alliesInitiative = initiative;
		boolean alliesGoesFirst = false;
		boolean allies = true;

		int enemyInitiative = initiative;
		int enemyAttack = randomNum;
		double enemyHealth = 30;
		double enemyDefense = .83;
		boolean enemyGoesFirst = false;
		boolean enemies = true;

		double alliesDamage = alliesAttack * enemyDefense;
		double enemyDamage = enemyAttack * alliesDefense;
		boolean turn = true;
		int firstTurn = 0;
		
		while (turn = true) {

			if (allies == false) {
				System.out.println("The allies took " + enemyDamage
						+ " damage and died!");
				turn = false;
				break;
			} else if (enemies == false) {
				System.out.println("The enemy took " + alliesDamage
						+ " damage and died!");
				turn = false;
				break;
			}
			if (firstTurn < 1) {
				if (alliesInitiative < enemyInitiative) {
					enemyGoesFirst = true;
					System.out.println("Enemy goes first");
					firstTurn = firstTurn + 1;
				} else {
					alliesGoesFirst = true;
					System.out.println("Allies go first");
					firstTurn = firstTurn + 1;
				}
			}

			if (enemyGoesFirst = true) {
				if (alliesHealth - enemyDamage <= 0) {
					allies = false;
				}
				alliesHealth = alliesHealth - enemyDamage;
				System.out.println("Allies took " + enemyDamage + " damage and have "
						+ alliesHealth + " health remaining");

			} else {
				if (enemyHealth - alliesDamage <= 0) {
					enemies = false;
				}
				enemyHealth = enemyHealth - alliesDamage;
				System.out.println("Enemy took " + alliesDamage + " damage and has "
						+ enemyHealth + " health remaining");

			}
			if (enemyHealth - alliesDamage <= 0) {
				enemies = false;
			}
			else
			{
			enemyHealth = enemyHealth - alliesDamage;
			System.out.println("Enemy took " + alliesDamage + " damage and has "
					+ enemyHealth + " health remaining");
			}

		}

	}
	
}
