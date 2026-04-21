package com.collegeDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import com.connectionDataBase.MyConnection;
import com.collegeBean.College;
import com.sqlConstant.SQLConstant;
import java.sql.SQLException;

public class CollegeImpl implements CollegeInterface {
	
	Connection con=null;
	PreparedStatement pstmt=null;
	int result=0;
	ResultSet rs=null;
	College bean=null;

	@Override
	public int addCollege(College clg) throws SQLException{
		
			con= MyConnection.getConnection();
			pstmt = con.prepareStatement(SQLConstant.ADD_COLLEGE);
			pstmt.setString(1, clg.getCOLLEGE_NAME());
			pstmt.setString(2, clg.getCOLLEGE_LOCATION());
			pstmt.setString(3, clg.getCOLLEGE_CATEGORY());
			pstmt.setString(4, clg.getCOLLEGE_DETAILS());
			pstmt.setDouble(5, clg.getCOLLEGE_RATING());
			pstmt.setString(6, clg.getCOLLEGE_PROGRAMS());
			pstmt.setInt(7, clg.getCOLLEGE_PRIORITY());
			pstmt.setInt(8, clg.getCOLLEGE_STATUS());
			pstmt.setString(9, clg.getCOLLEGE_IMAGE());
			

			result = pstmt.executeUpdate();
		
                pstmt.close();
                con.close();
		return result;
	
	}

	@Override
	public int updateCollege(College clg) throws SQLException{
		
			con= MyConnection.getConnection();
			pstmt = con.prepareStatement(SQLConstant.UPDATE_COLLEGE);
			pstmt.setString(1, clg.getCOLLEGE_NAME());
			pstmt.setString(2, clg.getCOLLEGE_LOCATION());
			pstmt.setString(3, clg.getCOLLEGE_CATEGORY());
			pstmt.setString(4, clg.getCOLLEGE_DETAILS());
			pstmt.setDouble(5, clg.getCOLLEGE_RATING());
			pstmt.setString(6, clg.getCOLLEGE_PROGRAMS());
			pstmt.setInt(7, clg.getCOLLEGE_PRIORITY());
			pstmt.setInt(8, clg.getCOLLEGE_STATUS());
			pstmt.setString(9, clg.getCOLLEGE_IMAGE());
			pstmt.setInt(10, clg.getCOLLEGE_ID());

			result = pstmt.executeUpdate();
		
                pstmt.close();
                con.close();
		return result;
	}

	@Override
	public College viewCollegeByID(int clgId) throws SQLException{
		
			con= MyConnection.getConnection();
			pstmt = con.prepareStatement(SQLConstant.VIEW_COLLEGE_BY_ID);
			pstmt.setInt(1, clgId);
			rs = pstmt.executeQuery();
			if(rs.next())
			{    
				 bean = new College();
				 bean.setCOLLEGE_ID(rs.getInt("COLLEGE_ID"));
				 bean.setCOLLEGE_NAME(rs.getString("COLLEGE_NAME"));
				 bean.setCOLLEGE_LOCATION(rs.getString("COLLEGE_LOCATION"));
				 bean.setCOLLEGE_CATEGORY(rs.getString("COLLEGE_CATEGORY"));
				 bean.setCOLLEGE_DETAILS(rs.getString("COLLEGE_DETAILS"));
				 bean.setCOLLEGE_RATING(rs.getDouble("COLLEGE_RATING"));
				 bean.setCOLLEGE_PROGRAMS(rs.getString("COLLEGE_PROGRAMS"));
				 bean.setCOLLEGE_PRIORITY(rs.getInt("COLLEGE_PRIORITY"));
				 bean.setCOLLEGE_STATUS(rs.getInt("COLLEGE_STATUS"));
				 bean.setCOLLEGE_IMAGE(rs.getString("COLLEGE_IMAGE"));
				 

			}
                        
                        pstmt.close();
                        con.close();
		
		return bean;
	}

	@Override
	public ArrayList<College> viewAllCollege() throws SQLException{
		ArrayList<College> al = new ArrayList<College>();
                
			con= MyConnection.getConnection();
			pstmt = con.prepareStatement(SQLConstant.VIEW_ALL_COLLEGE);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
			
			 College bean = new College();
			 
			 bean.setCOLLEGE_ID(rs.getInt("COLLEGE_ID"));
			 bean.setCOLLEGE_NAME(rs.getString("COLLEGE_NAME"));
			 bean.setCOLLEGE_LOCATION(rs.getString("COLLEGE_LOCATION"));
			 bean.setCOLLEGE_CATEGORY(rs.getString("COLLEGE_CATEGORY"));
			 bean.setCOLLEGE_DETAILS(rs.getString("COLLEGE_DETAILS"));
			 bean.setCOLLEGE_RATING(rs.getDouble("COLLEGE_RATING"));
			 bean.setCOLLEGE_PROGRAMS(rs.getString("COLLEGE_PROGRAMS"));
			 bean.setCOLLEGE_PRIORITY(rs.getInt("COLLEGE_PRIORITY"));
			 bean.setCOLLEGE_STATUS(rs.getInt("COLLEGE_STATUS"));
			 bean.setCOLLEGE_IMAGE(rs.getString("COLLEGE_IMAGE"));


				
				al.add(bean);
			}
                        pstmt.close();
                        con.close();
		
		return al;
	}

	@Override
	public int deleteCollege(int clgId) throws SQLException{
		
			con= MyConnection.getConnection();
			pstmt = con.prepareStatement(SQLConstant.DELETE_COLLEGE);
			pstmt.setInt(1,clgId);
			result = pstmt.executeUpdate();
		
                        pstmt.close();
                        con.close();
		        return result;
	}

    @Override
    public ArrayList<College> viewAllTopCollege() throws SQLException {
	ArrayList<College> al = new ArrayList<College>();
                
			con= MyConnection.getConnection();
			pstmt = con.prepareStatement(SQLConstant.VIEW_TOP_COLLEGE);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
			
			 College bean = new College();
			 
			 bean.setCOLLEGE_ID(rs.getInt("COLLEGE_ID"));
			 bean.setCOLLEGE_NAME(rs.getString("COLLEGE_NAME"));
			 bean.setCOLLEGE_LOCATION(rs.getString("COLLEGE_LOCATION"));
			 bean.setCOLLEGE_CATEGORY(rs.getString("COLLEGE_CATEGORY"));
			 bean.setCOLLEGE_DETAILS(rs.getString("COLLEGE_DETAILS"));
			 bean.setCOLLEGE_RATING(rs.getDouble("COLLEGE_RATING"));
			 bean.setCOLLEGE_PROGRAMS(rs.getString("COLLEGE_PROGRAMS"));
			 bean.setCOLLEGE_PRIORITY(rs.getInt("COLLEGE_PRIORITY"));
			 bean.setCOLLEGE_STATUS(rs.getInt("COLLEGE_STATUS"));
			 bean.setCOLLEGE_IMAGE(rs.getString("COLLEGE_IMAGE"));


				
				al.add(bean);
			}
                        pstmt.close();
                        con.close();
		
		return al;    }

}
