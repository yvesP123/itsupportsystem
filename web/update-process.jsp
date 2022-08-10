<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<% String driverName = "com.mysql.jdbc.Driver";%>
<%String url = "jdbc:mysql://localhost:3306/itsupport";%>
<%String user = "root";%>
<%String psw = "";%>
<%
    String id=request.getParameter("id");
String name=request.getParameter("name");
    String username=request.getParameter("username");
    String phone=request.getParameter("phone");
    String gender=request.getParameter("gender");
if(name != null)
{
Connection con = null;
PreparedStatement ps = null;
int pid = Integer.parseInt(id);
try
{
Class.forName(driverName);
con = DriverManager.getConnection(url,user,psw);
String sql="UPDATE itspecilist set name=?,gender=?,username=?,phone=? where id="+id;
ps = con.prepareStatement(sql);
ps.setString(1, name);
ps.setString(2, gender);
ps.setString(3, username);
ps.setString(4, phone);
int i = ps.executeUpdate();
if(i > 0)
{
  out.println("<script>alert('Data Updated');window.location='manage-it.jsp';</script>");
}
else
{
  out.println("<script>alert('Data not updated');window.location='manage-it.jsp';</script>");
}
}
catch(SQLException sql)
{
request.setAttribute("error", sql);
out.println(sql);
}
}
%>