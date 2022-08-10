 <%@ page import="java.sql.*" %>
   <%
     
    String urls="jdbc:mysql://localhost:3306/itsupport";
    
    String passs="";
    String users="root";
    String message=request.getParameter("message");
    
     String ii=request.getParameter("ii");
    Connection conn3=null;
    conn3=DriverManager.getConnection(urls,users,passs);
    PreparedStatement ps3;
    Statement st6;
    ResultSet rs6;
    st6=conn3.createStatement();
     request.getSession(false);
    String usernamess=(String)session.getAttribute("username");
   
    String sql6="select * from itspecilist where username='"+usernamess+"'";
    rs6=st6.executeQuery(sql6);
    rs6.next();
    String email1=rs6.getString("email");
    String phone11=rs6.getString("phone");
    
    String userid=rs6.getString("id");
  
    String sq4="INSERT INTO it_reply(username,email,phone,message,reply_id)values(?,?,?,?,?)";
    ps3=conn3.prepareStatement(sq4);
    ps3.setString(1, usernamess);
     ps3.setString(2, email1);
     ps3.setString(3, phone11);
     ps3.setString(4, message);
    ps3.setString(5, ii);
  
   
    int i=ps3.executeUpdate();
    if(i>0)
    {
        out.println("<script>alert('data inserted');window.location='it-chat.jsp';</script>");
    }
    else
    {
         out.println("<script>alert('data not inserted');window.location='it-chat.jsp';</script>");
        
    }
    
    
%>
