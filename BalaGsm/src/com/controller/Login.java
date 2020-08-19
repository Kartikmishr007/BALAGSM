package com.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.DAO.LoginDAO;
import com.services.Services;
import com.util.DbUtil;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	String b;
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String b = null;
		response.setContentType("text/jsp");
		String action = request.getParameter("action");
		
		if(action.equals("Login"))
		{
			String Email=request.getParameter("email");
			String kg= request.getParameter("pass");
			  try {
                  //load driver class  
              Class.forName("oracle.jdbc.driver.OracleDriver");
                  //create connection object  
              Connection cn = DriverManager.getConnection(
                      "jdbc:oracle:thin:@localhost:1521:xe", "system", "123456");
                  //create statement object  
              Statement st = cn.createStatement();
              PreparedStatement pt=cn.prepareStatement("select email from register where password=?");
  			pt.setString(1, kg);
  			ResultSet rs=pt.executeQuery();
  			
             while (rs.next()) {
           	  b=rs.getString(1);
               //System.out.println(rs.getString(1) + "  " + rs.getString(2)+"  " + rs.getString(3)+"  " + rs.getString(4));
            
             }
            // response.getWriter().print(kg);


				if(Email.equals(b)) {
				
					RequestDispatcher r=request.getRequestDispatcher("/Search.jsp");  
					r.include(request, response);
				}else {
					RequestDispatcher s=request.getRequestDispatcher("/EmpSearch.jsp");  
					s.include(request, response);
					
				}
				
             
//                
                  //execute query  
           
              cn.close();
              pt.close();
          } catch (Exception e) {
              
          }
	
		}
			
			
		
	
	}
}
