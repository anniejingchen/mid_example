package edu.uci.ics.spideruci.mid;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MidTest {

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

}
