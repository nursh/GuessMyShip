import java.util.*;

public class GuessMyShip{

	public static final String HIT = "hit";
	public static final String MISS = "miss";
	public static final String KILL = "kill";
	public static final int MAX_HITS = 3;


	private int hits;
	private int[] shipLocation;

	public GuessMyShip() {
		hits = 0;
		shipLocation = new int[3];
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

	public static void main(String[] args) {
		
	}

}
