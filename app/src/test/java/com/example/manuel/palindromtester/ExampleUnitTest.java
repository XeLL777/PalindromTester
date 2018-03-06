package com.example.manuel.palindromtester;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    MainActivity ma;

    @Before
    public void setUp() {
        ma = new MainActivity();
    }

    @After
    public void cleanUp() {
        ma = null;
    }

    @Test
    public void isPalindromTest_true() {
        //only lower case letters
        assertEquals(true, ma.isPalindrom("radar"));

        //leading upper case letter
        assertEquals(true, ma.isPalindrom("Radar"));
    }

    @Test
    public void isPalindromTest_false() {
        assertEquals(false, ma.isPalindrom("Testing"));
    }
}