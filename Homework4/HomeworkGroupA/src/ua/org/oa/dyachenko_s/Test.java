package ua.org.oa.dyachenko_s;



public class Test {

	public static void main(String[] args) {
	  
		/* ���� ���������� ������ ��������� 
	   * � ������ ������������� ����� ������
	   */
		
		@SuppressWarnings("unused")
		Products product1 = new Products(null);                                  
	        System.out.println();

	        new Products("Orange", -14);                              
	        System.out.println();

	        @SuppressWarnings("unused")
			Shop shop0 = new Shop(null);
	        System.out.println();

	        /* ������� �� ����� �������, 
	         * � ������� ��� ������� 
	         */
	        Shop shop1 = new Shop("ROST");  
	        System.out.println(shop1);                                    
	        System.out.println();

	        
	        System.out.println("Average price:");
	        /* ������ ��������� ������� ���
	         * ������ ������� ������� ���� ���� ��������,
	         * ���� ������������� �������� � ���� ��������,
	         * ���� ������������� ��������. ������� ��������� �� �����.
	         */
	        System.out.println(shop1.findProductPrice(new Products[]{new Products("��������", 6), 
	        		new Products("�������", 12), new Products("����", 9), new Products("�����", 27),
	        		new Products("������� ������", 7)})); 
	        shop1.findProductPriceAboveAverage(new Products[]{new Products("��������", 6), 
	        		new Products("�������", 12), new Products("����", 9), new Products("�����", 27),
	        		new Products("������� ������", 7)});
	        shop1.findProductPriceBelowAverage(new Products[]{new Products("��������", 6), 
	        		new Products("�������", 12), new Products("����", 9), new Products("�����", 27),
	        		new Products("������� ������", 7)});
	        shop1.findProductPriceAboveSet(new Products[]{new Products("��������", 6), 
	        		new Products("�������", 12), new Products("����", 9), new Products("�����", 27),
	        		new Products("������� ������", 7)},9);
	        shop1.findProductPriceBelowSet(new Products[]{new Products("��������", 6), 
	        		new Products("�������", 12), new Products("����", 9), new Products("�����", 27),
	        		new Products("������� ������", 7)},7);
	        System.out.println();
          
	        /* ������� ������ �� ����� ������
             * ������������� ������� � ��������������
             * ����������� � ������������ ������.
             */
	        Shop shop2 = new Shop("CLASS", new Products[]{new Products("Jellebone", 17.20), 
					new Products("����",22.85), new Products("���� �������", 11.40),
					new Products("��������",8.65), new Products("Rafaello", 19.50)});
	        System.out.println(shop2);
	        System.out.println("Average price:");
	        System.out.println(shop2.findProductPrice());
	        shop2.findProductPriceAboveAverage();
	        shop2.findProductPriceBelowAverage();
	        shop2.findProductPriceAboveSet(17);
	        shop2.findProductPriceBelowSet(15);
		
		
	}

}
