
public class RollDice {
	static int dice1 = playersDice();
	static int dice2 = playersDice();
	static int point = diceHand(dice1,dice2);
	
	public static void main(String[] args) {
		//Getting the values for two dice.
		
		System.out.println("You rolled a " + point);
		firstRoll(point);
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
	
	//Method to check the roll value and determine if it is a winning hand or lose hand.	
	public static void firstRoll(int x) {
		if(x == 7 || x == 11) {
			System.out.println("YOU WIN!!");
		}
		else if(x == 2 || x == 3 || x == 12) {
			System.out.println("You lose :(");
		}
		else {
			System.out.println("POINT is " + x);
			int newRoll = playersDice();
			int dice3 = playersDice();
			System.out.println("You rolled " + dice3 + " POINT is " + x);
			if (dice3 == x) {
				System.out.println("You Win Game Over.");
				}
			else if(dice3 == 7){
				System.out.println("Sorry bud you lose.");
				}
			else {
				while(dice3 != x) {
					dice3 = diceHand(playersDice(),playersDice());
					System.out.println("You rolled " + dice3 + " POINT is " + x);
					if(dice3 == x) {
						System.out.println("You Win!");
						break;
						}
					else if(dice3 == 7) {
						System.out.println("Take this L buddy.");
						break;
						}
					}
				}
			}
		}
}
	
