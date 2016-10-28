import java.util.Scanner;

public class Prompter {

	private static final Scanner input = new Scanner(System.in);

	public Jar getAdministrativeInfo() {
		System.out.println("ADMINISTRATOR SETUP\n===================");
		System.out.print("Name of items in Jar: ");
		String name = input.nextLine();
		System.out.print("Maximum number of " + name + " in the jar: ");
		int capacity = input.nextInt();
		return new Jar(name, capacity);
	}
	
	
}
