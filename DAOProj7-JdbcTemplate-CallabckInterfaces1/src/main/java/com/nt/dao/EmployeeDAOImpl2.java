package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empDAO2")
//@Primary
public class EmployeeDAOImpl2 implements EmployeeDAO {
	private static final String GET_EMP_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	
	@Autowired
	private JdbcTemplate jt;

	public EmployeeBO getEmployeeByNo(int no) {
		EmployeeBO bo=null;
	   bo=jt.queryForObject(GET_EMP_BY_NO,
			                                    (rs,index)->{
			                                    	EmployeeBO bo1=null;
			                                    	bo1=new EmployeeBO();
			                                    	bo1.setEmpno(rs.getInt(1));
			                                    	bo1.setEname(rs.getString(2));
			                                    	bo1.setJob(rs.getString(3));
			                                    	bo1.setSal(rs.getInt(4));
			                                    	return bo1;
			                                    },
			                           no);
		return bo;
	}
	

}//outer class
