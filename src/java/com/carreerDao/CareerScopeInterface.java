package com.carreerDao;

import java.util.ArrayList;

import com.careerBean.AddCarreer;
import com.careerBean.CareerScope;
import java.sql.SQLException;

public interface CareerScopeInterface {
	public int addCarreerScope(CareerScope cs) throws SQLException;
	public int updateCarreerScope(CareerScope cs) throws SQLException;
	public CareerScope viewScopeByID(int sId) throws SQLException;
	public ArrayList<CareerScope> viewAllScope() throws SQLException;
	public int deleteCareerScope(int sID) throws SQLException;
	public ArrayList<CareerScope> viewAllScopeByCID(int cID) throws SQLException;

}
