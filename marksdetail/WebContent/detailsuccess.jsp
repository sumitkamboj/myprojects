<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
Details Entered Successfully. you entered following values.<br><br>
Name : <bean:write name= "studentForm" property="name"></bean:write><br><br>
Gender : <bean:write  name="studentForm" property="gender"></bean:write><br><br>
Roll No. : <bean:write  name = "studentForm" property="rollno"></bean:write><br><br>
Age : <bean:write  name="studentForm" property="age"></bean:write><br><br>
Subject : <bean:write  name ="studentForm" property="subject"></bean:write><br><br>
Marks : <bean:write  name ="studentForm" property="marks"></bean:write><br><br>
Maximum Marks : <bean:write  name ="studentForm" property="maxMarks"></bean:write><br><br>
<%-- First_Name : <s:text name= "userinfoform" property="firstName"></s:text><br><br>
Last_Name : <s:text name="userinfoform" property="lastName"></s:text><br><br>
Gender : <s:text name = "userinfoform" property="gender"></s:text><br><br>
Age : <s:text name="userinfoform" property="age"></s:text><br><br>
Address : <s:text name ="userinfoform" property="address"></s:text><br><br> --%>
</body>
</html>