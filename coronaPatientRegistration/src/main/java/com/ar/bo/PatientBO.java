package com.ar.bo;

public class PatientBO {
	
	    private String patientName;
	    private String patientAddrs;
	    private  float mobileNo;
	    private  float noofhospitalizedday;
	    private float billperday;
	    private float  totalbillamount;
	    private float discount;
	    private  float netbillAmount;
	    
	    
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
		public float getTotalbillamount() {
			return totalbillamount;
		}
		public void setTotalbillamount(float totalbillamount) {
			this.totalbillamount = totalbillamount;
		}
		public float getDiscount() {
			return discount;
		}
		public void setDiscount(float discount) {
			this.discount = discount;
		}
		public float getNetbillAmount() {
			return netbillAmount;
		}
		public void setNetbillAmount(float netbillAmount) {
			this.netbillAmount = netbillAmount;
		}
		@Override
		public String toString() {
			return "PatientBO [patientName=" + patientName + ", patientAddrs=" + patientAddrs + ", mobileNo=" + mobileNo
					+ ", noofhospitalizedday=" + noofhospitalizedday + ", billperday=" + billperday
					+ ", totalbillamount=" + totalbillamount + ", discount=" + discount + ", netbillAmount="
					+ netbillAmount + "]";
		}
	  //", toString()=" + super.toString() +

}
