package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        assertEquals("Sum of 2 and 3 should be 5", 5, 2 + 3);
        assertTrue("5 is greater than 3", 5 > 3);
        assertFalse("5 is not less than 3", 5 < 3);
        assertNull("Object should be null", null);
        assertNotNull("Object should not be null", new Object());
    }
}
