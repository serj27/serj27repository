package ua.org.oa.homeworkPTMARXVI_110.dyachenko_s.task4_2.part_1;

import java.util.LinkedList;

/**
 * Created by serj27 on 15.05.2016.
 */
public class Demo {

    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<String>();

        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.add("Finland");
        states.add("Norway");
        states.addLast("Ukraine"); // добавляем на последнее место
        states.addFirst("Spain"); // добавляем на первое место
        states.add(1, "Italy"); // добавляем элемент по индексу 1

        System.out.printf("At list %d elements \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Netherland");
        for(String state : states){

            System.out.println(states);
        }
        // проверка на наличие элемента в списке
        if(states.contains("Germany")){

            System.out.println("List contains Germany");
        }

        states.remove("Germany");
        states.removeFirst(); // удаление первого элемента
        states.removeLast(); // удаление последнего элемента

        System.out.println("~~~~~~~~~~~~~~~~~");
        for (String state : states) {
        }System.out.println( states.getFirst());  // получить элемент из начала списка, не удаляя его

        System.out.println("~~~~~~~~~~~~~~~~~");
        for (String state : states) {
        }System.out.println( states.getLast());  // получить элемент из конца списка, не удаляя его

        System.out.println("~~~~~~~~~~~~~~~~~");
        for (String state : states) {
        }System.out.println(states.toArray());   // вернуть массив элементов из списка

        System.out.println("~~~~~~~~~~~~~~~~~");
        for (String state : states) {
        }System.out.println(states.toArray().length);  // вернуть количество элементов в списке

        if (states.containsAll(states)){
            System.out.println(states);
        } else {
            System.out.println("There are not all states!");
        }
    }
}


