package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bean.SalaryRegisterBean;
import com.services.Services;

/**
 * Servlet implementation class Salaryregister
 */
public class Salaryregister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/jsp");
		String action = request.getParameter("action");
		if(action.equals("Salaryregister")) {
			String 	employename=request.getParameter("Employee_Name");
			String  designation=request.getParameter("Designation");
		    int  month=Integer.parseInt(request.getParameter("Month"));
			int  year=Integer.parseInt(request.getParameter("Year"));
			double  basicda=Double.parseDouble(request.getParameter("BasicDa"));
            double  Hra=Double.parseDouble(request.getParameter("hra"));
			double  conveynce=Double.parseDouble(request.getParameter("Conveyance"));
			double  providentfund=Double.parseDouble(request.getParameter("ProvidentFund"));
			double  esi=Double.parseDouble(request.getParameter("Esi"));
			double  Loan=Double.parseDouble(request.getParameter("Loan"));
			double  professiontax=Double.parseDouble(request.getParameter("ProfessionTax"));
			double  Tsdit=Double.parseDouble(request.getParameter("TsdIt"));
			
			SalaryRegisterBean a=new SalaryRegisterBean(employename,designation,month,year,basicda,Hra,conveynce,
					providentfund,esi,Loan,professiontax,Tsdit);
			
			Services s = new Services();
			double salary=(basicda+Hra+conveynce)-(providentfund+Loan+professiontax+Tsdit);
	
			
			
			
try {
				

				
				if(s.sGetSalaryRegisterBean(a))
				{
					
					HttpSession A=request.getSession();
					A.setAttribute("design", designation);
					A.setAttribute("Month", month);
					A.setAttribute("Year", year);
					A.setAttribute("Basicda", basicda);
					A.setAttribute("hra", Hra);
					A.setAttribute("conveync", conveynce);
					A.setAttribute("providentfund",  providentfund);
					A.setAttribute("Esi", esi);
					A.setAttribute("loan", Loan);
					A.setAttribute("profession", professiontax);
					A.setAttribute("tsdit",  Tsdit);
                    A.setAttribute("employname",employename);
			
					HttpSession sn=request.getSession();
					sn.setAttribute("sal",salary);
			    	RequestDispatcher ds = request.getRequestDispatcher("Salary.jsp");
					ds.forward(request, response);

			    	
					
					
				}else
					response.getWriter().print("soarry kartik");

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}








			

			

		}

	}
	

	

}
