<%@ page contentType="text/html" language="java" import="java.sql.*"%> 
<jsp:useBean id="con" class="lf.DBConnection"/> 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html> 
<head> 
   <title>Connection test</title> 
</head> 
<body> 
    <h1>Below are connection test results using DataSource thru JNDI</h1> 
     
    <jsp:getProperty name="con" property="situation"/> 
   	   
   	   <table>
   	   
     	  <tr>
           <td>STUDENT ID</td>
           <td>STUDENT NAME</td>
        </tr>
     	   
     	   
     	  <% 
           con.setSearch ( );
    	     ResultSet res = con.getResult();  	     
       	   while(res.next()) { 
     	  %>

        <tr>
           <td><%=res.getInt(1)%></td>
           <td><%=res.getString(2)%></td>
        </tr>
        <% 
           } 
        %>
   	   
       </table>
   	   
</body>
</html>      