--ѧԺ
drop table College;
create table College(
  id varchar2(10),  --ѧԺ���
  name nvarchar2(20),  --ѧԺ����
  CONSTRAINT PK_COLLEGE_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_COLLEGE_NAME UNIQUE (NAME)
);
--רҵ
drop table Major;
create table Major(
  id varchar2(10),  --רҵ���
  collegeId varchar2(10),  --רҵ����ѧԺ,���
  name nvarchar2(20),  --רҵ����
  CONSTRAINT PK_MAJOR_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_MAJOR_NAME UNIQUE (NAME),
  CONSTRAINT FK_MAJOR_COLLEGEID FOREIGN KEY (COLLEGEID) REFERENCES COLLEGE(ID)
);
--�༶
drop table Class;
create table Class(
  id varchar2(10),  --�༶���
  majorId varchar2(10),  --�༶����רҵ,���
  name nvarchar2(20),  --�༶����
  openTime date,  --����ʱ�� 2014-09-01
  CONSTRAINT PK_CLASS_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_CLASS_NAME UNIQUE (NAME),
  CONSTRAINT FK_CLASS_MAJORID FOREIGN KEY (MAJORID) REFERENCES MAJOR(ID)
);
--�γ�����
drop table CourseType;
create table CourseType(
  id number(5),  --�߼�����
  type nvarchar2(20),  --������
  CONSTRAINT PK_COURSETYPE_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_COURSETYPE_NAME UNIQUE (TYPE)
);
--�γ�
drop table Course;
create table Course(
  id varchar2(10),  --�γ̱��
  typeId number(5),  --�γ�����,���
  name nvarchar2(20),  --�γ�����
  totalHours number(2),  --�ܿ�ʱ
  credit number(2),  --ѧ��
  note nvarchar2(200),  --��ע
  CONSTRAINT PK_COURSE_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_COURSE_NAME UNIQUE (NAME),
  CONSTRAINT FK_COURSE_TYPEID FOREIGN KEY (TYPEID) REFERENCES CourseType(ID)
);
--רҵ&�γ�
drop table MajorCourse;
create table MajorCourse(
  id number(10),  --�߼�����
  courseId varchar2(10),  --�γ̱��,���
  majorId varchar2(10),  --����רҵ,���
  term  number(2),  --����ѧ��
  CONSTRAINT PK_MAJORCOURSE_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_COURSE_COURSEID_MAJORID UNIQUE (COURSEID,MAJORID),
  CONSTRAINT FK_MAJORCOURSE_COURSEID FOREIGN KEY (COURSEID) REFERENCES COURSE(ID),
  CONSTRAINT FK_MAJORCOURSE_MAJORID FOREIGN KEY (MAJORID) REFERENCES MAJOR(ID)
);
--רҵ&�γ̣���ѡ��
drop table MajorCourseSelected;
create table MajorCourseSelected(
  id number(10),  --�߼�����
  courseId varchar2(10),  --�γ̱��,���
  majorId varchar2(10),  --����רҵ,���
  term  number(2),  --����ѧ��
  grade varchar2(10),  --�꼶 2014/2015
  CONSTRAINT PK_MAJORCOURSESELECTED_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_MajorCourseSelected UNIQUE (COURSEID,MAJORID,GRADE),
  CONSTRAINT FK_MajCouSelected_COURSEID FOREIGN KEY (COURSEID) REFERENCES COURSE(ID),
  CONSTRAINT FK_MajCouSelected_MAJORID FOREIGN KEY (MAJORID) REFERENCES MAJOR(ID)
);
--��ʦ����
drop table TeacherType;
create table TeacherType(
  id number(5),  --�߼�����
  type nvarchar2(20),  --��ʦ������
  CONSTRAINT PK_TEACHERTYPE_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_TEACHERTYPE_NAME UNIQUE (TYPE)
);
--��ʦ
drop table Teacher;
create table Teacher(
  id varchar2(10),  --��ʦ����
  typeId number(5),  --��ʦ����id,���
  name nvarchar2(20),  --��ʦ����
  idNumber varchar2(18),  --���֤��
  hireDate date,  --��ְ����
  sex nvarchar2(2),  --�Ա�
  phone char(11),  --�绰����
  nation nvarchar2(10),  --����
  address nvarchar2(100),  --��ͥסַ
  CONSTRAINT PK_TEACHER_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_TEACHER_IDNUMBER UNIQUE (IDNUMBER),
  CONSTRAINT FK_Teacher_typeId FOREIGN KEY (typeId) REFERENCES TeacherType(ID)
);
--��ѧ¥
drop table TeachBuild;
create table TeachBuild(
  name nvarchar2(20),  --��ѧ¥����
  CONSTRAINT PK_TEACHBUILD_NAME PRIMARY KEY (NAME)
);
--����
drop table ClassRoom;
create table ClassRoom(
  name varchar2(10),  --���ұ��
  CONSTRAINT PK_CLASSROOM_NAME PRIMARY KEY (NAME)
);
--�ڿΰ���(�γ�&��ʦ&��ѧ¥&����)
drop table Arrangement;
create table Arrangement(
  id number(10),  --�߼�����
  courseId varchar2(10),  --�γ̱��,���
  teacherId varchar2(10),  --��ʦ����,���
  teachBuild nvarchar2(20),  --��ѧ¥,���
  classRoom varchar2(10), --����,���
  CONSTRAINT PK_ARRANGEMENT_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_ARRANGEMENT UNIQUE (COURSEID,TEACHERID,TEACHBUILD,CLASSROOM),
  CONSTRAINT FK_Arrangement_courseId FOREIGN KEY (courseId) REFERENCES Course(ID),
  CONSTRAINT FK_Arrangement_teacherId FOREIGN KEY (teacherId) REFERENCES Teacher(ID),
  CONSTRAINT FK_Arrangement_teachBuild FOREIGN KEY (teachBuild) REFERENCES TeachBuild(name),
  CONSTRAINT FK_Arrangement_classRoom FOREIGN KEY (classRoom) REFERENCES ClassRoom(name)
);
--*�ڿΰ༶(��ʦ&�༶&����&����)
drop table TeacherClass;
create table TeacherClass(
  id number(10),  --�߼�����
  arrangementId number(10),  --�ڿΰ���id,���
  classId varchar2(10),  --�༶���,���
  startWeek number(2),  --��ʼ���� ��Сֵ1
  endWeek number(2),  --��������  ���ֵ18
  week nvarchar2(10),  --���� 
  lesson nvarchar2(10),  --����
  teachTime varchar2(11),  --�ڿ�ʱ�� 2014-2015-1
  CONSTRAINT PK_TEACHERCLASS_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_TEACHERCLASS UNIQUE (ARRANGEMENTID,CLASSID,STARTWEEK,ENDWEEK,WEEK,LESSON,TEACHTIME),
  CONSTRAINT FK_TeacherClass_arrangeId FOREIGN KEY (arrangementId) REFERENCES arrangement(id),
  CONSTRAINT FK_TeacherClass_classId FOREIGN KEY (classId) REFERENCES Class(id)
);
--ѧ��
drop table Student;
create table Student(
  id varchar2(10),  --ѧ��
  classId varchar2(10),  --ѧ�����ڰ༶���
  name nvarchar2(20),  --ѧ������
  enterTime date,  --��ѧʱ��
  idNumber varchar2(18),  --���֤��
  sex nvarchar2(2),  --�Ա�
  phone char(11),  --�绰����
  relativePhone varchar2(12), --�����绰
  nation nvarchar2(10),  --����
  address nvarchar2(100),  --��ͥסַ
  CONSTRAINT PK_STUDENT_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_STUDENT_IDNUMBER UNIQUE (IDNUMBER),
  CONSTRAINT FK_Student_classId FOREIGN KEY (classId) REFERENCES Class(id)
);
--*ѡ�޿ΰ༶
drop table ClassSelected;
create table ClassSelected(
  id varchar2(10),  --�༶���
  arrangementId number(10),  --�ڿΰ���id,���
  startWeek number(2),  --��ʼ���� *
  endWeek number(2),  --��������
  week nvarchar2(10),  --����
  lesson nvarchar2(10),  --����
  studentSelected number(3),  --ѡ������
  studentTemp number(3),  --Ԥ������
  CONSTRAINT PK_CLASSSELECTED_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_CLASSSELECTED UNIQUE (ID,ARRANGEMENTID,STARTWEEK,ENDWEEK,WEEK,LESSON),
  CONSTRAINT FK_ClassSelected_arrangeId FOREIGN KEY (arrangementId) REFERENCES arrangement(id)
);
--ѧ�����ڰ༶(ѧ��&�༶)
drop table InClassSelected;
create table InClassSelected(
  id number(10),  --�߼�����
  studentId varchar2(10),  --ѧ��,���
  classSelectedId varchar2(10),  --ѡ�޿ΰ༶���,���
  selectTime varchar2(11),  --ѡ��ʱ�� 2014-2015-2
  CONSTRAINT PK_INCLASSSELECTED_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_INCLASSSELECTED UNIQUE (studentId,classSelectedId,selectTime),
  CONSTRAINT FK_InClaSel_studentId FOREIGN KEY (studentId) REFERENCES Student(id),
  CONSTRAINT FK_InClaSel_claSelId FOREIGN KEY (classSelectedId) REFERENCES ClassSelected(id)
);
--�ɼ�(ѧ��&�γ�)
drop table Score;
create table Score(
  id number(10),  --�߼�����
  studentId varchar2(10),  --ѧ��,���
  courseId varchar2(10),  --�γ̱��,���
  dailyScore number(3),  --ƽʱ�ɼ�
  examScore number(3),  --��ĩ���Գɼ�
  totalScore number(3), --ѧ���ܷ�
  selectTime varchar2(11),  --ѡ��ʱ�� 
  isPass number(1),  --�Ƿ񲹿�
  isCommit number(1),  --�Ƿ��ύ
  CONSTRAINT PK_SCORE_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_SCORE UNIQUE (STUDENTID,COURSEID),
  CONSTRAINT FK_Score_studentId FOREIGN KEY (studentId) REFERENCES Student(id),
  CONSTRAINT FK_Score_courseId FOREIGN KEY (courseId) REFERENCES Course(id)
);
--�û�
drop table LoginUser;
create table LoginUser(
  id number(10),  --�߼�����
  userType nvarchar2(20),  --�û�����
  username varchar2(20),  --�û��� �û�������������������
  password varchar2(20),  --����
  CONSTRAINT PK_LoginUser_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_LoginUser UNIQUE (USERTYPE,USERNAME)
);
--����Ա
drop table Manager;
create table Manager(
  id number(10),  --�߼�����
  name nvarchar2(20),  --����Ա����
  idNumber varchar2(18),  --���֤��
  address nvarchar2(100),  --��ͥסַ
  CONSTRAINT PK_MANAGER_ID PRIMARY KEY (ID),
  CONSTRAINT UQ_MANAGER_IDNUMBER UNIQUE (IDNUMBER)
);
