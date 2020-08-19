package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Admin
 */
public class Admin extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String un = request.getParameter("email");
        String pw = request.getParameter("pass");
        PrintWriter out=response.getWriter();

        if (un.equals("kartikmishr007@gmail.com") && pw.equals("123456")) {
        	response.sendRedirect("SalaryRgisteredDetail.jsp");
            return;
        } else {
        	
        	response.sendRedirect("error.jsp");
            return;
        }
    }
		
	}


