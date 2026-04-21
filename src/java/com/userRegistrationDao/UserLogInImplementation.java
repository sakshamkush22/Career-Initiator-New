/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.userRegistrationDao;

import java.util.ArrayList;
import com.connectionDataBase.MyConnection;
import com.filterBean.CollegeByCity;
import com.sqlConstant.SQLConstant;
import com.userRegistrationBean.UserRegistrationBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class UserLogInImplementation implements UserLoginInterface{
private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private UserRegistrationBean bean;
    private ArrayList<UserRegistrationBean> al;
     int result=0;
    @Override
    public int loginValidate(String email, String password) {
         try
         {
            con = MyConnection.getConnection();
            ps = con.prepareStatement(SqlConstrantsOfUserLogin.VALIDATE);
            ps.setString(1, email);
            ps.setString(2, password);
           
            rs= ps.executeQuery();
            
            if(rs.next())
            {
                result=1;
            }
            else
            {
                result=0;
            }
            ps.close();
            con.close();
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
         return result;
        
    }

    @Override
    public UserRegistrationBean getDetails(String password, String email) {
        
        try{
            con = MyConnection.getConnection();
            ps = con.prepareStatement(SqlConstrantsOfUserLogin.GET_DETAILS);

            ps.setString(1, password);
            ps.setString(2, email);
            rs = ps.executeQuery();

            if(rs.next()) {
                bean = new UserRegistrationBean();
                bean.setUserId(rs.getInt("USER_ID"));
                bean.setEmail(rs.getString("EMAIL_ID"));
                bean.setPassword(rs.getString("PASSWORD"));
                bean.setUserName(rs.getString("USER_NAME"));
                bean.setWhatssapNo(rs.getString("WHATSAP_NUMBER"));
            }
              ps.close();
             con.close();
             
        }catch(Exception e){e.printStackTrace();}  
              return bean; 
    }

    @Override
    public UserRegistrationBean getAlldetails(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
