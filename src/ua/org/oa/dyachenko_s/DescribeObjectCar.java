package ua.org.oa.dyachenko_s;



public class DescribeObjectCar {

	 
	 static String nameCar;           // �������� ����������
	 static String modelCar;          // ������ ����������
	 static char colorCar;            // ���� ����������
	 static String typeEngine;        // ��� ���������
	 static int quantityValves;       // ���������� �������� �� �������
	 static double consumptionFuel;   // ������ ������� � ��������� �����
	 static int weigthCar;            // ���������� ������ ����� ����������
	 static int fuelTank;             // ����� ����
	 static String typeFuel;          // ��� �������
	 static double compressionRatio;  // ������� ������
	 static double volumeCylinder;    // ����� ��������
	 static double powerCar;          // �������� ���������� � ���
	 static double powerCarHP;        // �������� ���������� � �.�.
	 static double maxSpeed;          // ������������ �������� ����������
	 
	 public DescribeObjectCar () {       // �����������
		
		
	}
	
	public static void calcCompression () {
		
		DescribeObjectCar.compressionRatio =  0.0;                 // ������� ������                                
		DescribeObjectCar.volumeCylinder =  0.0;                   // ����� �������� ��������
		final double volumeEngine = 1600.0;                        // ����� ���������
		final double quantityCylinder = 4.0;                       // ���������� ���������
		final double volumeCombastionChamber = 32.0;               // ����� ������ �������� 
			
		volumeCylinder = volumeEngine / quantityCylinder;          // ������ ������ �������� ��������
		compressionRatio = (volumeCylinder + volumeCombastionChamber) / volumeCombastionChamber;  // ������ ������� ������
		
		System.out.println("������� ������: " + compressionRatio); //  ����� ���������� � �������
		
	}
	
	public static void calcPowerCar () {
		
		DescribeObjectCar.powerCar = 0.0;                     // �������� � ���
		DescribeObjectCar.powerCarHP = 0.0;                   // �������� � �.�.  
		final double hpConvert = 1.359;                       // ���������� ��� ����������� ��� � �.�.
		final double roundMomentEngine = 154.0;               // �������� ������ ���������
		final double rpm = 5600.0;                            // ������� ���������
		final double typeConst = 9549;                        // ��������� ��� ������� ��������
		
		powerCar = roundMomentEngine * rpm / typeConst;       // ������ �������� ���������� ���
		powerCarHP = powerCar * hpConvert;                    // ����������� ��� � �.�. 
		
		System.out.println("�������� ����������: " + powerCar + " ���  " + " ��� " + powerCarHP + " �.�." ); // ����� ���������� � �������
		
	}

	public static  void calcMaxSpeedCar () {
		DescribeObjectCar.maxSpeed = 0.0;                        // ������������ �������� ����������
		final double transmissionNum = 4.294;       // ��������� ������������ �����
		final double numConst = 530.616;      // ��������� ��� ������� ��������
		final double  maxRPM = 6200.0;        // ����������� ������� ��������� �� �������
		final double wheelD = 70.6;                 // ����������� ������� ������
		
		maxSpeed = maxRPM * wheelD / (transmissionNum * numConst);  // ������ ������������ �������� �� �������
		
		System.out.println("������������ ��������: " + maxSpeed + " km/h");  // ����� ���������� � �������
		
	
		
	}
	
	
	public static  void displayDescribeObjectCar () {
		
		System.out.println("                  �������� ����������              ");
		System.out.println("����� ����������:    " + nameCar);
		System.out.println("������:    " + modelCar);
		System.out.println("���� ������:   " + colorCar);                         // ����� �������� ���� � �������
		System.out.println("��� ���������: " + typeEngine);
		System.out.println("���������� �������� �� �������: " + quantityValves);
		System.out.println("������ ������� � ��������� ����� �� 100 ��: " + consumptionFuel + " �/100��");
		System.out.println("���������� ������ �����: " + weigthCar + " ��");
		System.out.println("����� ���������� ����: " + fuelTank + " �.");
		System.out.println("�������: " + typeFuel);
		
		
	}
	
	
		
	
}
