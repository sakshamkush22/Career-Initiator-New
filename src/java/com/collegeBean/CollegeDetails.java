
package com.collegeBean;

public class CollegeDetails {
    private int COLLEGE_DETAILS_ID, COLLEGE_ID;
    private String OVERVIEW, COURSE, JOB_READY_DEGREE, ADMISSION, PLACEMENTS, CUT_OFFS, GALLERY, AVRAGE_PACKAGE, FEES, REVIEWS, SCHOLARSHIP, NEWS, HOSTEL;

    public CollegeDetails() {
    }

    public CollegeDetails(int COLLEGE_DETAILS_ID, int COLLEGE_ID, String OVERVIEW, String COURSE, String JOB_READY_DEGREE, String ADMISSION, String PLACEMENTS, String CUT_OFFS, String GALLERY, String AVRAGE_PACKAGE, String FEES, String REVIEWS, String SCHOLARSHIP, String NEWS, String HOSTEL) {
        this.COLLEGE_DETAILS_ID = COLLEGE_DETAILS_ID;
        this.COLLEGE_ID = COLLEGE_ID;
        this.OVERVIEW = OVERVIEW;
        this.COURSE = COURSE;
        this.JOB_READY_DEGREE = JOB_READY_DEGREE;
        this.ADMISSION = ADMISSION;
        this.PLACEMENTS = PLACEMENTS;
        this.CUT_OFFS = CUT_OFFS;
        this.GALLERY = GALLERY;
        this.AVRAGE_PACKAGE = AVRAGE_PACKAGE;
        this.FEES = FEES;
        this.REVIEWS = REVIEWS;
        this.SCHOLARSHIP = SCHOLARSHIP;
        this.NEWS = NEWS;
        this.HOSTEL = HOSTEL;
    }

    public int getCOLLEGE_DETAILS_ID() {
        return COLLEGE_DETAILS_ID;
    }

    public void setCOLLEGE_DETAILS_ID(int COLLEGE_DETAILS_ID) {
        this.COLLEGE_DETAILS_ID = COLLEGE_DETAILS_ID;
    }

    public int getCOLLEGE_ID() {
        return COLLEGE_ID;
    }

    public void setCOLLEGE_ID(int COLLEGE_ID) {
        this.COLLEGE_ID = COLLEGE_ID;
    }

    public String getOVERVIEW() {
        return OVERVIEW;
    }

    public void setOVERVIEW(String OVERVIEW) {
        this.OVERVIEW = OVERVIEW;
    }

    public String getCOURSE() {
        return COURSE;
    }

    public void setCOURSE(String COURSE) {
        this.COURSE = COURSE;
    }

    public String getJOB_READY_DEGREE() {
        return JOB_READY_DEGREE;
    }

    public void setJOB_READY_DEGREE(String JOB_READY_DEGREE) {
        this.JOB_READY_DEGREE = JOB_READY_DEGREE;
    }

    public String getADMISSION() {
        return ADMISSION;
    }

    public void setADMISSION(String ADMISSION) {
        this.ADMISSION = ADMISSION;
    }

    public String getPLACEMENTS() {
        return PLACEMENTS;
    }

    public void setPLACEMENTS(String PLACEMENTS) {
        this.PLACEMENTS = PLACEMENTS;
    }

    public String getCUT_OFFS() {
        return CUT_OFFS;
    }

    public void setCUT_OFFS(String CUT_OFFS) {
        this.CUT_OFFS = CUT_OFFS;
    }

    public String getGALLERY() {
        return GALLERY;
    }

    public void setGALLERY(String GALLERY) {
        this.GALLERY = GALLERY;
    }

    public String getAVRAGE_PACKAGE() {
        return AVRAGE_PACKAGE;
    }

    public void setAVRAGE_PACKAGE(String AVRAGE_PACKAGE) {
        this.AVRAGE_PACKAGE = AVRAGE_PACKAGE;
    }

    public String getFEES() {
        return FEES;
    }

    public void setFEES(String FEES) {
        this.FEES = FEES;
    }

    public String getREVIEWS() {
        return REVIEWS;
    }

    public void setREVIEWS(String REVIEWS) {
        this.REVIEWS = REVIEWS;
    }

    public String getSCHOLARSHIP() {
        return SCHOLARSHIP;
    }

    public void setSCHOLARSHIP(String SCHOLARSHIP) {
        this.SCHOLARSHIP = SCHOLARSHIP;
    }

    public String getNEWS() {
        return NEWS;
    }

    public void setNEWS(String NEWS) {
        this.NEWS = NEWS;
    }

    public String getHOSTEL() {
        return HOSTEL;
    }

    public void setHOSTEL(String HOSTEL) {
        this.HOSTEL = HOSTEL;
    }

    @Override
    public String toString() {
        return "CollegeDetails{" + "COLLEGE_DETAILS_ID=" + COLLEGE_DETAILS_ID + ", COLLEGE_ID=" + COLLEGE_ID + ", OVERVIEW=" + OVERVIEW + ", COURSE=" + COURSE + ", JOB_READY_DEGREE=" + JOB_READY_DEGREE + ", ADMISSION=" + ADMISSION + ", PLACEMENTS=" + PLACEMENTS + ", CUT_OFFS=" + CUT_OFFS + ", GALLERY=" + GALLERY + ", AVRAGE_PACKAGE=" + AVRAGE_PACKAGE + ", FEES=" + FEES + ", REVIEWS=" + REVIEWS + ", SCHOLARSHIP=" + SCHOLARSHIP + ", NEWS=" + NEWS + ", HOSTEL=" + HOSTEL + '}';
    }
    
    
    
}
