package com.stackroute.practice4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortStringTest {
    SortString app;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void sortString() {
        String expectedValue="chaddha yash";
        String actualValue=app.sortString("yash chaddha");
        assertEquals(expectedValue,actualValue);
    }
}