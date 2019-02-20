package com.stackroute.practice4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountStringTest {
    CountString app;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void count() {
        int expectedValue=6;
        int actualValue=app.count("Javavavaaa");
        assertEquals(expectedValue,actualValue);
    }
}