package ua.org.oa.homeworkPTMARXVI_110.dyachenko_s.task4_1;

import java.util.Arrays;

/**
 * Created by serj27 on 15.05.2016.
 */
public class App {

    public static void main(String[] args) {

        Computer [] comp = new Computer[4];
        comp[0] = new Computer("IntelCore i3","HD Graphics",4300);
        comp[1] = new Computer("Celerone M520", "Radeon X1250",2250);
        comp[2] = new Computer("AMD A8", "Radeon HD9780",6780);
        comp[3] = new Computer("Pentium IV","Intel HD",1250);

        Arrays.sort(comp);
//Сортировка по int
        for (int i = 0; i < comp.length; i++){
            System.out.println(comp[i].getPrice() + " " + comp[i].getProcessor() + " " + comp[i].getVideoCard());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//Сортировка по String
        for (int i = 0; i < comp.length; i++){
            System.out.println(comp[i].getProcessor() + " " + comp[i].getPrice() + " " + comp[i].getVideoCard());
        }

    }
}
