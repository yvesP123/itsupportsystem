<%-- 
    Document   : config
    Created on : May 5, 2022, 5:55:43 PM
    Author     : claude
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Class.forName("com.mysql.jdbc.Driver");
Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/itsupport","root","");
				
%>
