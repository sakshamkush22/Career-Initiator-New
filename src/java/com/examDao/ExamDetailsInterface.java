
package com.examDao;

import com.examBean.ExamDetails;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ExamDetailsInterface {
   public int addExamDetails(ExamDetails exmdet) throws SQLException;
  public int updateExamDetails(ExamDetails exmdet) throws SQLException;
 public int deleteExamDetails(int exmdetId) throws SQLException;
  public ExamDetails getExamDetailsById(int exmdetId) throws SQLException;
  public ArrayList<ExamDetails> getAllExamDetails() throws SQLException;
}
