
package com.examBean;

public class Exam {
    private int EXAM_ID, PRIORITY, STATUS;
    private String EXAM_NAME, EXAM_IMAGE, EXAM_FEILD, EXAM_DETAIL;

    public Exam() {
    }

    public Exam(int EXAM_ID, int PRIORITY, int STATUS, String EXAM_NAME, String EXAM_IMAGE, String EXAM_FEILD, String EXAM_DETAIL) {
        this.EXAM_ID = EXAM_ID;
        this.PRIORITY = PRIORITY;
        this.STATUS = STATUS;
        this.EXAM_NAME = EXAM_NAME;
        this.EXAM_IMAGE = EXAM_IMAGE;
        this.EXAM_FEILD = EXAM_FEILD;
        this.EXAM_DETAIL = EXAM_DETAIL;
    }

    public int getEXAM_ID() {
        return EXAM_ID;
    }

    public void setEXAM_ID(int EXAM_ID) {
        this.EXAM_ID = EXAM_ID;
    }

    public int getPRIORITY() {
        return PRIORITY;
    }

    public void setPRIORITY(int PRIORITY) {
        this.PRIORITY = PRIORITY;
    }

    public int getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(int STATUS) {
        this.STATUS = STATUS;
    }

    public String getEXAM_NAME() {
        return EXAM_NAME;
    }

    public void setEXAM_NAME(String EXAM_NAME) {
        this.EXAM_NAME = EXAM_NAME;
    }

    public String getEXAM_IMAGE() {
        return EXAM_IMAGE;
    }

    public void setEXAM_IMAGE(String EXAM_IMAGE) {
        this.EXAM_IMAGE = EXAM_IMAGE;
    }

    public String getEXAM_FEILD() {
        return EXAM_FEILD;
    }

    public void setEXAM_FEILD(String EXAM_FEILD) {
        this.EXAM_FEILD = EXAM_FEILD;
    }

    public String getEXAM_DETAIL() {
        return EXAM_DETAIL;
    }

    public void setEXAM_DETAIL(String EXAM_DETAIL) {
        this.EXAM_DETAIL = EXAM_DETAIL;
    }

    @Override
    public String toString() {
        return "Exam{" + "EXAM_ID=" + EXAM_ID + ", PRIORITY=" + PRIORITY + ", STATUS=" + STATUS + ", EXAM_NAME=" + EXAM_NAME + ", EXAM_IMAGE=" + EXAM_IMAGE + ", EXAM_FEILD=" + EXAM_FEILD + ", EXAM_DETAIL=" + EXAM_DETAIL + '}';
    }

    
  
    
    
}
