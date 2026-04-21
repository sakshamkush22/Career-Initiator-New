package com.collegeDao;

import java.util.ArrayList;

import com.collegeBean.College;
import java.sql.SQLException;

public interface CollegeInterface {
	public int addCollege(College clg) throws SQLException;
	public int updateCollege(College clg) throws SQLException;
      	public College viewCollegeByID(int clgId) throws SQLException;
	public ArrayList<College> viewAllCollege() throws SQLException;
        public ArrayList<College> viewAllTopCollege() throws SQLException;
	public int deleteCollege(int clgId) throws SQLException;

}
