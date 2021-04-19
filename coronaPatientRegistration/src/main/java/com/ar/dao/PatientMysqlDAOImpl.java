package com.ar.dao;

import javax.sql.DataSource;

import com.ar.bo.PatientBO;

import java.sql.*;

public class PatientMysqlDAOImpl implements IPatientDAO {

	private  static final String  INSERT_QUERY="INSERT INTO coronapatient(patientName,patientAddrs,mobileNo,noofhospitalizedday," + "billperday,totalbillamount,discount,netbillAmount) VALUES(?,?,?,?,?,?,?,?)";
	private DataSource ds;

	
	 // alt+shift+s ,o 
	
	public PatientMysqlDAOImpl(DataSource ds) {
		System.out.println("Im in DAO IMPL 1 Param Constructor");
		this.ds = ds;
	}

	@Override
	public int insert(PatientBO bo) throws Exception {
			int count=0;
	//get Pooled jdbc con object and creatd PreparedStatement obj
	try(Connection con=ds.getConnection();
			PreparedStatement ps=con.prepareStatement(INSERT_QUERY)	){   //try with resource
		//set query param values
		ps.setString(1, bo.getPatientName());
		ps.setString(2, bo.getPatientAddrs());
		ps.setFloat(3,bo.getMobileNo());
		ps.setFloat(4,bo.getNoofhospitalizedday());
		ps.setFloat(5,bo.getBillperday());
		ps.setFloat(6,bo.getNetbillAmount());
		ps.setFloat(7,bo.getDiscount());
		ps.setFloat(8,bo.getNetbillAmount());
		//execute the Query
		count=ps.executeUpdate();
	}//try
	catch(SQLException se) {
		se.printStackTrace();
		throw se;  // Exception rethrowing
	}
	catch(Exception e) {
		e.printStackTrace();
		throw e;  //  Exception rethrowing
	}
	return count;
}
}
