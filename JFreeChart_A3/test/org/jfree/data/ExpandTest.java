package org.jfree.data;

import static org.junit.jupiter.api.Assertions.*;

import java.security.InvalidParameterException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExpandTest {
	Range exampleRange;

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
	void testForProperRangeExpandValue() {
		exampleRange = new Range(2,6);
		Range expected = new Range(1,8);
		Range actual = Range.expand(exampleRange, 0.25, 0.5);
			
		assertEquals(expected, actual);
	}
	
	
	@Test
	void testForNegativeValuesInLowerMargin() {
		exampleRange = new Range(1,7);
		Range x = Range.expand(exampleRange, -0.25, 0.5);
		System.out.println(x.getLowerBound());
	}
	
	@Test
	void testForInvalidParameterException() {
		assertThrows(InvalidParameterException.class, () -> Range.expand(null, 0.25, 0.5));
	}
}




























