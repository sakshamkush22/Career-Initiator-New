
package com.userRegistrationDao;

public class SqlConstrantsOfUserLogin {
    	public final static String VALIDATE="select * from TBL_USERREGISTRATION where EMAIL_ID=? AND PASSWORD=?";
        public final static String GET_DETAILS="select * from TBL_USERREGISTRATION where PASSWORD=? and EMAIL_ID=?";
        

    
}
