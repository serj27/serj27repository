package ua.org.oa.homeworkPTMARXVI_110.dyachenko_s.task4_2.part_2;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by serj27 on 15.05.2016.
 */
public class Demo {

    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<String>();

        states.add("Germany");
        states.add("France");
        states.add("Finland");
        states.add("Norway");
        states.add("Ukraine");
        states.add("Spain");

        ListIterator<String> listIter = states.listIterator();
        System.out.println("~~~~~forEach~~~~~");

        for (String state : states) {
        }System.out.println(states);

        System.out.println("~~~~~WHILE~~~~~");

        while(listIter.hasNext()){
            System.out.println(listIter.next());
        }
    }
}


