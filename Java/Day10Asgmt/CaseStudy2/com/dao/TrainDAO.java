package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.model.Train;

public class TrainDAO {
	
	private String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	private String DB_URL = "jdbc:mysql://localhost:3306/practice_db";
	private String USERNAME = "root";
	private String PASSWORD = "";
	
	public Train findTrain(int trainNo) {
		Train train = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM trains WHERE train_no = " + trainNo);
			if(rs == null) {
				return train;
			}
			while(rs.next()) {
				train = new Train(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return train;
	}
}
