import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquestriaTest {
	
	private final double tripLength = 21.5;
	
	private final int cloudsDaleX = 14;
	private final int cloudsDaleY = 8;
	
	private final int losPegasusX = 6;
	private final int losPegasusY = 19;
	
	public final int baltimareX = 31;
	private final int baltimareY = 16;
	
	private final int canterlotX = 18;
	private final int canterlotY = 10;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testRoadTrip() {
		double lengthDbl = Equestria.roadTrip(tripLength);
		assertTrue(lengthDbl > 67.5 && lengthDbl < 67.6);
	}

	@Test
	void testDistanceCanterlotToBaltimare() {
		double tripLength = Equestria.distance(canterlotX, canterlotY, baltimareX, baltimareY);
		assertTrue(tripLength > 14.3 && tripLength < 14.4);
	}

	@Test
	void testTotalTripCanterToBaltToCloudsToCanter() {
		double tripLength = Equestria.totalTrip(canterlotX, canterlotY, baltimareX, baltimareY, cloudsDaleX, cloudsDaleY);
		assertTrue(tripLength > 37.5 && tripLength < 37.6);
	}

}
