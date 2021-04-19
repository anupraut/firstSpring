package com.ar.vo;

public class PatientVO {

		    private String patientName;
		    private String patientAddrs;
		    private  String mobileNo;
		    private  String noofhospitalizedday;
		    private String billperday;
		    
		    //setter and getters (alt+shift+s ,r)
		
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

			public String getMobileNo() {
				return mobileNo;
			}

			public void setMobileNo(String mobileNo) {
				this.mobileNo = mobileNo;
			}

			public String getNoofhospitalizedday() {
				return noofhospitalizedday;
			}

			public void setNoofhospitalizedday(String noofhospitalizedday) {
				this.noofhospitalizedday = noofhospitalizedday;
			}

			public String getBillperday() {
				return billperday;
			}

			public void setBillperday(String billperday) {
				this.billperday = billperday;
			}

			@Override
			public String toString() {
				return "PatientVO [patientName=" + patientName + ", patientAddrs=" + patientAddrs + ", mobileNo="
						+ mobileNo + ", noofhospitalizedday=" + noofhospitalizedday + ", billperday=" + billperday
						+ "]";
			}
//, toString()=" + super.toString() + 
			/*    //toString (alt+shift+s ,s)
			@Override
			public String toString() {
				return "CustomerVO [custName=" + custName + ", custAddrs=" + custAddrs + ", pamt=" + pamt + ", rate=" + rate
						+ ", time=" + time + "]";
			}
*/


	}

