import java.util.Random;
import java.util.Scanner;

public class Fighting{

	public static void main(String[] args){
		/*
		 * Objective of the game is to have the player attack the monster and vice versa 
		 * to determine who has the higher attack point to win the round.
		 * 
		 * If the player attack point is higher than the monster defence points,
		 * monster lifepoint is equal to player attack point minus monster defence points and vice versa.
		 * 
		 * If defence points is higher than the attacker's attack point the the attack is not successful.
		 * 
		 * Create 3 class which is the monster, player and dice class containing the attributes below:
		 * Attributes of Monster and Player
		 * Attack points
		 * Defence points
		 * Damage
		 * Life Points
		 */

		//Declare Scanner object
		Scanner sc = new Scanner(System.in);

		/*
		 * Monster Attributes
		 */
		System.out.println("Monster Attack Points: ");
		int monsterAttack = sc.nextInt();
		System.out.println("Monster Defence Points: ");
		int monsterDefence = sc.nextInt();
		System.out.println("Monster Damage: ");
		int monsterDamage = sc.nextInt();
		System.out.println("Monster Life Points: ");
		int monsterLifePoints = sc.nextInt();

		/*
		 * Player Attributes
		 */
		System.out.println("Player Attack Points: ");
		int playerAttack = sc.nextInt();
		System.out.println("Player Defence Points: ");
		int playerDefence = sc.nextInt();
		System.out.println("Player Damage: ");
		int playerDamage = sc.nextInt();
		System.out.println("Player Life Points: ");
		int playerLifePoints = sc.nextInt();

		/*
		 * Generating random number
		 */
		Random generator = new Random();
		
		/*
		 * This will determine if the monster or the player is the attacker
		 */
		boolean attacker = generator.nextBoolean();
		if(attacker) {
			System.out.println("Player attack!");
			/*
			 * Declaring a variable of "dice" to store the dice.
			 * nextInt(6)+1 = 6 sides of the dice which consists number 1,2,3,4,5 & 6 and +1 means the quantity of the dice.
			 */
			int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1;
			int attackValue = playerAttack + dice;
			System.out.println("Rolled Value: " + dice); 
			System.out.println("Player's attack value: " + attackValue);
			
			if(attackValue > monsterDefence) {
				System.out.println("Player attack is succesful!");				
				monsterLifePoints = monsterLifePoints - playerDamage;			
				System.out.println("Monster remaining life: " + monsterLifePoints);				
			}else {
				System.out.println("Player attack is unsuccessful..");
			}	
			
		}else {
			
			System.out.println("Monster attack");
			int dice = generator.nextInt(6)+1 + generator.nextInt(6)+1;
			int attackValue = monsterAttack + dice;
			System.out.println("Rolled Value: " + dice); 
			System.out.println("Monster's attack value: " + attackValue);
			
			if(attackValue > playerDefence) {
				System.out.println("Monster attack is successful!");
				playerLifePoints = playerLifePoints - monsterDamage;
				System.out.println("Player remaining life: " + playerLifePoints);
			}else {
				System.out.println("Monster attack is unsuccessful..");
			}
		}
		
		
		


	}//closing bracket for main method
}// closing bracket for "Fighting" class