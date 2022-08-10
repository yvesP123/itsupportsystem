
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
    <head>

        <title> it support</title>
        <link href="assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/core.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/components.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/icons.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/pages.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/menu.css" rel="stylesheet" type="text/css" />
        <link href="assets/css/responsive.css" rel="stylesheet" type="text/css" />
		<link rel="stylesheet" href="../plugins/switchery/switchery.min.css">
        <script src="assets/js/modernizr.min.js"></script>

    </head>

  <% 
                                        response.setHeader("Cache-control", "no-cache,no-store,must-revalidate");
                                        String user=(String)session.getAttribute("username");
                                        if(user==null){
                                        	
                                        	response.sendRedirect("login.jsp");
                                        }
                                        else {
                                       %>
    <body class="fixed-left">

        <!-- Begin page -->
        <div id="wrapper">

            <!-- Top Bar Start -->
 <%@ include file="includes/topheader.jsp" %>

            <!-- ========== Left Sidebar Start ========== -->
<%@ include file="includes/leftsidebar.jsp" %>
            <!-- Left Sidebar End -->



            <!-- ============================================================== -->
            <!-- Start right Content here -->
            <!-- ============================================================== -->
            <div class="content-page">
                <!-- Start content -->
                <div class="content">
                    <div class="container">


                        <div class="row">
							<div class="col-xs-12">
								<div class="page-title-box">
                                    <h4 class="page-title">Manage User</h4>
                                    <ol class="breadcrumb p-0 m-0">
                                        <li>
                                            <a href="#">Admin</a>
                                        </li>
                                        <li>
                                            <a href="#">User</a>
                                        </li>
                                        <li class="active">
                                           Manage User
                                        </li>
                                    </ol>
                                    <div class="clearfix"></div>
                                </div>
							</div>
						</div>
                        <!-- end row -->


<div class="row">

                                 
                                 
                                    


                                   


                                    <div class="row">
										<div class="col-md-12">
											<div class="demo-box m-t-20">

												<div class="table-responsive">
                                                    <table class="table m-0 table-colored-bordered table-bordered-primary">
                                                        <thead>
                                                            <tr>
                                                                <th>#</th>
                                                                <th> Name</th>
                                                                <th>Email</th>
                                                                <th>Phone</th>
                                                                <th>UserName</th>
                                                                <th>Gender</th>
                                                                  
                                                               
                                                            </tr>
                                                        </thead>
                                                        <tbody>
<%
    
  				

    Connection conn=null;
   
      Class.forName("com.mysql.jdbc.Driver");
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/itsupport","root","");

    Statement st=null;
    ResultSet rs=null;
    String sql="select * from user";
     st=conn.createStatement();
     rs=st.executeQuery(sql);
     while(rs.next()){

%>

 <tr>
     <th scope="row"><%=rs.getString("id")%></th>
<td><%=rs.getString("name")%></td>
<td><%=rs.getString("email")%></td>
<td><%=rs.getString("phone")%></td>
<td><%=rs.getString("username")%></td>
<td><%=rs.getString("gender")%></td>

</tr>
<%}%>
</tbody>
                                                  
                                                    </table>
                                                </div>




											</div>

										</div>

							
									</div>
                                    <!--- end row -->


                                    
                   </div> <!-- container -->

                </div> <!-- content -->
<%@ include file="includes/footer.jsp"  %>
            </div>

        </div>
        <!-- END wrapper -->



        <script>
            var resizefunc = [];
        </script>

        <!-- jQuery  -->
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/bootstrap.min.js"></script>
        <script src="assets/js/detect.js"></script>
        <script src="assets/js/fastclick.js"></script>
        <script src="assets/js/jquery.blockUI.js"></script>
        <script src="assets/js/waves.js"></script>
        <script src="assets/js/jquery.slimscroll.js"></script>
        <script src="assets/js/jquery.scrollTo.min.js"></script>
        <script src="plugins/switchery/switchery.min.js"></script>

        <!-- App js -->
        <script src="assets/js/jquery.core.js"></script>
        <script src="assets/js/jquery.app.js"></script>

    </body>
    <%}%>
</html>

