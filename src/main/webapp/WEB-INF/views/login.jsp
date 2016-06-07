<%@include file="header.jsp" %>



<form class="form-horizontal" method="POST">
    <div class="container container-fluid">
        <div class="form-group">
            <label for="username" class="col-sm-2 control-label">Username</label>
            <div class="col-sm-6">
                <input type="text" class="form-control" name="username" id="username" placeholder="Enter Username">
            </div>
        </div>
        <div class="form-group">
            <label for="password" class="col-sm-2 control-label">Password</label>
            <div class="col-sm-6">
                <input type="password" class="form-control" name="password" id="password" placeholder="Enter Password">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <div class="input-group">
                    <div class="checkbox col-sm-6">
                        <label>
                            <input type="checkbox"> Remember me
                        </label>
                    </div>

                </div>
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-success">Sign in</button>
                <a type="button" href="${URL}/register" class="btn btn-primary ">Register</a>
            </div>
        </div>

        <div class="form-group ">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-link">Forgot Password</button>
            </div>
        </div>
    </div>
</div>
</form>



<%@include file="footer.jsp" %>