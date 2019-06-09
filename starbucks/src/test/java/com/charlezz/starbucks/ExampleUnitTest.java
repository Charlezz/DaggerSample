package com.charlezz.starbucks;

import org.junit.Test;

import com.charlezz.starbucks.logger.UnitTestLogger;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testStarbucks() {
        Starbucks starbucks = new Starbucks(new UnitTestLogger());
    }

}