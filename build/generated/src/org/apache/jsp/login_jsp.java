package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Login</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"dist/css/adminlte.min.css\">\n");
      out.write("      <!-- jQuery UI 1.11.4 -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/jquery-ui/jquery-ui.min.css\">\n");
      out.write("    <script src=\"plugins/jquery/jquery.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"dist/css/style.css\">\n");
      out.write("    <!-- Toastr -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"plugins/toastr/toastr.min.css\">\n");
      out.write("  <style>\n");
      out.write("      #span-error{\n");
      out.write("          color:red;\n");
      out.write("          font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;\n");
      out.write("          font-size:14px;       \n");
      out.write("          font-style: italic;  \n");
      out.write("\n");
      out.write("      }\n");
      out.write("      .error{\n");
      out.write("    margin:5px 7px;\n");
      out.write("    padding:12px 15px;\n");
      out.write("    border: 3px 2px;\n");
      out.write("    border-radius: 9px;\n");
      out.write("    box-shadow: 0 5px 6px rgba(139, 139, 139, 0.25), 0 3px 5px rgba(83, 83, 83, 0.22);\n");
      out.write("    min-width: 100%;\n");
      out.write("    border-left:red;\n");
      out.write("}\n");
      out.write("  </style>\n");
      out.write("</head>\n");
      out.write("<body id=\"body\">\n");
      out.write("  <div class=\"container\" id=\"container\">\n");
      out.write("      <div class=\"form-container sign-up-container\">\n");
      out.write("          <form action=\"#\">\n");
      out.write("              <h1>Create Account</h1>\n");
      out.write("              <input type=\"text\" name=\"username\" id=\"login_username\" placeholder=\"Enter the username\">\n");
      out.write("              <input type=\"password\" name=\"password\" id=\"login_password\" placeholder=\"Enter the password\">\n");
      out.write("              <button class=\"btn btn-info\">Sign Up</button>\n");
      out.write("\n");
      out.write("          </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-container sign-in-container\">\n");
      out.write("        <form action=\"login.php\" method=\"POST\" id=\"form\">\n");
      out.write("            <h1>Sign In</h1>\n");
      out.write("            <div class=\"error\" style=\"display:none;\"><span id=\"span-error\"> Invalid credentials </span></div>\n");
      out.write("            <input type=\"text\" name=\"username\" id=\"userName\" placeholder=\"Enter the username\" required>\n");
      out.write("            <input type=\"password\" name=\"password\" id=\"passWord\" placeholder=\"Enter the password\" required>\n");
      out.write("            <a href=\"#\">Forgot password</a>\n");
      out.write("            <button class=\" btn btn-info\" id=\"signInBtn\">Sign In</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"overlay-container\">\n");
      out.write("        <div class=\"overlay\">\n");
      out.write("            <div class=\"overlay-panel overlay-left\">\n");
      out.write("                <h1>Welcome Back</h1>\n");
      out.write("                <p>\n");
      out.write("                    To Keep Using SMS please login with your credentials.\n");
      out.write("                </p>\n");
      out.write("                <button class=\"ghost\" id=\"signIn\">Sign In</button>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"overlay-panel overlay-right\">\n");
      out.write("                <h1>Welcome Back</h1>\n");
      out.write("                <p>\n");
      out.write("                    To Keep Using SMS please login with your credentials.\n");
      out.write("                </p>\n");
      out.write("          <!--      <button class=\"ghost\" id=\"signUp\">Sign Up</button> -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("<script>\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<script src=\"dist/js/loginScript.js\"></script>\n");
      out.write("<script src=\"plugins/jquery/jquery.min.js\"></script>\n");
      out.write("<!-- jQuery UI 1.11.4 -->\n");
      out.write("<script src=\"plugins/jquery-ui/jquery-ui.min.js\"></script>\n");
      out.write("</body>\n");
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
