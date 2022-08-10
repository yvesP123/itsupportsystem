<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="dist/css/adminlte.min.css">
      <!-- jQuery UI 1.11.4 -->
  <link rel="stylesheet" href="plugins/jquery-ui/jquery-ui.min.css">
    <script src="plugins/jquery/jquery.min.js"></script>
    <link rel="stylesheet" href="dist/css/style.css">
    <!-- Toastr -->
  <link rel="stylesheet" href="plugins/toastr/toastr.min.css">
  <style>
      #span-error{
          color:red;
          font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
          font-size:14px;       
          font-style: italic;  

      }
      .error{
    margin:5px 7px;
    padding:12px 15px;
    border: 3px 2px;
    border-radius: 9px;
    box-shadow: 0 5px 6px rgba(139, 139, 139, 0.25), 0 3px 5px rgba(83, 83, 83, 0.22);
    min-width: 100%;
    border-left:red;
}
  </style>
</head>
<body id="body">
  <div class="container" id="container">
      <div class="form-container sign-up-container">
          <form action="#">
              <h1>Create Account</h1>
              <input type="text" name="username" id="login_username" placeholder="Enter the username">
              <input type="password" name="password" id="login_password" placeholder="Enter the password">
              <button class="btn btn-info">Sign Up</button>

          </form>
      </div>
      <div class="form-container sign-in-container">
        <form action="send.jsp" method="POST" id="form">
            <h1>Sign Up</h1>
            <div class="error" style="display:none;"><span id="span-error"> Invalid credentials </span></div>
            <input type="text" name="name" id="userName" placeholder="Enter the Name" required>
            <input type="email" name="email" id="userName" placeholder="Enter the Email" required>
            <input type="text" name="username" id="userName" placeholder="Enter the Username" required>
            <input type="password" name="password" id="userName" placeholder="Enter the Password" required>
            <input type="text" name="phone" id="passWord" placeholder="Enter the Phone" required>
            <select class="form-control" name="gender">
                <option value="male">Male</option>
                <option value="female">FeMale</option>
            </select>
            
          
           
            <button class=" btn btn-info" id="signInBtn">Sign Up</button>
             <a href="registration.jsp">I don't Have an Account?</a>
        </form>
    </div>
    <div class="overlay-container">
        <div class="overlay">
            <div class="overlay-panel overlay-left">
                <h1>Welcome Back</h1>
                <p>
                    To Keep Using it support please login with your credentials.
                </p>
                <button class="ghost" id="signIn">Sign In</button>
            </div>
            <div class="overlay-panel overlay-right">
                <h1>Welcome Back</h1>
                <p>
                    To Keep Using it support please login with your credentials.
                </p>
          <!--      <button class="ghost" id="signUp">Sign Up</button> -->
            </div>
        </div>
    </div>
  </div>
<script>

</script>
<script src="dist/js/loginScript.js"></script>
<script src="plugins/jquery/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="plugins/jquery-ui/jquery-ui.min.js"></script>
</body>
</html>