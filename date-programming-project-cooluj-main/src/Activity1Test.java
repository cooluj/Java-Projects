import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Activity1Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	public void testStaticIsLeapYear1of3() {
		assertEquals(false, Date.isLeapYear(1990));
	}
	@Test
	public void testStaticIsLeapYear2of3() {
		assertEquals(false, Date.isLeapYear(2100));
	}
	@Test
	public void testStaticIsLeapYear3of3() {
		assertEquals(true, Date.isLeapYear(2000));
	}
	@Test
	public void testDaysInMonth1of3() {
		assertEquals(29, Date.daysInMonth(2020, 2));
	}
	@Test
	public void testDaysInMonth2of3() {
		assertEquals(31, Date.daysInMonth(2020, 1));
	}
	@Test
	public void testDaysInMonth3of3() {
		assertEquals(28, Date.daysInMonth(2019, 2));
	}
	@Test
	public void testDaysInYear1of3() {
		assertEquals(365, Date.daysInYear(1990));
	}
	@Test
	public void testDaysInYear2of3() {
		assertEquals(365, Date.daysInYear(2100));
	}
	@Test
	public void testDaysInYear3of3() {
		assertEquals(366, Date.daysInYear(2000));
	}

}
