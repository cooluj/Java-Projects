import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MatryoshkaTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testHowManyDolls() {
		Matryoshka one = new Matryoshka();
		Matryoshka two = new Matryoshka(one);
		Matryoshka three = new Matryoshka(two);
		Matryoshka four = new Matryoshka(three);
		assertEquals(4,four.howManyDolls());
	}

	@Test
	void testHowManyDolls2() {
		Matryoshka one = new Matryoshka();
		assertEquals(1,one.howManyDolls());
	}
	@Test
	void testHowManyDolls3() {
		Matryoshka one = new Matryoshka();
		Matryoshka two = new Matryoshka(one);
		assertEquals(2,two.howManyDolls());
	}
	@Test
	void testHowManyWearingBabushkas() {
		Matryoshka one = new Matryoshka("Tatiana", java.awt.Color.PINK, true);
		Matryoshka two = new Matryoshka(one,"Alexei", java.awt.Color.RED, false);
		Matryoshka three = new Matryoshka(two,"Natasha", java.awt.Color.RED, true);
		Matryoshka four = new Matryoshka(three,"Vladimr", java.awt.Color.BLACK, false);
		assertEquals(2,four.howManyWearingBabushkas());
	}

	@Test
	void testHowManyWearingBabushkas2() {
		Matryoshka one = new Matryoshka("Tatiana", java.awt.Color.PINK, true);
		assertEquals(1,one.howManyWearingBabushkas());
	}

	@Test
	void testHowManyWearingBabushkas3() {
		Matryoshka one = new Matryoshka("Tatiana", java.awt.Color.PINK, false);
		assertEquals(0,one.howManyWearingBabushkas());
	}
	@Test
	void testRedHeadCount() {
		Matryoshka one = new Matryoshka("Tatiana", java.awt.Color.PINK, true);
		Matryoshka two = new Matryoshka(one,"Alexei", java.awt.Color.RED, false);
		Matryoshka three = new Matryoshka(two,"Natasha", java.awt.Color.RED, true);
		Matryoshka four = new Matryoshka(three,"Vladimr", java.awt.Color.BLACK, false);
		assertEquals(2,four.redHeadCount());
	}
	@Test
	void testRedHeadCount2() {
		Matryoshka one = new Matryoshka("Tatiana", java.awt.Color.PINK, true);
		Matryoshka two = new Matryoshka(one,"Alexei", java.awt.Color.RED, false);
		assertEquals(1,two.redHeadCount());
	}
	@Test
	void testRedHeadCount3() {
		Matryoshka one = new Matryoshka("Tatiana", java.awt.Color.PINK, true);
		assertEquals(0,one.redHeadCount());
	}
	@Test
	void testLastName() {
		Matryoshka one = new Matryoshka("Tatiana", java.awt.Color.PINK, true);
		Matryoshka two = new Matryoshka(one,"Alexei", java.awt.Color.RED, false);
		Matryoshka three = new Matryoshka(two,"Natasha", java.awt.Color.RED, true);
		Matryoshka four = new Matryoshka(three,"Vladimr", java.awt.Color.BLACK, false);
		assertEquals("Vladimr",four.lastName());

	}
	@Test
	void testLastName2() {
		Matryoshka one = new Matryoshka("Vladimr", java.awt.Color.BLACK, false);
		Matryoshka two = new Matryoshka(one,"Alexei", java.awt.Color.RED, false);
		Matryoshka three = new Matryoshka(two,"Natasha", java.awt.Color.RED, true);
		Matryoshka four = new Matryoshka(three,"Tatiana", java.awt.Color.PINK, true);
		assertEquals("Vladimr",four.lastName());
	}
	@Test
	void testLastName3() {
		Matryoshka one = new Matryoshka("Tatiana", java.awt.Color.PINK, true);
		assertEquals("Tatiana",one.lastName());
	}
}
