package com.ar.dto;
import java.io.Serializable;
public class PatientDTO implements Serializable{
	
	private String patientName;
    private String patientAddrs;
    private  float mobileNo;
    private  float noofhospitalizedday;
    private float billperday;
    
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientAddrs() {
		return patientAddrs;
	}
	public void setPatientAddrs(String patientAddrs) {
		this.patientAddrs = patientAddrs;
	}
	public float getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(float f) {
		this.mobileNo = f;
	}
	public float getNoofhospitalizedday() {
		return noofhospitalizedday;
	}
	public void setNoofhospitalizedday(float f) {
		this.noofhospitalizedday = f;
	}
	public float getBillperday() {
		return billperday;
	}
	public void setBillperday(float f) {
		this.billperday = f;
	}
	@Override
	public String toString() {
		return "PatientDTO [patientName=" + patientName + ", patientAddrs=" + patientAddrs + ", mobileNo=" + mobileNo
				+ ", noofhospitalizedday=" + noofhospitalizedday + ", billperday=" + billperday +  "]";
	}
    
    
}
