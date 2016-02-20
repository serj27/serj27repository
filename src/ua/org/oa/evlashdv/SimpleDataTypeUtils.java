package ua.org.oa.evlashdv;

public class SimpleDataTypeUtils {
	
	public static void checkTriangleTask4 (int side1, int side2, int side3) {
		
		System.out.println("Task4");
		if (side1 + side2 >side3 &&	side1 + side3 > side2 &&  side2 + side3 > side1){
			
			boolean isRectangle1 = side1*side1 + side2*side2 == side3*side3;
			boolean isRectangle2 = side2*side2 + side3*side3 == side1*side1;
			boolean isRectangle3 =side1*side1 + side3*side3 == side2*side2;
			
							System.out.println((isRectangle1 || isRectangle2 || isRectangle3)?"Rectangle":"not Rectangle");
		} else 
		
		{
			System.out.println ("It is not a triangle");
		}System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		
	}

	static byte eightBit;
	static short sixteenBit;
	static int thirtytwoBit;
	static long sixtyfourBit;
	static float sixteenBitF;
	static double thirtytwoBitD;
	
	public static void nameOfSimpleTypeTask1 (){
		byte eightBit = 8;
		short sixteenBit = 16;
		int thirtytwoBit = 32;
		long sixtyfourBit = 64;
		float sixteenBitF = 16.0f;
		double thirtytwoBitD = 32.0d;
		
		System.out.println(eightBit);
		System.out.println(sixteenBit);
		System.out.println(thirtytwoBit);
		System.out.println(sixtyfourBit);
		System.out.println(sixteenBitF);
		System.out.println(thirtytwoBitD);
	}
	
	
	
	public static void nameOfTypeFloatTask2 () {
		float f1 = 1.0f;
		float f2 = 1f;
		float f3 = 0x1f;
		float f4 = 0b1;
		float f5 = 1.0e-1f;
		float f6 = 0.1f;    
	
	
	}
	
	static short sumResult;
	
	public static void nameOfTypeShortTask3 () {
		sumResult = (short) (thirtytwoBit + thirtytwoBit);
		sumResult = (short) (thirtytwoBit + thirtytwoBitD);
		sumResult = (short) (sixteenBitF + thirtytwoBit);
		sumResult = (short) (eightBit + sixteenBit);
		sumResult = (short) (sixteenBitF + thirtytwoBitD);
	}
	
	
	public static void sumIntegerResultTask5 () {
		int sum1 = 0;
		for (int i = 1; i < 21; i++) {
			sum1 = sum1 + i;
		}System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Task5");
		System.out.println(sum1);
		
		}
	
	
	public static void sumNumbersTask6 (){
		
		int sum2 = 0;
		for (int i = 1; i < 21; i+=2){
			sum2 = sum2 + i;
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Task6");
		System.out.println(sum2);
	}
	
	
	public static void sumPrimeNumbersTask7()
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Task7");
		int number, divider;
		int sum3 = 0;
        for (number = 2; number < 20; number++)
        {
            divider = 0;
            for (int i = 1; i <= number; i++)
            {
                if (number % i == 0)
                {
                    divider++;
                }
                }
            if (divider <= 2)
            {
                sum3+=number;
                
                System.out.println(sum3 + " ");
            }
	    }
        
	}
	
	
	
	
	
	public static void displayTrueTask8 (int a, int b, int c){
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Task8");
		boolean bool = true;
		boolean bool2 = false;
		if (a + b == c || a + c == b || c + b == a) {
			
			
			System.out.println(bool);
		} else  {
			System.out.println(bool2);
		}
		
		
			
			
		}
	
	public static void calcMiddleTypeTask9 (int a, int b){
		int diapazon = a - b;
		int sum4 = 0;
		int result = 0; 
		for (int i = b; i<a; i++)
		{
			sum4+=i;
			result = sum4/diapazon;
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Task9");
		System.out.println(result);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
	}
	
			
		public static void creditBankTask10 (double sumCredit,double percent,double month) {
			System.out.println("Task10");
			double monthPay = sumCredit/month;
			double monthPercent = percent/month;
			double monthSumPay = monthPay * monthPercent;
			double yearSumPercent = monthSumPay * month;
			for (int i=1; i<=month; i++)
			{
			System.out.print(i + "   месяц:" + "    Сумма к оплате: " + monthPay +" грн" + 
			"                 Начисленный процент: " + monthSumPay + " грн");
			
				
			System.out.println();
			}
			System.out.println();
			System.out.print("Суммарное значение процентов: " + yearSumPercent + " грн");
			
		}
		
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

