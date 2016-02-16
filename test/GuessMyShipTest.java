
import org.junit.*;
import static org.junit.Assert.*;


public class GuessMyShipTest{

	private static GuessMyShip gms;

	@BeforeClass
	public static void setUp() {

		System.out.println("Initialization of the test");
		gms = new GuessMyShip();
		int[] locations = {1,2,3};
		gms.setShipLocation(locations);
		assertArrayEquals(locations, gms.getShipLocation());
	}

	@Test
	public void testGuessShipLocationHit() {

		System.out.println("Testing Ship Location with hit value.");
		String result = gms.guessShipLocation(2);
		assertEquals("hit", result);
	}

	@Test
	public void testGuessShipLocationMiss() {
		System.out.println("Testing Ship Location with miss value");
		String result = gms.guessShipLocation(5);
		assertEquals("miss", result);
	}

	@Test
	public void testGuessShipLocationKill() {
		System.out.println("Testing Ship Location with kill value");
		gms.guessShipLocation(1);
		String result = gms.guessShipLocation(3);
		assertEquals("kill", result);

	}

}