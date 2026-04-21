package com.careerBean;

import java.sql.Date;

public class AddCarreer {
	int cId;
	String cName;
	String cImage;
	String cPriority;
	String cStatus;
	public AddCarreer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AddCarreer(int cId, String cName, String cImage, String cPriority, String cStatus) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cImage = cImage;
		this.cPriority = cPriority;
		this.cStatus = cStatus;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcImage() {
		return cImage;
	}
	public void setcImage(String cImage) {
		this.cImage = cImage;
	}
	public String getcPriority() {
		return cPriority;
	}
	public void setcPriority(String cPriority) {
		this.cPriority = cPriority;
	}
	public String getcStatus() {
		return cStatus;
	}
	public void setcStatus(String cStatus) {
		this.cStatus = cStatus;
	}
	
}
