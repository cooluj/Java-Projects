import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Activity1Test {

	@Test
	void testsentimentOutput1() {
		assertEquals("Great:1.48",Review.sentimentOutput("Great"));
	}

	@Test
	void testsentimentOutput2() {
		assertEquals("Buggy:0.0",Review.sentimentOutput("Buggy"));
	}
	@Test
	void testsentimentOutput3() {
		assertEquals("Awesome:0.92",Review.sentimentOutput("Awesome"));
	}
	@Test
	void testsentimentOutput4() {
		assertEquals("Worst:-3.1",Review.sentimentOutput("Worst"));
	}
	@Test
	void testsentimentOutput5() {
		assertEquals("Brilliant:1.76",Review.sentimentOutput("Brilliant"));
	}
}
