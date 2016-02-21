package ua.org.oa.dyachenko_s;



public class DescribeObjectCar {

	 
	 static String nameCar;           // название автомобиля
	 static String modelCar;          // модель автомобиля
	 static char colorCar;            // цвет автомобиля
	 static String typeEngine;        // тип двигателя
	 static int quantityValves;       // количество клапанов на цилиндр
	 static double consumptionFuel;   // расход топлива в смешанном цикле
	 static int weigthCar;            // допустимая полная масса автомобиля
	 static int fuelTank;             // объем бака
	 static String typeFuel;          // тип топлива
	 static double compressionRatio;  // степень сжатия
	 static double volumeCylinder;    // объем цилиндра
	 static double powerCar;          // мощность автомобиля в кВт
	 static double powerCarHP;        // мощность автомобиля в л.с.
	 static double maxSpeed;          // максимальная скорость автомобиля
	 
	 public DescribeObjectCar () {       // конструктор
		
		
	}
	
	public static void calcCompression () {
		
		DescribeObjectCar.compressionRatio =  0.0;                 // степень сжатия                                
		DescribeObjectCar.volumeCylinder =  0.0;                   // объем рабочего цилиндра
		final double volumeEngine = 1600.0;                        // объем двигателя
		final double quantityCylinder = 4.0;                       // количество цилиндров
		final double volumeCombastionChamber = 32.0;               // объем камеры сгорания 
			
		volumeCylinder = volumeEngine / quantityCylinder;          // расчет объема рабочего цилиндра
		compressionRatio = (volumeCylinder + volumeCombastionChamber) / volumeCombastionChamber;  // расчет степени сжатия
		
		System.out.println("Степень сжатия: " + compressionRatio); //  вывод результата в консоль
		
	}
	
	public static void calcPowerCar () {
		
		DescribeObjectCar.powerCar = 0.0;                     // мощность в кВт
		DescribeObjectCar.powerCarHP = 0.0;                   // мощность в л.с.  
		final double hpConvert = 1.359;                       // постоянная для конвертации кВт в л.с.
		final double roundMomentEngine = 154.0;               // крутящий момент двигателя
		final double rpm = 5600.0;                            // обороты двигателя
		final double typeConst = 9549;                        // константа для расчета мощности
		
		powerCar = roundMomentEngine * rpm / typeConst;       // расчет мощности автомобиля кВт
		powerCarHP = powerCar * hpConvert;                    // конвертация кВт в л.с. 
		
		System.out.println("Мощность автомобиля: " + powerCar + " кВт  " + " или " + powerCarHP + " л.с." ); // вывод результата в консоль
		
	}

	public static  void calcMaxSpeedCar () {
		DescribeObjectCar.maxSpeed = 0.0;                        // максимальная скорость автомобиля
		final double transmissionNum = 4.294;       // составное передаточное число
		final double numConst = 530.616;      // константа для расчета скорости
		final double  maxRPM = 6200.0;        // аксимальные обороты дливателя до отсечки
		final double wheelD = 70.6;                 // статический диаметр колеса
		
		maxSpeed = maxRPM * wheelD / (transmissionNum * numConst);  // расчет максимальной скорости по формуле
		
		System.out.println("Максимальная скорость: " + maxSpeed + " km/h");  // вывод результата в консоль
		
	
		
	}
	
	
	public static  void displayDescribeObjectCar () {
		
		System.out.println("                  Описание автомобиля              ");
		System.out.println("Марка автомобиля:    " + nameCar);
		System.out.println("Модель:    " + modelCar);
		System.out.println("Цвет кузова:   " + colorCar);                         // вывод описания авто в консоль
		System.out.println("Тип двигателя: " + typeEngine);
		System.out.println("Количество клапанов на цилиндр: " + quantityValves);
		System.out.println("Расход топлива в смешанном цикле на 100 км: " + consumptionFuel + " л/100км");
		System.out.println("Допустимая полная масса: " + weigthCar + " кг");
		System.out.println("Объем топливного бака: " + fuelTank + " л.");
		System.out.println("Топливо: " + typeFuel);
		
		
	}
	
	
		
	
}
