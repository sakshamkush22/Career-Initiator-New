
package com.userRegistrationDao;

import com.userRegistrationBean.UserRegistrationBean;
import java.util.ArrayList;


public interface UserRegistration {
    public int addUser(UserRegistrationBean ur);
	public int updateUser(UserRegistrationBean us); 
      	public UserRegistrationBean viewUser(int urId); 
	public ArrayList<UserRegistrationBean> viewAllUser();
	public int deleteUser(int urId);
        public int forgetPassword(String email, String oldPass, String newPass);
}
