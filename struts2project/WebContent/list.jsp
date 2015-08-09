<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html> --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.mps.dao.*"%>
 
   <%
	 DBConnection dbcon = new DBConnection();
  
   try{
     System.out.println("hello");
	   String s[]=null;
	   Connection con=null;
     Class.forName("com.mysql.jdbc.Driver");
     //Connection con =DriverManager.getConnection("jdbc:mysql://localhost/pubstats_live","root","root");
     con = dbcon.getConnection();
     Statement st=con.createStatement();
     ResultSet rs = st.executeQuery("select institution_name from accounts");
 
       List li = new ArrayList();
 
       while(rs.next())
       {
    	   System.out.println(rs.getString(1));
           li.add(rs.getString(1));
       }
 
       String[] str = new String[li.size()];
       Iterator it = li.iterator();
 
       int i = 0;
       while(it.hasNext())
       {
           String p = (String)it.next();
           str[i] = p;
           i++;
       }
 
    //jQuery related start
       String query = (String)request.getParameter("q");
 
       int cnt=1;
       for(int j=0;j<str.length;j++)
       {
           if(str[j].toUpperCase().startsWith(query.toUpperCase()))
           {
              out.print(str[j]+"\n");
              if(cnt>=5)// 5=How many results have to show while we are typing(auto suggestions)
              break;
              cnt++;
            }
       }
    //jQuery related end
 
rs.close();
st.close();
con.close();
 
}
catch(Exception e){
e.printStackTrace();
} 
//www.java4s.com
%>