package ua.org.oa.dyachenko_s;

public class Products {

	private  String nameProduct;                  // Имя товара
	private  double priceProduct;                 // Цена товара
	private static final int MAX_PRICE = 100;     // Максимальная цена, для проверки условия
	private static final int MIN_PRICE = 0;       // Минимальная цена, для проверки условия
	
	/* Перегруженный конструктор
	 * для создания товаров без цены 
	 */
	public Products (String nameProduct){
		setNameProduct(nameProduct);
	}
	/* Перегруженный конструктор
	 * для создания товаров с указанной ценой
	 */
	public Products (String nameProduct, double priceProduct){
		setNameProduct(nameProduct);
		setPriceProduct(priceProduct);
	}
	
	
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		if (nameProduct != null && nameProduct != ""){
		this.nameProduct = nameProduct;}
		else {
			System.out.println("Ошибка. Укажите название товара! ");
		}
	}
	public double getPriceProduct() {
		return priceProduct;
	}
	public void setPriceProduct(double priceProduct) {
		if (priceProduct <= MAX_PRICE && priceProduct > MIN_PRICE){
		this.priceProduct = priceProduct;}
		else {
			System.out.println("Ошибка. Неверная цена товара! ");
		}
	}
	
	@Override
	public String toString() {
		return "Продукт: " + nameProduct + " " + " Цена: " + priceProduct + "грн.";
	
}
}
