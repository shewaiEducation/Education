--学院
create table College(
  id varchar2(10),  --学院编号
  name nvarchar2(20)  --学院名字
);
--专业
create table Major(
  id varchar2(10),  --专业编号
  collegeId number(5),  --专业所属学院
  name nvarchar2(20)  --专业名称
);
--班级
create table Class(
  id varchar2(10),  --班级编号
  majorId varchar2(10),  --班级所属专业
  name nvarchar2(20),  --班级名字
  openTime date  --开班时间
);
--课程类型
create table CourseType(
  id number(5),  --逻辑主键
  type nvarchar2(20)  --类型名
);
--课程
create table Course(
  id varchar2(10),  --课程编号
  majorId varchar2(10),  --开课专业
  term number(2),  --开课学期
  typeId number(5),  --课程类型
  name nvarchar2(20),  --课程名字
  totalHours number(2),  --总课时
  teachHours number(2),  --讲授课时
  practiceHours number(2),  --实践课时
  credit number(2),  --学分
  weekHours number(2),  --周课时
  note nvarchar2(200)  --备注
);
--教师类型
create table TeacherType(
  id number(5),  --逻辑主键
  type nvarchar2(20)  --教师类型名
);
--教师
create table Teacher(
  id varchar2(10),  --教师工号
  teacherTypeId number(5),  --教师类型id
  name nvarchar2(20),  --教师名字
  idNumber varchar2(18),  --身份证号
  address nvarchar2(100),  --家庭住址
  hireDate date  --入职日期
);
--教学楼
create table TeachBuild(
  id number(5),  --逻辑主键
  name nvarchar2(20),  --教学楼名称
  buildTime date  --建立日期
);
--教室
create table ClassRoom(
  id varchar2(5)  --教室编号
);
--星期
create table Week(
  id nvarchar2(10)  --星期几
);
--节数
create table Lesson(
  id nvarchar2(10)  --1-2/3-4
);
--授课安排(课程&教师&教学楼&教室&星期&节数)
create table Arrangement(
  id number(10),  --逻辑主键
  courseId varchar2(10),  --课程编号
  teacherId varchar2(10),  --教师工号
  teachBuildId number(5),  --教学楼
  classRoomId varchar2(5), --教室
  weekId nvarchar2(10),  --星期
  lessonId nvarchar2(10),  --节数
  startWeek number(2),  --开始周数
  endWeek number(2)  --结束周数
);
--授课班级(教师&班级)
create table TeacherClass(
  id number(10),  --逻辑主键
  teacherId varchar2(10),  --教师工号
  classId varchar2(10),  --班级编号
  teachTime date  --授课时间
);
--学生
create table Student(
  id varchar2(10),  --学号
  name nvarchar2(20),  --学生名字
  enterTime date,  --入学时间
  idNumber varchar2(18),  --身份证号
  address nvarchar2(100)  --家庭住址
);
--学生所在班级(学生&班级)
create table InClass(
  id number(10),  --逻辑主键
  studentId varchar2(10),  --学号
  classId varchar2(10)  --班级编号
);
--成绩(学生&课程)
create table Score(
  id number(10),  --逻辑主键
  studentId varchar2(10),  --学号
  courseId number(5),  --课程编号
  dailyScore number(3),  --平时成绩
  examScore number(3),  --期末考试成绩
  totalScore number(3), --学期总分
  selectTime date,  --选修时间
  isPass number(1)  --是否补考
);
--用户
create table User(
  id number(10),  --逻辑主键
  userType nvarchar2(20),  --用户类型
  username varchar2(20),  --用户名
  password varchar2(20)  --密码
);
--管理员
create table Manager(
  id number(10),  --逻辑主键
  name nvarchar2(20),  --管理员名字
  idNumber varchar2(18),  --身份证号
  address nvarchar2(100)  --家庭住址
);
