package ua.org.oa.homeworkPTMARXVI_110.dyachenko_s.task4_2.part_3;

import java.util.Iterator;

/**
 * Created by serj27 on 16.05.2016.
 */
public interface ListIterator<E> extends Iterator<E> {
    // проверяет, есть ли предыдущий элемент для выборки методом previous

    boolean hasPrevious();

// возвращает предыдущий элемент

    Character previous();

// заменяет элемент, который на предыдущем шаге был возвращен next/previous на данный элемент



// удаляет элемент, который на предыдущем шаге был возвращен next/previous

    @Override
    void remove();


}
