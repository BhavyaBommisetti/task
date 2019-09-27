package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class squaretest {

	@Test
	void test() {
		sample s= new sample();
		int output=s.square(5);
		assertEquals(24, output);
	}

}
