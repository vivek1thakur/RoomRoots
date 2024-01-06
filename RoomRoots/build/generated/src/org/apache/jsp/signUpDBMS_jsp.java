package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class signUpDBMS_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

Connection con ;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/DBCON.jsp");
  }

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
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            
           try
           {
               Class.forName("com.mysql.jdbc.Driver");
               String connectionURL ="jdbc:mysql://localhost:3306/roomroots";
               String dbuser="root";
               String dbpass="root";
               
               con = DriverManager.getConnection(connectionURL,dbuser,dbpass);
               out.println("connection sucess.....");
               out.println("<br>");
           }
           catch(Exception e)
           {
               out.println("connection failed");
           }
         
      out.write("   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

        try
        {
            String Fname = request.getParameter("ufirstname");
            String Lname = request.getParameter("ulastname");
            String Uname = request.getParameter("username");
            String Uemail = request.getParameter("uemail");
            String Upassword = request.getParameter("upassword");
            
            String createuserquery = "insert into account values(?,?,?,?,?);";
            PreparedStatement pst1 = con.prepareStatement(createuserquery);
            pst1.setString(1,Fname );
            pst1.setString(2,Lname );
            pst1.setString(3,Uname );
            pst1.setString(4,Uemail );
            pst1.setString(5,Upassword );
            
            String Usertable ="insert into users(Firstname,Lastname,username,email,password_Hash)values('"+Fname+"','"+Lname+"','"+Uname+"','"+Uemail+"','"+Upassword+"')";
            PreparedStatement pst2 = con.prepareStatement(Usertable);
            
            pst2.executeUpdate();
        }
        catch(Exception e)
        {
            out.println("user not created...."+e);
        }
            
            
            
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
