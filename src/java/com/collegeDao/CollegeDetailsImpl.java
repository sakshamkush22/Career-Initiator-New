
package com.collegeDao;

import com.collegeBean.CollegeDetails;
import com.connectionDataBase.MyConnection;
import com.sqlConstant.SQLConstant;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CollegeDetailsImpl implements CollegeDetailsInterface  {
        
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private CollegeDetails bean;
    private ArrayList<CollegeDetails> al;

    @Override
    public int addCollegeDetails(CollegeDetails clgdet) throws SQLException {
        //COLLEGE_ID, OVERVIEW, COURSE, JOB_READY_DEGREE, ADMISSION, PLACEMENTS,
        //CUT_OFFS, GALLERY, AVRAGE_PACKAGE, FEES, REVIEWS, SCHOLARSHIP, NEWS, HOSTEL
            con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.ADD_COLLEGE_DETAILS);
            
            ps.setInt(1, clgdet.getCOLLEGE_ID());
            ps.setString(2, clgdet.getOVERVIEW());
            ps.setString(3, clgdet.getCOURSE());
            ps.setString(4, clgdet.getJOB_READY_DEGREE());
            ps.setString(5, clgdet.getADMISSION());
            ps.setString(6, clgdet.getPLACEMENTS());
            ps.setString(7, clgdet.getCUT_OFFS());
            ps.setString(8, clgdet.getGALLERY());
            ps.setString(9, clgdet.getAVRAGE_PACKAGE());
            ps.setString(10, clgdet.getFEES());
            ps.setString(11, clgdet.getREVIEWS());
            ps.setString(12, clgdet.getSCHOLARSHIP());
            ps.setString(13, clgdet.getNEWS());
            ps.setString(14, clgdet.getHOSTEL());

            int result = ps.executeUpdate();
            ps.close();
            con.close();
           return result; 
    }

    @Override
    public int updateCollegeDetails(CollegeDetails clgdet) throws SQLException {
            con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.UPDATE_COLLEGE_DETAILS);
            
            ps.setInt(1, clgdet.getCOLLEGE_ID());
            ps.setString(2, clgdet.getOVERVIEW());
            ps.setString(3, clgdet.getCOURSE());
            ps.setString(4, clgdet.getJOB_READY_DEGREE());
            ps.setString(5, clgdet.getADMISSION());
            ps.setString(6, clgdet.getPLACEMENTS());
            ps.setString(7, clgdet.getCUT_OFFS());
            ps.setString(8, clgdet.getGALLERY());
            ps.setString(9, clgdet.getAVRAGE_PACKAGE());
            ps.setString(10, clgdet.getFEES());
            ps.setString(11, clgdet.getREVIEWS());
            ps.setString(12, clgdet.getSCHOLARSHIP());
            ps.setString(13, clgdet.getNEWS());
            ps.setString(14, clgdet.getHOSTEL());
            ps.setInt(14, clgdet.getCOLLEGE_DETAILS_ID());
            
            int result = ps.executeUpdate();
            ps.close();
            con.close();
           return result;    }

    @Override
    public CollegeDetails viewCollegeDetailsByID(int clgdetId) throws SQLException {
                //COLLEGE_ID, OVERVIEW, COURSE, JOB_READY_DEGREE, ADMISSION, PLACEMENTS,
        //CUT_OFFS, GALLERY, AVRAGE_PACKAGE, FEES, REVIEWS, SCHOLARSHIP, NEWS, HOSTEL
           con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.VIEW_COLLEGE_DETAILS_BY_ID);

            ps.setInt(1, clgdetId);
            rs = ps.executeQuery();

            if(rs.next()) {
                bean = new CollegeDetails();
                bean.setCOLLEGE_DETAILS_ID(rs.getInt("COLLEGE_DETAILS_ID"));
                bean.setCOLLEGE_ID(rs.getInt("COLLEGE_ID"));
                bean.setOVERVIEW(rs.getString("OVERVIEW"));
                bean.setCOURSE(rs.getString("COURSE"));
                bean.setJOB_READY_DEGREE(rs.getString("JOB_READY_DEGREE"));
                bean.setADMISSION(rs.getString("ADMISSION"));
                bean.setPLACEMENTS(rs.getString("PLACEMENTS"));
                bean.setCUT_OFFS(rs.getString("CUT_OFFS"));
                bean.setGALLERY(rs.getString("GALLERY"));
                bean.setAVRAGE_PACKAGE(rs.getString("AVRAGE_PACKAGE"));
                bean.setFEES(rs.getString("FEES"));
                bean.setREVIEWS(rs.getString("REVIEWS"));
                bean.setSCHOLARSHIP(rs.getString("SCHOLARSHIP"));
                bean.setNEWS(rs.getString("NEWS"));
                bean.setHOSTEL(rs.getString("HOSTEL"));
                
            }
              ps.close();
             con.close();
              return bean;    }

    @Override
    public ArrayList<CollegeDetails> viewAllCollegeDetails() throws SQLException {
          con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.VIEW_ALL_COLLEGE_DETAILS);
            rs = ps.executeQuery();
            al = new ArrayList<CollegeDetails>();
            while(rs.next()) {
                bean = new CollegeDetails();
                bean.setCOLLEGE_DETAILS_ID(rs.getInt("COLLEGE_DETAILS_ID"));
                bean.setCOLLEGE_ID(rs.getInt("COLLEGE_ID"));
                bean.setOVERVIEW(rs.getString("OVERVIEW"));
                bean.setCOURSE(rs.getString("COURSE"));
                bean.setJOB_READY_DEGREE(rs.getString("JOB_READY_DEGREE"));
                bean.setADMISSION(rs.getString("ADMISSION"));
                bean.setPLACEMENTS(rs.getString("PLACEMENTS"));
                bean.setCUT_OFFS(rs.getString("CUT_OFFS"));
                bean.setGALLERY(rs.getString("GALLERY"));
                bean.setAVRAGE_PACKAGE(rs.getString("AVRAGE_PACKAGE"));
                bean.setFEES(rs.getString("FEES"));
                bean.setREVIEWS(rs.getString("REVIEWS"));
                bean.setSCHOLARSHIP(rs.getString("SCHOLARSHIP"));
                bean.setNEWS(rs.getString("NEWS"));
                bean.setHOSTEL(rs.getString("HOSTEL"));
                al.add(bean);
            }

            ps.close();
            con.close();   
        return al;
    }

    @Override
    public int deleteCollegeDetails(int clgdetId) throws SQLException {
            con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.DELETE_COLLEGE_DETAILS);
            ps.setInt(1, clgdetId);
            int result= ps.executeUpdate();

            ps.close();
            con.close();
            return result;    }
    
}
