package com.sqlConstant;

public class SQLConstant {
    
    //career
	public final static String ADD_CARREER="insert into ADD_CARREER(C_NAME,C_IMAGE,C_PRIORITY,C_STATUS) values(?,?,?,?)";
	public final static String UPDATE_CARREER="update ADD_CARREER set C_NAME=?,C_IMAGE=?,C_PRIORITY=?,C_STATUS=? where c_Id=?";
	public final static String VIEW_BY_ID="select * from ADD_CARREER where c_Id=?";
	public final static String DELETE_CAREER="delete from ADD_CARREER where c_Id=?";
	public final static String VIEW_ALL="select * from ADD_CARREER";
        public final static String VIEW_TOP_CAREER="select * from mydb.ADD_CARREER LIMIT 8";
        //public final static String VIEW_TOP_CAREER="select * from ADD_CARREER WHERE ROWNUM <=8";

        
        
        
    //career scope
	public final static String ADD_CARREER_SCOPE="insert into CAREER_SCOPE(C_ID,S_NAME,S_IMAGE,S_PRIORITY,S_STATUS) values(?,?,?,?,?)";
	public final static String UPDATE_CARREER_SCOPE="update CAREER_SCOPE set S_NAME=?,S_IMAGE=?,S_PRIORITY=?,S_STATUS=? where S_ID=?";
	public final static String VIEW_BY_ID_SCOPE="select * from CAREER_SCOPE where S_ID=?";
	public final static String DELETE_CAREER_SCOPE="delete from CAREER_SCOPE where S_ID=?";
	public final static String VIEW_ALL_SCOPE="select * from CAREER_SCOPE";
	public final static String VIEW_ALL_SCOPE_BY_CID="select * from CAREER_SCOPE WHERE C_ID=?";
        
        
        
    //career scope details
	public final static String ADD_SCOPE_DETAILS="insert into TBL_SCOPE_DETAILS(CAREER_ID, SCOPE_ID, TITLE, ABOUT, ELIGIBILITY, JOBROLE, SALARY, STUDYMATERIAL, PROS, CONS, FAQ, STATUS) values(?,?,?,?,?,?,?,?,?,?,?,?)";
	public final static String UPDATE_SCOPE_DETAILS="update TBL_SCOPE_DETAILS set CAREER_ID=?, SCOPE_ID=?, TITLE=?, ABOUT=?, ELIGIBILITY=?, JOBROLE=?, SALARY=?, STUDYMATERIAL=?, PROS=?, CONS=?, FAQ=?, STATUS=? where SCOPE_DETAIL_ID=?";
	public final static String VIEW_BY_ID_SCOPE_DETAILS="select * from TBL_SCOPE_DETAILS where SCOPE_ID=?";
	public final static String DELETE_SCOPE_DETAILS="delete from TBL_SCOPE_DETAILS where SCOPE_DETAIL_ID=?";
	public final static String VIEW_ALL_SCOPE_DETAILS="select * from TBL_SCOPE_DETAILS";    
    
