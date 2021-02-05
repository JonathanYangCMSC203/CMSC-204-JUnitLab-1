/**
 * @author Jonathan Yang
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	GradeBook testA, testB;

	@BeforeEach
	void setUp() throws Exception {
		testA = new GradeBook(5);
		testB = new GradeBook(5);
		testA.addScore(30);
		testA.addScore(40);
		testB.addScore(55);
		testB.addScore(65);
	}

	@AfterEach
	void tearDown() throws Exception {
		testA = null;
		testB = null;
	}

	@Test
	void testAddScore() {
		assertEquals("30.0 40.0 ", testA.toString());
		assertEquals("55.0 65.0 ", testB.toString());
		assertEquals(2, testA.getScoreSize());
		assertEquals(2, testB.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(70, testA.sum(), .001);
		assertEquals(120, testB.sum(), .001);
	}

	@Test
	void testMinimum() {
		assertEquals(30, testA.minimum(), .001);
		assertEquals(55, testB.minimum(), .001);
	}

	@Test
	void testFinalScore() {
		assertEquals(40, testA.finalScore(), .001);
		assertEquals(65, testB.finalScore(), .001);
	}

	@Test
	void testGetScoreSize() {
		assertEquals(2, testA.getScoreSize());
		assertEquals(2, testB.getScoreSize());
	}

	@Test
	void testToString() {
		assertEquals("30.0 40.0 ", testA.toString());
		assertEquals("55.0 65.0 ", testB.toString());
	}

}
