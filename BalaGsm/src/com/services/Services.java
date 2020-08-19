package com.services;

import com.DAO.RegisterDAO;
import com.DAO.SalaryRegisterDAO;
import com.bean.RegisterBean;
import com.bean.SalaryRegisterBean;

public class Services {
	public boolean sGetRegisterBean(RegisterBean b) throws Exception{
		RegisterDAO lb=new RegisterDAO();
		boolean flag=lb.getRegister(b);
		return flag;
	}
	public boolean sGetSalaryRegisterBean(SalaryRegisterBean f) throws Exception{
		SalaryRegisterDAO lb=new SalaryRegisterDAO();
		boolean flag=lb.getSalaryRegister(f);
		return flag;
	}
	

}
