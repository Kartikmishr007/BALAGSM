package com.DAO;

import java.sql.*;

import com.bean.RegisterBean;
import com.util.DbUtil;

public class RegisterDAO {
	public boolean getRegister(RegisterBean e)throws Exception {
		// TODO Auto-generated method stub
		//Employee e=new Employee();
		try{
			Connection con = DbUtil.getConnection();
			System.out.println(e.getFullname());
			System.out.println(e.getEmail());
			System.out.println(e.getPassword());
			System.out.println(e.getConfirm_password());
			
			PreparedStatement pt=con.prepareStatement("insert into register values(?,?,?,?)");
			
			pt.setString(1,e.getFullname());
			pt.setString(2,e.getEmail());
            pt.setString(3,e.getPassword());
            pt.setString(4,e.getConfirm_password());
			int n=pt.executeUpdate();
			System.out.println(n);
			if(n>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception g)
		{
			g.printStackTrace();
			return false;
		}
		
	}

	

}
