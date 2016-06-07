<%@include file="header.jsp" %>

<h1> <u> User Registration </u> </h1>
<form method="POST">
     <div class="form-group">
        <label> First Name </label>
        <input type="text" name="firstname" class="form-control" placeholder="Enter First name"  />
    </div>
    <div class="form-group">
        <label> Last Name </label>
        <input type="text" name="lastname" class="form-control" placeholder="Enter last name"  />
    </div>
    <div class="form-group">
        <label> Email </label>
        <input type="email" name="email" class="form-control" placeholder="Enter email id"  />
    </div>
    <div class="form-group">
        <label> Phone </label>
        <input type="text" name="phone1" class="form-control" placeholder="Enter phone number"  />
    </div>
    <div class="form-group">
        <label> Phone 2 </label>
        <input type="text" name="phone2" class="form-control" placeholder="Enter other phone number where we may contact you or your team member"  />
    </div>
    <div class="form-group">
        <label> Username </label>
        <input type="text" name="username" class="form-control" placeholder="Enter Username"  />
    </div>
    <div class="form-group">
        <label> Password </label>
        <input type="password" name="password" class="form-control" placeholder="Enter password"  />
    </div>
    <div class="form-group">
        <label> Retype Password </label>
        <input type="password" name="re_password" class="form-control" placeholder="Retype password"  />
    </div>    
    
    <div class="form-group">
        <label> Team's Name </label>
        <input type="text" name="team_name" class="form-control" placeholder="Enter team's name"  />
    </div>
    <div class="form-group">
        <label> Team Picture </label>
        <input type="file" name="team_pic"  />
    </div>
    <div class="form-group">
        <label> Ready For Match </label>
        <label class="checkbox-inline"><input type="checkbox" value=""> YES </label>
    </div>
    <div class="form-group">
        <label> Notify By Mail </label>
        <label class="checkbox-inline"><input type="checkbox" value=""> YES </label>
    </div>
    <div class="form-group">
        <label> Show number </label>
        <label class="checkbox-inline"><input type="checkbox" value=""> YES </label>
    </div>

    <div class="form-group">
        <div class="col-sm-offset-5 col-sm-10">
            <button type="submit" class="btn btn-primary">Submit</button>
        </div>
    </div>
</div>
</form>


<%@include file="footer.jsp" %>