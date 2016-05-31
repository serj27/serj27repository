package ua.org.oa.practice1.dyachenko_s;

/**
 * Created by serj27 on 16.05.2016.
 */
public class ArraySum2 {
    private int[] Array;

    ArraySum2(int[] Array) {
        this.Array = Array;
    }

    public int sum() {
        int sum = 0;
        for (int i : Array) sum += i;
        return sum;
    }
}