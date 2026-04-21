
package com.userRegistrationDao;

import java.util.ArrayList;
import com.connectionDataBase.MyConnection;
import com.filterBean.CollegeByCity;
import com.sqlConstant.SQLConstant;
import com.userRegistrationBean.UserRegistrationBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserImplementation implements UserRegistration{
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private UserRegistrationBean bean;
    private ArrayList<UserRegistrationBean> al;
     int result=0;

    @Override
    public int addUser(UserRegistrationBean ur) 
    {
         try
         {
            con = MyConnection.getConnection();
            ps = con.prepareStatement(SqlConstrantsOfUserRegis.ADD_USER);
            ps.setString(1, ur.getUserName());
            ps.setString(2, ur.getEmail());
            ps.setString(3, ur.getWhatssapNo());
            ps.setString(4, ur.getPassword());
            ps.setString(5, ur.getAddress());
            ps.setString(6, ur.getStream());
            ps.setString(7, ur.getLevel());
            result= ps.executeUpdate();
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
    public int updateUser(UserRegistrationBean us) {
                try
         {
             con = MyConnection.getConnection();
            ps = con.prepareStatement(SqlConstrantsOfUserRegis.UPDATE_USER);
            ps.setString(1, us.getUserName());
            ps.setString(2, us.getEmail());
            ps.setString(3, us.getWhatssapNo());
            ps.setString(4, us.getPassword());
            ps.setString(5, us.getAddress());
            ps.setString(6, us.getStream());
            ps.setString(7, us.getLevel());
            ps.setInt(8, us.getUserId());
            result= ps.executeUpdate();
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
    public UserRegistrationBean viewUser(int urId) {
 try{
            con = MyConnection.getConnection();
            ps = con.prepareStatement(SqlConstrantsOfUserRegis.VIEW_USER_BY_ID);

            ps.setInt(1, urId);
            rs = ps.executeQuery();

            if(rs.next()) {
                bean = new UserRegistrationBean();
                bean.setUserId(rs.getInt("USER_ID"));
                bean.setEmail(rs.getString("EMAIL_ID"));
                bean.setPassword(rs.getString("PASSWORD"));
                bean.setUserName(rs.getString("USER_NAME"));
                bean.setWhatssapNo(rs.getString("WHATSAP_NUMBER"));
                bean.setAddress(rs.getString("ADDRESS"));
                bean.setStream(rs.getString("STREAM"));
                bean.setLevel(rs.getString("STD_LEVEL"));
            }
              ps.close();
             con.close();
             
        }catch(Exception e){e.printStackTrace();}  
              return bean;     }

    @Override
    public ArrayList<UserRegistrationBean> viewAllUser() {
        ArrayList<UserRegistrationBean> al = new ArrayList<UserRegistrationBean>();
                
			try
                        {
                            con= MyConnection.getConnection();
			ps = con.prepareStatement(SqlConstrantsOfUserRegis.VIEW_ALL_USERS);
			rs = ps.executeQuery();
			while(rs.next())
			{
			
			 UserRegistrationBean bean = new UserRegistrationBean();
			 
			 bean.setUserId(rs.getInt("USER_ID"));
			 bean.setUserName(rs.getString("USER_NAME"));
			 bean.setEmail(rs.getString("EMAIL_ID"));
			 bean.setWhatssapNo(rs.getString("WHATSAP_NUMBER"));
			 bean.setPassword(rs.getString("PASSWORD"));
			 bean.setAddress(rs.getString("ADDRESS"));
                         bean.setStream(rs.getString("STREAM"));
                         bean.setLevel(rs.getString("STD_LEVEL"));
                         
				al.add(bean);
			}
                        ps.close();
                        con.close();
                        }
                        catch(Exception e)
                        {
                            e.printStackTrace();
                        }
		
		return al; 
    }

    @Override
    public int deleteUser(int urId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int forgetPassword(String email, String oldPass, String newPass) {
        try
         {
             con = MyConnection.getConnection();
            ps = con.prepareStatement(SqlConstrantsOfUserRegis.FORGET_PASSWORD);
            ps.setString(1, newPass);
            ps.setString(2, oldPass);
            ps.setString(3, email);

            result= ps.executeUpdate();
            ps.close();
            con.close();
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
        
        
        
        return result;
        
    }


    
}
