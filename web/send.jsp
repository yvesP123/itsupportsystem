     <%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%
    String url="jdbc:mysql://localhost:3306/itsupport";
    String user="root";
    String pass="";
    String name=request.getParameter("name");
    String email=request.getParameter("email");
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    String phone=request.getParameter("phone");
    String gender=request.getParameter("gender");
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn=null;
    conn=DriverManager.getConnection(url,user,pass);
    PreparedStatement ps;
    String sql="INSERT INTO user(name,email,username,password,phone,gender)values(?,?,?,?,?,?)";
    ps=conn.prepareStatement(sql);
    ps.setString(1, name);
    ps.setString(2, email);
    ps.setString(3, username);
    ps.setString(4, password);
    ps.setString(5, phone);
    ps.setString(6,gender);
    int i=ps.executeUpdate();
    if(i>0)
    {
        out.println("<script>alert('data inserted');window.location='login.jsp';</script>");
    }
    else
    {
         out.println("<script>alert('data not inserted');</script>");
        
    }
    
    
%>
