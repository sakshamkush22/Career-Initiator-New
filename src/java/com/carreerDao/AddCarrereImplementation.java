package com.carreerDao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.careerBean.AddCarreer;
import com.connectionDataBase.MyConnection;
import com.sqlConstant.SQLConstant;
import java.sql.Connection;
import java.sql.SQLException;

public class AddCarrereImplementation implements AddCarrerInterface{
    	Connection con=null;
	PreparedStatement pstmt=null;
	int result=0;
	ResultSet rs=null;
	AddCarreer bean=null;

	@Override
	public int addCarreer(AddCarreer ac) throws SQLException{

			con= MyConnection.getConnection();
			pstmt = con.prepareStatement(SQLConstant.ADD_CARREER);
			pstmt.setString(1, ac.getcName());
			pstmt.setString(2, ac.getcImage());
			pstmt.setString(3, ac.getcPriority());
			pstmt.setString(4, ac.getcStatus());
			result = pstmt.executeUpdate();
                        pstmt.close();
                        con.close();
		        return result;
                
	}

	@Override
	public int updateCarreer(AddCarreer ac) throws SQLException{
			con= MyConnection.getConnection();
			pstmt = con.prepareStatement(SQLConstant.UPDATE_CARREER);
			pstmt.setString(1, ac.getcName());
			pstmt.setString(2, ac.getcImage());
			pstmt.setString(3, ac.getcPriority());
			pstmt.setString(4, ac.getcStatus());
			pstmt.setInt(5, ac.getcId());
			result = pstmt.executeUpdate();
                        pstmt.close();
                        con.close();


		return result;
	}

	@Override
	public AddCarreer viewByID(int cId) throws SQLException{

		
			con= MyConnection.getConnection();
			pstmt = con.prepareStatement(SQLConstant.VIEW_BY_ID);
			pstmt.setInt(1, cId);
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				bean = new AddCarreer();
				bean.setcId(rs.getInt("c_Id"));
				bean.setcName(rs.getString("c_Name"));
				bean.setcImage(rs.getString("c_Image"));
				bean.setcPriority(rs.getString("c_priority"));
				bean.setcStatus(rs.getString("c_status"));
                                
			}
                            pstmt.close();
                            con.close();
		
		return bean;
	}

	@Override
	public ArrayList<AddCarreer> viewAll() throws SQLException{
            
		ArrayList<AddCarreer> al = new ArrayList<AddCarreer>();
			con= MyConnection.getConnection();
			pstmt = con.prepareStatement(SQLConstant.VIEW_ALL);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				bean = new AddCarreer();
				bean.setcId(rs.getInt("c_Id"));
				bean.setcName(rs.getString("c_Name"));
				bean.setcImage(rs.getString("c_Image"));
				bean.setcPriority(rs.getString("c_priority"));
				bean.setcStatus(rs.getString("c_status"));
				al.add(bean);
			}
                                pstmt.close();
                                con.close();
		                return al;
	}

	@Override
	public int deleteCareer(int cID) throws SQLException{
		
			con= MyConnection.getConnection();
			pstmt = con.prepareStatement(SQLConstant.DELETE_CAREER);
			pstmt.setInt(1,cID);
			result = pstmt.executeUpdate();
                        pstmt.close();
                        con.close();
		        return result;
	}

    @Override
    public ArrayList<AddCarreer> viewAllTops() throws SQLException {
		ArrayList<AddCarreer> al = new ArrayList<AddCarreer>();
			con= MyConnection.getConnection();
			pstmt = con.prepareStatement(SQLConstant.VIEW_TOP_CAREER);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				bean = new AddCarreer();
				bean.setcId(rs.getInt("c_Id"));
				bean.setcName(rs.getString("c_Name"));
				bean.setcImage(rs.getString("c_Image"));
				bean.setcPriority(rs.getString("c_priority"));
				bean.setcStatus(rs.getString("c_status"));
				al.add(bean);
			}
                                pstmt.close();
                                con.close();
		                return al;    }

}
