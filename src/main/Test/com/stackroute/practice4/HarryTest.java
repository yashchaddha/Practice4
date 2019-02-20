package com.stackroute.practice4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HarryTest {
    Harry app;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkHarry() {
        boolean expectedValue=true;
        boolean actualvalue=app.checkHarry("asc Harry is there");

    }
}