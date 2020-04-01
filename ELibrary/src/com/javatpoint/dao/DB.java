package com.javatpoint.dao;

import java.sql.*;

public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		//con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		con=DriverManager.getConnection("jdbc:mysql://localhost/appDB","root","abc@12345");
	}catch(Exception e){System.out.println(e);}
	return con;
}
}
