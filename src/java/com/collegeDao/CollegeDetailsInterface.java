
package com.collegeDao;

import com.collegeBean.CollegeDetails;
import java.sql.SQLException;
import java.util.ArrayList;

public interface CollegeDetailsInterface {
    
    	public int addCollegeDetails(CollegeDetails clgdet) throws SQLException;
	public int updateCollegeDetails(CollegeDetails clgdet) throws SQLException;
      	public CollegeDetails viewCollegeDetailsByID(int clgdetId) throws SQLException;
	public ArrayList<CollegeDetails> viewAllCollegeDetails() throws SQLException;
	public int deleteCollegeDetails(int clgdetId) throws SQLException;
    
}
