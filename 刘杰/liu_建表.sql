--ѧԺ
create table College(
  id varchar2(10) primary key,  --ѧԺ���
  name nvarchar2(20),  --ѧԺ����
  CONSTRAINT UQ_COLLEGE_NAME UNIQUE (NAME)
);
--רҵ
create table Major(
  id varchar2(10) primary key,  --רҵ���
  collegeId number(5),  --רҵ����ѧԺ
  name nvarchar2(20),  --רҵ����
  CONSTRAINT UQ_MAJOR_NAME UNIQUE (NAME)
);
--�༶
create table Class(
  id varchar2(10) primary key,  --�༶���
  majorId varchar2(10),  --�༶����רҵ
  name nvarchar2(20),  --�༶����
  openTime date,  --����ʱ��
  CONSTRAINT UQ_CLASS_NAME UNIQUE (NAME)
);
--�γ�����
create table CourseType(
  id number(5) primary key,  --�߼�����
  type nvarchar2(20),  --������
  CONSTRAINT UQ_COURSETYPE_NAME UNIQUE (TYPE)
);
--�γ�
create table Course(
  id varchar2(10) primary key,  --�γ̱��
  typeId number(5),  --�γ�����
  name nvarchar2(20),  --�γ�����
  totalHours number(2),  --�ܿ�ʱ
  teachHours number(2),  --���ڿ�ʱ
  practiceHours number(2),  --ʵ����ʱ
  credit number(2),  --ѧ��
  weekHours number(2),  --�ܿ�ʱ
  note nvarchar2(200),  --��ע
  CONSTRAINT UQ_COURSE_NAME UNIQUE (NAME)
);
--רҵ&�γ�
create table MajorCourse(
  id number(10),  --�߼�����
  courseId varchar2(10),  --�γ̱��
  majorId varchar2(10),  --����רҵ
  term  number(2)  --����ѧ��
);
--רҵ&�γ̣���ѡ��
create table MajorCourseSelected(
  id number(10),  --�߼�����
  courseId varchar2(10),  --�γ̱��
  majorId varchar2(10),  --����רҵ
  term  number(2),  --����ѧ��
  grade varchar2(10)  --�꼶
);
--��ʦ����
create table TeacherType(
  id number(5) primary key,  --�߼�����
  type nvarchar2(20),  --��ʦ������
  CONSTRAINT UQ_TEACHERTYPE_NAME UNIQUE (TYPE)
);
--��ʦ
create table Teacher(
  id varchar2(10) primary key,  --��ʦ����
  teacherTypeId number(5),  --��ʦ����id
  name nvarchar2(20),  --��ʦ����
  idNumber varchar2(18),  --���֤��
  hireDate date,  --��ְ����
  sex nvarchar2(2),  --�Ա�
  phone char(11),  --�绰����
  nation nvarchar2(10),  --����
  address nvarchar2(100)  --��ͥסַ
);
--�ڿΰ���(�γ�&��ʦ&��ѧ¥&����&����&����) ���Լ������������
create table Arrangement(
  id number(10) primary key,  --�߼�����
  courseId varchar2(10),  --�γ̱��
  teacherId varchar2(10),  --��ʦ����
  teachBuild number(5),  --��ѧ¥
  classRoom varchar2(5), --����
  week nvarchar2(10),  --����
  lesson nvarchar2(10),  --����
  startWeek number(2),  --��ʼ����
  endWeek number(2)  --��������
);
--�ڿΰ༶(��ʦ&�༶)
create table TeacherClass(
  id number(10) primary key,  --�߼�����
  arrangementId number(10),  --�ڿΰ���id
  classId varchar2(10),  --�༶���
  teachTime date  --�ڿ�ʱ��(��һ��)
);
--ѧ��
create table Student(
  id varchar2(10) primary key,  --ѧ��
  name nvarchar2(20),  --ѧ������
  enterTime date,  --��ѧʱ��
  idNumber varchar2(18),  --���֤��
  sex nvarchar2(2),  --�Ա�
  phone char(11),  --�绰����
  relativePhone varchar2(12), --�����绰
  nation nvarchar2(10),  --����
  address nvarchar2(100)  --��ͥסַ
);
--ѧ�����ڰ༶(ѧ��&�༶)
create table InClass(
  id number(10) primary key,  --�߼�����
  studentId varchar2(10),  --ѧ��
  classId varchar2(10)  --�༶���
);
--�ɼ�(ѧ��&�γ�)
create table Score(
  id number(10) primary key,  --�߼�����
  studentId varchar2(10),  --ѧ��
  courseId number(5),  --�γ̱��
  dailyScore number(3),  --ƽʱ�ɼ�
  examScore number(3),  --��ĩ���Գɼ�
  totalScore number(3), --ѧ���ܷ�
  selectTime date,  --ѡ��ʱ��
  isPass number(1)  --�Ƿ񲹿�
);
--�û�
create table User(
  id number(10) primary key,  --�߼�����
  userType nvarchar2(20),  --�û�����
  username varchar2(20),  --�û���
  password varchar2(20)  --����
);
--����Ա
create table Manager(
  id number(10) primary key,  --�߼�����
  name nvarchar2(20),  --����Ա����
  idNumber varchar2(18),  --���֤��
  address nvarchar2(100)  --��ͥסַ
);
