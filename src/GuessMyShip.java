import java.util.*;

public class GuessMyShip{

	public static final String HIT = "hit";
	public static final String MISS = "miss";
	public static final String KILL = "kill";
	public static final int MAX_HITS = 3;


	private int hits;
	private int[] shipLocation;
	private List<Integer> guesses;

	public GuessMyShip() {
		hits = 0;
		shipLocation = new int[3];
		guesses = new ArrayList<>();
	}

	public void setShipLocation(int[] location) {

		shipLocation = Arrays.copyOf(location, location.length);
	}

	public int getHits() {

		return hits;
	}

	public int[] getShipLocation() {

		return shipLocation;
	}

	public String guessShipLocation(int userGuess){


		for (int i = 0; i < shipLocation.length; i++){
			if(userGuess == shipLocation[i]) {
				hits++;
				if (hits != MAX_HITS){ 
					return HIT;
				} else {
						return KILL;
				  }
			} 
		}
		return MISS;
	}

	public static void clearScreen() {  
    	System.out.print("\033[H\033[2J");  
    	System.out.flush();  
    } 

    public boolean guessedBefore(int guess) {
    	if (guesses.contains(guess)){
    		return true;
    	}
    	guesses.add(guess);
    	return false;
    }

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		GuessMyShip gms = new GuessMyShip();
		String result = "";
		System.out.println("Enter the location of your ship:");
		System.out.println("Choose 3 numbers between 0-9 in the format, 'x y z' and press enter:");
		String shipLocation = scanner.nextLine();
		int[] location = new int[3];	
		int i = 0;
		for(char c: shipLocation.toCharArray()){
				if(!(Character.isWhitespace(c))) {
					location[i] = Character.getNumericValue(c);
					i++;
				}			
		}
		clearScreen();
		gms.setShipLocation(location);
		System.out.println("Guess the location of my ship: ");
		while (!(result.equals(KILL))) {
			System.out.println("Enter your guess: ");
			int guess = scanner.nextInt();
			if (gms.guessedBefore(guess)) {
				System.out.println("That number has been guessed before.");
				System.out.println("Please guess another number:");
			} else {
				result = gms.guessShipLocation(guess);
				System.out.println(result);
			}		
		}
		System.out.println("Congratulations You won!!!!");

	}

}
