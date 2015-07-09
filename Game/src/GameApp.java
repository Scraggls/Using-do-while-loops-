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
		//display the menu
		System.out.println("how many lives do you want to play with (0 exits)? ");
		//getting the users choice
		int numGames;
		Scanner playerChoice = new Scanner(System.in);
		System.out.println("Enter how many lives you want to play with:");
		numGames = playerChoice.nextInt();
		//printing out the users choice
		System.out.println("you chose to play with" + numGames);
		
		while(numGames > 0){
			System.out.println("PLaying Game");
			numGames--;

		}
		System.out.println(numGames + " lives left \nGame Over");
	}
}



