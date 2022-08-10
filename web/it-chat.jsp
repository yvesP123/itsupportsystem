<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, shrink-to-fit=yes">
    <title>Chat Bot UI/UX & html for web Plugin | Css3 Transition </title>
    <meta name="description" content="Chat Bot UI/UX & html for web" />
    <meta name="keywords" content="Chat Bot UI/UX & html for web, UI/UX for chat bot, chat bot html, best chatbot, chatbot app, online chat bot plugin" />
    <meta name="author" content="css3transition" />
    <link rel="shortcut icon" href="../favicon.ico">
    <meta name="description" content="Chat Bot UI/UX & html for web, UI/UX for chat bot, chat bot html, best chatbot, chatbot app, online chat bot plugin | Css3Transition " />
    <meta name="keywords" content="Chat Bot UI/UX & html for web, UI/UX for chat bot, chat bot html, best chatbot, chatbot app, online chat bot plugin" />
    <meta name="abstract" content="Chat Bot UI/UX & html for web, UI/UX for chat bot, chat bot html, best chatbot, chatbot app, online chat bot plugin">
    <meta name="author" content="Rahul Yaduvanshi">
    <meta name="technologies" content="HTML5, CSS3, HTML, CSS, JQUERY, Bootstrap, Angular">
    <meta name="distribution" content="Global">
    <meta name="development" content="Rahul Yaduvanshi">
    <meta name="robots" content="index, follow">
    <meta name="googlebot" content="index, follow">
    <meta name="city" content="New Delhi">
    <meta name="country" content="india">
    <!-- BEGIN GLOBAL MANDATORY STYLES -->
    <link href="https://fonts.googleapis.com/css?family=Nunito:400,600,700" rel="stylesheet">
    <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="css/main.css" rel="stylesheet" type="text/css" />
    <!-- END GLOBAL MANDATORY STYLES -->
    <link href="css/select2.min.css" rel="stylesheet" type="text/css"/>
    <link href="css/chatBot.css" rel="stylesheet" type="text/css"/>
    <link href="css/timeline.css" rel="stylesheet" type="text/css"/>
    <style>
    @import url('https://fonts.googleapis.com/css2?family=Sriracha&display=swap');

    body {
      margin: 0;
      box-sizing: border-box;
    }

    /* CSS for header */
    .header {
      display: flex;
      justify-content: space-between;
      align-items: center;
      background-color: #f5f5f5;
    }

    .header .logo {
      font-size: 25px;
      font-family: 'Sriracha', cursive;
      color: #00ff00;
      text-decoration: none;
      margin-left: 30px;
    }

    .nav-items {
      display: flex;
      justify-content: space-around;
      align-items: center;
      background-color: #f5f5f5;
      margin-right: 20px;
    }

    .nav-items a {
      text-decoration: none;
      color: #000;
      padding: 35px 20px;
    }

    /* CSS for main element */
    .intro {
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      width: 100%;
      height: 520px;
      background: linear-gradient(to bottom, rgba(0, 0, 0, 0.5) 0%, rgba(0, 0, 0, 0.5) 100%), url("grdn.jpg");
      background-size: cover;
      background-position: center;
      background-repeat: no-repeat;
    }

    .intro h1 {
      font-family: sans-serif;
      font-size: 60px;
      color: #fff;
      font-weight: bold;
      text-transform: uppercase;
      margin: 0;
    }

    .intro p {
      font-size: 20px;
      color: #d1d1d1;
      text-transform: uppercase;
      margin: 20px 0;
    }

    .intro button {
      background-color: #5edaf0;
      color: #000;
      padding: 10px 25px;
      border: none;
      border-radius: 5px;
      font-size: 20px;
      font-weight: bold;
      cursor: pointer;
      box-shadow: 0px 0px 20px rgba(255, 255, 255, 0.4)
    }

    .achievements {
      display: flex;
      justify-content: space-around;
      align-items: center;
      padding: 40px 80px;
    }

    .achievements .work {
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      padding: 0 40px;
    }

    .achievements .work i {
      width: fit-content;
      font-size: 50px;
      color: #333333;
      border-radius: 50%;
      border: 2px solid #333333;
      padding: 12px;
    }

    .achievements .work .work-heading {
      font-size: 20px;
      color: #333333;
      text-transform: uppercase;
      margin: 10px 0;
    }

    .achievements .work .work-text {
      font-size: 15px;
      color: #585858;
      margin: 10px 0;
    }

    .about-me {
      display: flex;
      justify-content: center;
      align-items: center;
      padding: 40px 80px;
      border-top: 2px solid #eeeeee;
    }

    .about-me img {
      width: 500px;
      max-width: 100%;
      height: auto;
      border-radius: 10px;
    }

    .about-me-text h2 {
      font-size: 30px;
      color: #333333;
      text-transform: uppercase;
      margin: 0;
    }

    .about-me-text p {
      font-size: 15px;
      color: #585858;
      margin: 10px 0;
    }

    .bottom-links {
      display: flex;
      justify-content: space-around;
      align-items: center;
      padding: 40px 0;
    }

    .bottom-links .links {
      display: flex;
      flex-direction: column;
      justify-content: center;
      align-items: center;
      padding: 0 40px;
    }

    .bottom-links .links span {
      font-size: 20px;
      color: #fff;
      text-transform: uppercase;
      margin: 10px 0;
    }

    .bottom-links .links a {
      text-decoration: none;
      color: #a1a1a1;
      padding: 10px 20px;
    }
  </style>
