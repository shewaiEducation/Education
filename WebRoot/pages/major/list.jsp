<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML>
<html>
  <head>
  	<meta charset="utf-8">
    <title>All of major's info</title>
  </head>
  
  <body>
  
    <a href="majorAction">Click</a>
  
    <h1>Major</h1>
    <table>
      <thead>
        <tr>
          <th>专业编号</th>
          <th>专业所属学院编号</th>
          <th>专业名字</th>
        </tr>
      </thead>
      <tbody>
      <s:iterator var="major" value="majors">
        <tr>
          <td><s:property value="#major.id" /></td>
          <td><s:property value="#major.college.id" /></td>
          <td><s:property value="#major.name" /></td>
        </tr>
      </s:iterator>
      </tbody>
    </table>
    
  </body>
</html>
