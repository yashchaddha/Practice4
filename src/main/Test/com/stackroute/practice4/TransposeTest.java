package com.stackroute.practice4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeTest {
    Transpose app;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void transpose() {
        String expectedValue="a kciuq nworb xof spmuj revo eht yzal god";
        String actualValue=app.transpose("a quick brown fox jumps over the lazy dog");
        assertEquals(expectedValue,actualValue);
    }
}