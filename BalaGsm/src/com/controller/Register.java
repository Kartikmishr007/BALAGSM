package com.controller;

import java.beans.Beans;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.AdminBean;
import com.bean.RegisterBean;
import com.services.Services;



public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/jsp");
		String action = request.getParameter("action");
		
		if(action.equals("signup"))
		{
			String fullname=request.getParameter("Full_name");
			String email= request.getParameter("email_id");
			String password=request.getParameter("password");
			String confirm_password=request.getParameter("Confirm_password");

		
			//String contact=Integer.parseInt(request.getParameter("Contact"));
			
			
			RegisterBean emp=new RegisterBean( fullname, email, password, confirm_password);
			
			
			//ArrayList<Employee> emp1=new ArrayList<Employee>();
			Services s = new Services();
			try {
				

				
				if(s.sGetRegisterBean(emp))
				{
					
					
					RequestDispatcher rd=request.getRequestDispatcher("/Home.jsp");  
					rd.include(request, response);
					
				}else {
					RequestDispatcher rd=request.getRequestDispatcher("/AllreadyRegister.jsp");  
				rd.include(request, response);
				}
		
					
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("H3");
			
		
			
			
			
		}

		
		

	
}



	

}
