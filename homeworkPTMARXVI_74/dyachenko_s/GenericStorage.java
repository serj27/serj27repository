package ua.org.oa.homeworkPTMARXVI_74.dyachenko_s;

import java.util.Arrays;

/**
 * Created by serj27 on 15.05.2016.
 */
public class GenericStorage<T> {

    T[] elementData;
    private int lastIndex = 0;
    private static final int DEFAULT_SIZE = 10;
    private static final int MAX_ARRAY_SIZE = 99999999;

    /*1.	Создать конструктор без параметров.
    При вызове такого конструктора должен инициализироваться
    массив длиной 10.
     */

    public GenericStorage() {
        this(DEFAULT_SIZE);
    }

    /*2.	Создать конструктор с параметром (int size).
    Size - размер массива.
     */
    public GenericStorage(int size) {
        if (size >= 0) {
            elementData = (T[])(new Object[size]);
        } else {
            throw new IllegalArgumentException("Illegal size = "+size);
        }

    }

    private boolean checkIndex(int index) {
        if (index >= 0 && index < this.elementData.length) {
            return true;
        } else {
            return false;
        }
    }

    private boolean ensureCapacity() {
        if (lastIndex < this.elementData.length) {
            return true;
        } else {
            return false;
        }
    }

    public void growArrow() {
        int var1 = this.elementData.length;
        int var2 = var1 + (var1>>1) + 1;
        if (var2 < MAX_ARRAY_SIZE) {
            T[] clone = (T[])(new Object[var2]);
            System.arraycopy(this.elementData, 0, clone, 0, this.elementData.length);
            elementData = clone;
        }
    }

    /*3.	Метод add(T obj), который добавит
    новый элемент в хранилище в конец
     */
    public void add(T obj) {
        if (ensureCapacity()) {
            elementData[lastIndex++] = obj;
        } else {
            growArrow();
            elementData[lastIndex++] = obj;
        }

    }

    /*4.	Метод T get(int index), который возвратит
    элемент по индексу в масиве.
     */
    public T get(int index) {
        if (checkIndex(index)) {
            return elementData[index];
        } else {
            throw new IllegalArgumentException("Illegal index = " + index);
        }
    }

    /*5.	Метод T[] getAll(), который вернет массив элементов.
    (Распечатать массив при помощи Arrays.toString(<-Ваш массив->))
     */
    public T[] getAll() {
        return elementData;
    }

    /*6.	Метод update(int index, T obj), который подменит
    объект по заданной позиции только, если на этой позиции
    уже есть элемент.
     */
    public void update(int index, T obj) {
        if (checkIndex(index)){
            if (get(index) != null) {
                elementData[index] = obj;
            }
        } else {
            throw new IllegalArgumentException("Illegal index = "+index);
        }
    }

    /*7.	Meтод delete(int index), который удалит элемент по
     индексу и захлопнет пустую ячейку в массиве, если на этой
     позиции уже есть элемент.
      */
    public void delete(int index) {
        if (checkIndex(index)) {
            if (this.elementData[index]!= null) {
                T[] clone = (T[])(new Object[elementData.length-1]);
                System.arraycopy(this.elementData, 0, clone, 0, index);
                System.arraycopy(this.elementData, index+1, clone, index, clone.length-index);
                elementData = clone;
            }
        } else {
            throw new IllegalArgumentException("Illegal index = " + index);
        }

    }

    /*8.	Метод delete(T obj), который удалит заданный
     объект из массива
      */
    public int delete(T obj) {
        int count = 0;
        for (int i = 0; i < this.elementData.length; i++) {
            if (this.elementData[i] == obj) {
                delete(i);
                count++;
            }
        }
        return count;
    }

    /*9.	Метод который возвратит размер
    массива ЗАПОЛНЕНОГО
     */
    public int size() {
        return this.elementData.length;
    }

    @Override
    public String toString() {
        return "Generiс Storage{" +
                "Element Data =" + Arrays.toString(elementData) +
                ", Last Index =" + lastIndex +
                ", Size =" + elementData.length +
                '}';
    }
}
