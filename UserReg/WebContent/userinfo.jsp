<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://struts.apache.org/tags-html" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="/userregister">
First_Name : <s:text name= "userinfoform" property="firstName"></s:text><br><br>
Last_Name : <s:text name="userinfoform" property="lastName"></s:text><br><br>
Gender : <s:text name = "userinfoform" property="gender"></s:text><br><br>
Age : <s:text name="userinfoform" property="age"></s:text><br><br>
Address : <s:text name ="userinfoform" property="address"></s:text><br><br>
<s:submit value="Create User"></s:submit>
<s:reset value="Reset"></s:reset>
</s:form>
<a href="/UserReg/fetchdata.do"><input type = "button" value="Get Data"/></a>
</body>
</html>