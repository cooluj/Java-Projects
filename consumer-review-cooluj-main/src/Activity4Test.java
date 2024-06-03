import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Activity4Test {

	@Test
	void testFakeReview2NoAsterisks() {
		assertFalse( Review.fakeReview2("LG.txt", true).contains("*"));
	}

	@Test
	void testFakeReview2SameLength() {
		String reviewFilename = "LG2_Annotated.txt";
		String fake = Review.fakeReview2(reviewFilename, false);
		String original = Review.textToString(reviewFilename);
		String[] fakes = fake.split(" ");
		String[] orig = original.split(" ");
		assertEquals(orig.length, fakes.length);
	}
	@Test
	void testFakeReview2AnnotatedChanged() {
		String reviewFilename = "LG2_Annotated.txt";
		String fake = Review.fakeReview2(reviewFilename, false);
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
	void testFakeReview2UnannotatedNotChanged() {
		String reviewFilename = "LG2_Annotated.txt";
		String fake = Review.fakeReview2(reviewFilename, false);
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
	@Test
	void testFakeReview2MorePositiveTrue() {
		String reviewFilename = "LG2_Annotated.txt";
		String fake = Review.fakeReview2(reviewFilename, true);
		String original = Review.textToString(reviewFilename);
		String[] fakes = fake.split(" ");
		String[] orig = original.split(" ");

		boolean isWorking = true;
		for (int i = 0; i < orig.length; i++) {
			if (orig[i].contains("*") && Review.sentimentVal(fakes[i]) <= 0) {
				isWorking = false;
			}
		}
		assertTrue(isWorking);
	}
	@Test
	void testFakeReview2MorePositiveFalse() {
		String reviewFilename = "LG2_Annotated.txt";
		String fake = Review.fakeReview2(reviewFilename, false);
		String original = Review.textToString(reviewFilename);
		String[] fakes = fake.split(" ");
		String[] orig = original.split(" ");

		boolean isWorking = true;
		for (int i = 0; i < orig.length; i++) {
			if (orig[i].contains("*") && Review.sentimentVal(fakes[i]) >= 0) {
				System.out.println("Original: " + Review.sentimentOutput(orig[i]));
				System.out.println("Fake: " + Review.sentimentOutput(fakes[i]));
				isWorking = false;
			}
		}
		assertTrue(isWorking);
	}
	@Test
	void testFakeReview2Sentiment50PercentGreater1() {
		String reviewFilename = "LG2_Annotated.txt";
		String fake = Review.fakeReview2(reviewFilename, false);
		String original = Review.textToString(reviewFilename);
		String[] fakes = fake.split(" ");
		String[] orig = original.split(" ");

		boolean isWorking = true;
		for (int i = 0; i < orig.length; i++) {
			if (orig[i].contains("*") && Math.abs(Review.sentimentVal(orig[i].substring(1)) *1.50) > Math.abs(Review.sentimentVal(fakes[i]))) {
				isWorking = false;
			}
		}
		assertTrue(isWorking);
	}
	@Test
	void testFakeReview2Sentiment50PercentGreater2() {
		String reviewFilename = "LG2_Annotated.txt";
		String fake = Review.fakeReview2(reviewFilename, true);
		String original = Review.textToString(reviewFilename);
		String[] fakes = fake.split(" ");
		String[] orig = original.split(" ");

		boolean isWorking = true;
		for (int i = 0; i < orig.length; i++) {
			if (orig[i].contains("*") && Math.abs(Review.sentimentVal(orig[i].substring(1)) *1.50) > Math.abs(Review.sentimentVal(fakes[i]))) {
				isWorking = false;
			}
		}
		assertTrue(isWorking);
	}
}
