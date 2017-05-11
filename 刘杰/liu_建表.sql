--ѧԺ
create table College(
  id varchar2(10),  --ѧԺ���
  name nvarchar2(20)  --ѧԺ����
);
--רҵ
create table Major(
  id varchar2(10),  --רҵ���
  collegeId number(5),  --רҵ����ѧԺ
  name nvarchar2(20)  --רҵ����
);
--�༶
create table Class(
  id varchar2(10),  --�༶���
  majorId varchar2(10),  --�༶����רҵ
  name nvarchar2(20),  --�༶����
  openTime date  --����ʱ��
);
--�γ�����
create table CourseType(
  id number(5),  --�߼�����
  type nvarchar2(20)  --������
);
--�γ�
create table Course(
  id varchar2(10),  --�γ̱��
  majorId varchar2(10),  --����רҵ
  term number(2),  --����ѧ��
  typeId number(5),  --�γ�����
  name nvarchar2(20),  --�γ�����
  totalHours number(2),  --�ܿ�ʱ
  teachHours number(2),  --���ڿ�ʱ
  practiceHours number(2),  --ʵ����ʱ
  credit number(2),  --ѧ��
  weekHours number(2),  --�ܿ�ʱ
  note nvarchar2(200)  --��ע
);
--��ʦ����
create table TeacherType(
  id number(5),  --�߼�����
  type nvarchar2(20)  --��ʦ������
);
--��ʦ
create table Teacher(
  id varchar2(10),  --��ʦ����
  teacherTypeId number(5),  --��ʦ����id
  name nvarchar2(20),  --��ʦ����
  idNumber varchar2(18),  --���֤��
  address nvarchar2(100),  --��ͥסַ
  hireDate date  --��ְ����
);
--��ѧ¥
create table TeachBuild(
  id number(5),  --�߼�����
  name nvarchar2(20),  --��ѧ¥����
  buildTime date  --��������
);
--����
create table ClassRoom(
  id varchar2(5)  --���ұ��
);
--����
create table Week(
  id nvarchar2(10)  --���ڼ�
);
--����
create table Lesson(
  id nvarchar2(10)  --1-2/3-4
);
--�ڿΰ���(�γ�&��ʦ&��ѧ¥&����&����&����)
create table Arrangement(
  id number(10),  --�߼�����
  courseId varchar2(10),  --�γ̱��
  teacherId varchar2(10),  --��ʦ����
  teachBuildId number(5),  --��ѧ¥
  classRoomId varchar2(5), --����
  weekId nvarchar2(10),  --����
  lessonId nvarchar2(10),  --����
  startWeek number(2),  --��ʼ����
  endWeek number(2)  --��������
);
--�ڿΰ༶(��ʦ&�༶)
create table TeacherClass(
  id number(10),  --�߼�����
  teacherId varchar2(10),  --��ʦ����
  classId varchar2(10),  --�༶���
  teachTime date  --�ڿ�ʱ��
);
--ѧ��
create table Student(
  id varchar2(10),  --ѧ��
  name nvarchar2(20),  --ѧ������
  enterTime date,  --��ѧʱ��
  idNumber varchar2(18),  --���֤��
  address nvarchar2(100)  --��ͥסַ
);
--ѧ�����ڰ༶(ѧ��&�༶)
create table InClass(
  id number(10),  --�߼�����
  studentId varchar2(10),  --ѧ��
  classId varchar2(10)  --�༶���
);
--�ɼ�(ѧ��&�γ�)
create table Score(
  id number(10),  --�߼�����
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
  id number(10),  --�߼�����
  userType nvarchar2(20),  --�û�����
  username varchar2(20),  --�û���
  password varchar2(20)  --����
);
--����Ա
create table Manager(
  id number(10),  --�߼�����
  name nvarchar2(20),  --����Ա����
  idNumber varchar2(18),  --���֤��
  address nvarchar2(100)  --��ͥסַ
);
