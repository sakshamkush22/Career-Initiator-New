package com.careerBean;

public class ScopeDetails {
	
	private int SCOPE_DETAIL_ID, CAREER_ID, SCOPE_ID, STATUS;
	private String TITLE, ABOUT, ELIGIBILITY, JOBROLE, SALARY, STUDYMATERIAL, PROS, CONS, FAQ;
	
	public ScopeDetails() {
		super();
	}

	public ScopeDetails(int sCOPE_DETAIL_ID, int cAREER_ID, int sCOPE_ID, int sTATUS, String tITLE, String aBOUT,
			String eLIGIBILITY, String jOBROLE, String sALARY, String sTUDYMATERIAL, String pROS, String cONS,
			String fAQ) {
		super();
		SCOPE_DETAIL_ID = sCOPE_DETAIL_ID;
		CAREER_ID = cAREER_ID;
		SCOPE_ID = sCOPE_ID;
		STATUS = sTATUS;
		TITLE = tITLE;
		ABOUT = aBOUT;
		ELIGIBILITY = eLIGIBILITY;
		JOBROLE = jOBROLE;
		SALARY = sALARY;
		STUDYMATERIAL = sTUDYMATERIAL;
		PROS = pROS;
		CONS = cONS;
		FAQ = fAQ;
	}

	public int getSCOPE_DETAIL_ID() {
		return SCOPE_DETAIL_ID;
	}

	public void setSCOPE_DETAIL_ID(int sCOPE_DETAIL_ID) {
		SCOPE_DETAIL_ID = sCOPE_DETAIL_ID;
	}

	public int getCAREER_ID() {
		return CAREER_ID;
	}

	public void setCAREER_ID(int cAREER_ID) {
		CAREER_ID = cAREER_ID;
	}

	public int getSCOPE_ID() {
		return SCOPE_ID;
	}

	public void setSCOPE_ID(int sCOPE_ID) {
		SCOPE_ID = sCOPE_ID;
	}

	public int getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(int sTATUS) {
		STATUS = sTATUS;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}

	public String getABOUT() {
		return ABOUT;
	}

	public void setABOUT(String aBOUT) {
		ABOUT = aBOUT;
	}

	public String getELIGIBILITY() {
		return ELIGIBILITY;
	}

	public void setELIGIBILITY(String eLIGIBILITY) {
		ELIGIBILITY = eLIGIBILITY;
	}

	public String getJOBROLE() {
		return JOBROLE;
	}

	public void setJOBROLE(String jOBROLE) {
		JOBROLE = jOBROLE;
	}

	public String getSALARY() {
		return SALARY;
	}

	public void setSALARY(String sALARY) {
		SALARY = sALARY;
	}

	public String getSTUDYMATERIAL() {
		return STUDYMATERIAL;
	}

	public void setSTUDYMATERIAL(String sTUDYMATERIAL) {
		STUDYMATERIAL = sTUDYMATERIAL;
	}

	public String getPROS() {
		return PROS;
	}

	public void setPROS(String pROS) {
		PROS = pROS;
	}

	public String getCONS() {
		return CONS;
	}

	public void setCONS(String cONS) {
		CONS = cONS;
	}

	public String getFAQ() {
		return FAQ;
	}

	public void setFAQ(String fAQ) {
		FAQ = fAQ;
	}

	@Override
	public String toString() {
		return "ScopeDetails [SCOPE_DETAIL_ID=" + SCOPE_DETAIL_ID + ", CAREER_ID=" + CAREER_ID + ", SCOPE_ID="
				+ SCOPE_ID + ", STATUS=" + STATUS + ", TITLE=" + TITLE + ", ABOUT=" + ABOUT + ", ELIGIBILITY="
				+ ELIGIBILITY + ", JOBROLE=" + JOBROLE + ", SALARY=" + SALARY + ", STUDYMATERIAL=" + STUDYMATERIAL
				+ ", PROS=" + PROS + ", CONS=" + CONS + ", FAQ=" + FAQ + "]";
	}
	
	
	
	

}
