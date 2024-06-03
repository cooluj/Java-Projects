import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Activity3Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testGetDay() {
		Date d = new Date(2015, 1, 18);
		assertEquals(18, d.getDay());
	}

	@Test
	void testGetMonth() {
		Date d = new Date(2015, 1, 18);
		assertEquals(1, d.getMonth());
	}

	@Test
	void testGetYear() {
		Date d = new Date(2014, 2, 2);
		assertEquals(2014, d.getYear());
	}


	@Test
	public void testIsLeapYear1of3() {
		Date d = new Date();
		assertFalse(d.isLeapYear());
	}
	@Test
	public void testIsLeapYear2of3() {
		Date d = new Date(1900, 1, 1);
		assertFalse(d.isLeapYear());
	}
	@Test
	public void testIsLeapYear3of3() {
		Date d = new Date(2000, 1, 1);
		assertTrue(d.isLeapYear());
	}

	//@Test
	//void testToString() {
	//	Date d = new Date();
	
	}


