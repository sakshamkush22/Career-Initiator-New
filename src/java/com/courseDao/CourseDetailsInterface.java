
package com.courseDao;

import com.courseBean.CourseDetails;
import java.sql.SQLException;
import java.util.ArrayList;

public interface CourseDetailsInterface {
    public int addCourseDetails(CourseDetails cd) throws SQLException;
  public int updateCourseDetails(CourseDetails cd) throws SQLException;
 public int deleteCourseDetails(int cdId) throws SQLException;
  public CourseDetails getCourseDetailsById(int cdId) throws SQLException;
  public ArrayList<CourseDetails> getAllCourseDetails() throws SQLException;
    
    
}
