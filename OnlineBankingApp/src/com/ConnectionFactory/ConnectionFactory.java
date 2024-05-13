package com.ConnectionFactory;

import java.sql.Connection;

import com.mysql.cj.jdbc.MysqlDataSource;

public class ConnectionFactory {
	
	public static Connection con;
	
	public static Connection getCon()
	{
		try
		{
			MysqlDataSource ds= new MysqlDataSource();
			ds.setUrl("com.mysql.cj.jdbc.Driver");
			ds.setUser("root");
			ds.setPassword("");
			
			con=ds.getConnection();
			System.out.println(con);
			
		}catch (Exception e) {
		System.out.println(e);
		}finally
		{
			return con;
		}
	}

}
