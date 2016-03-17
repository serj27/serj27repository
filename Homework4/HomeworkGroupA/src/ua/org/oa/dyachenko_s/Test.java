package ua.org.oa.dyachenko_s;



public class Test {

	public static void main(String[] args) {
	  
		/* Тест корректной работы программы 
	   * в случае неправильного ввода данных
	   */
		
		@SuppressWarnings("unused")
		Products product1 = new Products(null);                                  
	        System.out.println();

	        new Products("Orange", -14);                              
	        System.out.println();

	        @SuppressWarnings("unused")
			Shop shop0 = new Shop(null);
	        System.out.println();

	        /* Выводим на экран магазин, 
	         * в котором нет товаров 
	         */
	        Shop shop1 = new Shop("ROST");  
	        System.out.println(shop1);                                    
	        System.out.println();

	        
	        System.out.println("Average price:");
	        /* Задаем параметры товаров для
	         * работы методов расчета цены выше среднего,
	         * выше определенного значения и ниже среднего,
	         * ниже определенного значения. Выводим результат на экран.
	         */
	        System.out.println(shop1.findProductPrice(new Products[]{new Products("Картошка", 6), 
	        		new Products("Помидор", 12), new Products("Хлеб", 9), new Products("Водка", 27),
	        		new Products("Овсяные хлопья", 7)})); 
	        shop1.findProductPriceAboveAverage(new Products[]{new Products("Картошка", 6), 
	        		new Products("Помидор", 12), new Products("Хлеб", 9), new Products("Водка", 27),
	        		new Products("Овсяные хлопья", 7)});
	        shop1.findProductPriceBelowAverage(new Products[]{new Products("Картошка", 6), 
	        		new Products("Помидор", 12), new Products("Хлеб", 9), new Products("Водка", 27),
	        		new Products("Овсяные хлопья", 7)});
	        shop1.findProductPriceAboveSet(new Products[]{new Products("Картошка", 6), 
	        		new Products("Помидор", 12), new Products("Хлеб", 9), new Products("Водка", 27),
	        		new Products("Овсяные хлопья", 7)},9);
	        shop1.findProductPriceBelowSet(new Products[]{new Products("Картошка", 6), 
	        		new Products("Помидор", 12), new Products("Хлеб", 9), new Products("Водка", 27),
	        		new Products("Овсяные хлопья", 7)},7);
	        System.out.println();
          
	        /* Вариант вывода на экран работы
             * перегруженных методов с необъявленными
             * переменными в конструкторе метода.
             */
	        Shop shop2 = new Shop("CLASS", new Products[]{new Products("Jellebone", 17.20), 
					new Products("Торт",22.85), new Products("Пиво светлое", 11.40),
					new Products("Апельсин",8.65), new Products("Rafaello", 19.50)});
	        System.out.println(shop2);
	        System.out.println("Average price:");
	        System.out.println(shop2.findProductPrice());
	        shop2.findProductPriceAboveAverage();
	        shop2.findProductPriceBelowAverage();
	        shop2.findProductPriceAboveSet(17);
	        shop2.findProductPriceBelowSet(15);
		
		
	}

}
