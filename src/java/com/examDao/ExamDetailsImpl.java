
package com.examDao;

import com.collegeBean.CollegeDetails;
import com.connectionDataBase.MyConnection;
import com.examBean.ExamDetails;
import com.sqlConstant.SQLConstant;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ExamDetailsImpl implements ExamDetailsInterface {
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private ExamDetails bean;
    private ArrayList<ExamDetails> al;

    @Override
    public int addExamDetails(ExamDetails exmdet) throws SQLException {
        //EXAM_ID, TITLE, OVERVIEW, EXAM_DATES, ELIGIBILITY, APPLICATION_FORM, ADMIT_CARD, EXAM_PATTERN, 
        //SYLLABUS, HOW_TO_PREPARE, BEST_BPOKS, PREVIOUS_YEAR_QP, SAMPLE_PAPER, MOCK_TEAST, COCHING_INSTITUTE,
        //PAPER_ANALYSIS, RESPONSE_SHEET, ANSWER_KEY, RESULT, MERIT_LIST, RANK_PREDICTOR, COLLEGE_PREDICTOR, 
        //CONSLING_PROCESS, CHOICE_FILLING, SEAT_ALLOTMENT, CUT_OFFS, PARTICIPATING_COLLEGES, NEWS_AND_ARTICALES
        
        
            con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.ADD_EXAM_DETAILS);
            
            ps.setInt(1, exmdet.getEXAM_ID());
            ps.setString(2, exmdet.getTITLE());
            ps.setString(3, exmdet.getOVERVIEW());
            ps.setString(4, exmdet.getEXAM_DATES());
            ps.setString(5, exmdet.getELIGIBILITY());
            ps.setString(6, exmdet.getAPPLICATION_FORM());
            ps.setString(7, exmdet.getADMIT_CARD());
            ps.setString(8, exmdet.getEXAM_PATTERN());
            ps.setString(9, exmdet.getSYLLABUS());
            ps.setString(10, exmdet.getHOW_TO_PREPARE());
            ps.setString(11, exmdet.getBEST_BPOKS());
            ps.setString(12, exmdet.getPREVIOUS_YEAR_QP());
            ps.setString(13, exmdet.getSAMPLE_PAPER());
            ps.setString(14, exmdet.getMOCK_TEAST());
            ps.setString(15, exmdet.getCOCHING_INSTITUTE());
            ps.setString(16, exmdet.getPAPER_ANALYSIS());
            ps.setString(17, exmdet.getRESPONSE_SHEET());
            ps.setString(18, exmdet.getANSWER_KEY());
            ps.setString(19, exmdet.getRESULT());
            ps.setString(20, exmdet.getMERIT_LIST());
            ps.setString(21, exmdet.getRANK_PREDICTOR());
            ps.setString(22, exmdet.getCOLLEGE_PREDICTOR());
            ps.setString(23, exmdet.getCONSLING_PROCESS());
            ps.setString(24, exmdet.getCHOICE_FILLING());
            ps.setString(25, exmdet.getSEAT_ALLOTMENT());
            ps.setString(26, exmdet.getCUT_OFFS());
            ps.setString(27, exmdet.getPARTICIPATING_COLLEGES());
            ps.setString(28, exmdet.getNEWS_AND_ARTICALES());
            
            int result = ps.executeUpdate();
            ps.close();
            con.close();
           return result;     }

    @Override
    public int updateExamDetails(ExamDetails exmdet) throws SQLException {
            con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.UPDATE_EXAM_DETAILS);
            
            ps.setInt(1, exmdet.getEXAM_ID());
            ps.setString(2, exmdet.getTITLE());
            ps.setString(3, exmdet.getOVERVIEW());
            ps.setString(4, exmdet.getEXAM_DATES());
            ps.setString(5, exmdet.getELIGIBILITY());
            ps.setString(6, exmdet.getAPPLICATION_FORM());
            ps.setString(7, exmdet.getADMIT_CARD());
            ps.setString(8, exmdet.getEXAM_PATTERN());
            ps.setString(9, exmdet.getSYLLABUS());
            ps.setString(10, exmdet.getHOW_TO_PREPARE());
            ps.setString(11, exmdet.getBEST_BPOKS());
            ps.setString(12, exmdet.getPREVIOUS_YEAR_QP());
            ps.setString(13, exmdet.getSAMPLE_PAPER());
            ps.setString(14, exmdet.getMOCK_TEAST());
            ps.setString(15, exmdet.getCOCHING_INSTITUTE());
            ps.setString(16, exmdet.getPAPER_ANALYSIS());
            ps.setString(17, exmdet.getRESPONSE_SHEET());
            ps.setString(18, exmdet.getANSWER_KEY());
            ps.setString(19, exmdet.getRESULT());
            ps.setString(20, exmdet.getMERIT_LIST());
            ps.setString(21, exmdet.getRANK_PREDICTOR());
            ps.setString(22, exmdet.getCOLLEGE_PREDICTOR());
            ps.setString(23, exmdet.getCONSLING_PROCESS());
            ps.setString(24, exmdet.getCHOICE_FILLING());
            ps.setString(25, exmdet.getSEAT_ALLOTMENT());
            ps.setString(26, exmdet.getCUT_OFFS());
            ps.setString(27, exmdet.getPARTICIPATING_COLLEGES());
            ps.setString(28, exmdet.getNEWS_AND_ARTICALES());
            ps.setInt(29, exmdet.getEXAM_DETAILS_ID());
            
            int result = ps.executeUpdate();
            ps.close();
            con.close();
           return result;    }

    @Override
    public int deleteExamDetails(int exmdetId) throws SQLException {
            con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.DELETE_EXAM_DETAILS);
            ps.setInt(1, exmdetId);
            int result= ps.executeUpdate();

            ps.close();
            con.close();
            return result;    }

    @Override
    public ExamDetails getExamDetailsById(int exmdetId) throws SQLException {
        
        //EXAM_ID, TITLE, OVERVIEW, EXAM_DATES, ELIGIBILITY, APPLICATION_FORM, ADMIT_CARD, EXAM_PATTERN, 
        //SYLLABUS, HOW_TO_PREPARE, BEST_BPOKS, PREVIOUS_YEAR_QP, SAMPLE_PAPER, MOCK_TEAST, COCHING_INSTITUTE,
        //PAPER_ANALYSIS, RESPONSE_SHEET, ANSWER_KEY, RESULT, MERIT_LIST, RANK_PREDICTOR, COLLEGE_PREDICTOR, 
        //CONSLING_PROCESS, CHOICE_FILLING, SEAT_ALLOTMENT, CUT_OFFS, PARTICIPATING_COLLEGES, NEWS_AND_ARTICALES
        
            con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.GET_EXAM_DETAILS_BYID);

            ps.setInt(1, exmdetId);
            rs = ps.executeQuery();

            if(rs.next()) {
                bean = new ExamDetails();
                bean.setEXAM_DETAILS_ID(rs.getInt("EXAM_DETAILS_ID"));
                bean.setEXAM_ID(rs.getInt("EXAM_ID"));
                bean.setTITLE(rs.getString("TITLE"));
                bean.setOVERVIEW(rs.getString("OVERVIEW"));
                bean.setEXAM_DATES(rs.getString("EXAM_DATES"));
                bean.setELIGIBILITY(rs.getString("ELIGIBILITY"));
                bean.setAPPLICATION_FORM(rs.getString("APPLICATION_FORM"));
                bean.setADMIT_CARD(rs.getString("ADMIT_CARD"));
                bean.setEXAM_PATTERN(rs.getString("EXAM_PATTERN"));
                bean.setSYLLABUS(rs.getString("SYLLABUS"));
                bean.setHOW_TO_PREPARE(rs.getString("HOW_TO_PREPARE"));
                bean.setBEST_BPOKS(rs.getString("BEST_BPOKS"));
                bean.setPREVIOUS_YEAR_QP(rs.getString("PREVIOUS_YEAR_QP"));
                bean.setSAMPLE_PAPER(rs.getString("SAMPLE_PAPER"));
                bean.setMOCK_TEAST(rs.getString("MOCK_TEAST"));
                bean.setCOCHING_INSTITUTE(rs.getString("COCHING_INSTITUTE"));
                bean.setPAPER_ANALYSIS(rs.getString("PAPER_ANALYSIS"));
                bean.setRESPONSE_SHEET(rs.getString("RESPONSE_SHEET"));
                bean.setANSWER_KEY(rs.getString("ANSWER_KEY"));
                bean.setRESULT(rs.getString("RESULT"));
                bean.setMERIT_LIST(rs.getString("MERIT_LIST"));
                bean.setRANK_PREDICTOR(rs.getString("RANK_PREDICTOR"));
                bean.setCOLLEGE_PREDICTOR(rs.getString("COLLEGE_PREDICTOR"));
                bean.setCONSLING_PROCESS(rs.getString("CONSLING_PROCESS"));
                bean.setCHOICE_FILLING(rs.getString("CHOICE_FILLING"));
                bean.setSEAT_ALLOTMENT(rs.getString("SEAT_ALLOTMENT"));
                bean.setCUT_OFFS(rs.getString("CUT_OFFS"));
                bean.setPARTICIPATING_COLLEGES(rs.getString("PARTICIPATING_COLLEGES"));
                bean.setNEWS_AND_ARTICALES(rs.getString("NEWS_AND_ARTICALES"));
                
            }
              ps.close();
             con.close();
              return bean;    }

    @Override
    public ArrayList<ExamDetails> getAllExamDetails() throws SQLException {
          con = MyConnection.getConnection();
            ps = con.prepareStatement(SQLConstant.GET_ALL_EXAM_DETAILS);
            rs = ps.executeQuery();
            al = new ArrayList<ExamDetails>();
            while(rs.next()) {
                bean = new ExamDetails();
                bean.setEXAM_DETAILS_ID(rs.getInt("EXAM_DETAILS_ID"));
                bean.setEXAM_ID(rs.getInt("EXAM_ID"));
                bean.setTITLE(rs.getString("TITLE"));
                bean.setOVERVIEW(rs.getString("OVERVIEW"));
                bean.setEXAM_DATES(rs.getString("EXAM_DATES"));
                bean.setELIGIBILITY(rs.getString("ELIGIBILITY"));
                bean.setAPPLICATION_FORM(rs.getString("APPLICATION_FORM"));
                bean.setADMIT_CARD(rs.getString("ADMIT_CARD"));
                bean.setEXAM_PATTERN(rs.getString("EXAM_PATTERN"));
                bean.setSYLLABUS(rs.getString("SYLLABUS"));
                bean.setHOW_TO_PREPARE(rs.getString("HOW_TO_PREPARE"));
                bean.setBEST_BPOKS(rs.getString("BEST_BPOKS"));
                bean.setPREVIOUS_YEAR_QP(rs.getString("PREVIOUS_YEAR_QP"));
                bean.setSAMPLE_PAPER(rs.getString("SAMPLE_PAPER"));
                bean.setMOCK_TEAST(rs.getString("MOCK_TEAST"));
                bean.setCOCHING_INSTITUTE(rs.getString("COCHING_INSTITUTE"));
                bean.setPAPER_ANALYSIS(rs.getString("PAPER_ANALYSIS"));
                bean.setRESPONSE_SHEET(rs.getString("RESPONSE_SHEET"));
                bean.setANSWER_KEY(rs.getString("ANSWER_KEY"));
                bean.setRESULT(rs.getString("RESULT"));
                bean.setMERIT_LIST(rs.getString("MERIT_LIST"));
                bean.setRANK_PREDICTOR(rs.getString("RANK_PREDICTOR"));
                bean.setCOLLEGE_PREDICTOR(rs.getString("COLLEGE_PREDICTOR"));
                bean.setCONSLING_PROCESS(rs.getString("CONSLING_PROCESS"));
                bean.setCHOICE_FILLING(rs.getString("CHOICE_FILLING"));
                bean.setSEAT_ALLOTMENT(rs.getString("SEAT_ALLOTMENT"));
                bean.setCUT_OFFS(rs.getString("CUT_OFFS"));
                bean.setPARTICIPATING_COLLEGES(rs.getString("PARTICIPATING_COLLEGES"));
                bean.setNEWS_AND_ARTICALES(rs.getString("NEWS_AND_ARTICALES"));
                al.add(bean);
            }

            ps.close();
            con.close();   
        return al;    }
    
}
