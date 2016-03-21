package ua.org.oa.dyachenko_s;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class JavaExeptions {

	/* Демонстрации возникновения ошибки
	 *  ArrayIndexOutOfBoundsException
	 */
	public void arrayIndexOutOfBoundsException (){
		int i = 0;
		int[] nArray = new int[10];
		    
		/* Вызываем обработчик исключений, иначе программа
		 * завершится аварийно. Как только значение переменной 
		 * "i" достигнет десяти, будет вызван системный обработчик исключений.
		 */
		while(true)
		{
		  try
		  {
		    nArray[i] = i;
		  }
		  /*  обработчик, заданный в теле оператора catch, выводит название исключения 
		   * на консоль, а затем прерывает выполнение цикла при помощи оператора break. 
		   * Таким образом, программа продолжает свою работу "штатным" образом несмотря на 
		   * предпринятую попытку выхода за границы массива.
		   */
		  catch(Exception ex)
		  {
		    System.out.println("\n" + ex.toString()); 
		    break;
		  }
		      
		  System.out.print(i); 
		  i++;
	}   
}
	/*B методе illegalArgumentExeption мы бросаем исключение 
	 * IllegalArgumentException
	 */
	public void illegalArgumentExeption(String s){
	try {
		System.out.println(Integer.parseInt(s));
		System.out.println();
	} catch (IllegalArgumentException iae) {
		System.out.println("IllegalArgumentException.");
		System.out.println();
	}
	}
	
	public void classCastExeption (){
		Object ch = new Character('*');
	    
		try
		{
		  System.out.println((Byte)ch);
		}
		catch(Exception ex)
		{
		  System.out.println(ex.toString()); 
		}
	}
	
	public void stackOverflowError (){
		try {
			stackOverflowError();
		} catch (StackOverflowError so) {
			System.out.println("StackOverflowError.");
			System.out.println();
		}
	}
	public void nullPointerExeption1() {
		String[] s = new String[5];
		try {
			System.out.println(s[1].charAt(0));
		} catch (NullPointerException npe) {
			System.out.println("NullPointerException 1.");
			System.out.println();
		}
	}

	
	public void nullPointerExeption2() {
		Integer[] integer = new Integer[5];
		try {
			System.out.println(integer[1].toString());
		} catch (NullPointerException npe) {
			System.out.println("NullPointerException 2.");
			System.out.println();
		}
	}

	
	public void nullPointerExeption3() {
		Object object = null;
		try {
			System.out.println(object.toString());
		} catch (NullPointerException npe) {
			System.out.println("NullPointerException 3.");
			System.out.println();
		}
	}
	public void numberFormatExeption(String s) {
		try {
			System.out.println(Integer.parseInt(s));
			System.out.println();
		} catch (NumberFormatException iae) {
			System.out.println("NumberFormatException.");
			System.out.println();
		}
	}
	public void stringIndexOutOfBoudsException(String s, int z) {
		try {
			System.out.println("Char number " + z + ": " + s.charAt(z));
			System.out.println();
		} catch (StringIndexOutOfBoundsException si) {
			System.out.println("StringIndexOutOfBoundsException.");
			System.out.println();
		}
	}
		public void outOfMemoryError() {
			ArrayList<String> st = new ArrayList<String>();
			try {
				while (true) {
					st.add("word");
				}
			} catch (OutOfMemoryError om) {
				System.out.println("OutOfMemoryError.");
				System.out.println();
			}
		}
	}
	
