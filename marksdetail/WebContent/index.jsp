<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://struts.apache.org/tags-html" prefix="s" %>
  <%@ taglib uri="http://struts.apache.org/tags-html" prefix="s" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="/studentregister">
Student Name : <s:text name= "studentForm" property="name"></s:text><br><br>
Gender : <s:text name="studentForm" property="gender"></s:text><br><br>
Roll No : <s:text name = "studentForm" property="rollno"></s:text><br><br>
Age : <s:text name="studentForm" property="age"></s:text><br><br>
Subject : <s:text name ="studentForm" property="subject"></s:text><br><br>
Marks : <s:text name ="studentForm" property="marks"></s:text><br><br>
Maximum Marks : <s:text name ="studentForm" property="maxMarks"></s:text><br><br>
<s:submit value="Submit Detail"></s:submit>
<s:reset value="Reset"></s:reset>
</s:form>
<s:form action="/getbyrollno">
Enter Roll No : <s:text name="studentData" property="rollno"></s:text><br><br>
<s:submit value="Enter"></s:submit>
</s:form>
<s:form action="/updatemarks">
Enter Roll No : <s:text name="updateMarks" property="rollno"></s:text><br><br>
Enter Marks : <s:text name="updateMarks" property="marks"></s:text>
<s:submit value="Update Marks"></s:submit>
</s:form>
<a href="studentdata.do"><input type = "button" value="Get All Student Detail"/></a>
</body>
</html>