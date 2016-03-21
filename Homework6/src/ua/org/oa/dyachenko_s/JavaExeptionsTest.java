package ua.org.oa.dyachenko_s;

public class JavaExeptionsTest {

	public static void main(String[] args) {
		
		JavaExeptions test = new JavaExeptions();
		test.arrayIndexOutOfBoundsException();
		test.illegalArgumentExeption("5i");
		test.classCastExeption();
		test.stackOverflowError();
        test.stringIndexOutOfBoudsException("index", 5);
        test.nullPointerExeption1();
        test.nullPointerExeption2();
        test.nullPointerExeption3();
        test.numberFormatExeption("0i");
        test.outOfMemoryError();
	}

}
