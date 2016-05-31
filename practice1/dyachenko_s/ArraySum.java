package ua.org.oa.practice1.dyachenko_s;

/**
 * Created by serj27 on 04.04.2016.
 */
public class ArraySum {

    public static int [] arraySum;

    public static int  sumArr (int [] arraySum){


        int  sum = 0;
        for (int i : arraySum){
            sum += i;
        }
        return sum;
    }

  }
