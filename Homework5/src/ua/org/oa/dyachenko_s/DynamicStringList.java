package ua.org.oa.dyachenko_s;

import java.util.Arrays;

public class DynamicStringList implements SimpleList{

	 private String[] stringArray;                   // Массив для хранения элементов 
	 private int size;
	 private final int INIT_ARRAY_VOLUME = 10;
	    
	 /*Пустой конструктор
	  * 
	  */
	    public DynamicStringList() {
	        this.stringArray = new String[INIT_ARRAY_VOLUME];
	    }

	    /*Конструктор с числовым аргументом
	     * 
	     */
	    public DynamicStringList(int i) {
	        this.stringArray = new String[i];
	    }

	    // Реализуем переопределенный метод добавления строки в массив
	    
	    @Override
	    public void add(String s) {
	        if (this.stringArray.length > size) {
	            this.stringArray[size] = s;
	            size++;
	        } else {
	            increaseDynamicStringArraySize();
	            this.stringArray[size] = s;
	            size++;
	        }
	    }

	    
	    private void increaseDynamicStringArraySize() {
	        String[] vol = new String[size * 2];
	        System.arraycopy(this.stringArray, 0, vol, 0, this.stringArray.length);
	        this.stringArray = vol;
	    }

	    /* Реализуем переопределенный метод получения
	     * последнего элемента из массива
	     */
	    @Override
	    public String get() {
	        return this.stringArray[size - 1];
	    }

	    /* Реализуем переопределенный метод получения 
	     * элемента массива по его индексу
	     */
	    @Override
	    public String get(int id) {
	        if (size > id) {
	            return this.stringArray[id];
	        } else {
	            return "Going beyond the bounds of the array";
	        }
	    }

	    /* Реализуем переопределенный метод удаления
	     * последнего элемента массива
	     */
	    @Override
	    public String remove() {
	        this.stringArray[size - 1] = null;
	        size--;
	        return this.stringArray[size];
	    }

	    /* Реализуем переопределенный метод удаления
	     * элемента массива по его индексу
	     */
	    @Override
	    public String remove(int id) {
	        if (size > id) {
	            System.arraycopy(stringArray, id + 1, stringArray, id, size - id - 1);
	            stringArray[size - 1] = null;
	            size--;
	            return Arrays.toString(stringArray);
	        } else {
	            return "Going beyond the bounds of the array";
	        }
	    }

	    /* Реализуем переопределенный метод удаления
	     * всех элементов массива
	     */
	    @Override
	    public boolean delete() {
	        for (int i = 0; i < this.stringArray.length - 1; i++) {
	            this.stringArray[i] = null;
	        }
	        size = 0;
	        return true;
	    }

	    @Override
	    public String toString() {
	        String[] vol = new String[size];
	        System.arraycopy(stringArray, 0, vol, 0, size);
	        return Arrays.toString(vol);
	    }
}
