package asgmt3;

class Product {
	
	private String productCode;
	private String productName;
	private double productPrice;
	
	public Product(String productCode, String productName, double productPrice) {
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public void displayProductDetails() {
		System.out.println("Product Code  : "+this.productCode+"\nProduct Name  : "+this.productName
        +"\nProduct Price : "+this.productPrice);
	}
	
}

public class TestProduct {
	public static void main(String[] args) {
		Product p1 = new Product("P101", "Laptop", 45000.00);
		p1.displayProductDetails();
	}
}

