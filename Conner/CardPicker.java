import java.util.concurrent.ThreadLocalRandom;

public class CardPicker {
	
	static int cardOne;
	static int cardTwo;
	static int cardThree;
	static int cardFour;
	static int undefinedCard;
	static String definedCard;
	static int cardValue;

		public static void main(String[] args) {
			
			// The Problem 
			
			/**7.29 (Game: pick four cards) Write a program that picks four cards from a deck of 52
			cards and computes their sum. An Ace, King, Queen, and Jack represent 1, 13,
			12, and 11, respectively. Your program should display the number of picks that
			yields the sum of 24.
			*/
			
			for (int i = 0; i < 4; i++) {
				int CardNumber = CardsPicker();
				if (i == 0) {
					cardOne = CardNumber;
				} else if (i == 1) {
					cardTwo = CardNumber;
				} else if (i == 2) {
					cardThree = CardNumber;
				} else if (i == 3) {
					cardFour = CardNumber;
				}
			}
			
			String cardOneDefined = Definer(cardOne);
			String cardTwoDefined = Definer(cardTwo);
			String cardThreeDefined = Definer(cardThree);
			String cardFourDefined = Definer(cardFour);
			
			int cardOneValue = CardValuer(cardOne);
			int cardTwoValue = CardValuer(cardTwo);
			int cardThreeValue = CardValuer(cardThree);
			int cardFourValue = CardValuer(cardFour);
			
			int totalCardsValue = (cardOneValue + cardTwoValue + cardThreeValue + cardFourValue);
			
			System.out.format("Your numbers are: %d, %d, %d, and %d.\n\n", cardOne, cardTwo, cardThree, cardFour);
			
			System.out.println("Your First card is:  " + cardOneDefined);
			System.out.println("Your Second card is: " + cardTwoDefined);
			System.out.println("Your Third card is:  " + cardThreeDefined);
			System.out.println("Your Fourth card is: " + cardFourDefined + "\n");
			
			System.out.println("The value of your First card is:  " + cardOneValue);
			System.out.println("The value of your Second card is: " + cardTwoValue);
			System.out.println("The value of your Third card is:  " + cardThreeValue);
			System.out.println("The value of your Fourth card is: " + cardFourValue + "\n");
			
			System.out.println("The total value of all of your cards is: " + totalCardsValue);

		}
		
		// This function picks four random cards.
		public static int CardsPicker() {
			
			int test = ThreadLocalRandom.current().nextInt(1, 52 + 1);
			return test;
			
		}
		
		public static String Definer(int cardToDefine) {
			
			String definedCard = CardDefiner(cardToDefine);
			return definedCard;
			
		}
		
