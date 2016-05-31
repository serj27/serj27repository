package ua.org.oa.practice1.dyachenko_s;

/**
 * Created by serj27 on 16.05.2016.
 */
public class ArrayProd {
    public static int prod (int [] Array) {
        int prod = 1;
        for (int i: Array) prod *= i;
        return prod;
    }
}
