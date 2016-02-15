
import org.junit.*;
import static org.junit.Assert.*;

public class GuessMyShipTest{

	@Before
	public void setUp() {

		System.out.println("This is the start of the test");
	}

	@Test
	public void testSetShipLocation() {

		System.out.println("Testing.....");
		GuessMyShip gms = new GuessMyShip();
		int[] locations = {1,2,3};
		gms.setShipLocation(locations);
		assertArrayEquals(locations, gms.getShipLocation());
	}

}