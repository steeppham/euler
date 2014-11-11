import static org.junit.Assert.*;
import org.junit.Test;

public class SmallestDivisibleForRangeTest {

	@Test
	public void test() {
		assertEquals(2520, SmallestDivisibleForRange.answer(1, 10));
		assertEquals(2520, SmallestDivisibleForRange.answer(1, 20));
	}
}
