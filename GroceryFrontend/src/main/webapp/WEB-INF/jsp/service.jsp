<div class="container mt-5">
<h1 class="text-center">Registration Form</h1>
<form action="${contextRoot}/processform" method="post" modelAttribute="login">
  <div class="form-group ">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" class="form-control" id="exampleInputEmail1"
     aria-describedby="emailHelp" placeholder="Enter email-Id" name="email">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Password</label>
    <input type="password" class="form-control" id="exampleInputPassword1"
     placeholder="Enter Password" name="password">
  </div>
 
  
  <div class="container text-center">
  <button type="submit" class="btn btn-primary">Submit</button>
   </div>
</form>
</div>