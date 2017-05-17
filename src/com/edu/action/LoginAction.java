/*
package com.edu.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.edu.pojo.LoginUser;
import com.edu.pojo.Student;
import com.edu.pojo.Teacher;
import com.edu.service.LoginUserService;
import com.edu.service.StudentService;
import com.edu.service.TeacherService;
import com.edu.util.Base64Util;

public class LoginAction implements SessionAware{
	private LoginUserService loginService = new LoginUserService();
	private StudentService stuServ = new StudentService();
	private TeacherService teaServ = new TeacherService();
	private Map<String,Object> session;
	public void login(){
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		String uname = request.getParameter("username");
		String pass = request.getParameter("password");
		String username = new String(Base64Util.decode(uname));
		String password = new String(Base64Util.decode(pass));
		try {
			PrintWriter out = response.getWriter();
			LoginUser user = loginService.check(username, password);
			String msg = "error";
			if(user!=null){
				String usertype= user.getUserType();
				if(usertype.equals("学生")){
					Student stu = stuServ.getStuById(Student.class, username);
					if(stu!=null){
					session.put("user",stu);
					msg="student";
					}
				}else if(usertype.equals("教师")){
					Teacher tea = teaServ.getTeaById(Teacher.class, username);
					if(tea!=null){ 
						session.put("user",tea);
						msg="teacher";
					}
				}else if(usertype.equals("管理员")){
					msg="admin";
				}
			}
			out.print(msg);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
}
*/