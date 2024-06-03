import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Activity4Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	public void testAddDays1of3() {
		Date d = new Date();
		d.addDays(30);
		assertEquals("1970/01/31", d.toString());
	}
	@Test
	public void testAddDays2of3() {
		Date d = new Date();
		d.addDays(31);
		assertEquals("1970/02/01", d.toString());
	}
	@Test
	public void testAddDays3of3() {
		Date d = new Date();
		d.addDays(365);
		assertEquals("1971/01/01", d.toString());
	}

	@Test
	void testAddWeeks() {
		Date d = new Date();
		d.addWeeks(52);
		assertEquals("1970/12/31", d.toString());
	}
	@Test
	public void testDaysTo1of4() {
		Date d1 = new Date(1970, 1, 1);
		Date d2 = new Date(1970, 1, 2);
		assertEquals(1, d1.daysTo(d2));
	}
	@Test
	public void testDaysTo2of4() {
		Date d1 = new Date(1970, 1, 31);
		Date d2 = new Date(1970, 2, 1);
		assertEquals(1, d1.daysTo(d2));
	}
	@Test
	public void testDaysTo3of4() {
		Date d1 = new Date(1969, 12, 31);
		Date d2 = new Date(1970, 1, 1);
		assertEquals(1, d1.daysTo(d2));
	}
	@Test
	public void testDaysTo4of4() {
		Date d1 = new Date(2014, 2, 2);
		Date d2 = new Date(2020, 2, 2);
		assertEquals(2191, d1.daysTo(d2));
	}


}
