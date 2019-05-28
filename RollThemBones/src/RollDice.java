import java.util.Scanner;

public class RollDice {
	
public static String playersDice() {
		
		String[]playersDice;
    	playersDice = new String[6];   ///need to change to a string of Int. for vaule . 
    	playersDice[0] = "1";
    	playersDice[1] = "2";
    	playersDice[2] = "3";
    	playersDice[3] = "4";
    	playersDice[4] = "5";
    	playersDice[5] = "6";
    	
		
	int random = (int) (Math.random()*6);
			{
				System.out.println("You rolled: " + playersDice[random]);
				return playersDice[random];
				
			}
	}
	
	public static String instaWinOrLosse() {
		 int x = instaWinOrLosse;

	      if( x == 7 ) {
	         System.out.print("You win ");
	      }else if( x == 11 ) {
	         System.out.print("You Win ");
	      }else if( x == 2 ) {
	         System.out.print("You Losse");	         
	      }else if( x == 3 ) {
	         System.out.print("You Losse");
	      }else if(x == 12) {
	    	  System.out.println("You Losse");
	   }
	}
	
			
	public static String playersPoint() {
		
	}

//	public static String playersExtraRoll() {
//		 
//	
//	
//		Scanner myObj = new Scanner(System.in);  
//		System.out.println("Will you roll again?");  ///dont think i need to ask this as the game is auto till a win or loose condation is meant 
//		String userInput = myObj.nextLine(); 
//		
//		
//		
//			if ((userInput = myObj.nextLine()) != "yes") {
//				String newRoll = playersDice();
//					System.out.println("Your  roll is: " + newRoll);
//					System.out.println("roll again ");
//			}
//					else {
//        		System.out.println("Your Holding");
//        		
//        			
//			}
//				
//			return userInput;
//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String dice1 = playersDice();
		String dice2 = playersDice();
		instaWinOrLosse();
		playersPoint();
		
		//String card3 = playersCards();
		//String card4 = playersCards();
		//String myarPlayer[] = {card1, card2};
		//String myarComputer[] = {card3, card4};
		//System.out.println(myarPlayer);
		//System.out.println(myarComputer);
	
		//playersExtraRoll();
		
		
	}

}






# Mid Course Project

Given the following rules for the game of dice, create a program that prints out whether you won or lost on each roll. Below are the requirements for this program. 

The player rolls two 6-sided dice (hint: use 1 + (int)(Math.random() * 6) ) to generate a random number between 1 and 6.

Rolling 7 or 11 on the first try is a WIN 
Rolling 2, 3 or 12 on the first try is a LOSE 
Any other roll on the first try becomes the player's POINT 
If a player rolled POINT, the player continues to roll until one of two things happens:
If a player has POINT and rolls the POINT again, it is a WIN 
If a player has POINT and rolls 7, it is a LOST 

Example runs:

You rolled 7.
You win!

You rolled 12.
You lose!

You rolled 4. POINT is 4.
You rolled 3. POINT is 4.
You rolled 11. POINT is 4.
You rolled 4.
You win!
