package com.ar.service;

import com.ar.dao.IPatientDAO;
import com.ar.dto.PatientDTO;
import com.ar.bo.PatientBO;

public final class PatientMgmtServiceImpl implements IPatientMgmtService {
	 private  IPatientDAO  dao;
	 public PatientMgmtServiceImpl(IPatientDAO dao) {
		 System.out.println("PatientMgmtServiceImpl.1-param constructor");
		 this.dao=dao;
	}
	@Override
	public String calculatebilling(PatientDTO dto) throws Exception {
		
		float discount= 0;
		float netbillAmount=0;
		float totalbillamount =(dto.getNoofhospitalizedday()*dto.getBillperday());
		
		if(totalbillamount>= 100000 && totalbillamount< 200000)
			discount = 10;
		else if (totalbillamount>= 200000.0f)
			discount = 20;
		
		netbillAmount= totalbillamount - (totalbillamount *(discount)/100);
		//create BO class obj having persistable data
		PatientBO bo=new PatientBO();
		bo.setPatientName(dto.getPatientName());
		bo.setPatientAddrs(dto.getPatientAddrs());
		bo.setMobileNo(dto.getMobileNo());
		bo.setNoofhospitalizedday(dto.getNoofhospitalizedday());
		bo.setBillperday(dto.getBillperday());
		bo.setTotalbillamount(totalbillamount);
		bo.setDiscount(discount);
		bo.setNetbillAmount(netbillAmount);
		//use DAO
		int count=dao.insert(bo);
		  // terinary operator   <condition>?<sucess>:<failure>
		return  count==1?"Patient registered sucessfully---> netbillAmount::"+netbillAmount:"Customer registration failed";   
	
	}

}
