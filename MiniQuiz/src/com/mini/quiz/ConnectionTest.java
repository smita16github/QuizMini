package com.mini.quiz;


	import java.sql.DriverManager;
	import java.sql.Connection;
	import java.sql.*;
	public class ConnectionTest {

	public Connection getConnection()

	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306:/quiz","root","root");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}

	}


