import java.util.Scanner;

/**
 * practising while loops and scanner for U.I
 */

/**
 * @author Craig McGarry
 *
 */
public class GameApp {


	public static void main(String[] args) {
		//		//display the menu
		//		System.out.println("how many lives do you want to play with (0 exits)? ");
		//		//getting the users choice
		//
		//		Scanner scan = new Scanner(System.in);
		//		System.out.println("Enter how many lives you want to play with:");
		//		int choice = scan.nextInt();
		//		//printing out the users choice
		//		System.out.println("you chose to play with" + choice);
		//		int numGames = choice;
		//		
		//		while(numGames > 0){
		//			System.out.println("PLaying Game");
		//			numGames--;
		//
		//		}
		//		System.out.println(numGames + " lives left \nGame Over");

		boolean playAgain = true;
		do{
			//displaying the menu
			System.out.println("how many lives do you want to play with (0 exits)? ");		
			//get user choice
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter how many lives you want to play with: ");
			int choice = scan.nextInt();

			//weather to stop playing or not
			if (choice == 0){
				playAgain= false;
				System.out.println("Thank you for playing");
			}
			System.out.println("you chose to play with " + choice);

			//while loop
			int numGames = choice;

			while(numGames > 0){
				System.out.println("PLaying Game");
				numGames--;
			}
			System.out.println(numGames + " lives left \nGame Over");
			
		}while(playAgain);












			
		}
	}



