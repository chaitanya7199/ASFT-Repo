package asgmt5;

class Product {
	
	private String productCode;
	private String productName;
	private double productPrice;
	private char categoryType;
	
	private static int prodCounter = 100;
	
	public Product(String productName, double productPrice, char categoryType) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.categoryType = categoryType;
		this.productCode = generateProductCode();
	}
	
	public Product(String productName, double productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.categoryType = 'E';
		this.productCode = generateProductCode();
	}
	
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public void setCategoryType(char categoryType) {
		this.categoryType = categoryType;
	}
	
	public String getProductCode() {
		return productCode;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public double getProductPrice() {
		return productPrice;
	}
	
	public char getCategoryType() {
		return categoryType;
	}
	
	private String generateProductCode() {
		return this.categoryType+" - "+String.valueOf(++prodCounter);
	}
	
	public void displayProductDetails() {
		System.out.println("Product Code     : "+this.productCode+"\nProduct Name     : "+this.productName
        +"\nProduct Price    : "+this.productPrice+"\nProduct Category : "+this.categoryType);
	}
	
}

public class TestProduct {
	public static void main(String[] args) {
		System.out.println("Product1 :");
		Product p1 = new Product("Laptop", 45000.00, 'E');
		p1.displayProductDetails();
		System.out.println("\nProduct2 :");
		Product p2 = new Product("Laptop", 45000.00);
		p2.displayProductDetails();
	}
}
