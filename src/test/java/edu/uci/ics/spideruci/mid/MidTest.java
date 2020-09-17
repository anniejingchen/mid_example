package edu.uci.ics.spideruci.mid;

import org.junit.Test;
import org.junit.Assert;

public class MidTest {

	/* JUnit 5 version
	@ParameterizedTest(name="{0}, {1}, {2} Expected= {3}")
	@CsvSource({
		"3, 3, 5, 3",
		"1, 2, 3, 2",
		"3, 2, 1, 2",
		"5, 5, 5, 5",
		"5, 3, 4, 4",
		"2, 1, 3, 2"
		})
	void testMid(int a, int b, int c, int expected) {
		int median = Mid.mid(a, b, c);
		Assertions.assertEquals(expected, median);
	}
	*/

	@Test
	public void test335() {
		Assert.assertEquals(3, Mid.mid(3,3,5));
	}

	@Test
	public void test123() {
		Assert.assertEquals(2, Mid.mid(1,2,3));
	}

	@Test
	public void test321() {
		Assert.assertEquals(2, Mid.mid(3,2,1));
	}

	@Test
	public void test555() {
		Assert.assertEquals(5, Mid.mid(5,5,5));
	}

	@Test
	public void test534() {
		Assert.assertEquals(4, Mid.mid(5,3,4));
	}

	@Test
	public void test213() {
		Assert.assertEquals(2, Mid.mid(2,1,3));
	}


}
