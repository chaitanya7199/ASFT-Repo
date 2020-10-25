package asgmt2;

class Product {
	
	private String productCode;
	private String productName;
	private double productPrice;
	
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
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
	
}

public class TestProduct {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setProductCode("P101");
		p1.setProductName("Laptop");
		p1.setProductPrice(45000.00);
		System.out.println("Product Code  : "+p1.getProductCode()+"\nProduct Name  : "+p1.getProductName()
		                   +"\nProduct Price : "+p1.getProductPrice());
	}
}

