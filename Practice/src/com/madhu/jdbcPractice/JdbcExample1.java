package com.madhu.jdbcPractice;
import javax.swing.plaf.synth.SynthTextPaneUI;

public class JdbcExample1 {

	public static void main(String[] args) {

try {
	//step1:load and register the driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver has loaded...");
	
	//step2:establish the connection
	String user="root";
	String pasword="root";
	
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


	}

}
