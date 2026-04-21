
package com.courseBean;

public class Course {
    private int COURSE_ID;
    private String COURSE_NAME, COURSE_IMAGE, AVRAGE_DURATION, AVRAGE_FEES, DETAIL;

    public Course() {
    }

    public Course(int COURSE_ID, String COURSE_NAME, String COURSE_IMAGE, String AVRAGE_DURATION, String AVRAGE_FEES, String DETAIL) {
        this.COURSE_ID = COURSE_ID;
        this.COURSE_NAME = COURSE_NAME;
        this.COURSE_IMAGE = COURSE_IMAGE;
        this.AVRAGE_DURATION = AVRAGE_DURATION;
        this.AVRAGE_FEES = AVRAGE_FEES;
        this.DETAIL = DETAIL;
    }

    public int getCOURSE_ID() {
        return COURSE_ID;
    }

    public void setCOURSE_ID(int COURSE_ID) {
        this.COURSE_ID = COURSE_ID;
    }

    public String getCOURSE_NAME() {
        return COURSE_NAME;
    }

    public void setCOURSE_NAME(String COURSE_NAME) {
        this.COURSE_NAME = COURSE_NAME;
    }

    public String getCOURSE_IMAGE() {
        return COURSE_IMAGE;
    }

    public void setCOURSE_IMAGE(String COURSE_IMAGE) {
        this.COURSE_IMAGE = COURSE_IMAGE;
    }

    public String getAVRAGE_DURATION() {
        return AVRAGE_DURATION;
    }

    public void setAVRAGE_DURATION(String AVRAGE_DURATION) {
        this.AVRAGE_DURATION = AVRAGE_DURATION;
    }

    public String getAVRAGE_FEES() {
        return AVRAGE_FEES;
    }

    public void setAVRAGE_FEES(String AVRAGE_FEES) {
        this.AVRAGE_FEES = AVRAGE_FEES;
    }

    public String getDETAIL() {
        return DETAIL;
    }

    public void setDETAIL(String DETAIL) {
        this.DETAIL = DETAIL;
    }

    @Override
    public String toString() {
        return "Course{" + "COURSE_ID=" + COURSE_ID + ", COURSE_NAME=" + COURSE_NAME + ", COURSE_IMAGE=" + COURSE_IMAGE + ", AVRAGE_DURATION=" + AVRAGE_DURATION + ", AVRAGE_FEES=" + AVRAGE_FEES + ", DETAIL=" + DETAIL + '}';
    }

    
    
}
