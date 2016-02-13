
import org.junit.*;
import static org.junit.Assert.*;

public class GuessMyShipTest{

	@Test
	public void test() {
		System.out.println("I am the test Baby!!!");
		GuessMyShip gms = new GuessMyShip();
		assertEquals("hit",gms.guessShipLocation(3));
	}

}