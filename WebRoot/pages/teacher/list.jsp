<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML>
<html>
  <head>
  	<meta charset="utf-8">
    <title>All of teacher's info</title>
  </head>
  
  <body>
  
    <a href="teacherAction_typelist">Click</a>
  
    <h1>TeacherType</h1>
    <table border="1">
      <thead>
        <tr>
          <th>教师类型</th>
        </tr>
      </thead>
	  <s:iterator var="type" value="types">
        <tr>
          <td><s:property value="#type.type" /></td>
        </tr>
      </s:iterator>
      </tbody>
    </table>
    
  </body>
</html>
