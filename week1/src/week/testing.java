package week;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import week.week1;

class testing {

	@Test
	void test() {
		week1 w= new week1();
		int output=w.square(5);
		assertEquals(25, output);
	}

}
