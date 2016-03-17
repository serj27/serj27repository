package ua.org.oa.dyachenko_s;

import java.util.ArrayList;

public class Tablets extends MobileElectronics {

	private static double screenDiagonal;                        // Получаемое значение размера экрана
	private static final double standartScreenDiagonal = 10.0;   // константа. Заданный размер экрана
	
	public Tablets(String nameDevice, double priceDevice, double screenDiagonal) {
		super(nameDevice, priceDevice);
		this.setScreenDiagonal(screenDiagonal);
	}
/* Реализуем метод сравнения размера заданной диагонали
 * экрана планшета с полученной
 */
	public static ArrayList<Tablets> chooseScreenDiagonal (ArrayList<MobileElectronics> mbArrayList, double screenDiagonal){
		ArrayList<Tablets> tabletScreen = new ArrayList<>();
		for (MobileElectronics mobileelectronics : mbArrayList) {
			if (mobileelectronics instanceof Tablets){
				if (standartScreenDiagonal <((Tablets.getScreenDiagonal() ))){
					tabletScreen.add((Tablets)mobileelectronics);
				}
			}
		}
		return tabletScreen;
	}

	public static double getScreenDiagonal() {
		return screenDiagonal;
	}

	public void setScreenDiagonal(double screenDiagonal) {
		if (screenDiagonal != 0){
		Tablets.screenDiagonal = screenDiagonal;
		} else {
			System.out.println("Screen diagonal cannot be 0!");
		}
	}

	@Override
	public String toString() {
		return "Tablets [ Screen Diagonal = " + getScreenDiagonal()
				+ ", Name Device = " + getNameDevice() + ", Price Device = " + getPriceDevice() + "]";
	}

	
	

	

	
	
	

}
