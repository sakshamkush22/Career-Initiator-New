
package com.examDao;

import com.courseBean.Course;
import com.examBean.Exam;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ExamInterface {
     public int addExam(Exam exm) throws SQLException;
  public int updateExam(Exam exm) throws SQLException;
 public int deleteExam(int exmId) throws SQLException;
  public Exam getExamById(int exmId) throws SQLException;
  public ArrayList<Exam> getAllExam() throws SQLException;
  public ArrayList<Exam> getAllTopExam() throws SQLException;  
  
}
