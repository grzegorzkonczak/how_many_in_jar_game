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

	public void displayPlayerWelcomeInfo(Jar jar) {
		System.out.println("PLAYER STARTS THE GAME\n===================");
		System.out.println("How many " + jar.getItemName() + " are in the jar?"
				+ " Pick a number between 1 and " 
				+ jar.getMaxCapacity() + ".");
		
	}
	
	
}
