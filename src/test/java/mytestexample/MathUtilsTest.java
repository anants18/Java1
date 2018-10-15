package mytestexample;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by ejs on 4/5/2016.
 */
public class MathUtilsTest {

	@Test
	public void testMultiply() {

		double a = 5;
		double b = 4.0;
		double result = MathUtils.multiply(a, b);
		assertEquals("5 * 4 = 20", 20, result, 0.0);
		//assertEquals("The test 5 * 4 = 20", 21, result, 0.00001);
	}
}
