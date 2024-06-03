import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Activity2Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testDate() {
		Date d = new Date();
		assertEquals(1970, d.getYear());
		assertEquals(1, d.getMonth());
		assertEquals(1, d.getDay());
	}

	@Test
	void testDateIntIntInt() {
		Date d = new Date(1995, 10, 8);
		assertEquals(1995, d.getYear());
		assertEquals(10, d.getMonth());
		assertEquals(8, d.getDay());
	}


}
