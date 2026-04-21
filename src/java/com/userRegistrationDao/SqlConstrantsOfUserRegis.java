
package com.userRegistrationDao;

public class SqlConstrantsOfUserRegis {
    public final static String ADD_USER="insert into TBL_USERREGISTRATION(USER_NAME,EMAIL_ID,WHATSAP_NUMBER,PASSWORD,ADDRESS, STREAM, STD_LEVEL) values(?,?,?,?,?,?,?)";
	public final static String UPDATE_USER="update TBL_USERREGISTRATION set USER_NAME=?,EMAIL_ID=?,WHATSAP_NUMBER=?,PASSWORD=?,ADDRESS=?, STREAM=?, STD_LEVEL=?  where USER_ID=?";
	public final static String VIEW_USER_BY_ID="select * from TBL_USERREGISTRATION where USER_ID=?";
	public final static String VIEW_ALL_USERS="select * from TBL_USERREGISTRATION";
        public final static String DELETE_USER="delete from TBL_USERREGISTRATION where USER_ID=?";
        public final static String FORGET_PASSWORD="update TBL_USERREGISTRATION set PASSWORD=? where PASSWORD=? AND EMAIL_ID=? ";

    
}
