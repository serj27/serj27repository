package ua.org.oa.homeworkPTMARXVI_110.dyachenko_s.task4_2.part_2;

/**
 * Created by serj27 on 15.05.2016.
 */
public interface MyDeque<E> extends Iterable<E> {

    void addFirst(E e);
    void addLast(E e);
    E removeFirst();
    E removeLast();
    E getFirst();
    E getLast();
    boolean contains(Object o);
    void clear();
    Object[] toArray();
    int size();
    boolean containsAll(MyDeque<? extends E> deque);
}
