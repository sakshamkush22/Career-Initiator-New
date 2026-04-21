/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.userRegistrationDao;

import com.userRegistrationBean.UserRegistrationBean;

/**
 *
 * @author Mukul
 */
public interface UserLoginInterface {
    public int loginValidate(String email,String password);
    public UserRegistrationBean getDetails(String password,String email);
    public UserRegistrationBean getAlldetails(int id);
   
    
}
