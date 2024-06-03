import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Activity2Test {

	@Test
	void testTotalSentiment1() {
		double sentiment = Review.totalSentiment("26WestReview.txt");
		assertTrue(sentiment > 29.048 && sentiment < 29.05);
	}

	@Test
	void testTotalSentiment2() {
		double sentiment = Review.totalSentiment("LG.txt");
		assertTrue(sentiment > 13.54 && sentiment < 13.55);
	}
	
	@Test
	void testStarRating1() {
		assertEquals(4, Review.starRating("26WestReview.txt"));
	}
	
	@Test
	void testStarRating2() {
		assertEquals(3, Review.starRating("LG.txt"));
	}

	@Test
	void testAverageSentiment1() {
		double average = Review.averageSentiment("26WestReview.txt");
		assertTrue(average > .095 && average < .15);
	}
	@Test
	void testAverageSentiment2() {
		double average = Review.averageSentiment("LG.txt");
		
		assertTrue(average > .16 && average < .17);
	}
}
