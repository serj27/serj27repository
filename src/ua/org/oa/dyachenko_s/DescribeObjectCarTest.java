package ua.org.oa.dyachenko_s;

public class DescribeObjectCarTest {

	public static void main(String[] args) {
		
		DescribeObjectCar sedan = new DescribeObjectCar(); // ������ ������ 
		
		sedan.nameCar = "Hyundai";
		sedan.modelCar = "Elantra";
		sedan.colorCar = 'B';
		sedan.typeEngine = "������";
		sedan.quantityValves = 4;
		sedan.consumptionFuel = 6.2;
		sedan.weigthCar = 1760;
		sedan.fuelTank = 53;
		sedan.typeFuel = "��-92, ��-95";
		
		
		
		
		DescribeObjectCar.displayDescribeObjectCar ();
		DescribeObjectCar.calcCompression();
		DescribeObjectCar.calcPowerCar();
		DescribeObjectCar.calcMaxSpeedCar ();
	}

}
