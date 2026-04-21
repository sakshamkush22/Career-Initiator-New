package com.carreerDao;

import java.util.ArrayList;

import com.careerBean.ScopeDetails;
import java.sql.SQLException;

public interface ScopeDetailsInterface {
	public int addScopeDetails(ScopeDetails sd) throws SQLException;
	public int updateScopeDetails(ScopeDetails sd) throws SQLException;
	public ScopeDetails viewScopeDetailsByID(int sdId) throws SQLException;
	public ArrayList<ScopeDetails> viewAllScopeDetails() throws SQLException;
	public int deleteScopeDetails(int sdId) throws SQLException;

}
