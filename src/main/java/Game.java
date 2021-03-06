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
    	
    	// Ask user to guess correct number until the guess is correct
    	// Keep track how many times user guessed
    	int guessCount = 0;
    	int guess = 0;
    	while (guess != jar.getNumberOfItemsInside()){
    		guess = prompter.getUserGuess(jar.getMaxCapacity());
    		if(guess > jar.getMaxCapacity() || guess < 1){
    			System.out.println("Your guess must be less than " + jar.getMaxCapacity() + "and more then 1.\nTry again");
    			continue;
    		} else if(guess < jar.getNumberOfItemsInside()){
    			prompter.encuragePlayer("higher");
    		} else if (guess > jar.getNumberOfItemsInside()){
    			prompter.encuragePlayer("lower");
    		}
    		guessCount++;
    	}
    	
    	prompter.displayFinalScore(guessCount, jar);
    }
}
