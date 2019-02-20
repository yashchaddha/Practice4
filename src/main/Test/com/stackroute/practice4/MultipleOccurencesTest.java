package com.stackroute.practice4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleOccurencesTest {
    MultipleOccurences app;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() {
        String expectedValue="4 6 10 12 27 29";
        String actualValue=app.check("She sells seashells by the seashore");
        assertEquals(expectedValue,actualValue);
    }
}