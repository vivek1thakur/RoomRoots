<%@page import = "java.sql.*" %>
<html>
    <body>
        <%!Connection con ;%>
        <%
            
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
         %>   
    </body>
</html>
