
package com.examDao;

import com.connectionDataBase.MyConnection;
import com.courseBean.Course;
import com.examBean.Exam;
import com.sqlConstant.SQLConstant;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ExamImpl implements ExamInterface {
    
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private Exam bean;
    private ArrayList<Exam> al;

    @Override
    public int addExam(Exam exm) throws SQLException {
        
        //EXAM_NAME, EXAM_IMAGE, EXAM_FEILD, PRIORITY, STATUS, EXAM_DETAIL
            con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.ADD_EXAM);
            ps.setString(1, exm.getEXAM_NAME());
            ps.setString(2, exm.getEXAM_IMAGE());
            ps.setString(3, exm.getEXAM_FEILD());
            ps.setInt(4, exm.getPRIORITY());
            ps.setInt(5, exm.getSTATUS());
            ps.setString(6, exm.getEXAM_DETAIL());
          

            int result = ps.executeUpdate();
            ps.close();
            con.close();
           return result;    }

    @Override
    public int updateExam(Exam exm) throws SQLException {
    con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.UPDATE_EXAM);
            ps.setString(1, exm.getEXAM_NAME());
            ps.setString(2, exm.getEXAM_IMAGE());
            ps.setString(3, exm.getEXAM_FEILD());
            ps.setInt(4, exm.getPRIORITY());
            ps.setInt(5, exm.getSTATUS());
            ps.setString(6, exm.getEXAM_DETAIL());
            ps.setInt(7, exm.getEXAM_ID());

          

            int result = ps.executeUpdate();
            ps.close();
            con.close();
           return result;    }

    @Override
    public int deleteExam(int exmId) throws SQLException {
            con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.DELETE_EXAM);
            ps.setInt(1, exmId);
            int result= ps.executeUpdate();

            ps.close();
            con.close();
            return result;    }

    @Override
    public Exam getExamById(int exmId) throws SQLException {
 con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.GET_EXAM_BYID);

            ps.setInt(1, exmId);
            rs = ps.executeQuery();

            if(rs.next()) {
                bean = new Exam();
                bean.setEXAM_ID(rs.getInt("EXAM_ID"));
                bean.setEXAM_NAME(rs.getString("EXAM_NAME"));
                bean.setEXAM_IMAGE(rs.getString("EXAM_IMAGE"));
                bean.setEXAM_FEILD(rs.getString("EXAM_FEILD"));
                bean.setPRIORITY(rs.getInt("PRIORITY"));
                bean.setSTATUS(rs.getInt("STATUS"));
                bean.setEXAM_DETAIL(rs.getString("EXAM_DETAIL"));

            }
              ps.close();
             con.close();
              return bean;    }

    @Override
    public ArrayList<Exam> getAllExam() throws SQLException {
          con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.GET_ALL_EXAM);
            rs = ps.executeQuery();
            al = new ArrayList<Exam>();
            while(rs.next()) {
                bean = new Exam();
                bean.setEXAM_ID(rs.getInt("EXAM_ID"));
                bean.setEXAM_NAME(rs.getString("EXAM_NAME"));
                bean.setEXAM_IMAGE(rs.getString("EXAM_IMAGE"));
                bean.setEXAM_FEILD(rs.getString("EXAM_FEILD"));
                bean.setPRIORITY(rs.getInt("PRIORITY"));
                bean.setSTATUS(rs.getInt("STATUS"));
                bean.setEXAM_DETAIL(rs.getString("EXAM_DETAIL"));
                al.add(bean);
            }

            ps.close();
            con.close();   
        return al;    }

    @Override
    public ArrayList<Exam> getAllTopExam() throws SQLException {
          con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.GET_TOP_EXAM);
            rs = ps.executeQuery();
            al = new ArrayList<Exam>();
            while(rs.next()) {
                bean = new Exam();
                bean.setEXAM_ID(rs.getInt("EXAM_ID"));
                bean.setEXAM_NAME(rs.getString("EXAM_NAME"));
                bean.setEXAM_IMAGE(rs.getString("EXAM_IMAGE"));
                bean.setEXAM_FEILD(rs.getString("EXAM_FEILD"));
                bean.setPRIORITY(rs.getInt("PRIORITY"));
                bean.setSTATUS(rs.getInt("STATUS"));
                bean.setEXAM_DETAIL(rs.getString("EXAM_DETAIL"));
                al.add(bean);
            }

            ps.close();
            con.close();   
        return al;    }
    
}
