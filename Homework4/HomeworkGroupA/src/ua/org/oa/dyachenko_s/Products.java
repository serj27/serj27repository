package ua.org.oa.dyachenko_s;

public class Products {

	private  String nameProduct;                  // ��� ������
	private  double priceProduct;                 // ���� ������
	private static final int MAX_PRICE = 100;     // ������������ ����, ��� �������� �������
	private static final int MIN_PRICE = 0;       // ����������� ����, ��� �������� �������
	
	/* ������������� �����������
	 * ��� �������� ������� ��� ���� 
	 */
	public Products (String nameProduct){
		setNameProduct(nameProduct);
	}
	/* ������������� �����������
	 * ��� �������� ������� � ��������� �����
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
			System.out.println("������. ������� �������� ������! ");
		}
	}
	public double getPriceProduct() {
		return priceProduct;
	}
	public void setPriceProduct(double priceProduct) {
		if (priceProduct <= MAX_PRICE && priceProduct > MIN_PRICE){
		this.priceProduct = priceProduct;}
		else {
			System.out.println("������. �������� ���� ������! ");
		}
	}
	
	@Override
	public String toString() {
		return "�������: " + nameProduct + " " + " ����: " + priceProduct + "���.";
	
}
}
