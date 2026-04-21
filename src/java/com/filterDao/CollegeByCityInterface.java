
package com.filterDao;

import com.filterBean.CollegeByCity;
import java.util.ArrayList;

public interface CollegeByCityInterface {
      public int addCollegeByCity(CollegeByCity clgCity) throws Exception;
  public int updateCollegeByCity(CollegeByCity clgCity) throws Exception;
 public int deleteCollegeByCity(int cityId) throws Exception;
  public CollegeByCity getCollegeByCityById(int cityId) throws Exception;
  public ArrayList<CollegeByCity> getAllCollegeByCity() throws Exception;
    
}
