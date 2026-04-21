package com.carreerDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.connectionDataBase.MyConnection;
import com.careerBean.AddCarreer;
import com.careerBean.CareerScope;
import com.sqlConstant.SQLConstant;
import java.sql.SQLException;

public class CarrereScopeImplementation implements CareerScopeInterface{
	
	Connection con=null;
	PreparedStatement pstmt=null;
	int result=0;
	ResultSet rs=null;
	CareerScope bean=null;

	@Override
	public int addCarreerScope(CareerScope cs) throws SQLException{
		
			con= MyConnection.getConnection();
			pstmt = con.prepareStatement(SQLConstant.ADD_CARREER_SCOPE);
			pstmt.setInt(1, cs.getcId());
			pstmt.setString(2, cs.getsName());
			pstmt.setString(3, cs.getsImage());
			pstmt.setString(4, cs.getsPriority());
			pstmt.setString(5, cs.getsStatus());
			result = pstmt.executeUpdate();
                        pstmt.close();
                        con.close();

		return result;
	}

	@Override
	public int updateCarreerScope(CareerScope cs) throws SQLException{
		
			con= MyConnection.getConnection();
			pstmt = con.prepareStatement(SQLConstant.UPDATE_CARREER_SCOPE);
			pstmt.setString(1, cs.getsName());
			pstmt.setString(2, cs.getsImage());
			pstmt.setString(3, cs.getsPriority());
			pstmt.setString(4, cs.getsStatus());
			pstmt.setInt(5, cs.getsId());
			result = pstmt.executeUpdate();
                        pstmt.close();
                        con.close();

		return result;
	}

	@Override
	public CareerScope viewScopeByID(int sId) throws SQLException{
		
			con= MyConnection.getConnection();
			pstmt = con.prepareStatement(SQLConstant.VIEW_BY_ID_SCOPE);
			pstmt.setInt(1, sId);
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				bean = new CareerScope();
				bean.setsId(rs.getInt("S_ID"));
				bean.setcId(rs.getInt("C_ID"));
				bean.setsName(rs.getString("S_NAME"));;
				bean.setsImage(rs.getString("S_IMAGE"));;
				bean.setsPriority(rs.getString("S_PRIORITY"));
				bean.setsStatus(rs.getString("S_STATUS"));
			}
                        pstmt.close();
                        con.close();
		return bean;
	}

	@Override
	public ArrayList<CareerScope> viewAllScope() throws SQLException{
		ArrayList<CareerScope> al = new ArrayList<CareerScope>();

			con= MyConnection.getConnection();
			pstmt = con.prepareStatement(SQLConstant.VIEW_ALL_SCOPE);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				bean = new CareerScope();
				bean.setsId(rs.getInt("S_ID"));
				bean.setcId(rs.getInt("C_ID"));
				bean.setsName(rs.getString("S_NAME"));;
				bean.setsImage(rs.getString("S_IMAGE"));;
				bean.setsPriority(rs.getString("S_PRIORITY"));
				bean.setsStatus(rs.getString("S_STATUS"));
				al.add(bean);
			}
                        pstmt.close();
                         con.close();

		return al;
	}
	

	@Override
	public int deleteCareerScope(int sID) throws SQLException{
		
			con= MyConnection.getConnection();
			pstmt = con.prepareStatement(SQLConstant.DELETE_CAREER_SCOPE);
			pstmt.setInt(1,sID);
			result = pstmt.executeUpdate();
                        con.close();
                        pstmt.close();
		        return result;
	}

	@Override
	public ArrayList<CareerScope> viewAllScopeByCID(int cID) throws SQLException{
		ArrayList<CareerScope> al = new ArrayList<CareerScope>();

			con= MyConnection.getConnection();
			pstmt = con.prepareStatement(SQLConstant.VIEW_ALL_SCOPE_BY_CID);
			pstmt.setInt(1, cID);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				
				bean = new CareerScope();
				bean.setsId(rs.getInt("S_ID"));
				bean.setcId(rs.getInt("C_ID"));
				bean.setsName(rs.getString("S_NAME"));;
				bean.setsImage(rs.getString("S_IMAGE"));;
				bean.setsPriority(rs.getString("S_PRIORITY"));
				bean.setsStatus(rs.getString("S_STATUS"));
				al.add(bean);
			}
                                pstmt.close();
                                con.close();

		return al;
	}

}
