package ua.org.oa.homeworkPTMARXVI_110.dyachenko_s.task4_2.part_2;

import ua.org.oa.homeworkPTMARXVI_110.dyachenko_s.task4_2.part_1.MyDeque;

import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 * Created by serj27 on 15.05.2016.
 */
public class MyDequeImpl<E> implements ua.org.oa.homeworkPTMARXVI_110.dyachenko_s.task4_2.part_1.MyDeque<E> {

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

    public IteratorImpl iterator(){
     return new IteratorImpl();
    }

    private class IteratorImpl implements Iterator<Character> {

        private String str;
        private int count = 0;

        IteratorImpl(String s) {
            str = s;
        }

        public IteratorImpl() {

        }

        @Override
        public boolean hasNext() {
            if(count < str.length()) return true;
            return false;
        }
        @Override
        public Character next() {
            if(count == str.length())
                throw new NoSuchElementException();

            count++;
            return str.charAt(count-1);
        }

        @Override
        public void remove () {
            throw new IllegalStateException();
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
