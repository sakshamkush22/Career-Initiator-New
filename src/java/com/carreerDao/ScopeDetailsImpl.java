package com.carreerDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.connectionDataBase.MyConnection;
import com.careerBean.ScopeDetails;
import com.sqlConstant.SQLConstant;
import java.sql.SQLException;

public class ScopeDetailsImpl implements ScopeDetailsInterface  {

	Connection con=null;
	PreparedStatement pstmt=null;
	int result=0;
	ResultSet rs=null;
	ScopeDetails bean=null;
	
	@Override
	public int addScopeDetails(ScopeDetails sd) throws SQLException{

			con= MyConnection.getConnection();
			pstmt = con.prepareStatement(SQLConstant.ADD_SCOPE_DETAILS);
			
			pstmt.setInt(1, sd.getCAREER_ID());
			pstmt.setInt(2, sd.getSCOPE_ID());
			pstmt.setString(3, sd.getTITLE());
			pstmt.setString(4, sd.getABOUT());
			pstmt.setString(5, sd.getELIGIBILITY());
			pstmt.setString(6, sd.getJOBROLE());
			pstmt.setString(7, sd.getSALARY());
			pstmt.setString(8, sd.getSTUDYMATERIAL());
			pstmt.setString(9, sd.getPROS());
			pstmt.setString(10, sd.getCONS());
			pstmt.setString(11, sd.getFAQ());
			pstmt.setInt(12, sd.getSTATUS());
                        
			result = pstmt.executeUpdate();
                        pstmt.close();
                        con.close();

		return result;
       
	}

	@Override
	public int updateScopeDetails(ScopeDetails sd) throws SQLException{
			con= MyConnection.getConnection();
			pstmt = con.prepareStatement(SQLConstant.UPDATE_SCOPE_DETAILS);
			
			pstmt.setInt(1, sd.getCAREER_ID());
			pstmt.setInt(2, sd.getSCOPE_ID());
			pstmt.setString(3, sd.getTITLE());
			pstmt.setString(4, sd.getABOUT());
			pstmt.setString(5, sd.getELIGIBILITY());
			pstmt.setString(6, sd.getJOBROLE());
			pstmt.setString(7, sd.getSALARY());
			pstmt.setString(8, sd.getSTUDYMATERIAL());
			pstmt.setString(9, sd.getPROS());
			pstmt.setString(10, sd.getCONS());
			pstmt.setString(11, sd.getFAQ());
			pstmt.setInt(12, sd.getSTATUS());
			pstmt.setInt(13, sd.getSCOPE_DETAIL_ID());

			result = pstmt.executeUpdate();
                        pstmt.close();
                        con.close();
	

		return result;
	}

	@Override
	public ScopeDetails viewScopeDetailsByID(int sdId) throws SQLException{

			con= MyConnection.getConnection();
			pstmt = con.prepareStatement(SQLConstant.VIEW_BY_ID_SCOPE_DETAILS);
			pstmt.setInt(1, sdId);
			rs = pstmt.executeQuery();
			if(rs.next())
			{
				bean = new ScopeDetails();
				
				bean.setSCOPE_DETAIL_ID(rs.getInt("SCOPE_DETAIL_ID"));
				bean.setCAREER_ID(rs.getInt("CAREER_ID"));
				bean.setSCOPE_ID(rs.getInt("SCOPE_ID"));
				bean.setTITLE(rs.getString("TITLE"));
				bean.setABOUT(rs.getString("ABOUT"));
				bean.setELIGIBILITY(rs.getString("ELIGIBILITY"));
				bean.setJOBROLE(rs.getString("JOBROLE"));
				bean.setSALARY(rs.getString("SALARY"));
				bean.setSTUDYMATERIAL(rs.getString("STUDYMATERIAL"));
				bean.setPROS(rs.getString("PROS"));
				bean.setCONS(rs.getString("CONS"));
				bean.setFAQ(rs.getString("FAQ"));
				bean.setSTATUS(rs.getInt("STATUS"));	
			
			}
                        pstmt.close();        
                        con.close();
	
		return bean;
	
	}

	@Override
	public ArrayList<ScopeDetails> viewAllScopeDetails() throws SQLException{
		
		ArrayList<ScopeDetails> al = new ArrayList<ScopeDetails>();

			con= MyConnection.getConnection();
			pstmt = con.prepareStatement(SQLConstant.VIEW_ALL_SCOPE_DETAILS);
			rs = pstmt.executeQuery();
			while(rs.next())
			{
				bean=new ScopeDetails();
				bean.setSCOPE_DETAIL_ID(rs.getInt("SCOPE_DETAIL_ID"));
				bean.setCAREER_ID(rs.getInt("CAREER_ID"));
				bean.setSCOPE_ID(rs.getInt("SCOPE_ID"));
				bean.setTITLE(rs.getString("TITLE"));
				bean.setABOUT(rs.getString("ABOUT"));
				bean.setELIGIBILITY(rs.getString("ELIGIBILITY"));
				bean.setJOBROLE(rs.getString("JOBROLE"));
				bean.setSALARY(rs.getString("SALARY"));
				bean.setSTUDYMATERIAL(rs.getString("STUDYMATERIAL"));
				bean.setPROS(rs.getString("PROS"));
				bean.setCONS(rs.getString("CONS"));
				bean.setFAQ(rs.getString("FAQ"));
				bean.setSTATUS(rs.getInt("STATUS"));	
				
				al.add(bean);
			}
                                pstmt.close();
                                con.close();
		                return al;
	
	}

	@Override
	public int deleteScopeDetails(int sdId) throws SQLException{
		
			con= MyConnection.getConnection();
			pstmt = con.prepareStatement(SQLConstant.DELETE_SCOPE_DETAILS);
			pstmt.setInt(1,sdId);
			result = pstmt.executeUpdate();
                        pstmt.close();
                        con.close();
		
		return result;
	}
	}


