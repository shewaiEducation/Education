--学院
drop table College;
create table College(
  id varchar2(10),  --学院编号
  name nvarchar2(20),  --学院名字
  CONSTRAINT PK_COLLEGE_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_COLLEGE_NAME UNIQUE (NAME)
);
--专业
drop table Major;
create table Major(
  id varchar2(10),  --专业编号
  collegeId number(5),  --专业所属学院,外键
  name nvarchar2(20),  --专业名称
  CONSTRAINT PK_MAJOR_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_MAJOR_NAME UNIQUE (NAME)
);
--班级
drop table Class;
create table Class(
  id varchar2(10),  --班级编号
  majorId varchar2(10),  --班级所属专业,外键
  name nvarchar2(20),  --班级名字
  openTime date,  --开班时间 2014-09-01
  CONSTRAINT PK_CLASS_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_CLASS_NAME UNIQUE (NAME)
);
--课程类型
drop table CourseType;
create table CourseType(
  id number(5),  --逻辑主键
  type nvarchar2(20),  --类型名
  CONSTRAINT PK_COURSETYPE_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_COURSETYPE_NAME UNIQUE (TYPE)
);
--课程
drop table Course;
create table Course(
  id varchar2(10),  --课程编号
  typeId number(5),  --课程类型,外键
  name nvarchar2(20),  --课程名字
  totalHours number(2),  --总课时
  credit number(2),  --学分
  note nvarchar2(200),  --备注
  CONSTRAINT PK_COURSE_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_COURSE_NAME UNIQUE (NAME)
);
--专业&课程
drop table MajorCourse;
create table MajorCourse(
  id number(10),  --逻辑主键
  courseId varchar2(10),  --课程编号,外键
  majorId varchar2(10),  --开课专业,外键
  term  number(2),  --开课学期
  CONSTRAINT PK_MAJORCOURSE_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_COURSE_COURSEID_MAJORID UNIQUE (COURSEID,MAJORID)
);
--专业&课程，被选择
drop table MajorCourseSelected;
create table MajorCourseSelected(
  id number(10),  --逻辑主键
  courseId varchar2(10),  --课程编号,外键
  majorId varchar2(10),  --开课专业,外键
  term  number(2),  --开课学期
  grade varchar2(10),  --年级 2014/2015
  CONSTRAINT PK_MAJORCOURSESELECTED_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_MajorCourseSelected UNIQUE (COURSEID,MAJORID,GRADE)
);
--教师类型
drop table TeacherType;
create table TeacherType(
  id number(5),  --逻辑主键
  type nvarchar2(20),  --教师类型名
  CONSTRAINT PK_TEACHERTYPE_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_TEACHERTYPE_NAME UNIQUE (TYPE)
);
--教师
drop table Teacher;
create table Teacher(
  id varchar2(10),  --教师工号
  teacherTypeId number(5),  --教师类型id,外键
  name nvarchar2(20),  --教师名字
  idNumber varchar2(18),  --身份证号
  hireDate date,  --入职日期
  sex nvarchar2(2),  --性别
  phone char(11),  --电话号码
  nation nvarchar2(10),  --民族
  address nvarchar2(100),  --家庭住址
  CONSTRAINT PK_TEACHER_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_TEACHER_IDNUMBER UNIQUE (IDNUMBER)
);
--教学楼
drop table TeachBuild;
create table TeachBuild(
  name nvarchar2(20),  --教学楼名称
  CONSTRAINT PK_TEACHBUILD_NAME PRIMARY KEY (NAME)
);
--教室
drop table ClassRoom;
create table ClassRoom(
  name varchar2(10),  --教室编号
  CONSTRAINT PK_CLASSROOM_NAME PRIMARY KEY (NAME)
);
--授课安排(课程&教师&教学楼&教室)
drop table Arrangement;
create table Arrangement(
  id number(10),  --逻辑主键
  courseId varchar2(10),  --课程编号,外键
  teacherId varchar2(10),  --教师工号,外键
  teachBuild number(5),  --教学楼,外键
  classRoom varchar2(5), --教室,外键
  CONSTRAINT PK_ARRANGEMENT_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_ARRANGEMENT UNIQUE (COURSEID,TEACHERID,TEACHBUILD,CLASSROOM)
);
--*授课班级(教师&班级&星期&节数)
drop table TeacherClass;
create table TeacherClass(
  id number(10),  --逻辑主键
  arrangementId number(10),  --授课安排id,外键
  classId varchar2(10),  --班级编号,外键
  startWeek number(2),  --开始周数 最小值1
  endWeek number(2),  --结束周数  最大值18
  week nvarchar2(10),  --星期 
  lesson nvarchar2(10),  --节数
  teachTime varchar2(11),  --授课时间 2014-2015-1
  CONSTRAINT PK_TEACHERCLASS_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_TEACHERCLASS UNIQUE (ARRANGEMENTID,CLASSID,STARTWEEK,ENDWEEK,WEEK,LESSON,TEACHTIME)
);
--学生
drop table Student;
create table Student(
  id varchar2(10),  --学号
  name nvarchar2(20),  --学生名字
  enterTime date,  --入学时间
  idNumber varchar2(18),  --身份证号
  sex nvarchar2(2),  --性别
  phone char(11),  --电话号码
  relativePhone varchar2(12), --亲属电话
  nation nvarchar2(10),  --民族
  address nvarchar2(100),  --家庭住址
  CONSTRAINT PK_STUDENT_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_STUDENT_IDNUMBER UNIQUE (IDNUMBER)
);
--*选修课班级
drop table ClassSelected;
create table ClassSelected(
  classId varchar2(10),  --班级编号
  arrangementId number(10),  --授课安排id,外键
  startWeek number(2),  --开始周数 *
  endWeek number(2),  --结束周数
  week nvarchar2(10),  --星期
  lesson nvarchar2(10),  --节数
  studentSelected number(3),  --选择人数
  studentTemp number(3),  --预期人数
  CONSTRAINT PK_CLASSSELECTED_ID PRIMARY KEY (CLASSID),
  CONSTRAINT UQ_CLASSSELECTED UNIQUE (CLASSID,ARRANGEMENTID,STARTWEEK,ENDWEEK,WEEK,LESSON)
);
--学生所在班级(学生&班级)
drop table InClassSelected;
create table InClassSelected(
  id number(10),  --逻辑主键
  studentId varchar2(10),  --学号,外键
  classSelectedId varchar2(10),  --选修课班级编号,外键
  selectTime varchar2(11),  --选修时间 2014-2015-2
  CONSTRAINT PK_INCLASSSELECTED_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_INCLASSSELECTED UNIQUE (studentId,classSelectedId,selectTime)
);
--成绩(学生&课程)
drop table Score;
create table Score(
  id number(10),  --逻辑主键
  studentId varchar2(10),  --学号,外键
  courseId number(5),  --课程编号,外键
  dailyScore number(3),  --平时成绩
  examScore number(3),  --期末考试成绩
  totalScore number(3), --学期总分
  selectTime varchar2(11),  --选修时间 
  isPass number(1),  --是否补考
  isCommit number(1),  --是否提交
  CONSTRAINT PK_INCLASSSELECTED_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_SCORE UNIQUE (STUDENTID,COURSEID)
);
--用户
drop table LoginUser;
create table LoginUser(
  id number(10),  --逻辑主键
  userType nvarchar2(20),  --用户类型
  username varchar2(20),  --用户名 用户名和类型用联合索引
  password varchar2(20),  --密码
  CONSTRAINT PK_LoginUser_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_LoginUser UNIQUE (USERTYPE,USERNAME)
);
--管理员
drop table Manager;
create table Manager(
  id number(10),  --逻辑主键
  name nvarchar2(20),  --管理员名字
  idNumber varchar2(18),  --身份证号
  address nvarchar2(100),  --家庭住址
  CONSTRAINT PK_MANAGER_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_MANAGER_IDNUMBER UNIQUE (IDNUMBER)
);