    //College
	public final static String ADD_COLLEGE="insert into TBL_COLLEGE(COLLEGE_NAME, COLLEGE_LOCATION, COLLEGE_CATEGORY, COLLEGE_DETAILS, COLLEGE_RATING, COLLEGE_PROGRAMS, COLLEGE_PRIORITY, COLLEGE_STATUS, COLLEGE_IMAGE) values(?,?,?,?,?,?,?,?,?)";
	public final static String UPDATE_COLLEGE="update TBL_COLLEGE set COLLEGE_NAME=?, COLLEGE_LOCATION=?, COLLEGE_CATEGORY=?, COLLEGE_DETAILS=?, COLLEGE_RATING=?, COLLEGE_PROGRAMS=?, COLLEGE_PRIORITY=?, COLLEGE_STATUS=?, COLLEGE_IMAGE=? where COLLEGE_ID=?";
	public final static String VIEW_COLLEGE_BY_ID="select * from TBL_COLLEGE where COLLEGE_ID=?";
	public final static String DELETE_COLLEGE="delete from TBL_COLLEGE where COLLEGE_ID=?";
	public final static String VIEW_ALL_COLLEGE="select * from TBL_COLLEGE";
        public final static String VIEW_TOP_COLLEGE="select * from TBL_COLLEGE LIMIT 4";
        //public final static String VIEW_TOP_COLLEGE="select * from TBL_COLLEGE WHERE ROWNUM <=4";

        
    //College Details
	public final static String ADD_COLLEGE_DETAILS="insert into TBL_COLLEGES_DETAILS(COLLEGE_ID, OVERVIEW, COURSE, JOB_READY_DEGREE, ADMISSION, PLACEMENTS, CUT_OFFS, GALLERY, AVRAGE_PACKAGE, FEES, REVIEWS, SCHOLARSHIP, NEWS, HOSTEL) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public final static String UPDATE_COLLEGE_DETAILS="update TBL_COLLEGES_DETAILS set COLLEGE_ID=?, OVERVIEW=?, COURSE=?, JOB_READY_DEGREE=?, ADMISSION=?, PLACEMENTS=?, CUT_OFFS=?, GALLERY=?, AVRAGE_PACKAGE=?, FEES=?, REVIEWS=?, SCHOLARSHIP=?, NEWS=?, HOSTEL=? where COLLEGE_DETAILS_ID=?";
	public final static String VIEW_COLLEGE_DETAILS_BY_ID="select * from TBL_COLLEGES_DETAILS where COLLEGE_ID=?";
	public final static String DELETE_COLLEGE_DETAILS="delete from TBL_COLLEGES_DETAILS where COLLEGE_DETAILS_ID=?";
	public final static String VIEW_ALL_COLLEGE_DETAILS="select * from TBL_COLLEGES_DETAILS";   
        
        
    //course
        public static final String ADD_COURSE = "INSERT INTO TBL_COURSE(COURSE_NAME, COURSE_IMAGE, AVRAGE_DURATION, AVRAGE_FEES, DETAIL) VALUES(?,?,?,?,?)";
        public static final String UPDATE_COURSE = "UPDATE TBL_COURSE SET COURSE_NAME=?, COURSE_IMAGE=?, AVRAGE_DURATION=?, AVRAGE_FEES=?, DETAIL=? WHERE COURSE_ID=? ";
        public static final String DELETE_COURSE = "DELETE FROM TBL_COURSE WHERE COURSE_ID=?";
        public static final String GET_COURSE_BYID = "SELECT * FROM TBL_COURSE WHERE COURSE_ID=?";
        public static final String GET_ALL_COURSE = "SELECT * FROM TBL_COURSE";
        public static final String GET_TOP_COURSE = "SELECT * FROM TBL_COURSE LIMIT 4";
         //public static final String GET_TOP_COURSE = "SELECT * FROM TBL_COURSE WHERE ROWNUM <=4";


        
        //course details
        public static final String ADD_COURSE_DETAILS = "INSERT INTO TBL_COURSE_DETAILS(COURSE_OVERVIEW, SYLLABUS_AND_SUBJECTS, JOB, SCOPE, SALARY, ADMISSION, PLACEMENTS, TITLE, COURSE_ID) VALUES(?,?,?,?,?,?,?,?,?)";
        public static final String UPDATE_COURSE_DETAILS = "UPDATE TBL_COURSE_DETAILS SET COURSE_OVERVIEW=?, SYLLABUS_AND_SUBJECTS=?, JOB=?, SCOPE=?, SALARY=?, ADMISSION=?, PLACEMENTS=?, TITLE=?, COURSE_ID=? WHERE COURSE_DETAILS_ID=? ";
        public static final String DELETE_COURSE_DETAILS = "DELETE FROM TBL_COURSE_DETAILS WHERE COURSE_DETAILS_ID=?";
        public static final String GET_COURSE_DETAILS_BYID = "SELECT * FROM TBL_COURSE_DETAILS WHERE COURSE_ID=?";
        public static final String GET_ALL_COURSE_DETAILS = "SELECT * FROM TBL_COURSE_DETAILS";
        
        
        //EXAM
        public static final String ADD_EXAM = "INSERT INTO TBL_EXAM(EXAM_NAME, EXAM_IMAGE, EXAM_FEILD, PRIORITY, STATUS, EXAM_DETAIL) VALUES(?,?,?,?,?,?)";
        public static final String UPDATE_EXAM = "UPDATE TBL_EXAM SET EXAM_NAME=?, EXAM_IMAGE=?, EXAM_FEILD=?, PRIORITY=?, STATUS=?, EXAM_DETAIL=?  WHERE EXAM_ID=? ";
        public static final String DELETE_EXAM = "DELETE FROM TBL_EXAM WHERE EXAM_ID=?";
        public static final String GET_EXAM_BYID = "SELECT * FROM TBL_EXAM WHERE EXAM_ID=?";
        public static final String GET_ALL_EXAM = "SELECT * FROM TBL_EXAM";
        public static final String GET_TOP_EXAM = "SELECT * FROM TBL_EXAM LIMIT 4";
        //public static final String GET_TOP_EXAM = "SELECT * FROM TBL_EXAM WHERE ROWNUM <=4";

        
     //EXAM DETAILS
        public static final String ADD_EXAM_DETAILS = "INSERT INTO TBL_EXAM_DETAILS(EXAM_ID, TITLE, OVERVIEW, EXAM_DATES, ELIGIBILITY, APPLICATION_FORM, ADMIT_CARD, EXAM_PATTERN, SYLLABUS, HOW_TO_PREPARE, BEST_BPOKS, PREVIOUS_YEAR_QP, SAMPLE_PAPER, MOCK_TEAST, COCHING_INSTITUTE, PAPER_ANALYSIS, RESPONSE_SHEET, ANSWER_KEY, RESULT, MERIT_LIST, RANK_PREDICTOR, COLLEGE_PREDICTOR, CONSLING_PROCESS, CHOICE_FILLING, SEAT_ALLOTMENT, CUT_OFFS, PARTICIPATING_COLLEGES, NEWS_AND_ARTICALES ) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        public static final String UPDATE_EXAM_DETAILS = "UPDATE TBL_EXAM_DETAILS SET EXAM_ID=?, TITLE=?, OVERVIEW=?, EXAM_DATES=?, ELIGIBILITY=?, APPLICATION_FORM=?, ADMIT_CARD=?, EXAM_PATTERN=?, SYLLABUS=?, HOW_TO_PREPARE=?, BEST_BPOKS=?, PREVIOUS_YEAR_QP=?, SAMPLE_PAPER=?, MOCK_TEAST=?, COCHING_INSTITUTE=?, PAPER_ANALYSIS=?, RESPONSE_SHEET=?, ANSWER_KEY=?, RESULT=?, MERIT_LIST=?, RANK_PREDICTOR=?, COLLEGE_PREDICTOR=?, CONSLING_PROCESS=?, CHOICE_FILLING=?, SEAT_ALLOTMENT=?, CUT_OFFS=?, PARTICIPATING_COLLEGES=?, NEWS_AND_ARTICALES=? WHERE EXAM_DETAILS_ID=? ";
        public static final String DELETE_EXAM_DETAILS = "DELETE FROM TBL_EXAM_DETAILS WHERE EXAM_DETAILS_ID=?";
        public static final String GET_EXAM_DETAILS_BYID = "SELECT * FROM TBL_EXAM_DETAILS WHERE EXAM_ID=?";
        public static final String GET_ALL_EXAM_DETAILS = "SELECT * FROM TBL_EXAM_DETAILS";
        
    //College By City
    public static final String ADD_CITY = "INSERT INTO TBL_COLLEGE_CITY(CITY_NAME, PRIORITY, STATUS) VALUES(?,?,?)";
    public static final String UPDATE_CITY = "UPDATE TBL_COLLEGE_CITY SET CITY_NAME=?, PRIORITY=?, STATUS=? WHERE COLOR_ID=? ";
    public static final String DELETE_CITY = "DELETE FROM TBL_COLLEGE_CITY WHERE CITY_ID=?";
    public static final String GET_CITY_BYID = "SELECT * FROM TBL_COLLEGE_CITY WHERE CITY_ID=?";
    public static final String GET_ALL_CITY = "SELECT * FROM TBL_COLLEGE_CITY"; 
}
