
package com.courseBean;

public class CourseDetails {
    private int COURSE_DETAILS_ID, COURSE_ID;
    private String  COURSE_OVERVIEW, SYLLABUS_AND_SUBJECTS, JOB, SCOPE, SALARY, ADMISSION, PLACEMENTS, TITLE;

    public CourseDetails() {
    }

    public CourseDetails(int COURSE_DETAILS_ID, String COURSE_OVERVIEW, String SYLLABUS_AND_SUBJECTS, String JOB, String SCOPE, String SALARY, String ADMISSION, String PLACEMENTS, String TITLE) {
        this.COURSE_DETAILS_ID = COURSE_DETAILS_ID;
        this.COURSE_OVERVIEW = COURSE_OVERVIEW;
        this.SYLLABUS_AND_SUBJECTS = SYLLABUS_AND_SUBJECTS;
        this.JOB = JOB;
        this.SCOPE = SCOPE;
        this.SALARY = SALARY;
        this.ADMISSION = ADMISSION;
        this.PLACEMENTS = PLACEMENTS;
        this.TITLE = TITLE;
        this.COURSE_ID = COURSE_ID;
    }

    public int getCOURSE_DETAILS_ID() {
        return COURSE_DETAILS_ID;
    }

    public void setCOURSE_DETAILS_ID(int COURSE_DETAILS_ID) {
        this.COURSE_DETAILS_ID = COURSE_DETAILS_ID;
    }

    public String getCOURSE_OVERVIEW() {
        return COURSE_OVERVIEW;
    }

    public void setCOURSE_OVERVIEW(String COURSE_OVERVIEW) {
        this.COURSE_OVERVIEW = COURSE_OVERVIEW;
    }

    public String getSYLLABUS_AND_SUBJECTS() {
        return SYLLABUS_AND_SUBJECTS;
    }

    public void setSYLLABUS_AND_SUBJECTS(String SYLLABUS_AND_SUBJECTS) {
        this.SYLLABUS_AND_SUBJECTS = SYLLABUS_AND_SUBJECTS;
    }

    public String getJOB() {
        return JOB;
    }

    public void setJOB(String JOB) {
        this.JOB = JOB;
    }

    public String getSCOPE() {
        return SCOPE;
    }

    public void setSCOPE(String SCOPE) {
        this.SCOPE = SCOPE;
    }

    public String getSALARY() {
        return SALARY;
    }

    public void setSALARY(String SALARY) {
        this.SALARY = SALARY;
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

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }
       public int getCOURSE_ID() {
        return COURSE_ID;
    }

    public void setCOURSE_ID(int COURSE_ID) {
        this.COURSE_ID = COURSE_ID;
    }

    @Override
    public String toString() {
        return "CourseDetails{" + "COURSE_DETAILS_ID=" + COURSE_DETAILS_ID + ", COURSE_OVERVIEW=" + COURSE_OVERVIEW + ", SYLLABUS_AND_SUBJECTS=" + SYLLABUS_AND_SUBJECTS + ", JOB=" + JOB + ", SCOPE=" + SCOPE + ", SALARY=" + SALARY + ", ADMISSION=" + ADMISSION + ", PLACEMENTS=" + PLACEMENTS + ", TITLE=" + TITLE + ", COURSE_ID=" + COURSE_ID + '}';
    }

  
    
    
    
}
