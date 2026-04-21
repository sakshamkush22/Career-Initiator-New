package com.carreerDao;

import java.util.ArrayList;

import com.careerBean.AddCarreer;
import java.sql.SQLException;

public interface AddCarrerInterface 
{
	public int addCarreer(AddCarreer ac) throws SQLException;
	public int updateCarreer(AddCarreer ac) throws SQLException;
	public AddCarreer viewByID(int cId) throws SQLException;
	public ArrayList<AddCarreer> viewAll() throws SQLException;
        public ArrayList<AddCarreer> viewAllTops() throws SQLException;
	public int deleteCareer(int cID) throws SQLException;
	
}
