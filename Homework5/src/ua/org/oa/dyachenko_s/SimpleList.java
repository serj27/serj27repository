package ua.org.oa.dyachenko_s;

public interface SimpleList {
	void add(String s);             //add string to array
	String get();                   //get the last element from an array
	String get(int id);             //get an item by its index
	String remove();                //delete last element
	String remove(int id);          //delete element by its index
	boolean delete();               //delete all elements from an array
}
