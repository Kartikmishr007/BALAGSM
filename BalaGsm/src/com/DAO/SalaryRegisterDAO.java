package com.DAO;

import java.sql.*;

import com.bean.SalaryRegisterBean;
import com.util.*;

public class SalaryRegisterDAO {
	public boolean getSalaryRegister(SalaryRegisterBean f) {
		try {
			Connection con =DbUtil.getConnection();
			PreparedStatement pt=con.prepareStatement("insert into slip1 values(?,?,?,?,?,?,?,?,?,?,?,?)");
			pt.setString(1, f.getEmployeename());
			pt.setString(2,f.getDesignation() );
			pt.setDouble(3,f.getMonth());
			pt.setDouble(4,f.getYear() );
			pt.setDouble(5,f.getBasicda() );
			pt.setDouble(6,f.getHra());
			pt.setDouble(7,f.getConveyance() );
			pt.setDouble(8,f.getProvidentfund() );
			pt.setDouble(9,f.getEsi() );
			pt.setDouble(10,f.getLoan() );
			pt.setDouble(11,f.getProfessiontax());
			pt.setDouble(12,f.getTsdit());
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
		

			
		}catch(Exception g) {
			g.printStackTrace();
			return false;
		}
		
	}

}
