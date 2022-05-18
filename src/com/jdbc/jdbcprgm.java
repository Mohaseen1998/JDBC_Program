package com.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbcprgm {
	public static void main(String[] args) {
		String s="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/testyantraproject";
		String user_name ="root";
		String password="root";
		String query=" insert into employee values(3,'jerry',9986464)";
		try {
			//1: load and register Driver
			Class.forName(s);
			//2: EStablish Connection
			Connection c = DriverManager.getConnection(url,user_name,password);
			//3: create a statement
			Statement st =c.createStatement();
			//4: Execute statement / Query
			st.execute(query);
			//5: close 
			c.close();
			System.out.println(" data saved");
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();

		}		
	}
}
