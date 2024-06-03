import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PigLatinTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testBeginsWithVowel1() {
		assertFalse(PigLatin.beginsWithVowel("pig"));
	}
	@Test
	void testBeginsWithVowel2() {
		assertTrue(PigLatin.beginsWithVowel("Ultimate"));
	}
	@Test
	void testBeginsWithVowel3() {
		assertTrue(PigLatin.beginsWithVowel("oval"));
	}

	@Test
	void testBeginsWithVowel4() {
		assertTrue(PigLatin.beginsWithVowel("odd"));
	}
	@Test
	void testBeginsWithConsonant1() {
		assertTrue(PigLatin.beginsWithConsonant("pig"));
	}
	@Test
	void testBeginsWithConsonant2() {
		assertTrue(PigLatin.beginsWithConsonant("Please"));
	}
	@Test
	void testBeginsWithConsonant3() {
		assertFalse(PigLatin.beginsWithConsonant("oval"));
	}
	@Test
	void testBeginsWithConsonantCluster1() {
		assertFalse(PigLatin.beginsWithConsonantCluster("pig"));
	}
	@Test
	void testBeginsWithConsonantCluster2() {
		assertTrue(PigLatin.beginsWithConsonantCluster("Please"));
	}
	@Test
	void testTranslate1() {
		assertEquals("igpay", PigLatin.translate("pig"));
	}
	
	@Test
	void testTranslate2() {
		assertEquals("olvesway", PigLatin.translate("Wolves"));
	}
	
	@Test
	void testTranslate3() {
		assertEquals("omputercay", PigLatin.translate("computer"));
	}

	@Test
	void testTranslate4() {
		assertEquals("ovalyay", PigLatin.translate("Oval"));
	}
	
	@Test
	void testTranslate5() {
		assertEquals("ultimateyay", PigLatin.translate("Ultimate"));
	}
	
	@Test
	void testTranslate6() {
		assertEquals("oddyay", PigLatin.translate("odd"));
	}
	
	@Test
	void testTranslatePhrase1() {
		assertEquals("oodgay ayday", PigLatin.translate("Good day"));
	}
	
	@Test
	void testTranslatePhrase2() {
		assertEquals("omputercay iencescay", PigLatin.translate("Computer Science"));
	}
	@Test
	void testTranslatePhrase3() {
		assertEquals("olfway ongstray ackpay ongstray", PigLatin.translate("Wolf strong pack strong"));
	}
}