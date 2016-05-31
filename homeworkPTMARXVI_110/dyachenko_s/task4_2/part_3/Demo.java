package ua.org.oa.homeworkPTMARXVI_110.dyachenko_s.task4_2.part_3;

/**
 * Created by serj27 on 15.05.2016.
 */
public class Demo {

    public static void main(String[] args) {
        MyDequeImpl<String> states = new MyDequeImpl<>();
        states.add("Germany");
        states.add("Italy");
        states.addLast("Ukraine");
        states.addFirst("Spain");


        System.out.printf("At list %d elements \n", states.size());

        if(states.contains("Ukraine")){

            System.out.println("List contains Ukraine");
        }
//        states.removeFirst(); // удаление первого элемента
//        states.removeLast(); // удаление последнего элемента

}}


