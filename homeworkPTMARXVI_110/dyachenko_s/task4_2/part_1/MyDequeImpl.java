package ua.org.oa.homeworkPTMARXVI_110.dyachenko_s.task4_2.part_1;

/**
 * Created by serj27 on 15.05.2016.
 */
public class MyDequeImpl<E> implements MyDeque<E> {

    private static class Node<E>{
        // хранимый элемент

        E element;

// ссылка на следующий элемент списка

        Node<E> next;

// ссылка на предыдущий элемент списка

        Node<E> prev;

        Node(E element, Node<E> prev, Node<E> next){

        }
    }
    @Override
    public void addFirst(E e) {

    }

    @Override
    public void addLast(E e) {

    }

    @Override
    public E removeFirst() {
        return null;
    }

    @Override
    public E removeLast() {
        return null;
    }

    @Override
    public E getFirst() {
        return null;
    }

    @Override
    public E getLast() {
        return null;
    }

    @Override
    public E add() {
        return null;
    }

    @Override
    public E add(String s) {
        return null;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean containsAll(MyDeque<? extends E> deque) {
        return false;
    }
}
