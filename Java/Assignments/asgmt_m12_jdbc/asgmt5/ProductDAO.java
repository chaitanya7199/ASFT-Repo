package asgmt5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDAO {
	
	Connection con = DBUtil.getConnection();
	
	public boolean insertProduct(Product1 prod) {
		String sql = "insert into products(PROD_CODE, PROD_NAME, PROD_PRICE, PROD_CATG) "
				   + "values(?, ?, ?, ?)";
		PreparedStatement ps;	
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1,prod.getProdCode());
			ps.setString(2, prod.getProdName());
			ps.setFloat(3, prod.getProdPrice());
			ps.setString(4, prod.getProdCategory());
			int i = ps.executeUpdate();
			if(i>0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public Product1 getProduct(int prodCode) {
		Product1 product = new Product1();
		Statement stmt;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from products where PROD_CODE = "+prodCode);
			while (rs.next()) {
				product.setProdCode(rs.getInt(1)); 
			    product.setProdName(rs.getString(2));
			    product.setProdPrice(rs.getFloat(3));
			    product.setProdCategory(rs.getString(4));
			}
			return product;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		return null;
	}
}
