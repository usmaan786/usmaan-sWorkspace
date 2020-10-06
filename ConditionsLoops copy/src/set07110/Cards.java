//remember the package name comes first
package set07110;

//Then remember to import any built in Java classes
import java.util.Random;
import java.util.Scanner;

//Then define the class 
public class Cards {

	public static void main(String[] args) {

		// An array of suits and ranks which we will use to create a pack of cards
		String[] suits = { "Clubs", "Diamonds", "Hearts", "Spades" };

		String[] ranks = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack",
				"Queen", "King" };

		// Create a String array to hold our pack of cards
		String[] cards = new String[52];

		// Populate the cards array using a nested for each loop to create 52 Strings
		int index = 0;
		for (String suit : suits) {
			for (String rank : ranks) {
				
				//create the card string
				String card = rank + " of " + suit;
				
				// add it to the pack and increment the index
				cards[index] = card;
				index++;
			}
		}

		// We need a random number generator to shuffle the pack of cards.
		Random random = new Random();

		// shuffle the cards by randomly swapping two cards 30 times. 
		for (int i = 0; i < 30; i++) {
			int index1 = random.nextInt(52);
			int index2 = random.nextInt(52);

			// we need to use a temporary String variable to swap two cards 
			String temporaryCard = cards[index1];
			cards[index1] = cards[index2];
			cards[index2] = temporaryCard;
		}

		// the cards should now be shuffled 
		
	
		// Lets have a game of higher lower.
		char response = 'Z';
		index = 0;
		
		/**
		 * ****************************************************************
		 * add your code in the following loop 
		 * ****************************************************************
		 */
		while (response != 'q' && index < 52) {
			System.out.println(cards[index]);
			
			//Add a Scanner
						
			index++;
		}//end of while loop
	}
}
