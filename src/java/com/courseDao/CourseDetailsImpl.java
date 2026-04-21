
package com.courseDao;

import com.connectionDataBase.MyConnection;
import com.courseBean.CourseDetails;
import com.sqlConstant.SQLConstant;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CourseDetailsImpl implements CourseDetailsInterface  {
    
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private CourseDetails bean;
    private ArrayList<CourseDetails> al;

    @Override
    public int addCourseDetails(CourseDetails cd) throws SQLException {
        //COURSE_OVERVIEW, SYLLABUS_AND_SUBJECTS, JOB, SCOPE, SALARY, ADMISSION, PLACEMENTS, TITLE
            con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.ADD_COURSE_DETAILS);
            ps.setString(1, cd.getCOURSE_OVERVIEW());
            ps.setString(2, cd.getSYLLABUS_AND_SUBJECTS());
            ps.setString(3, cd.getJOB());
            ps.setString(4, cd.getSCOPE());
            ps.setString(5, cd.getSALARY());
            ps.setString(6, cd.getADMISSION());
            ps.setString(7, cd.getPLACEMENTS());
            ps.setString(8, cd.getTITLE());
            ps.setInt(9, cd.getCOURSE_ID());
            
            int result = ps.executeUpdate();
            ps.close();
            con.close();
           return result;
        
    }

    @Override
    public int updateCourseDetails(CourseDetails cd) throws SQLException {
            con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.UPDATE_COURSE_DETAILS);
            ps.setString(1, cd.getCOURSE_OVERVIEW());
            ps.setString(2, cd.getSYLLABUS_AND_SUBJECTS());
            ps.setString(3, cd.getJOB());
            ps.setString(4, cd.getSCOPE());
            ps.setString(5, cd.getSALARY());
            ps.setString(6, cd.getADMISSION());
            ps.setString(7, cd.getPLACEMENTS());
            ps.setString(8, cd.getTITLE());
            ps.setInt(9, cd.getCOURSE_ID());
            ps.setInt(10, cd.getCOURSE_DETAILS_ID());
            
            int result = ps.executeUpdate();
            ps.close();
            con.close();
           return result;    }

    @Override
    public int deleteCourseDetails(int cdId) throws SQLException {
            con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.DELETE_COURSE_DETAILS);
            ps.setInt(1, cdId);
            int result= ps.executeUpdate();

            ps.close();
            con.close();
            return result;    }

    @Override
    public CourseDetails getCourseDetailsById(int cdId) throws SQLException {
        //COURSE_OVERVIEW, SYLLABUS_AND_SUBJECTS, JOB, SCOPE, SALARY, ADMISSION, PLACEMENTS, TITLE
            con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.GET_COURSE_DETAILS_BYID);

            ps.setInt(1, cdId);
            rs = ps.executeQuery();

            if(rs.next()) {
                bean = new CourseDetails();
                bean.setCOURSE_DETAILS_ID(rs.getInt("COURSE_DETAILS_ID"));
                bean.setCOURSE_OVERVIEW(rs.getString("COURSE_OVERVIEW"));
                bean.setSYLLABUS_AND_SUBJECTS(rs.getString("SYLLABUS_AND_SUBJECTS"));
                bean.setJOB(rs.getString("JOB"));
                bean.setSCOPE(rs.getString("SCOPE"));
                bean.setSALARY(rs.getString("SALARY"));
                bean.setADMISSION(rs.getString("ADMISSION"));
                bean.setPLACEMENTS(rs.getString("PLACEMENTS"));
                bean.setTITLE(rs.getString("TITLE"));
                bean.setCOURSE_ID(rs.getInt("COURSE_ID"));
            }
              ps.close();
             con.close();
              return bean;
        
    }

    @Override
    public ArrayList<CourseDetails> getAllCourseDetails() throws SQLException {
          con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.GET_ALL_COURSE_DETAILS);
            rs = ps.executeQuery();
            al = new ArrayList<CourseDetails>();
            while(rs.next()) {
                bean = new CourseDetails();
                bean.setCOURSE_DETAILS_ID(rs.getInt("COURSE_DETAILS_ID"));
                bean.setCOURSE_OVERVIEW(rs.getString("COURSE_OVERVIEW"));
                bean.setSYLLABUS_AND_SUBJECTS(rs.getString("SYLLABUS_AND_SUBJECTS"));
                bean.setJOB(rs.getString("JOB"));
                bean.setSCOPE(rs.getString("SCOPE"));
                bean.setSALARY(rs.getString("SALARY"));
                bean.setADMISSION(rs.getString("ADMISSION"));
                bean.setPLACEMENTS(rs.getString("PLACEMENTS"));
                bean.setTITLE(rs.getString("TITLE"));
                bean.setCOURSE_ID(rs.getInt("COURSE_ID"));
                al.add(bean);
            }

            ps.close();
            con.close();   
        return al;    }
    
}
