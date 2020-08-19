package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.LoginBean;
import com.bean.RegisterBean;
import com.util.DbUtil;

public class LoginDAO {
	
	public boolean getRegister(LoginBean e) throws Exception {

	try {
		Connection con = DbUtil.getConnection();
		PreparedStatement pt=con.prepareStatement("select email from register where password='pass';");
		System.out.println(pt);


	}
	catch(Exception g) {
		
	}
	return false;

}}
