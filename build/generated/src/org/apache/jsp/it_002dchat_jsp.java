package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class it_002dchat_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1, shrink-to-fit=yes\">\n");
      out.write("    <title>Chat Bot UI/UX & html for web Plugin | Css3 Transition </title>\n");
      out.write("    <meta name=\"description\" content=\"Chat Bot UI/UX & html for web\" />\n");
      out.write("    <meta name=\"keywords\" content=\"Chat Bot UI/UX & html for web, UI/UX for chat bot, chat bot html, best chatbot, chatbot app, online chat bot plugin\" />\n");
      out.write("    <meta name=\"author\" content=\"css3transition\" />\n");
      out.write("    <link rel=\"shortcut icon\" href=\"../favicon.ico\">\n");
      out.write("    <meta name=\"description\" content=\"Chat Bot UI/UX & html for web, UI/UX for chat bot, chat bot html, best chatbot, chatbot app, online chat bot plugin | Css3Transition \" />\n");
      out.write("    <meta name=\"keywords\" content=\"Chat Bot UI/UX & html for web, UI/UX for chat bot, chat bot html, best chatbot, chatbot app, online chat bot plugin\" />\n");
      out.write("    <meta name=\"abstract\" content=\"Chat Bot UI/UX & html for web, UI/UX for chat bot, chat bot html, best chatbot, chatbot app, online chat bot plugin\">\n");
      out.write("    <meta name=\"author\" content=\"Rahul Yaduvanshi\">\n");
      out.write("    <meta name=\"technologies\" content=\"HTML5, CSS3, HTML, CSS, JQUERY, Bootstrap, Angular\">\n");
      out.write("    <meta name=\"distribution\" content=\"Global\">\n");
      out.write("    <meta name=\"development\" content=\"Rahul Yaduvanshi\">\n");
      out.write("    <meta name=\"robots\" content=\"index, follow\">\n");
      out.write("    <meta name=\"googlebot\" content=\"index, follow\">\n");
      out.write("    <meta name=\"city\" content=\"New Delhi\">\n");
      out.write("    <meta name=\"country\" content=\"india\">\n");
      out.write("    <!-- BEGIN GLOBAL MANDATORY STYLES -->\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Nunito:400,600,700\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <link href=\"css/main.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    <!-- END GLOBAL MANDATORY STYLES -->\n");
      out.write("    <link href=\"css/select2.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"css/chatBot.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <link href=\"css/timeline.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <style>\n");
      out.write("    @import url('https://fonts.googleapis.com/css2?family=Sriracha&display=swap');\n");
      out.write("\n");
      out.write("    body {\n");
      out.write("      margin: 0;\n");
      out.write("      box-sizing: border-box;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* CSS for header */\n");
      out.write("    .header {\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: space-between;\n");
      out.write("      align-items: center;\n");
      out.write("      background-color: #f5f5f5;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .header .logo {\n");
      out.write("      font-size: 25px;\n");
      out.write("      font-family: 'Sriracha', cursive;\n");
      out.write("      color: #00ff00;\n");
      out.write("      text-decoration: none;\n");
      out.write("      margin-left: 30px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .nav-items {\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: space-around;\n");
      out.write("      align-items: center;\n");
      out.write("      background-color: #f5f5f5;\n");
      out.write("      margin-right: 20px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .nav-items a {\n");
      out.write("      text-decoration: none;\n");
      out.write("      color: #000;\n");
      out.write("      padding: 35px 20px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /* CSS for main element */\n");
      out.write("    .intro {\n");
      out.write("      display: flex;\n");
      out.write("      flex-direction: column;\n");
      out.write("      justify-content: center;\n");
      out.write("      align-items: center;\n");
      out.write("      width: 100%;\n");
      out.write("      height: 520px;\n");
      out.write("      background: linear-gradient(to bottom, rgba(0, 0, 0, 0.5) 0%, rgba(0, 0, 0, 0.5) 100%), url(\"grdn.jpg\");\n");
      out.write("      background-size: cover;\n");
      out.write("      background-position: center;\n");
      out.write("      background-repeat: no-repeat;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .intro h1 {\n");
      out.write("      font-family: sans-serif;\n");
      out.write("      font-size: 60px;\n");
      out.write("      color: #fff;\n");
      out.write("      font-weight: bold;\n");
      out.write("      text-transform: uppercase;\n");
      out.write("      margin: 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .intro p {\n");
      out.write("      font-size: 20px;\n");
      out.write("      color: #d1d1d1;\n");
      out.write("      text-transform: uppercase;\n");
      out.write("      margin: 20px 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .intro button {\n");
      out.write("      background-color: #5edaf0;\n");
      out.write("      color: #000;\n");
      out.write("      padding: 10px 25px;\n");
      out.write("      border: none;\n");
      out.write("      border-radius: 5px;\n");
      out.write("      font-size: 20px;\n");
      out.write("      font-weight: bold;\n");
      out.write("      cursor: pointer;\n");
      out.write("      box-shadow: 0px 0px 20px rgba(255, 255, 255, 0.4)\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .achievements {\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: space-around;\n");
      out.write("      align-items: center;\n");
      out.write("      padding: 40px 80px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .achievements .work {\n");
      out.write("      display: flex;\n");
      out.write("      flex-direction: column;\n");
      out.write("      justify-content: center;\n");
      out.write("      align-items: center;\n");
      out.write("      padding: 0 40px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .achievements .work i {\n");
      out.write("      width: fit-content;\n");
      out.write("      font-size: 50px;\n");
      out.write("      color: #333333;\n");
      out.write("      border-radius: 50%;\n");
      out.write("      border: 2px solid #333333;\n");
      out.write("      padding: 12px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .achievements .work .work-heading {\n");
      out.write("      font-size: 20px;\n");
      out.write("      color: #333333;\n");
      out.write("      text-transform: uppercase;\n");
      out.write("      margin: 10px 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .achievements .work .work-text {\n");
      out.write("      font-size: 15px;\n");
      out.write("      color: #585858;\n");
      out.write("      margin: 10px 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .about-me {\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: center;\n");
      out.write("      align-items: center;\n");
      out.write("      padding: 40px 80px;\n");
      out.write("      border-top: 2px solid #eeeeee;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .about-me img {\n");
      out.write("      width: 500px;\n");
      out.write("      max-width: 100%;\n");
      out.write("      height: auto;\n");
      out.write("      border-radius: 10px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .about-me-text h2 {\n");
      out.write("      font-size: 30px;\n");
      out.write("      color: #333333;\n");
      out.write("      text-transform: uppercase;\n");
      out.write("      margin: 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .about-me-text p {\n");
      out.write("      font-size: 15px;\n");
      out.write("      color: #585858;\n");
      out.write("      margin: 10px 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .bottom-links {\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: space-around;\n");
      out.write("      align-items: center;\n");
      out.write("      padding: 40px 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .bottom-links .links {\n");
      out.write("      display: flex;\n");
      out.write("      flex-direction: column;\n");
      out.write("      justify-content: center;\n");
      out.write("      align-items: center;\n");
      out.write("      padding: 0 40px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .bottom-links .links span {\n");
      out.write("      font-size: 20px;\n");
      out.write("      color: #fff;\n");
      out.write("      text-transform: uppercase;\n");
      out.write("      margin: 10px 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .bottom-links .links a {\n");
      out.write("      text-decoration: none;\n");
      out.write("      color: #a1a1a1;\n");
      out.write("      padding: 10px 20px;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("</head>\n");
 
                                        response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
                                        String user=(String)session.getAttribute("username");
                                        if(user==null){
                                        	
                                        	response.sendRedirect("login.jsp");
                                        }
                                        else {
                                       
      out.write("\n");
      out.write("<body>\n");
      out.write("   <header class=\"header\">\n");
      out.write("    <a href=\"#\" class=\"logo\">It Support</a>\n");
      out.write("    <nav class=\"nav-items\">\n");
      out.write("      <a href=\"#\">HOME</a>\n");
      out.write("      <form action=\"Logout\">\n");
      out.write("      <button class=\"bottoom-link\">Logout</button>\n");
      out.write("      </form>\n");
      out.write("      \n");
      out.write("    </nav>\n");
      out.write("  </header>\n");
      out.write("<!-- Chat bot UI start -->\n");
      out.write("<div class=\"chat-screen\">\n");
      out.write("    <div class=\"chat-header\">\n");
      out.write("        <div class=\"chat-header-title\">\n");
      out.write("            Let's chat? - We're online\n");
      out.write("        </div>\n");
      out.write("        <div class=\"chat-header-option hide\">\n");
      out.write("            <span class=\"dropdown custom-dropdown\">\n");
      out.write("                <a class=\"dropdown-toggle\" href=\"#\" role=\"button\" id=\"dropdownMenuLink1\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-more-horizontal\"><circle cx=\"12\" cy=\"12\" r=\"1\"></circle><circle cx=\"19\" cy=\"12\" r=\"1\"></circle><circle cx=\"5\" cy=\"12\" r=\"1\"></circle></svg>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"dropdownMenuLink1\" style=\"will-change: transform;\">\n");
      out.write("                    <a class=\"dropdown-item\" href=\"javascript:void(0);\">\n");
      out.write("                        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"#bc32ef\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-file-text\"><path d=\"M14 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V8z\"></path><polyline points=\"14 2 14 8 20 8\"></polyline><line x1=\"16\" y1=\"13\" x2=\"8\" y2=\"13\"></line><line x1=\"16\" y1=\"17\" x2=\"8\" y2=\"17\"></line><polyline points=\"10 9 9 9 8 9\"></polyline></svg>\n");
      out.write("                        Send Transcriptions\n");
      out.write("                    </a>\n");
      out.write("                    <a class=\"dropdown-item end-chat\" href=\"javascript:void(0);\">\n");
      out.write("                        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"16\" height=\"16\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"#bc32ef\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-power\"><path d=\"M18.36 6.64a9 9 0 1 1-12.73 0\"></path><line x1=\"12\" y1=\"2\" x2=\"12\" y2=\"12\"></line></svg>\n");
      out.write("                        End Chat\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </span>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"chat-mail\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-12 text-center mb-2\">\n");
      out.write("                <p>Hi <strong>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</strong>! Start chatting with the next available agent.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("            ");

                Connection conn=null;
                
   
      Class.forName("com.mysql.jdbc.Driver");
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/itsupport","root","");

    Statement st=null;
    ResultSet rs=null;
    
    request.getSession(false);
    String username=(String)session.getAttribute("username");
    String sql="select * from itspecilist where username='"+username+"'";
     st=conn.createStatement();
     rs=st.executeQuery(sql);
     rs.next();
     String email=rs.getString("email");
     String phone=rs.getString("name");
     String phones=rs.getString("phone");
                
            
      out.write("\n");
      out.write("            \n");
      out.write("        <div class=\"row\">\n");
      out.write("           \n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" value=\"");
      out.print(rs.getString("name") );
      out.write("\" disabled>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"email\" class=\"form-control\" value=\"");
      out.print(rs.getString("email") );
      out.write("\" disabled>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                 <div class=\"col-md-12\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" value=\"");
      out.print(rs.getString("phone") );
      out.write("\" disabled>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                \n");
      out.write("           \n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("                <button class=\"btn btn-primary btn-rounded btn-block\">Start Chat</button>\n");
      out.write("            </div>\n");
      out.write("           <div class=\"col-md-12\">\n");
      out.write("               <div class=\"powered-by\">Powered by dalius</div>\n");
      out.write("           </div>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("    </div>\n");
      out.write("    <div class=\"chat-body hide\">\n");
      out.write("       \n");
      out.write("        ");
 
             Connection conn1=null;
                
   
      Class.forName("com.mysql.jdbc.Driver");
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/itsupport","root","");

         Statement st1=null;
         String sql1="select * from chat";
         st1=conn.createStatement();
         ResultSet rs1=null;
         rs1=st1.executeQuery(sql1);
         while(rs1.next()){
        
      out.write("\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <div class=\"chat-bubble me\">");
      out.print(rs1.getString("message"));
      out.write("</div>\n");
      out.write("       \n");
      out.write("         ");
 } 
      out.write(" \n");
      out.write("         \n");
      out.write("         ");
 
             Connection conn2=null;
                
   
      Class.forName("com.mysql.jdbc.Driver");
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/itsupport","root","");
        String id=request.getParameter("id");
         Statement st2=null;
         String sql2="select * from it_reply";
         st2=conn.createStatement();
         ResultSet rs2=null;
         rs2=st2.executeQuery(sql2);
         while(rs2.next()){
        
      out.write("\n");
      out.write("       <div class=\"chat-bubble you\">");
      out.print(rs2.getString("message"));
      out.write("</div>\n");
      out.write("         <div class=\"chat-start\">Monday, 1:27 PM</div>\n");
      out.write("         ");
}
      out.write("\n");
      out.write("    </div>\n");
      out.write("       \n");
      out.write("\n");
      out.write("     <form action=\"\" method=\"post\">           \n");
      out.write("    <div class=\"chat-input hide\">\n");
      out.write("        <input type=\"text\" name=\"message\" placeholder=\"Type a message...\">\n");
      out.write("        <div class=\"input-action-icon\">\n");
      out.write("          \n");
      out.write("            <button type=\"submit\" class=\"btn btn-link\"><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-send\"><line x1=\"22\" y1=\"2\" x2=\"11\" y2=\"13\"></line><polygon points=\"22 2 15 22 11 13 2 9 22 2\"></polygon></svg></button>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("     </form>\n");
      out.write("      ");

    String urls="jdbc:mysql://localhost:3306/itsupport";
    
    String passs="";
    String users="root";
    String message=request.getParameter("message");
    
    
    Connection conn3=null;
    conn=DriverManager.getConnection(urls,users,passs);
    PreparedStatement ps3;
    Statement st6;
    ResultSet rs6;
    st6=conn.createStatement();
     request.getSession(false);
    String usernamess=(String)session.getAttribute("username");
   
    String sql6="select * from itspecilist where username='"+usernamess+"'";
    rs6=st6.executeQuery(sql1);
    rs6.next();
    String email1=rs.getString("email");
    String phone11=rs.getString("phone");
    
    String userid=rs.getString("id");
   String id2=request.getParameter("id");
   int r_id=Integer.parseInt(id);
    String sq4="INSERT INTO it_reply(username,email,phone,message,reply_id)values(?,?,?,?,?)";
    ps3=conn3.prepareStatement(sq4);
    ps3.setString(1, usernamess);
     ps3.setString(2, email1);
     ps3.setString(3, phone11);
     ps3.setString(4, message);
    ps3.setInt(5, r_id);
  
   
    int i=ps3.executeUpdate();
    if(i>0)
    {
        out.println("<script>alert('data inserted');window.location='it-chat.jsp';</script>");
    }
    else
    {
         out.println("<script>alert('data not inserted');window.location='it-chat.jsp';</script>");
        
    }
    
    

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"chat-session-end hide\">\n");
      out.write("        <h5>This chat session has ended</h5>\n");
      out.write("        <p>Thank you for chatting with us, If you can take a minute and rate this chat:</p>\n");
      out.write("        <div class=\"rate-me\">\n");
      out.write("            <div class=\"rate-bubble great\">\n");
      out.write("                <span><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"20\" height=\"20\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"#ffffff\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-thumbs-up\"><path d=\"M14 9V5a3 3 0 0 0-3-3l-4 9v11h11.28a2 2 0 0 0 2-1.7l1.38-9a2 2 0 0 0-2-2.3zM7 22H4a2 2 0 0 1-2-2v-7a2 2 0 0 1 2-2h3\"></path></svg></span>\n");
      out.write("                Great\n");
      out.write("            </div>\n");
      out.write("            <div class=\"rate-bubble bad\">\n");
      out.write("                <span><svg xmlns=\"http://www.w3.org/2000/svg\" width=\"20\" height=\"20\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"#ffffff\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-thumbs-down\"><path d=\"M10 15v4a3 3 0 0 0 3 3l4-9V2H5.72a2 2 0 0 0-2 1.7l-1.38 9a2 2 0 0 0 2 2.3zm7-13h2.67A2.31 2.31 0 0 1 22 4v7a2.31 2.31 0 0 1-2.33 2H17\"></path></svg></span>\n");
      out.write("                Bad\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <a class=\"transcript-chat\">Need a Transcript?</a>\n");
      out.write("        <div class=\"powered-by\">Powered by css3transition</div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"chat-bot-icon\">\n");
      out.write("    <img src=\"img/we-are-here.svg\"/>\n");
      out.write("    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-message-square animate\"><path d=\"M21 15a2 2 0 0 1-2 2H7l-4 4V5a2 2 0 0 1 2-2h14a2 2 0 0 1 2 2z\"></path></svg>\n");
      out.write("    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"24\" height=\"24\" viewBox=\"0 0 24 24\" fill=\"none\" stroke=\"currentColor\" stroke-width=\"2\" stroke-linecap=\"round\" stroke-linejoin=\"round\" class=\"feather feather-x \"><line x1=\"18\" y1=\"6\" x2=\"6\" y2=\"18\"></line><line x1=\"6\" y1=\"6\" x2=\"18\" y2=\"18\"></line></svg>\n");
      out.write("</div>\n");
      out.write("<!-- Chat Bot UI Ends -->\n");
      out.write("<!-- Time line Html Start -->\n");
      out.write("<h1 class=\"hide\">Responsive Timeline using Flexbox</h1>\n");
      out.write("<div class=\"timeline hide\">\n");
      out.write("    <div class=\"timeline-item\">\n");
      out.write("        <div class=\"timeline-date\">\n");
      out.write("            <img src=\"stylesheet/images/cities/delhi.svg\"/>\n");
      out.write("            <div>\n");
      out.write("                January 2019\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"timeline-content\">\n");
      out.write("            <h2>Journey Start <span>(Delhi)</span></h2>\n");
      out.write("            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ad saepe nulla quibusdam ut. Beatae, facere sequi blanditiis porro suscipit tempore ipsam iste ipsa, culpa quam vero, dolorem cupiditate. Magni, numquam?<button type=\"button\" class=\"visit\">Visit âº</button><img src=\"stylesheet/images/cities/delhi.svg\"/></p>\n");
      out.write("            <br>\n");
      out.write("            <i class=\"fas fa-rocket fa-icon\"></i>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"timeline-item\">\n");
      out.write("        <div class=\"timeline-date\">\n");
      out.write("            <img src=\"stylesheet/images/cities/lucknow.svg\"/>\n");
      out.write("            <div>\n");
      out.write("                February 2019\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"timeline-content\">\n");
      out.write("            <h2>Nawabo ka Sehar<span>(Lucknow)</span></h2>\n");
      out.write("            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ad saepe nulla quibusdam ut. Beatae, facere sequi blanditiis porro suscipit tempore ipsam iste ipsa, culpa quam vero, dolorem cupiditate. Magni, numquam?<button type=\"button\" class=\"visit\">Visit âº</button><img src=\"stylesheet/images/cities/lucknow.svg\"/></p>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <i class=\"fas fa-graduation-cap fa-icon\"></i>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"timeline-item\">\n");
      out.write("        <div class=\"timeline-date\">\n");
      out.write("            <img src=\"stylesheet/images/cities/prayagraj.svg\"/>\n");
      out.write("            <div>\n");
      out.write("                March 2019\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"timeline-content\">\n");
      out.write("            <h2>Devotional Place<span>(Prayagraj)</span></h2>\n");
      out.write("            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ad saepe nulla quibusdam ut. Beatae, facere sequi blanditiis porro suscipit tempore ipsam iste ipsa, culpa quam vero, dolorem cupiditate. Magni, numquam?<button type=\"button\" class=\"visit\">Visit âº</button><img src=\"stylesheet/images/cities/prayagraj.svg\"/></p>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <i class=\"fas fa-power-off fa-icon\"></i>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<script type=\"257be86a981729866f2fa61c-text/javascript\">\n");
      out.write("    (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){\n");
      out.write("          (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),\n");
      out.write("        m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)\n");
      out.write("    })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');\n");
      out.write("\n");
      out.write("    ga('create', 'UA-83834093-1', 'auto');\n");
      out.write("    ga('send', 'pageview');\n");
      out.write("\n");
      out.write("  </script>\n");
      out.write("<script src=\"https://ajax.cloudflare.com/cdn-cgi/scripts/7089c43e/cloudflare-static/rocket-loader.min.js\" data-cf-settings=\"257be86a981729866f2fa61c-|49\" defer=\"\"></script>\n");
      out.write("<!-- Time line Html Ends -->\n");
      out.write("<!-- BEGIN GLOBAL MANDATORY SCRIPTS -->\n");
      out.write("<script src=\"js/jquery-3.1.1.min.js\"></script>\n");
      out.write("<script src=\"js/popper.min.js\"></script>\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"js/select2.min.js\"></script>\n");
      out.write(" <script>\n");
      out.write("        $(document).ready(function(){\n");
      out.write("            $(\".select2_el\").select2({\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("        </script>\n");
      out.write("<script>\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        //Toggle fullscreen\n");
      out.write("        $(\".chat-bot-icon\").click(function (e) {\n");
      out.write("            $(this).children('img').toggleClass('hide');\n");
      out.write("            $(this).children('svg').toggleClass('animate');\n");
      out.write("            $('.chat-screen').toggleClass('show-chat');\n");
      out.write("        });\n");
      out.write("        $('.chat-mail button').click(function () {\n");
      out.write("            $('.chat-mail').addClass('hide');\n");
      out.write("            $('.chat-body').removeClass('hide');\n");
      out.write("            $('.chat-input').removeClass('hide');\n");
      out.write("            $('.chat-header-option').removeClass('hide');\n");
      out.write("        });\n");
      out.write("        $('.end-chat').click(function () {\n");
      out.write("            $('.chat-body').addClass('hide');\n");
      out.write("            $('.chat-input').addClass('hide');\n");
      out.write("            $('.chat-session-end').removeClass('hide');\n");
      out.write("            $('.chat-header-option').addClass('hide');\n");
      out.write("        });\n");
      out.write("    });\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</body>\n");
} 
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
