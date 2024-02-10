package com.servlet.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc {
	 static jdbc mysql=new jdbc();
	 static Connection connect;
	private jdbc()  {
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/Cars","root","Geetha@98");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
			public static Connection getinstance() {
				return  mysql.connect;			
				}
			public static void main(String args[]) {
				System.out.println(jdbc.getinstance());
			}
	}
	


 