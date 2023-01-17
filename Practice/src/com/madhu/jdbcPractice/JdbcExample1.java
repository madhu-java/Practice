package com.madhu.jdbcPractice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.plaf.synth.SynthTextPaneUI;

public class JdbcExample1 {

	public static void main(String[] args) {
		Connection connection=null;

try {
	//step1:load and register the driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver has loaded...");
	
	//step2:establish the connection
	String url ="jdbc:mysql://localhost:3306/madhavi";
	String userName="root";
	String passWord="root";
	connection=DriverManager.getConnection(url, userName, passWord);
	System.out.println("implementation class name:"+connection.getClass().getName());;
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

}	