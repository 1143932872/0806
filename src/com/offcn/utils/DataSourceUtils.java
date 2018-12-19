package com.offcn.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class DataSourceUtils {
	
	 //获得连接池对象
	private static final   ComboPooledDataSource dataSource = new ComboPooledDataSource();
	
	//返回一个池子的对象
	public  static  DataSource getDataSource() {
		
		
		return  dataSource;
	}
	//连接对象
	public  static  Connection getConnection() {
		Connection  conn = null;
		try {
			conn = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  conn;
		
	}

}