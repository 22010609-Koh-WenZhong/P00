import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	@Test
	public void Addtest() {
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;

		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 

		int expected = 5555;
		assertEquals (expected ,actual);
	}


	@Test
	public final void testSubstract() {
		int a = 9876;
		int b = 4321;

		Calculator cal = new Calculator();
		int acutal = cal.substract(a, b);

		int expected = 5555;
		assertEquals(expected,acutal);
	}

	@Test
	public void testMultiple() {
		int a = 4;
		int b = 3;

		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b); 

		int expected = 12;
		assertEquals (expected, actual);
	}

	@Test
	public void testDivide() {
		int a = 4;
		int b = 2;

		Calculator cal = new Calculator();
		int actual = cal.divide(a, b); 

		int expected = 2;
		assertEquals (expected, actual);
	}
}

//wz