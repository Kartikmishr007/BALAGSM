package com.util;

import java.sql.*;



public class DbUtil {
	public static Connection getConnection(){
		Connection con = null;	
			try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection(  
						"jdbc:oracle:thin:@localhost:1521:xe","system","123456");
			
				return con;
			}catch(Exception e){
				return con;
			}
			
			
		}

}
