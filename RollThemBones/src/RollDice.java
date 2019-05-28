
public class RollDice {
	public static void main(String[] args) {
		//Getting the values for two dice.
		int dice1 = playersDice();
		int dice2 = playersDice();
		
		int hand = diceHand(dice1,dice2);
		
		System.out.println("You rolled a " + hand);
		
		firstRoll(hand);
		

		
	}
	
	
	//Getting the Rolled Dice Value
	public static int playersDice() {
		int[] playersDice = {1,2,3,4,5,6};
    	int random = (int) (Math.random()*6);
    	return playersDice[random];
    	}
	
	//Adding the dice together to get the Total value
	public static int diceHand(int dice1, int dice2) {
		int sum = dice1 + dice2;
		return sum;
	}
	
	public static int firstRoll(int x) {
		if(x == 7 || x == 11) {
			System.out.println("YOU WIN!!");
		}
		else if(x == 2 || x == 3 || x == 12) {
			System.out.println("You lose :(");
		}
		return x;
	}
	
	
	
	
}












//# Mid Course Project
//
//Given the following rules for the game of dice, create a program that prints out whether you won or lost on each roll. Below are the requirements for this program. 
//
//The player rolls two 6-sided dice (hint: use 1 + (int)(Math.random() * 6) ) to generate a random number between 1 and 6.
//
//Rolling 7 or 11 on the first try is a WIN 
//Rolling 2, 3 or 12 on the first try is a LOSE 
//Any other roll on the first try becomes the player's POINT 
//If a player rolled POINT, the player continues to roll until one of two things happens:
//If a player has POINT and rolls the POINT again, it is a WIN 
//If a player has POINT and rolls 7, it is a LOST 
//
//Example runs:
//
//You rolled 7.
//You win!
//
//You rolled 12.
//You lose!
//
//You rolled 4. POINT is 4.
//You rolled 3. POINT is 4.
//You rolled 11. POINT is 4.
//You rolled 4.
//You win!