</head>
<% 
                                        response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
                                        String user=(String)session.getAttribute("username");
                                        if(user==null){
                                        	
                                        	response.sendRedirect("login.jsp");
                                        }
                                        else {
                                       %>
<body>
   <header class="header">
    <a href="#" class="logo">It Support</a>
    <nav class="nav-items">
      <a href="#">HOME</a>
      <form action="Logout">
      <button class="bottoom-link">Logout</button>
      </form>
      
    </nav>
  </header>
<!-- Chat bot UI start -->
<div class="chat-screen">
    <div class="chat-header">
        <div class="chat-header-title">
            Let's chat? - We're online
        </div>
        <div class="chat-header-option hide">
            <span class="dropdown custom-dropdown">
                <a class="dropdown-toggle" href="#" role="button" id="dropdownMenuLink1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-more-horizontal"><circle cx="12" cy="12" r="1"></circle><circle cx="19" cy="12" r="1"></circle><circle cx="5" cy="12" r="1"></circle></svg>
                </a>
                <div class="dropdown-menu dropdown-menu-right" aria-labelledby="dropdownMenuLink1" style="will-change: transform;">
                    <a class="dropdown-item" href="javascript:void(0);">
                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" viewBox="0 0 24 24" fill="none" stroke="#bc32ef" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-file-text"><path d="M14 2H6a2 2 0 0 0-2 2v16a2 2 0 0 0 2 2h12a2 2 0 0 0 2-2V8z"></path><polyline points="14 2 14 8 20 8"></polyline><line x1="16" y1="13" x2="8" y2="13"></line><line x1="16" y1="17" x2="8" y2="17"></line><polyline points="10 9 9 9 8 9"></polyline></svg>
                        Send Transcriptions
                    </a>
                    <a class="dropdown-item end-chat" href="javascript:void(0);">
                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" viewBox="0 0 24 24" fill="none" stroke="#bc32ef" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-power"><path d="M18.36 6.64a9 9 0 1 1-12.73 0"></path><line x1="12" y1="2" x2="12" y2="12"></line></svg>
                        End Chat
                    </a>
                </div>
            </span>
        </div>
    </div>
    <div class="chat-mail">
        <div class="row">
            <div class="col-md-12 text-center mb-2">
                <p>Hi <strong>${username}</strong>! Start chatting with the next available agent.</p>
            </div>
        </div>
            <%
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
                
            %>
            <% String id=request.getParameter("id");%>
           
            
            
        <div class="row">
           
            <div class="col-md-12">
                <div class="form-group">
                    <input type="text" class="form-control" value="<%=rs.getString("name") %>" disabled>
                </div>
            </div>
            <div class="col-md-12">
                <div class="form-group">
                    <input type="email" class="form-control" value="<%=rs.getString("email") %>" disabled>
                </div>
            </div>
                 <div class="col-md-12">
                <div class="form-group">
                    <input type="text" class="form-control" value="<%=rs.getString("phone") %>" disabled>
                </div>
            </div>
                
           
            <div class="col-md-12">
                <button class="btn btn-primary btn-rounded btn-block">Start Chat</button>
            </div>
           <div class="col-md-12">
               <div class="powered-by">Powered by dalius</div>
           </div>
        </div>
            
    </div>
    <div class="chat-body hide">
       
        <% 
           
             Connection conn1=null;
                
   
      Class.forName("com.mysql.jdbc.Driver");
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/itsupport","root","");

         Statement st1=null;
         String sql1="select * from chat where sender_id='"+id+"'";
         st1=conn.createStatement();
         ResultSet rs1=null;
         rs1=st1.executeQuery(sql1);
         while(rs1.next()){
        %>
        
       
        <div class="chat-bubble me"><%=rs1.getString("message")%></div>
       
         <% } %> 
         
         <% 
             Connection conn2=null;
                
   
      Class.forName("com.mysql.jdbc.Driver");
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/itsupport","root","");
       
         Statement st2=null;
         String sql2="select * from it_reply";
         st2=conn.createStatement();
         ResultSet rs2=null;
         rs2=st2.executeQuery(sql2);
         while(rs2.next()){
        %>
       <div class="chat-bubble you"><%=rs2.getString("message")%></div>
         <div class="chat-start">Monday, 1:27 PM</div>
         <%}%>
    </div>
   
  

     <form action="process.jsp" method="post">           
    <div class="chat-input hide">
        <input type="hidden" name="ii" value="<%=request.getParameter("id")%>">
        <input type="text" name="message" placeholder="Type a message...">
        <div class="input-action-icon">
          
            <button type="submit" class="btn btn-link"><svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-send"><line x1="22" y1="2" x2="11" y2="13"></line><polygon points="22 2 15 22 11 13 2 9 22 2"></polygon></svg></button>
        </div>
    </div>
     </form>
     




    <div class="chat-session-end hide">
        <h5>This chat session has ended</h5>
        <p>Thank you for chatting with us, If you can take a minute and rate this chat:</p>
        <div class="rate-me">
            <div class="rate-bubble great">
                <span><svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="#ffffff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-thumbs-up"><path d="M14 9V5a3 3 0 0 0-3-3l-4 9v11h11.28a2 2 0 0 0 2-1.7l1.38-9a2 2 0 0 0-2-2.3zM7 22H4a2 2 0 0 1-2-2v-7a2 2 0 0 1 2-2h3"></path></svg></span>
                Great
            </div>
            <div class="rate-bubble bad">
                <span><svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" viewBox="0 0 24 24" fill="none" stroke="#ffffff" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-thumbs-down"><path d="M10 15v4a3 3 0 0 0 3 3l4-9V2H5.72a2 2 0 0 0-2 1.7l-1.38 9a2 2 0 0 0 2 2.3zm7-13h2.67A2.31 2.31 0 0 1 22 4v7a2.31 2.31 0 0 1-2.33 2H17"></path></svg></span>
                Bad
            </div>
        </div>
        <a class="transcript-chat">Need a Transcript?</a>
        <div class="powered-by">Powered by css3transition</div>
    </div>
</div>
<div class="chat-bot-icon">
    <img src="img/we-are-here.svg"/>
    <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-message-square animate"><path d="M21 15a2 2 0 0 1-2 2H7l-4 4V5a2 2 0 0 1 2-2h14a2 2 0 0 1 2 2z"></path></svg>
    <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="feather feather-x "><line x1="18" y1="6" x2="6" y2="18"></line><line x1="6" y1="6" x2="18" y2="18"></line></svg>
</div>
<!-- Chat Bot UI Ends -->
<!-- Time line Html Start -->
<h1 class="hide">Responsive Timeline using Flexbox</h1>
<div class="timeline hide">
    <div class="timeline-item">
        <div class="timeline-date">
            <img src="stylesheet/images/cities/delhi.svg"/>
            <div>
                January 2019
            </div>
        </div>
        <div class="timeline-content">
            <h2>Journey Start <span>(Delhi)</span></h2>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ad saepe nulla quibusdam ut. Beatae, facere sequi blanditiis porro suscipit tempore ipsam iste ipsa, culpa quam vero, dolorem cupiditate. Magni, numquam?<button type="button" class="visit">Visit ›</button><img src="stylesheet/images/cities/delhi.svg"/></p>
            <br>
            <i class="fas fa-rocket fa-icon"></i>
        </div>
    </div>

    <div class="timeline-item">
        <div class="timeline-date">
            <img src="stylesheet/images/cities/lucknow.svg"/>
            <div>
                February 2019
            </div>
        </div>
        <div class="timeline-content">
            <h2>Nawabo ka Sehar<span>(Lucknow)</span></h2>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ad saepe nulla quibusdam ut. Beatae, facere sequi blanditiis porro suscipit tempore ipsam iste ipsa, culpa quam vero, dolorem cupiditate. Magni, numquam?<button type="button" class="visit">Visit ›</button><img src="stylesheet/images/cities/lucknow.svg"/></p>

            <br>
            <i class="fas fa-graduation-cap fa-icon"></i>
        </div>
    </div>

    <div class="timeline-item">
        <div class="timeline-date">
            <img src="stylesheet/images/cities/prayagraj.svg"/>
            <div>
                March 2019
            </div>
        </div>
        <div class="timeline-content">
            <h2>Devotional Place<span>(Prayagraj)</span></h2>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ad saepe nulla quibusdam ut. Beatae, facere sequi blanditiis porro suscipit tempore ipsam iste ipsa, culpa quam vero, dolorem cupiditate. Magni, numquam?<button type="button" class="visit">Visit ›</button><img src="stylesheet/images/cities/prayagraj.svg"/></p>

            <br>
            <i class="fas fa-power-off fa-icon"></i>
        </div>
    </div>
</div>
<script type="257be86a981729866f2fa61c-text/javascript">
    (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
          (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
        m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
    })(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

    ga('create', 'UA-83834093-1', 'auto');
    ga('send', 'pageview');

  </script>
<script src="https://ajax.cloudflare.com/cdn-cgi/scripts/7089c43e/cloudflare-static/rocket-loader.min.js" data-cf-settings="257be86a981729866f2fa61c-|49" defer=""></script>
<!-- Time line Html Ends -->
<!-- BEGIN GLOBAL MANDATORY SCRIPTS -->
<script src="js/jquery-3.1.1.min.js"></script>
<script src="js/popper.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/select2.min.js"></script>
 <script>
        $(document).ready(function(){
            $(".select2_el").select2({
            });
        });
        </script>
<script>
    $(document).ready(function () {
        //Toggle fullscreen
        $(".chat-bot-icon").click(function (e) {
            $(this).children('img').toggleClass('hide');
            $(this).children('svg').toggleClass('animate');
            $('.chat-screen').toggleClass('show-chat');
        });
        $('.chat-mail button').click(function () {
            $('.chat-mail').addClass('hide');
            $('.chat-body').removeClass('hide');
            $('.chat-input').removeClass('hide');
            $('.chat-header-option').removeClass('hide');
        });
        $('.end-chat').click(function () {
            $('.chat-body').addClass('hide');
            $('.chat-input').addClass('hide');
            $('.chat-session-end').removeClass('hide');
            $('.chat-header-option').addClass('hide');
        });
    });

</script>
</body>
<%} %>
</html>