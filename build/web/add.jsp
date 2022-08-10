<%-- 
    Document   : add
    Created on : May 5, 2022, 6:07:25 PM
    Author     : claude
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
       Connection conn=null;
   
      Class.forName("com.mysql.jdbc.Driver");
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/itsupport","root","");
String name=request.getParameter("names");
String gender=request.getParameter("gender");
String username=request.getParameter("username");
String password=request.getParameter("password");
String email=request.getParameter("email");
String phone=request.getParameter("phone");
PreparedStatement ps;
String sql="INSERT INTO itspecilist(`name`, `gender`, `username`, `password`, `email`, `phone`)values(?,?,?,?,?,?)";
ps=conn.prepareStatement(sql);
ps.setString(1, name);
ps.setString(2, gender);
ps.setString(3, username);
ps.setString(4, password);
ps.setString(5, email);
ps.setString(6, phone);
int j=ps.executeUpdate();
if(j>0)
{
    out.println("<script>alert('Data has Been Inserted');window.location='add-it.jsp';</script>");
}
else
{
       out.println("<script>alert('Data has not Been Inserted');window.location='add-it.jsp';</script>");
}

%>
