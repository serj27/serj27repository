package ua.org.oa.dyachenko_s;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		/* Коллекция планшетов, смартфонов и мобильных телефонов
		 * 
		 */
		ArrayList<MobileElectronics> mbArrayList = new ArrayList<>();
		
		/* Выводим на экран планшеты, дтагональ экрана
		 * которых больше 10 дюймов
		 */
		mbArrayList.add(new Tablets("FLY", 3500, 10.5));
		System.out.println(Tablets.chooseScreenDiagonal(mbArrayList, 10));
		mbArrayList.add(new Tablets("IMPRESSION PAD", 2250, 11));
		System.out.println(Tablets.chooseScreenDiagonal(mbArrayList, 10));
		mbArrayList.add(new Tablets("APPLE I-PAD", 32155, 11));
		System.out.println(Tablets.chooseScreenDiagonal(mbArrayList, 10));
		mbArrayList.add(new Tablets("ASUS Nexus7", 2420, 7));
		System.out.println(Tablets.chooseScreenDiagonal(mbArrayList, 10));
		mbArrayList.add(new Tablets("LENOVO IdeaPAD", 2700, 8));
		/* Выводим на экран смартфоны, ёмкость аккумуляторов
		 * которых больше установленного значения
		 */
		mbArrayList.add(new Smart ("SAMSUNG", 5600, 3500));
		System.out.println(Smart.chooseBatteryCapacity(mbArrayList, 2000));
		mbArrayList.add(new Smart ("DEX", 2800, 2100));
		System.out.println(Smart.chooseBatteryCapacity(mbArrayList, 2000));
		mbArrayList.add(new Smart ("SONY Xperia-Z", 7800, 3000));
		System.out.println(Smart.chooseBatteryCapacity(mbArrayList, 2000));
		mbArrayList.add(new Smart ("FLY Evo Chic 3", 2570, 1750));
		System.out.println(Smart.chooseBatteryCapacity(mbArrayList, 2000));
		mbArrayList.add(new Smart ("ASUS Zenfone", 3790, 2500));
		System.out.println(Smart.chooseBatteryCapacity(mbArrayList, 2000));
		/* Выводим на экран мобильные телефоны, у которых
		 * количество сим карт соответствует 2
		 */
		mbArrayList.add(new Phone("NOKIA", 400, 2));
		System.out.println(Phone.chooseQuantitySim(mbArrayList, 2));
		mbArrayList.add(new Phone("ALCATEL", 350, 2));
		System.out.println(Phone.chooseQuantitySim(mbArrayList, 2));
		mbArrayList.add(new Phone("Trium MARS", 150, 1));
		System.out.println(Phone.chooseQuantitySim(mbArrayList, 2));
		mbArrayList.add(new Phone("SonyEricsson", 450, 2));
		System.out.println(Phone.chooseQuantitySim(mbArrayList, 2));
		mbArrayList.add(new Phone("SIEMENS CX65", 320, 1));
		System.out.println(Phone.chooseQuantitySim(mbArrayList, 2));
	}

}
