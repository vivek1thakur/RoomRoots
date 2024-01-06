<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Page</title>
    <link rel="stylesheet" href="style.css">
    <script src="https://kit.fontawesome.com/6f0ede3b10.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="slstyle.css">
    <style>
        body{
    background-color:  #e8f0fe;
    font-family: 'Roboto', sans-serif;
     
}

.signup-box{
    width: 360px;
    height: 620px;
    margin: auto;
    margin-top: 50px;
    background-color: rgb(255, 255, 255);
    border-radius: 3px;
}

.login-box{
    width: 360px;
    height: 280px;
    margin: auto;
    margin-top: 230px;
    background-color: white;
    border-radius: 3px;
}

h1{
    text-align: center;
    padding-top: 15pxx;
    background-color: grey;
}

h4{
    text-align: center;
}

form{
    width: 300px;
    margin-left: 20px;
    
    
}

form label{
    display: flex;
    margin-top: 20px;
    font-size: 18px;
}

form input{
    width: 300px;
    padding: 7px;
    border: none;
    border: 1px solid gray;
    border-radius: 6px;
    outline: none;
}

input[type="button"]{
    width: 300px;
    height: 35px;
    alignment-adjust: auto;
    margin-top: 20px;
    border: none;
    background-color: #4caf50;
    color:white;
    font-size: 18px;
}

p{
    text-align: center;
    padding-top: 20px;
    font-size: 15px;
}

.para-2{
    text-align: center;
    color: #333;
    font-size: 15px;
    margin-top: -10px;
}

.para-2 a{
    color: #4caf50;
}
    </style>
</head>
<body >
    
    <div class="signup-box" align="center">
        <h1>Sign Up</h1>
        <form action="signUpDBMS.jsp" method="post">
          <div class="form-group">
            <label for="firstname">First Name</label>
            <input type="text" placeholder=""name="ufirstname">
          </div>
          <div class="form-group">
            <label for="lastname">Last Name</label>
            <input type="text" placeholder=""  name="ulastname">
          </div>
            <div class="form-group">
            <label for="lastname">User Name</label>
            <input type="text" placeholder=""name="username">
          </div>
          <div class="form-group"> 
            <label for="email">Email</label>
            <input type="email" placeholder=""  name="uemail">
          </div>
          <div class="form-group"> 
            <label for="password">Password</label>
            <input type="password" placeholder=""  name="upassword">
          </div>  
            <div>
            <label>Confirm Password</label>
            <input type="password" placeholder="">
            <input type="Submit" name="b1" value="Submit">
            </div>
        </form>
        <p>By clicking Sign Up button, you agree to our <br>
        <a href="#">Terms and Conditions</a> and <a href="#">Privacy Policy</a></p>
    </div>
    <p class="para-2">Already have an account. <a href="login.html">Login here</a></p>
    
</body>
</html>