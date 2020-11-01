package com.hefshine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url="jdbc:mysql://localhost:3306/hefshine";
		String username="root";
		String password="Mst@2995";
		
		Class forName("com.mysql.cj.jdbc.Driver");
		Connection con =DriverManager.getConnection(url, username, password);
		Statement st=con.createStatement();
		Resultset rs=st.executeQuery("select *from emp");
		
	}

}
