
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    String message=request.getParameter("message");
    request.getSession(false);
    String username=(String)session.getAttribute("username");
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn=null;
    conn=DriverManager.getConnection(url,user,pass);
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    st=conn.createStatement();
    String sql1="select * from user";
    rs=st.executeQuery(sql1);
    rs.next();
    String userid=rs.getString("id");
    int uid=Integer.parseInt(userid);
    rs=st.executeQuery(sql1);
    String sql="INSERT INTO chat(send_name,message,sender_id)values(?,?,?)";
    ps=conn.prepareStatement(sql);
    ps.setString(1, username);
    ps.setString(2, message);
    ps.setInt(3, uid);
   
    int i=ps.executeUpdate();
    if(i>0)
    {
        out.println("<script>alert('data inserted');window.location='user.jsp';</script>");
    }
    else
    {
         out.println("<script>alert('data not inserted');window.location='user.jsp';</script>");
        
    }
    
    
%>


