package ua.org.oa.dyachenko_s;

import java.util.ArrayList;

public class Phone extends MobileElectronics {

	private static  int quantitySim;                   //Получаемое количество сим карт
	private static final int standartQuantitySim = 2;  // Заданное количество сим карт
	
	public Phone(String nameDevice, double priceDevice, int quantitySim) {
		super(nameDevice, priceDevice);
		Phone.quantitySim = quantitySim;
	}
	/* Реализовуем метод сравнения количества сим карт в телефоне с заданным количеством
	 * 
	 */
	public static ArrayList<Phone> chooseQuantitySim (ArrayList<MobileElectronics> mbArrayList, int quantitySim){
		ArrayList<Phone> phoneSim = new ArrayList<>();
		for (MobileElectronics mobileelectronics : mbArrayList) {
			if (mobileelectronics instanceof Phone){
				if (standartQuantitySim ==((Phone.getQuantitySim() ))){
					phoneSim.add((Phone)mobileelectronics);
				}
			}
		}
		return phoneSim;
	}
	
	public  static int getQuantitySim() {
		return quantitySim;
	}

	public  void setQuantitySim(int quantitySim) {
		Phone.quantitySim = quantitySim;
	}


	@Override
	public String toString() {
		return "Phone [Quantity Sim = " + getQuantitySim() + ", Name Device = " + getNameDevice()
				+ ", PriceDevice = " + getPriceDevice() + "]";
	}
	

}
