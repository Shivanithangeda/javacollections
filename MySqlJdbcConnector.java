package com.shiv.mysql.jdbc;

import  java.sql.Connection;
import  java.sql.DriverManager;
import  java.sql.ResultSet;
import  java.sql.SQLException;
import  java.sql.Statement;


public class MySqlJdbcConnector {
	
	public static final String QUERY = "select *  from USER;";
	
	public static void main(String[] args)  throws  ClassNotFoundException, SQLException{
		// TODO Auto-generated method stub
		 String host = "";
	        String user = "";
	        
	         // Load MySQL JDBC driver
	         
	   	    Class.forName("com.mysql.jdbc.Driver");	
	   		
	   		//  Create Connection to DB		
	   		 
	    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","mysqldb");
	    	
	    	//  Create Statement Object.
	    	 
		    Statement stmt = con.createStatement();
		    
		    //  Execute the SQL Query. Store results in ResultSet.
		     
	 		ResultSet rs= stmt.executeQuery(QUERY);						
	 		
	 		// While Loop iterates through all data present in a table.
	 		 
			while (rs.next()){ 
		        		 host = rs.getString(1);								        
	                     user = rs.getString("User");
	                     System.out.println("Host: "+host);
	         			 System.out.println("Username: "+user);
	            }				
				con.close();
	}

}