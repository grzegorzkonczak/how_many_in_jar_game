import java.util.Scanner;

public class Prompter {

	private static final Scanner input = new Scanner(System.in);

	// Gather administrative data from user
	public Jar getAdministrativeInfo() {
		System.out.println("ADMINISTRATOR SETUP\n===================");
		System.out.print("Name of items in Jar: ");
		String name = input.nextLine();
		System.out.print("Maximum number of " + name + " in the jar: ");
		int capacity = input.nextInt();
		return new Jar(name, capacity);
	}

	// Display starting message to player
	public void displayPlayerWelcomeInfo(Jar jar) {
		System.out.println("PLAYER STARTS THE GAME\n===================");
		System.out.println("How many " + jar.getItemName() + " are in the jar?"
				+ " Pick a number between 1 and " 
				+ jar.getMaxCapacity() + ".");
		System.out.println("Ready?  (Press enter to start guessing)");
		input.nextLine();
	}

	// Display guess prompt and return user guess
	public int getUserGuess() {
		System.out.print("\nGuess: ");
		return input.nextInt();
	}

	// Display summary information for user
	public void displayFinalScore(int guessCount, Jar jar) {
		System.out.println("Congratulations! You guest that there was " + jar.getNumberOfItemsInside() + " of "
				+ jar.getItemName() + " in the jar! It took you " + guessCount + " guess(es) to get it right.");
		
	}
	
	
}
