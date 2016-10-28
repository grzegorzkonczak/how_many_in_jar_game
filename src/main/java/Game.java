import java.util.Random;

public class Game {
	
	private static final Random randomNumbers = new Random();
	
    public static void main(String[] args) {
    	
    	// Initialize game by gathering administrative information about game
    	Prompter prompter = new Prompter();
    	Jar jar = prompter.getAdministrativeInfo();
    	
    	// fill the jar with random amount of items
    	jar.fill(randomNumbers.nextInt(1 + jar.getMaxCapacity()));
    	
    	// Prompt starting information for user
    	prompter.displayPlayerWelcomeInfo(jar);
    	
    	
    }
}
