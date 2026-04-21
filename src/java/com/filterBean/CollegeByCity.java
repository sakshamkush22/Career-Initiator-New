
package com.filterBean;

public class CollegeByCity {
    private int CITY_ID, PRIORITY, STATUS;
    private String CITY_NAME;

    public CollegeByCity() {
    }

    public CollegeByCity(int CITY_ID, int PRIORITY, int STATUS, String CITY_NAME) {
        this.CITY_ID = CITY_ID;
        this.PRIORITY = PRIORITY;
        this.STATUS = STATUS;
        this.CITY_NAME = CITY_NAME;
    }

    @Override
    public String toString() {
        return "CollegeByCity{" + "CITY_ID=" + CITY_ID + ", PRIORITY=" + PRIORITY + ", STATUS=" + STATUS + ", CITY_NAME=" + CITY_NAME + '}';
    }

    public int getCITY_ID() {
        return CITY_ID;
    }

    public void setCITY_ID(int CITY_ID) {
        this.CITY_ID = CITY_ID;
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

    public String getCITY_NAME() {
        return CITY_NAME;
    }

    public void setCITY_NAME(String CITY_NAME) {
        this.CITY_NAME = CITY_NAME;
    }
    
    
    
    
}
