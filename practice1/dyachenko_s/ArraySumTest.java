package ua.org.oa.practice1.dyachenko_s;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by serj27 on 16.05.2016.
 */
public class ArraySumTest {
    @Test
    public void testSum() throws Exception {
        int actual = ArraySum.sumArr(new int[] {2,3,4,5});
        int expected = 14;
        Assert.assertEquals("Wrong summ", expected, actual, 0.001);
    }
}