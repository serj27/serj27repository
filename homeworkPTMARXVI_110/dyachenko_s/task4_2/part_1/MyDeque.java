package ua.org.oa.homeworkPTMARXVI_110.dyachenko_s.task4_2.part_1;

/**
 * Created by serj27 on 15.05.2016.
 */
public interface MyDeque<E> {

    void addFirst(E e);
    void addLast(E e);
    E removeFirst();
    E removeLast();
    E getFirst();
    E getLast();

    E add();

    E add(String s);

    boolean contains(Object o);
    void clear();
    Object[] toArray();
    int size();
    boolean containsAll(MyDeque<? extends E> deque);
}
