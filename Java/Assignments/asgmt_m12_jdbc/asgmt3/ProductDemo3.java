package asgmt3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

class Products {
	
	private int productCode;
	private String productName;
	private float productPrice;
	private String productCategory;
	
	public Products() {}

	public Products(int productCode, String productName, float productPrice, String productCategory) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productCategory = productCategory;
	}

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	
	
}

public class ProductDemo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of products");;
		int n = sc.nextInt();
		int productCode;
		String productName, productCategory;
		float productPrice;
		for(int i=0;i<n;i++) {
			System.out.println("Enter details of product "+(i+1));
			productCode = sc.nextInt();
			productName = sc.next();
			productPrice = sc.nextFloat();
			productCategory = sc.next();
			Products product = new Products(productCode, productName, productPrice, productCategory);
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_db", "root", "");
				String sql = "INSERT INTO products VALUES(?, ?, ?, ?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1,product.getProductCode());
				ps.setString(2, product.getProductName());
				ps.setFloat(3, product.getProductPrice());
				ps.setString(4, product.getProductCategory());
				ps.executeUpdate();
				
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("All Products Inserted");
		sc.close();
	}

}
