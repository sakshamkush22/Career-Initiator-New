
package com.courseDao;

import com.courseBean.Course;
import java.sql.SQLException;
import java.util.ArrayList;

public interface CourseInterface {
    
 public int addCourse(Course cs) throws SQLException;
  public int updateCourse(Course cs) throws SQLException;
 public int deleteCourse(int csId) throws SQLException;
  public Course getCourseById(int csId) throws SQLException;
  public ArrayList<Course> getAllCourse() throws SQLException;
  public ArrayList<Course> getAllTopCourse() throws SQLException;

    
}
