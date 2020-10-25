package asgmt2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ProductDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product code");
		int productCode = sc.nextInt();
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_db", "root", "");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from products where PROD_CODE = "+productCode);
		while (rs.next()) {
			int prodCode = rs.getInt(1); 
		    String prodName = rs.getString(2);
		    float prodPrice = rs.getFloat(3);
		    String prodCategory = rs.getString(4);
		    System.out.println("Product Details\nCode : "+prodCode+"\nName : "+prodName
		                      +"\nPrice : "+prodPrice+"\nCategory : "+prodCategory);
		}
		con.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
