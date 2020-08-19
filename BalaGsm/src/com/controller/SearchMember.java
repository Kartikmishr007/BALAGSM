package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SearchMember extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String b = null;
			response.setContentType("text/jsp");
			String action = request.getParameter("action");
			if(action.equals("Member")) {
				response.setContentType("text/html");
			PrintWriter out = response.getWriter();        

            String esi=request.getParameter("eid");                          

            try{

                   Class.forName("oracle.jdbc.driver.OracleDriver");

                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456");               

                   PreparedStatement ps=con.prepareStatement("select * from slip1 where esi=?");

                   ps.setString(1,esi);                   

                   out.print("<table width=25% border=1>");

                   out.print("<center><h1>CONGRATULATIONS YOUR DETAILS HERE:</h1></center>");

                   ResultSet rs=ps.executeQuery();                

                   /* Printing column names */

                   ResultSetMetaData rsmd=rs.getMetaData();

                   while(rs.next())

                      {
                	

                   out.print("<tr>");
                 

                   out.print("<td>"+rsmd.getColumnName(1)+"</td>");

                      out.print("<td>"+rs.getString(1)+"</td></tr>");

                      out.print("<tr><td>"+rsmd.getColumnName(2)+"</td>");

                      out.print("<td>"+rs.getString(2)+"</td></tr>");

                      out.print("<tr><td>"+rsmd.getColumnName(3)+"</td>");

                      out.print("<td>"+rs.getString(3)+"</td></tr>");

                      out.print("<tr><td>"+rsmd.getColumnName(5)+"</td>");

                      out.print("<td>"+rs.getString(5)+"</td></tr>");
                      
                      out.print("<tr><td>"+rsmd.getColumnName(6)+"</td>");

                      out.print("<td>"+rs.getString(6)+"</td></tr>");  
                      
                      out.print("<tr><td>"+rsmd.getColumnName(7)+"</td>");

                      out.print("<td>"+rs.getString(7)+"</td></tr>");  
                      
                      out.print("<tr><td>"+rsmd.getColumnName(8)+"</td>");

                      out.print("<td>"+rs.getString(8)+"</td></tr>"); 
                      
                      out.print("<tr><td>"+rsmd.getColumnName(9)+"</td>");

                      out.print("<td>"+rs.getString(9)+"</td></tr>");   
                      
                      out.print("<tr><td>"+rsmd.getColumnName(10)+"</td>");

                      out.print("<td>"+rs.getString(10)+"</td></tr>");   
                      
                      out.print("<tr><td>"+rsmd.getColumnName(11)+"</td>");

                      out.print("<td>"+rs.getString(11)+"</td></tr>");    
                      
                      out.print("<tr><td>"+rsmd.getColumnName(12)+"</td>");

                      out.print("<td>"+rs.getString(12)+"</td></tr>");    
                      
                     






                   }

                   out.print("</table>");
                   
                  


            }catch (Exception e2)

              {

                  e2.printStackTrace();

              }



            finally{out.close();

              }

     }
			
				}
}
	