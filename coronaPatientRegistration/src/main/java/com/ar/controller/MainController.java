package com.ar.controller;

import com.ar.dto.PatientDTO;
import com.ar.service.IPatientMgmtService;
import com.ar.vo.PatientVO;


public class MainController {

private IPatientMgmtService service;
	
	public MainController(IPatientMgmtService service) {
		System.out.println("MainController: 1-param constructor");
		  this.service=service;
	}
	
	public  String  processCustomer(PatientVO vo)throws Exception {
		//convert  VO class obj data to DTO class object data
		PatientDTO dto=new PatientDTO();
		dto.setPatientName(vo.getPatientName());
		dto.setPatientAddrs(vo.getPatientAddrs());
		dto.setMobileNo(Float.parseFloat(vo.getMobileNo()));
		dto.setNoofhospitalizedday(Float.parseFloat(vo.getNoofhospitalizedday()));
		dto.setBillperday(Float.parseFloat(vo.getBillperday()));
	
		//use service
		String result=service.calculatebilling(dto);
		return result;
	}
}
