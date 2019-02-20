package com.stackroute.practice4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharTest {
    ReplaceChar app;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void replacechar() {
        String expectedValue="faity fry";
        String actualValue=app.replacechar("daily dry");
        assertEquals(expectedValue,actualValue);
    }
}