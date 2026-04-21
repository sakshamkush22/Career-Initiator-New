
package com.filterDao;

import com.connectionDataBase.MyConnection;
import com.filterBean.CollegeByCity;
import com.sqlConstant.SQLConstant;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CollegeByCityImpl implements CollegeByCityInterface {
    
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private CollegeByCity bean;
    private ArrayList<CollegeByCity> al;

    @Override
    public int addCollegeByCity(CollegeByCity clgCity) throws Exception {
           con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.ADD_CITY);
            ps.setString(1, clgCity.getCITY_NAME());
            ps.setInt(2, clgCity.getPRIORITY());
            ps.setInt(3, clgCity.getSTATUS());

            int result = ps.executeUpdate();
            ps.close();
            con.close();
           return result; 
    }

    @Override
    public int updateCollegeByCity(CollegeByCity clgCity) throws Exception {
           con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.UPDATE_CITY);
            ps.setString(1, clgCity.getCITY_NAME());
            ps.setInt(2, clgCity.getPRIORITY());
            ps.setInt(3, clgCity.getSTATUS());
            ps.setInt(4, clgCity.getCITY_ID());


            int result = ps.executeUpdate();
            ps.close();
            con.close();
           return result;     }

    @Override
    public int deleteCollegeByCity(int cityId) throws Exception {
            con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.DELETE_CITY);
            ps.setInt(1, cityId);
            int result= ps.executeUpdate();

            ps.close();
            con.close();
            return result;    }

    @Override
    public CollegeByCity getCollegeByCityById(int cityId) throws Exception {
           con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.GET_CITY_BYID);

            ps.setInt(1, cityId);
            rs = ps.executeQuery();

            if(rs.next()) {
                bean = new CollegeByCity();
                bean.setCITY_ID (rs.getInt("CITY_ID"));
                bean.setCITY_NAME(rs.getString("CITY_NAME"));
                bean.setPRIORITY(rs.getInt("PRIORITY"));
                bean.setSTATUS(rs.getInt("STATUS"));
              
            }
              ps.close();
             con.close();
              return bean;    }

    @Override
    public ArrayList<CollegeByCity> getAllCollegeByCity() throws Exception {
          con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.GET_ALL_CITY);
            rs = ps.executeQuery();
            al = new ArrayList<CollegeByCity>();
            while(rs.next()) {
                bean = new CollegeByCity();
                bean.setCITY_ID (rs.getInt("CITY_ID"));
                bean.setCITY_NAME(rs.getString("CITY_NAME"));
                bean.setPRIORITY(rs.getInt("PRIORITY"));
                bean.setSTATUS(rs.getInt("STATUS"));
                al.add(bean);
            }

            ps.close();
            con.close();   
        return al;    }
    
}
