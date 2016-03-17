package ua.org.oa.dyachenko_s;

import java.util.ArrayList;

public class Smart extends MobileElectronics {

	private static int batteryCapacity;                        // Получаемое значерие ёмкости аккумулятора
	private static final int standartBatteryCapacity = 2000;   // Заданная ёмкость аккумулятора
	
	public Smart(String nameDevice, double priceDevice, int batteryCapacity) {
		super(nameDevice, priceDevice);
		Smart.batteryCapacity = batteryCapacity;
		
	}
	
/* Реализовуем метод сравнения заданной емкости аккумулятора с полученной*/
	
	public static ArrayList<Smart> chooseBatteryCapacity (ArrayList<MobileElectronics> mbArrayList, int batteryCapacity){
		ArrayList<Smart> smartBattery = new ArrayList<>();
		for (MobileElectronics mobileelectronics : mbArrayList) {
			if (mobileelectronics instanceof Smart){
				if (standartBatteryCapacity <((Smart.getBatteryCapacity() ))){
					smartBattery.add((Smart)mobileelectronics);
				}
			}
		}
		return smartBattery;
	}

	

	public static int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		if (batteryCapacity != 0){
		Smart.batteryCapacity = batteryCapacity;}
		else {
			System.out.println();
		}
	}



	@Override
	public String toString() {
		return "Smart [Battery Capacity = " + getBatteryCapacity() + ", Name Device = " + getNameDevice()
				+ ", Price Device = " + getPriceDevice() + "]";
	}
	
	

}
