package com.madhu.jdbcPractice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.plaf.synth.SynthTextPaneUI;

public class JdbcExample2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//1.load and register thr driver
		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		System.out.println("loading the driver...");
		//2.establish the connection with database
//		String url="jdbc:mysql://localhost:3306/student";
		//
		//when it's local machine and the port number is default port(3306) we can skip writing them
		String url="jdbc:mysql:///student";
		String user="root";
		String password="root";
		Connection connection = DriverManager.getConnection(url,user,password);
		
		//3.create the statemt object and send the query
		//String sqlQueryString = "select id, name, age,city from student";
		Statement statement = connection.createStatement();
		//ResultSet resultSet = statement.executeQuery(sqlQueryString);
		//4. execute the query and process the result set
		String sqlQueryString = "delete from student where id =4";
		int noofrowaffected = statement.executeUpdate(sqlQueryString);
		System.out.println("no of rows affected :"+noofrowaffected);
//		System.out.println("id\tname\tage\tcity");
//		while(resultSet.next()) {
//			int sid =resultSet.getInt(1);
//			String sname = resultSet.getString(2);
//			int sage =resultSet.getInt(3);
//			String scity = resultSet.getString(4);
//			System.out.println(sid+"\t"+sname+"\t"+sage+"\t"+scity);
//			
//		}
		
		//5.Handle the sql exception if it gets generated 
		//6. close the connection
		//resultSet.close();
		statement.close();
		connection.close();
		


	}

}	
