import static org.junit.Assert.*;

import org.junit.Test;


public class SumSquareDifferenceTest {

	@Test
	public void test() {
		assertEquals(2640, SumSquareDifference.sumSquareDifference(10));
		assertEquals(25164150, SumSquareDifference.sumSquareDifference(100));
	}
}
