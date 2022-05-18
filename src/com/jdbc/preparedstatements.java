package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class preparedstatements {
	public static void main(String[] args) {
		String s="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/testyantraproject";
		String user_name ="root";
		String password="root";
		String query=" insert into employee values(?,?,?)";
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the id");
		int id = sc.nextInt();
		System.out.println("enter the name");
		String name = sc.next();
		System.out.println(" enter the phno");
		double phno = sc.nextDouble();
		try {
			//1: load and register Driver
			Class.forName(s);
			//2: EStablish Connection
			Connection c = DriverManager.getConnection(url,user_name,password);
			//3: create a statement
			PreparedStatement pre =c.prepareStatement(query);
			//4: Execute statement / Query
			pre.setInt(1,id);
			pre.setString(2,"name");
			pre.setDouble(3,phno);
			pre.execute();
			//5: close 
			c.close();
			System.out.println(" data saved");
		}
		catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();

		}		
	}

}
