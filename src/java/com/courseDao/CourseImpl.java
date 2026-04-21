
package com.courseDao;

import com.connectionDataBase.MyConnection;
import com.courseBean.Course;
import com.sqlConstant.SQLConstant;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CourseImpl implements CourseInterface {
    
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private Course bean;
    private ArrayList<Course> al;

    @Override
    public int addCourse(Course cs) throws SQLException {
        //COURSE_NAME, COURSE_IMAGE, AVRAGE_DURATION, AVRAGE_FEES, DETAIL
            con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.ADD_COURSE);
            ps.setString(1, cs.getCOURSE_NAME());
            ps.setString(2, cs.getCOURSE_IMAGE());
            ps.setString(3, cs.getAVRAGE_DURATION());
            ps.setString(4, cs.getAVRAGE_FEES());
            ps.setString(5, cs.getDETAIL());

            int result = ps.executeUpdate();
            ps.close();
            con.close();
           return result;  
    }

    @Override
    public int updateCourse(Course cs) throws SQLException {
            con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.UPDATE_COURSE);
            ps.setString(1, cs.getCOURSE_NAME());
            ps.setString(2, cs.getCOURSE_IMAGE());
            ps.setString(3, cs.getAVRAGE_DURATION());
            ps.setString(4, cs.getAVRAGE_FEES());
            ps.setString(5, cs.getDETAIL());
            ps.setInt(6, cs.getCOURSE_ID());

            int result = ps.executeUpdate();  
            ps.close();
            con.close();
            
           return result;      }

    @Override
    public int deleteCourse(int csId) throws SQLException {
            con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.DELETE_COURSE);
            ps.setInt(1, csId);
            int result= ps.executeUpdate();

            ps.close();
            con.close();
            return result;
    }

    @Override
    public Course getCourseById(int csId) throws SQLException {
           con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.GET_COURSE_BYID);

            ps.setInt(1, csId);
            rs = ps.executeQuery();

            if(rs.next()) {
                bean = new Course();
                bean.setCOURSE_ID(rs.getInt("COURSE_ID"));
                bean.setCOURSE_NAME(rs.getString("COURSE_NAME"));
                bean.setCOURSE_IMAGE(rs.getString("COURSE_IMAGE"));
                bean.setAVRAGE_DURATION(rs.getString("AVRAGE_DURATION"));
                bean.setAVRAGE_FEES(rs.getString("AVRAGE_FEES"));
                bean.setDETAIL(rs.getString("DETAIL"));
            }
              ps.close();
             con.close();
              return bean;    }

    @Override
    public ArrayList<Course> getAllCourse() throws SQLException {
          con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.GET_ALL_COURSE);
            rs = ps.executeQuery();
            al = new ArrayList<Course>();
            while(rs.next()) {
                bean = new Course();
                bean.setCOURSE_ID(rs.getInt("COURSE_ID"));
                bean.setCOURSE_NAME(rs.getString("COURSE_NAME"));
                bean.setCOURSE_IMAGE(rs.getString("COURSE_IMAGE"));
                bean.setAVRAGE_DURATION(rs.getString("AVRAGE_DURATION"));
                bean.setAVRAGE_FEES(rs.getString("AVRAGE_FEES"));
                bean.setDETAIL(rs.getString("DETAIL"));
                al.add(bean);
            }

            ps.close();
            con.close();   
        return al;
    }    

    @Override
    public ArrayList<Course> getAllTopCourse() throws SQLException {
        con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.GET_TOP_COURSE);
            rs = ps.executeQuery();
            al = new ArrayList<Course>();
            while(rs.next()) {
                bean = new Course();
                bean.setCOURSE_ID(rs.getInt("COURSE_ID"));
                bean.setCOURSE_NAME(rs.getString("COURSE_NAME"));
                bean.setCOURSE_IMAGE(rs.getString("COURSE_IMAGE"));
                bean.setAVRAGE_DURATION(rs.getString("AVRAGE_DURATION"));
                bean.setAVRAGE_FEES(rs.getString("AVRAGE_FEES"));
                bean.setDETAIL(rs.getString("DETAIL"));
                al.add(bean);
            }

            ps.close();
            con.close();   
        return al;    }
    
}
