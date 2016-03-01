package ua.org.oa.dyachenko_s;

import java.util.Arrays;

public class Shop {

	 private String nameShop;
	    private Products[] products;

	    /* ������ ������������� �����������
	     * ��� �������� �������� ��� �������
	     */
	    public Shop(String nameShop) {                              
	        setNameShop(nameShop);
	    }
        /* ������ ������������� �����������
         * ��� �������� �������� � ��������
         */
	    public Shop(String nameShop, Products[] products) {               
	        setNameShop(nameShop);
	        setProducts(products);
	    }
        /* ������������� ����� ��� ����������
         * ������� ���� ������� � ��������.
         * ����������� ������ ������.
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
	    /* ������������� ����� ��� ����������
         * ������� ���� ������� � ��������.
         * ��������� ������������ ������ ������.
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
         /* ������������� �����, � ������� �� ��������� 
          * � ���������� �������� ���� ������ ���� ��������.
          * ����������� ������ ������.
          */
	    public Products[] findProductPriceAboveAverage() {                  
	        System.out.println("���� ������ ���� �������� � �������� " + "\'" + this.getNameShop() + "\'");
	        for (int i = 0; i < products.length; i++) {
	            if (findProductPrice() < products[i].getPriceProduct()) {
	                System.out.println(products[i]);
	            }
	        }

	        return products;
	    }
	    /* ������������� �����, � ������� �� ��������� 
         * � ���������� �������� ���� ������ ���� ��������.
         * ��������� ������������ ������ ������.
         */
	    public Products[] findProductPriceAboveAverage(Products[] products) {       
	        System.out.println("���� ������ ���� �������� � �������� " + "\'" + this.getNameShop() + "\'");
	        for (int i = 0; i < products.length; i++) {
	            if (findProductPrice(products) < products[i].getPriceProduct()) {
	                System.out.println(products[i]);
	            }
	        }

	        return products;
	    }
	    /* ������������� �����, � ������� �� ��������� 
         * � ���������� �������� ���� ������ ���� ��������.
         * ����������� ������ ������.
         */
	    public Products[] findProductPriceBelowAverage() {                    
	        System.out.println("���� ������ ���� �������� � �������� " + "\'" + this.getNameShop() + "\'");
	        for (int i = 0; i < products.length; i++) {
	            if (findProductPrice() > products[i].getPriceProduct()) {
	                System.out.println(products[i]);
	            }
	        }
	        return products;
	    }
	    /* ������������� �����, � ������� �� ��������� 
         * � ���������� �������� ���� ������ ���� ��������.
         * ��������� ������������ ������ ������.
         */
	    public Products[] findProductPriceBelowAverage(Products[] products) {         
	        System.out.println("���� ������ ���� �������� � �������� " + "\'" + this.getNameShop() + "\'");
	        for (int i = 0; i < products.length; i++) {
	            if (findProductPrice(products) > products[i].getPriceProduct()) {
	                System.out.println(products[i]);
	            }
	        }
	        return products;
	    }
	    /* ������������� �����, � ������� �� ��������� 
         * � ���������� �������� ���� ������ ���� ��������������.
         * ����������� ������ ������.
         */
	    public Products[] findProductPriceAboveSet(int price) {                  
	        System.out.println("���� ������ ���� ������������� " + price + "���"+ " � �������� " + "\'" + this.getNameShop() + "\'");
	        for (int i = 0; i < products.length; i++) {
	            if (price < products[i].getPriceProduct()) {
	                System.out.println(products[i]);
	            }
	        }
	        return products;
	    }
	    /* ������������� �����, � ������� �� ��������� 
         * � ���������� �������� ���� ������ ���� ��������������.
         * ��������� ������������ ������ ������.
         */
	    public Products[] findProductPriceAboveSet(Products[] products, int price) {    
	        System.out.println("���� ������ ���� ������������� " + price + "���" + " � �������� " + "\'" + this.getNameShop() + "\'");
	        for (int i = 0; i < products.length; i++) {
	            if (price < products[i].getPriceProduct()) {
	                System.out.println(products[i]);
	            }
	        }
	        return products;
	    }
	    /* ������������� �����, � ������� �� ��������� 
         * � ���������� �������� ���� ������ ���� ��������������.
         * ��������� ������������ ������ ������ ��������.
         */
	    public Products[] findProductPriceBelowSet(int price) {                 
	        System.out.println("���� ������ ���� ������������� " + price + "���" + " � �������� " + "\'" + this.getNameShop() + "\'");
	        for (int i = 0; i < products.length; i++) {
	            if (price > products[i].getPriceProduct()) {
	                System.out.println(products[i]);
	            }
	        }
	        return products;
	    }
	    /* ������������� �����, � ������� �� ��������� 
         * � ���������� �������� ���� ������ ���� ��������������.
         * ��������� ������������ ������ ������.
         */
	    public Products[] findProductPriceBelowSet(Products[] products, int price) {   
	        System.out.println("���� ������ ���� �������������  " + price + "��� "+ " � ��������" + "\'" + this.getNameShop() + "\'");
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
	            System.out.println("������. �������� �������� ��������");
	        }
	    }

	    public Products[] getProducts() {
	        return products;
	    }

	    public void setProducts(Products[] products) {
	        if (products != null) {
	            this.products = products;
	        } else{
	            System.out.println("������. �� ������ ������ ��� ������� ���� �����");
	        }
	    }

	    @Override
	    public String toString() {
	        if (products == null) {
	            return "�������: " + nameShop + "\n" +
	                    "������:  ������� �������� �������";
	        }
	        return "�������: " + nameShop + "\n" +
	                Arrays.toString(products);

	    }
	}
