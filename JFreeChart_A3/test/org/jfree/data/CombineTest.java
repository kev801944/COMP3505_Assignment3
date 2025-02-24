package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CombineTest {
	private Range exampleRange;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testReturningNullIfBothRangesAreNull() {
		assertNull(Range.combine(null, null));
	}
	
	@Test
	void testReturnFirstAgurmentRangeIfSecondRangeIsNull() {
		exampleRange = new Range(-1, 1);
		
		Range actual = Range.combine(exampleRange, null);
		Range expected = new Range(-1,1);
		
		assertEquals(expected, actual);
	}

	@Test
	void testReturnSecondAgurmentRangeIfFirstRangeIsNull() {
		exampleRange = new Range(-1, 1);
		
		Range actual = Range.combine(null, exampleRange);
		Range expected = new Range(-1,1);
		
		assertEquals(expected, actual);
	}
	
}







































