package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empDAO1")
//@Primary
public class EmployeeDAOImpl1 implements EmployeeDAO {
	private static final String GET_EMP_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	
	@Autowired
	private JdbcTemplate jt;

	public EmployeeBO getEmployeeByNo(int no) {
		EmployeeBO bo=null;
	   bo=jt.queryForObject(GET_EMP_BY_NO,
			                           new RowMapper<EmployeeBO>() {
		                                    public EmployeeBO mapRow(ResultSet rs, int rowNum) throws SQLException {
		                                    	System.out.println(
														"EmployeeDAOImpl1.getEmployeeByNo(...).new RowMapper() {...}.mapRow(..)");
		                                        EmployeeBO bo=null;
		                                    	//copy ResultSet obj record to BO class object
		                                        bo=new  EmployeeBO();
		                                        bo.setEmpno(rs.getInt(1));
		                                        bo.setEname(rs.getString(2));
		                                        bo.setJob(rs.getString(3));
		                                        bo.setSal(rs.getInt(4));
		                                        return bo;
	                                       }},
			                           no);
		return bo;
	}
	

}//outer class
