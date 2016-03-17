package ua.org.oa.dyachenko_s;

import java.util.Arrays;

public class Shop {

	 private String nameShop;
	    private Products[] products;

	    /* Создаю перегруженный конструктор
	     * для создания магазина без товаров
	     */
	    public Shop(String nameShop) {                              
	        setNameShop(nameShop);
	    }
        /* Создаю перегруженный конструктор
         * для создания магазина с товарами
         */
	    public Shop(String nameShop, Products[] products) {               
	        setNameShop(nameShop);
	        setProducts(products);
	    }
        /* Перегруженный метод для вычисления
         * средней цены товаров в магазине.
         * Конструктор метода пустой.
         */
	    public double findProductPrice() {                                   
	            int count = 0;
	            double average = 0;

	            for (int i = 0; i < products.length; i++) {
	                average += products[i].getPriceProduct();
	                count++;
	            }
	            return average / count;
	    }
	    /* Перегруженный метод для вычисления
         * средней цены товаров в магазине.
         * Параметры конструктора метода заданы.
         */
	    public double findProductPrice(Products[] products) {                        
	        int count = 0;
	        double average = 0;

	        for (int i = 0; i < products.length; i++) {
	            average += products[i].getPriceProduct();
	            count++;
	        }
	        return average / count;
	    }
         /* Перегруженный метод, в котором мы вычисляем 
          * и возвращаем значение цены товара ВЫШЕ СРЕДНЕГО.
          * Конструктор метода пустой.
          */
	    public Products[] findProductPriceAboveAverage() {                  
	        System.out.println("Цена товара выше среднего в магазине " + "\'" + this.getNameShop() + "\'");
	        for (int i = 0; i < products.length; i++) {
	            if (findProductPrice() < products[i].getPriceProduct()) {
	                System.out.println(products[i]);
	            }
	        }

	        return products;
	    }
	    /* Перегруженный метод, в котором мы вычисляем 
         * и возвращаем значение цены товара ВЫШЕ СРЕДНЕГО.
         * Параметры конструктора метода заданы.
         */
	    public Products[] findProductPriceAboveAverage(Products[] products) {       
	        System.out.println("Цена товара выше среднего в магазине " + "\'" + this.getNameShop() + "\'");
	        for (int i = 0; i < products.length; i++) {
	            if (findProductPrice(products) < products[i].getPriceProduct()) {
	                System.out.println(products[i]);
	            }
	        }

	        return products;
	    }
	    /* Перегруженный метод, в котором мы вычисляем 
         * и возвращаем значение цены товара НИЖЕ СРЕДНЕГО.
         * Конструктор метода пустой.
         */
	    public Products[] findProductPriceBelowAverage() {                    
	        System.out.println("Цена товара ниже среднего в магазине " + "\'" + this.getNameShop() + "\'");
	        for (int i = 0; i < products.length; i++) {
	            if (findProductPrice() > products[i].getPriceProduct()) {
	                System.out.println(products[i]);
	            }
	        }
	        return products;
	    }
	    /* Перегруженный метод, в котором мы вычисляем 
         * и возвращаем значение цены товара НИЖЕ СРЕДНЕГО.
         * Параметры конструктора метода заданы.
         */
	    public Products[] findProductPriceBelowAverage(Products[] products) {         
	        System.out.println("Цена товара ниже среднего в магазине " + "\'" + this.getNameShop() + "\'");
	        for (int i = 0; i < products.length; i++) {
	            if (findProductPrice(products) > products[i].getPriceProduct()) {
	                System.out.println(products[i]);
	            }
	        }
	        return products;
	    }
	    /* Перегруженный метод, в котором мы вычисляем 
         * и возвращаем значение цены товара ВЫШЕ УСТАНОВЛЕННОГО.
         * Конструктор метода пустой.
         */
	    public Products[] findProductPriceAboveSet(int price) {                  
	        System.out.println("Цена товара выше установленной " + price + "грн"+ " в магазине " + "\'" + this.getNameShop() + "\'");
	        for (int i = 0; i < products.length; i++) {
	            if (price < products[i].getPriceProduct()) {
	                System.out.println(products[i]);
	            }
	        }
	        return products;
	    }
	    /* Перегруженный метод, в котором мы вычисляем 
         * и возвращаем значение цены товара ВЫШЕ УСТАНОВЛЕННОГО.
         * Параметры конструктора метода заданы.
         */
	    public Products[] findProductPriceAboveSet(Products[] products, int price) {    
	        System.out.println("Цена товара выше установленной " + price + "грн" + " в магазине " + "\'" + this.getNameShop() + "\'");
	        for (int i = 0; i < products.length; i++) {
	            if (price < products[i].getPriceProduct()) {
	                System.out.println(products[i]);
	            }
	        }
	        return products;
	    }
	    /* Перегруженный метод, в котором мы вычисляем 
         * и возвращаем значение цены товара НИЖЕ УСТАНОВЛЕННОГО.
         * Параметры конструктора метода заданы частично.
         */
	    public Products[] findProductPriceBelowSet(int price) {                 
	        System.out.println("Цена товара ниже установленной " + price + "грн" + " в магазине " + "\'" + this.getNameShop() + "\'");
	        for (int i = 0; i < products.length; i++) {
	            if (price > products[i].getPriceProduct()) {
	                System.out.println(products[i]);
	            }
	        }
	        return products;
	    }
	    /* Перегруженный метод, в котором мы вычисляем 
         * и возвращаем значение цены товара НИЖЕ УСТАНОВЛЕННОГО.
         * Параметры конструктора метода заданы.
         */
	    public Products[] findProductPriceBelowSet(Products[] products, int price) {   
	        System.out.println("Цена товара ниже установленной  " + price + "грн "+ " в магазине" + "\'" + this.getNameShop() + "\'");
	        for (int i = 0; i < products.length; i++) {
	            if (price > products[i].getPriceProduct()) {
	                System.out.println(products[i]);
	            }
	        }
	        return products;
	    }

	    public String getNameShop() {
	        return nameShop;
	    }

	    public void setNameShop(String nameShop) {
	        if (nameShop != null && nameShop != "") {
	            this.nameShop = nameShop;
	        } else  {
	            System.out.println("Ошибка. Неверное название магазина");
	        }
	    }

	    public Products[] getProducts() {
	        return products;
	    }

	    public void setProducts(Products[] products) {
	        if (products != null) {
	            this.products = products;
	        } else{
	            System.out.println("Ошибка. Вы должны задать как минимум один товар");
	        }
	    }

	    @Override
	    public String toString() {
	        if (products == null) {
	            return "МАГАЗИН: " + nameShop + "\n" +
	                    "ТОВАРЫ:  Ожидаем доставку товаров";
	        }
	        return "МАГАЗИН: " + nameShop + "\n" +
	                Arrays.toString(products);

	    }
	}
