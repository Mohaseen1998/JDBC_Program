package com.jdbc;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class retrivejdbc {
	

		public static void main(String[] args) {
			String s="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/testyantraproject";
			String user_name ="root";
			String password="root";
			String query="select * from employee";
			try {
				//1: load and register Driver
				Class.forName(s);
				//2: EStablish Connection
				Connection c = DriverManager.getConnection(url,user_name,password);
				//3: create a statement
				Statement st =c.createStatement();
				//4: Execute statement / Query
				ResultSet resultset =st.executeQuery(query);
				while(resultset.next()) {
					System.out.println(resultset.getInt(1));
					System.out.println(resultset.getString(2));
					System.out.println(resultset.getDouble(3));
					System.out.println("------------------");
				}
				//5: close 
				c.close();
				System.out.println(" data saved");
			}
			catch(ClassNotFoundException | SQLException e){
				e.printStackTrace();

			}		
		}
	}


