package com.javatpoint.dao;

import java.sql.*;

public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		//con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
		con=DriverManager.getConnection("jdbc:sqlserver://52.143.104.12:1433;databaseName=appDB;user=user123;password=abc@12345678");
	}catch(Exception e){System.out.println(e);}
	return con;
}
}
