<%@include  file="DBCON.jsp"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
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
            response.sendRedirect("Login.jsp");
        }
        catch(Exception e)
        {
            out.println("user not created...."+e);
        }
            
            
            %>
    </body>
</html>
