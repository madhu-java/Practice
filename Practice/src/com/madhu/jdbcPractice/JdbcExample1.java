package com.madhu.jdbcPractice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.plaf.synth.SynthTextPaneUI;

public class JdbcExample1 {

	public static void main(String[] args) {
		Connection connection=null;
		Statement statement = null;
		ResultSet resultSet= null;

try {
	//step1:load and register the driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver has loaded...");
	
	//step2:establish the connection
	String url ="jdbc:mysql://localhost:3306/madhavi";
	String userName="root";
	String passWord="root";
	connection=DriverManager.getConnection(url, userName, passWord);
	System.out.println("implementation class name:"+connection.getClass().getName());
	
	//step 3: create ststemnt object and send the query
	String sqlQuery = "select b_id ,b_branch, b_name from bank";
	statement = connection.createStatement();
	System.out.println("implement classs name:"+statement.getClass().getName());
	resultSet = statement.executeQuery(sqlQuery);
	System.out.println("implement classs name:"+resultSet.getClass().getName());
	
	//step4: process the result set
	System.out.println("bankId\tbankbranch\tbankname");
	while(resultSet.next()) {
		Integer bid = resultSet.getInt(1);
		String bbranch= resultSet.getString(2);
		String bname= resultSet.getString(3);
		System.out.println(bid+"\t"+bbranch+"\t"+bname);
	}
	
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

}	
