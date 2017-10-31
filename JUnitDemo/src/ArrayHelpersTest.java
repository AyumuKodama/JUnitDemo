import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayHelpersTest {

	@Test
	public void testReverse() {
		fail("Not yet implemented");
	}

	@Test
	public void testMaxElement() {
		int[] test1 = {-2, 0, 5, 3, 10};
		assertTrue(ArrayHelpers.maxElement(test1) == 10);
		int[] test2 = {-10, -8, -2, -1};
		assertTrue(ArrayHelpers.maxElement(test2) == -1);
	}

}
