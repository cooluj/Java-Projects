import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Activity3Test {


	@Test
	void testFakeReview() {
		assertNotEquals(Review.textToString("26WestReview_Annotated.txt"),Review.fakeReview("26WestReview_Annotated.txt"));
	}

	@Test
	void testFakeReviewNoAsterisks() {
		assertFalse( Review.fakeReview("26WestReview_Annotated.txt").contains("*"));
	}
	
	@Test
	void testFakeReviewSameLength() {
		String reviewFilename = "LG2_Annotated.txt";
		String fake = Review.fakeReview(reviewFilename);
		String original = Review.textToString(reviewFilename);
		String[] fakes = fake.split(" ");
		String[] orig = original.split(" ");
		assertEquals(orig.length, fakes.length);
	}
	@Test
	void testFakeReviewAnnotatedChanged() {
		String reviewFilename = "LG2_Annotated.txt";
		String fake = Review.fakeReview(reviewFilename);
		String original = Review.textToString(reviewFilename);
		String[] fakes = fake.split(" ");
		String[] orig = original.split(" ");

		boolean isWorking = true;
		for (int i = 0; i < orig.length; i++) {
			if (orig[i].contains("*") && fakes[i].contains("*")) {
				isWorking = false;
			}
		}
		assertTrue(isWorking);
	}
	@Test
	void testFakeReviewUnannotatedNotChanged() {
		String reviewFilename = "LG2_Annotated.txt";
		String fake = Review.fakeReview(reviewFilename);
		String original = Review.textToString(reviewFilename);
		String[] fakes = fake.split(" ");
		String[] orig = original.split(" ");

		boolean isWorking = true;
		for (int i = 0; i < orig.length; i++) {
			if (!orig[i].contains("*") && !orig[i].equals(fakes[i])) {
				isWorking = false;
			}
		}
		assertTrue(isWorking);
	}
}
