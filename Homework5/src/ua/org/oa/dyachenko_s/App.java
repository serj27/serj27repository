package ua.org.oa.dyachenko_s;

public class App {

	public static void main(String[] args) {
		DynamicStringList array1 = new DynamicStringList();
        System.out.println("~~~~~~~~~~The obtained result of the first method of operation~~~~~~~~~~");
		System.out.println(array1);
        array1.add("index0");
        array1.add("index1");
        array1.add("index2");
        array1.add("index3");
        array1.add("index4");
        array1.add("index5");
        array1.add("index6");
        array1.add("index7");
        array1.add("index8");
        array1.add("index9");
        array1.add("index10");
        array1.add("index11");
        System.out.println(array1);
        System.out.println(array1.get());
        System.out.println(array1.get(1));
        System.out.println(array1.get(11));
        System.out.println(array1.remove());
        System.out.println(array1.remove(25));
        System.out.println(array1.delete());

        DynamicStringList array2 = new DynamicStringList(5);
        System.out.println("~~~~~~~~~~The obtained result of the second method of operation~~~~~~~~~~");
        System.out.println(array2);
        array2.add("index0");
        array2.add("index1");
        array2.add("index2");
        array2.add("index3");
        array2.add("index4");
        array2.add("index5");
        System.out.println(array2);
        System.out.println(array2.get());
        System.out.println(array2.get(1));
        System.out.println(array2.get(5));
        System.out.println(array2.remove());
        System.out.println(array2.remove(20));
        System.out.println(array2.delete());
    }
	}


