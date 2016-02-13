public class GuessMyShip{

	public static final String HIT = "hit";
	public static final String MISS = "miss";
	public static final String KILL = "kill";
	private int hits;
	private int[] shipLocation;

	public GuessMyShip() {
		hits = 0;
		shipLocation = new int[3];
	}

	public void setShipLocation(int[] location) {

	}

	public String guessShipLocation(int userGuess){
		return HIT;
	}

	public static void main(String[] args) {
		
	}

}