		public static String CardDefiner(int Number) {
			
			if (Number == 1) {
				definedCard = "Ace of Spades";
				return definedCard;
			} else if (Number == 2) {
				definedCard = "King of Spades";
				return definedCard;
			} else if (Number == 3) {
				definedCard = "Queen of Spades";
				return definedCard;
			} else if (Number == 4) {
				definedCard = "Jack of Spades";
				return definedCard;
			} else if (Number == 5) {
				definedCard = "Ten of Spades";
				return definedCard;
			} else if (Number == 6) {
				definedCard = "Nine of Spades";
				return definedCard;
			} else if (Number == 7) {
				definedCard = "Eight of Spades";
				return definedCard;
			} else if (Number == 8) {
				definedCard = "Seven of Spades";
				return definedCard;
			} else if (Number == 9) {
				definedCard = "Six of Spades";
				return definedCard;
			} else if (Number == 10) {
				definedCard = "Five of Spades";
				return definedCard;
			} else if (Number == 11) {
				definedCard = "Four of Spades";
				return definedCard;
			} else if (Number == 12) {
				definedCard = "Three of Spaces";
				return definedCard;
			} else if (Number == 13) {
				definedCard = "Two of Spades";
				return definedCard;
			} else if (Number == 14) {
				definedCard = "Ace of Hearts";
				return definedCard;
			} else if (Number == 15) {
				definedCard = "King of Hearts";
				return definedCard;
			} else if (Number == 16) {
				definedCard = "Queen of Hearts";
				return definedCard;
			} else if (Number == 17) {
				definedCard = "Jack of Hearts";
				return definedCard;
			} else if (Number == 18) {
				definedCard = "Ten of Hearts";
				return definedCard;
			} else if (Number == 19) {
				definedCard = "Nine of Hearts";
				return definedCard;
			} else if (Number == 20) {
				definedCard = "Eight of Hearts";
				return definedCard;
			} else if (Number == 21) {
				definedCard = "Seven of Hearts";
				return definedCard;
			} else if (Number == 22) {
				definedCard = "Six of Hearts";
				return definedCard;
			} else if (Number == 23) {
				definedCard = "Five of Hearts";
				return definedCard;
			} else if (Number == 24) {
				definedCard = "Four of Hearts";
				return definedCard;
			} else if (Number == 25) {
				definedCard = "Three of Hearts";
				return definedCard;
			} else if (Number == 26) {
				definedCard = "Two of Hearts";
				return definedCard;
			} else if (Number == 27) {
				definedCard = "Ace of Clubs";
				return definedCard;
			} else if (Number == 28) {
				definedCard = "King of Clubs";
				return definedCard;
			} else if (Number == 29) {
				definedCard = "Queen of Clubs";
				return definedCard;
			} else if (Number == 30) {
				definedCard = "Jack of Clubs";
				return definedCard;
			} else if (Number == 31) {
				definedCard = "Ten of Clubs";
				return definedCard;
			} else if (Number == 32) {
				definedCard = "Nine of Clubs";
				return definedCard;
			} else if (Number == 33) {
				definedCard = "Eight of Clubs";
				return definedCard;
			} else if (Number == 34) {
				definedCard = "Seven of Clubs";
				return definedCard;
			} else if (Number == 35) {
				definedCard = "Six of Clubs";
				return definedCard;
			} else if (Number == 36) {
				definedCard = "Five of Clubs";
				return definedCard;
			} else if (Number == 37) {
				definedCard = "Four of Clubs";
				return definedCard;
			} else if (Number == 38) {
				definedCard = "Three of Clubs";
				return definedCard;
			} else if (Number == 39) {
				definedCard = "Two of Clubs";
				return definedCard;
			} else if (Number == 40) {
				definedCard = "Ace of Diamonds";
				return definedCard;
			} else if (Number == 41) {
				definedCard = "King of Diamonds";
				return definedCard;
			} else if (Number == 42) {
				definedCard = "Queen of Diamonds";
				return definedCard;
			} else if (Number == 43) {
				definedCard = "Jack of Diamonds";
				return definedCard;
			} else if (Number == 44) {
				definedCard = "Ten of Diamonds";
				return definedCard;
			} else if (Number == 45) {
				definedCard = "Nine of Diamonds";
				return definedCard;
			} else if (Number == 46) {
				definedCard = "Eight of Diamonds";
				return definedCard;
			} else if (Number == 47) {
				definedCard = "Seven of Diamonds";
				return definedCard;
			} else if (Number == 48) {
				definedCard = "Six of Diamonds";
				return definedCard;
			} else if (Number == 49) {
				definedCard = "Five of Diamonds";
				return definedCard;
			} else if (Number == 50) {
				definedCard = "Four of Diamonds";
				return definedCard;
			} else if (Number == 51) {
				definedCard = "Three of Diamonds";
				return definedCard;
			} else if (Number == 52) {
				definedCard = "Two of Diamonds";
				return definedCard;
			}
			return definedCard;
		}

