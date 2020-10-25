package asgmt1;

class Product {
	
	String productCode;
	String productName;
	double productPrice;	
	
}

public class TestProduct {
	public static void main(String[] args) {
		Product p1 = new Product();
		System.out.println("Product Code  : "+p1.productCode);
		System.out.println("Product Name  : "+p1.productName);
		System.out.println("Product Price : "+p1.productPrice);
		Product p2 = new Product();
		p2.productCode = "P101";
		p2.productName = "Laptop";
		p2.productPrice = 45000.00;
		System.out.println("\nProduct Code  : "+p2.productCode);
		System.out.println("Product Name  : "+p2.productName);
		System.out.println("Product Price : "+p2.productPrice);
	}
}
