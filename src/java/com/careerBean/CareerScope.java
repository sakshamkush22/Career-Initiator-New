package com.careerBean;

public class CareerScope {
	int sId;
	String sName;
	String sImage;
	String sPriority;
	String sStatus;
	int cId;
	public CareerScope() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CareerScope(int sId, String sName, String sImage, String sPriority, String sStatus, int cId) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sImage = sImage;
		this.sPriority = sPriority;
		this.sStatus = sStatus;
		this.cId = cId;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsImage() {
		return sImage;
	}
	public void setsImage(String sImage) {
		this.sImage = sImage;
	}
	public String getsPriority() {
		return sPriority;
	}
	public void setsPriority(String sPriority) {
		this.sPriority = sPriority;
	}
	public String getsStatus() {
		return sStatus;
	}
	public void setsStatus(String sStatus) {
		this.sStatus = sStatus;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	@Override
	public String toString() {
		return "CareerScope [sId=" + sId + ", sName=" + sName + ", sImage=" + sImage + ", sPriority=" + sPriority
				+ ", sStatus=" + sStatus + ", cId=" + cId + "]";
	}
	

}