		public static int CardValuer(int Number) {
			
			if (Number == 1) {
				cardValue = 1;
				return cardValue;
			} else if (Number == 2) {
				cardValue = 13;
				return cardValue;
			} else if (Number == 3) {
				cardValue = 12;
				return cardValue;
			} else if (Number == 4) {
				cardValue = 11;
				return cardValue;
			} else if (Number == 5) {
				cardValue = 10;
				return cardValue;
			} else if (Number == 6) {
				cardValue = 9;
				return cardValue;
			} else if (Number == 7) {
				cardValue = 8;
				return cardValue;
			} else if (Number == 8) {
				cardValue = 7;
				return cardValue;
			} else if (Number == 9) {
				cardValue = 6;
				return cardValue;
			} else if (Number == 10) {
				cardValue = 5;
				return cardValue;
			} else if (Number == 11) {
				cardValue = 4;
				return cardValue;
			} else if (Number == 12) {
				cardValue = 3;
				return cardValue;
			} else if (Number == 13) {
				cardValue = 2;
				return cardValue;
			} else if (Number == 14) {
				cardValue = 1;
				return cardValue;
			} else if (Number == 15) {
				cardValue = 13;
				return cardValue;
			} else if (Number == 16) {
				cardValue = 12;
				return cardValue;
			} else if (Number == 17) {
				cardValue = 11;
				return cardValue;
			} else if (Number == 18) {
				cardValue = 10;
				return cardValue;
			} else if (Number == 19) {
				cardValue = 9;
				return cardValue;
			} else if (Number == 20) {
				cardValue = 8;
				return cardValue;
			} else if (Number == 21) {
				cardValue = 7;
				return cardValue;
			} else if (Number == 22) {
				cardValue = 6;
				return cardValue;
			} else if (Number == 23) {
				cardValue = 5;
				return cardValue;
			} else if (Number == 24) {
				cardValue = 4;
				return cardValue;
			} else if (Number == 25) {
				cardValue = 3;
				return cardValue;
			} else if (Number == 26) {
				cardValue = 2;
				return cardValue;
			} else if (Number == 27) {
				cardValue = 1;
				return cardValue;
			} else if (Number == 28) {
				cardValue = 13;
				return cardValue;
			} else if (Number == 29) {
				cardValue = 12;
				return cardValue;
			} else if (Number == 30) {
				cardValue = 11;
				return cardValue;
			} else if (Number == 31) {
				cardValue = 10;
				return cardValue;
			} else if (Number == 32) {
				cardValue = 9;
				return cardValue;
			} else if (Number == 33) {
				cardValue = 8;
				return cardValue;
			} else if (Number == 34) {
				cardValue = 7;
				return cardValue;
			} else if (Number == 35) {
				cardValue = 6;
				return cardValue;
			} else if (Number == 36) {
				cardValue = 5;
				return cardValue;
			} else if (Number == 37) {
				cardValue = 4;
				return cardValue;
			} else if (Number == 38) {
				cardValue = 3;
				return cardValue;
			} else if (Number == 39) {
				cardValue = 2;
				return cardValue;
			} else if (Number == 40) {
				cardValue = 1;
				return cardValue;
			} else if (Number == 41) {
				cardValue = 13;
				return cardValue;
			} else if (Number == 42) {
				cardValue = 12;
				return cardValue;
			} else if (Number == 43) {
				cardValue = 11;
				return cardValue;
			} else if (Number == 44) {
				cardValue = 10;
				return cardValue;
			} else if (Number == 45) {
				cardValue = 9;
				return cardValue;
			} else if (Number == 46) {
				cardValue = 8;
				return cardValue;
			} else if (Number == 47) {
				cardValue = 7;
				return cardValue;
			} else if (Number == 48) {
				cardValue = 6;
				return cardValue;
			} else if (Number == 49) {
				cardValue = 5;
				return cardValue;
			} else if (Number == 50) {
				cardValue = 4;
				return cardValue;
			} else if (Number == 51) {
				cardValue = 3;
				return cardValue;
			} else if (Number == 52) {
				cardValue = 2;
				return cardValue;
			}
			return cardValue;
			}
}