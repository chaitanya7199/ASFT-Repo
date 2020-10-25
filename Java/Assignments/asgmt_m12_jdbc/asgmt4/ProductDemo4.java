package asgmt4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProductDemo4 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_db", "root", "");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from products");
			while (rs.next()) {
				int prodCode = rs.getInt(1); 
			    //String prodName = rs.getString(2);
			    float prodPrice = rs.getFloat(3);
			    String prodCategory = rs.getString(4);
			    if(prodCategory.equals("Electronics")) {
			    	if(prodPrice < 1000f) {
			    		float updatedPrice = (float) (prodPrice + prodPrice*0.1);
			    		String sql1 = "update products set PROD_PRICE = ? where PROD_CODE = ?";
			    		PreparedStatement ps = con.prepareStatement(sql1);
			    		ps.setFloat(1, updatedPrice);
			    		ps.setInt(2, prodCode);
			    		ps.executeUpdate();
			    	}
			    }
			    if(prodCategory.equals("Clothing")) {
			    	if(prodPrice > 1000f) {
			    		float updatedPrice = (float) (prodPrice - prodPrice*0.1);
			    		String sql1 = "update products set PROD_PRICE = ? where PROD_CODE = ?";
			    		PreparedStatement ps = con.prepareStatement(sql1);
			    		ps.setFloat(1, updatedPrice);
			    		ps.setInt(2, prodCode);
			    		ps.executeUpdate();
			    	}
			    }
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Updated Successfully");
	}

}
