package ua.org.oa.practice1.dyachenko_s;

import org.junit.Test;

/**
 * Created by serj27 on 16.05.2016.
 */
public class ArraySumTest3 {
    @Test(expected = java.lang.NullPointerException.class)
    public void testSum3() {
        int actual = ArraySum.sumArr(null);

    }

}