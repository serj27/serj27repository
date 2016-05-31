package ua.org.oa.practice1.dyachenko_s;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by serj27 on 16.05.2016.
 */
public class ArraySum2Test {
    ArraySum2 as2;

    @Before
    public void setUp() throws Exception {
        as2 = new ArraySum2(new int[] {2,3,4,5});
    }

    @Test
    public void testSum() throws Exception {
        int actual = as2.sum();
        int expected = 14;
        Assert.assertEquals("Wrong sum", expected, actual, 0.001);
    }
}