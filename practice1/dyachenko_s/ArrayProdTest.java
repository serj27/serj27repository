package ua.org.oa.practice1.dyachenko_s;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by serj27 on 16.05.2016.
 */
public class ArrayProdTest {
    @Test
    public void testProd() throws Exception {
        int actual = ArrayProd.prod(new int[] {1,2,3,3,3});
        int expected = 54;
        Assert.assertEquals("Wrong prod", expected, actual, 0.001);
    }
}