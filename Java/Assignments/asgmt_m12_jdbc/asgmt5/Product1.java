package asgmt5;

public class Product1 {
	
	private int prodCode;
	private String prodName;
	private float prodPrice;
	private String prodCategory;
	
	public Product1() {}

	public Product1(int prodCode, String prodName, float prodPrice, String prodCategory) {
		this.prodCode = prodCode;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodCategory = prodCategory;
	}

	public int getProdCode() {
		return prodCode;
	}

	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public float getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(float prodPrice) {
		this.prodPrice = prodPrice;
	}

	public String getProdCategory() {
		return prodCategory;
	}

	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}

	@Override
	public String toString() {
		return "Product1 [prodCode=" + prodCode + ", prodName=" + prodName + ", prodPrice=" + prodPrice
				+ ", prodCategory=" + prodCategory + "]";
	}
	
}
