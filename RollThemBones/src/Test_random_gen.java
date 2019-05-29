import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_random_gen {

	@Test
	void diceNumberCheck() {
//		assertEquals(4,playersDice());
	}
	
	public static int playersDice() {
		int[] playersDice = {1,2,3,4,5,6};
    	int random = (int) (Math.random()*6);
    	
    	System.out.println("You rolled: " + playersDice[random]);
    	return playersDice[random];
    	}
	
	@Test
	void diceHandCheck() {
		assertEquals(7,diceHand(3,4));
	}
	
	public static int diceHand(int dice1, int dice2) {
		int sum = dice1 + dice2;
		return sum;
	}

	@Test
	void doesThisThingWork(){
		assertEquals(true,winOrLose(11));
		assertEquals(false,winOrLose(3));
	}
	public boolean winOrLose(int x) {
		if(x == 7 || x == 11) {
			return true;
		}
		else if(x == 2 || x == 3 || x == 12) {
			return false;
		}
		return false;
	}
}