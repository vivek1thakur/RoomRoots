package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signUp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Login Page</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <script src=\"https://kit.fontawesome.com/6f0ede3b10.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"slstyle.css\">\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("    background-color:  #e8f0fe;\n");
      out.write("    font-family: 'Roboto', sans-serif;\n");
      out.write("     \n");
      out.write("}\n");
      out.write("\n");
      out.write(".signup-box{\n");
      out.write("    width: 360px;\n");
      out.write("    height: 620px;\n");
      out.write("    margin: auto;\n");
      out.write("    margin-top: 50px;\n");
      out.write("    background-color: rgb(255, 255, 255);\n");
      out.write("    border-radius: 3px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-box{\n");
      out.write("    width: 360px;\n");
      out.write("    height: 280px;\n");
      out.write("    margin: auto;\n");
      out.write("    margin-top: 230px;\n");
      out.write("    background-color: white;\n");
      out.write("    border-radius: 3px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1{\n");
      out.write("    text-align: center;\n");
      out.write("    padding-top: 15pxx;\n");
      out.write("    background-color: grey;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h4{\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form{\n");
      out.write("    width: 300px;\n");
      out.write("    margin-left: 20px;\n");
      out.write("    \n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("form label{\n");
      out.write("    display: flex;\n");
      out.write("    margin-top: 20px;\n");
      out.write("    font-size: 18px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("form input{\n");
      out.write("    width: 300px;\n");
      out.write("    padding: 7px;\n");
      out.write("    border: none;\n");
      out.write("    border: 1px solid gray;\n");
      out.write("    border-radius: 6px;\n");
      out.write("    outline: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"button\"]{\n");
      out.write("    width: 300px;\n");
      out.write("    height: 35px;\n");
      out.write("    alignment-adjust: auto;\n");
      out.write("    margin-top: 20px;\n");
      out.write("    border: none;\n");
      out.write("    background-color: #4caf50;\n");
      out.write("    color:white;\n");
      out.write("    font-size: 18px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("p{\n");
      out.write("    text-align: center;\n");
      out.write("    padding-top: 20px;\n");
      out.write("    font-size: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".para-2{\n");
      out.write("    text-align: center;\n");
      out.write("    color: #333;\n");
      out.write("    font-size: 15px;\n");
      out.write("    margin-top: -10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".para-2 a{\n");
      out.write("    color: #4caf50;\n");
      out.write("}\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("    \n");
      out.write("    <div class=\"signup-box\" align=\"center\">\n");
      out.write("        <h1>Sign Up</h1>\n");
      out.write("        <form action=\"signUpDBMS.jsp\" method=\"post\">\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"firstname\">First Name</label>\n");
      out.write("            <input type=\"text\" placeholder=\"\"name=\"ufirstname\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\">\n");
      out.write("            <label for=\"lastname\">Last Name</label>\n");
      out.write("            <input type=\"text\" placeholder=\"\"  name=\"ulastname\">\n");
      out.write("          </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("            <label for=\"lastname\">User Name</label>\n");
      out.write("            <input type=\"text\" placeholder=\"\"name=\"username\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\"> \n");
      out.write("            <label for=\"email\">Email</label>\n");
      out.write("            <input type=\"email\" placeholder=\"\"  name=\"uemail\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group\"> \n");
      out.write("            <label for=\"password\">Password</label>\n");
      out.write("            <input type=\"password\" placeholder=\"\"  name=\"upassword\">\n");
      out.write("          </div>  \n");
      out.write("            <div>\n");
      out.write("            <label>Confirm Password</label>\n");
      out.write("            <input type=\"password\" placeholder=\"\">\n");
      out.write("            <input type=\"Submit\" name=\"b1\" value=\"Submit\">\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <p>By clicking Sign Up button, you agree to our <br>\n");
      out.write("        <a href=\"#\">Terms and Conditions</a> and <a href=\"#\">Privacy Policy</a></p>\n");
      out.write("    </div>\n");
      out.write("    <p class=\"para-2\">Already have an account. <a href=\"login.html\">Login here</a></p>\n");
      out.write("    \n");
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
