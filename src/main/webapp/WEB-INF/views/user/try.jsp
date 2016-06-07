<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="URL" value="${pageContext.request.contextPath}"/>


<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title> Welcome ${user.username}</title>
        <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <!-- Bootstrap 3.3.5 -->
        <!--<link rel="stylesheet" href="assets/bootstrap/bootstrap.min.css">-->
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
        <!-- Font Awesome -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
        <!-- Ionicons -->
        <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
        <!-- Theme style -->


        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/admin-lte/2.3.3/css/AdminLTE.css">
        <!--<link rel="stylesheet" href="assets/dist/css/AdminLTE.min.css">-->
        <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
              page. However, you can choose any other skin. Make sure you
              apply the skin class to the body tag so the changes take effect.
        -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/admin-lte/2.3.3/css/skins/skin-blue.min.css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
            <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <!--
    BODY TAG OPTIONS:
    =================
    Apply one or more of the following classes to get the
    desired effect
    |---------------------------------------------------------|
    | SKINS         | skin-blue                               |
    |               | skin-black                              |
    |               | skin-purple                             |
    |               | skin-yellow                             |
    |               | skin-red                                |
    |               | skin-green                              |
    |---------------------------------------------------------|
    |LAYOUT OPTIONS | fixed                                   |
    |               | layout-boxed                            |
    |               | layout-top-nav                          |
    |               | sidebar-collapse                        |
    |               | sidebar-mini                            |
    |---------------------------------------------------------|
    -->
    <body class="hold-transition skin-blue sidebar-mini">
        <div class="wrapper">

            <!-- Main Header -->
            <header class="main-header">

                <!-- Logo -->
                <a href="index2.html" class="logo">
                    <!-- mini logo for sidebar mini 50x50 pixels -->
                    <span class="logo-mini"><b>A</b>LT</span>
                    <!-- logo for regular state and mobile devices -->
                    <span class="logo-lg"><b>Admin</b>LTE</span>
                </a>

                <!-- Header Navbar -->
                <nav class="navbar navbar-static-top" role="navigation">
                    <!-- Sidebar toggle button-->
                    <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                        <span class="sr-only">Toggle navigation</span>
                    </a>



                    <!--                                     Menu Footer
                    -->                                    <li class="user-footer">
                        <!--                                        <div class="pull-left">
                                                                    <a href="#" class="btn btn-default btn-flat">Profile</a>
                                                                </div>-->
                        <div class="pull-right">
                            <a href="${URL}/logout" class="btn btn-default btn-flat">Sign out</a>
                        </div>
                    </li><!--
                </ul>
            </li>-->
                    <!-- Control Sidebar Toggle Button -->
                    <li>
                        <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
                    </li>
                    </ul>
                    </div>
                </nav>
            </header>
            <!-- Left side column. contains the logo and sidebar -->
            <aside class="main-sidebar">

                <!-- sidebar: style can be found in sidebar.less -->
                <section class="sidebar">

                    <!--                     Sidebar user panel (optional) 
                                        <div class="user-panel">
                                            <div class="pull-left image">
                                                <img src="dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
                                            </div>
                                            <div class="pull-left info">
                                                <p>Alexander Pierce</p>
                                                 Status 
                                                <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
                                            </div>
                                        </div>-->

                    <!-- search form (Optional) -->
                    <form action="#" method="get" class="sidebar-form">
                        <div class="input-group">
                            <input type="text" name="q" class="form-control" placeholder="Search...">
                            <span class="input-group-btn">
                                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i></button>
                            </span>
                        </div>
                    </form>
                    <!-- /.search form -->

                    <!-- Sidebar Menu -->
                    <ul class="sidebar-menu">
                        <li class="header">HEADER</li>
                        <!-- Optionally, you can add icons to the links -->
                        <li class="active"><a href="#"><i class="fa fa-link"></i> <span>Profile</span></a></li>
                        <li><a href="#myGames"><i class="fa fa-link"></i> <span>My Games</span></a></li>
                        <li><a href="#fixturetoday"><i class="fa fa-link"></i> <span>Today's bookings</span></a></li>
                        <li ><a href="#fixturetoday"><i class="fa fa-link"></i> <span>Fix a match</span></a></li>

                    </ul><!-- /.sidebar-menu -->
                </section>
                <!-- /.sidebar -->
            </aside>


            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                        Hello ${user.username}
                    </h1>

                </section>

                <!-- Main content -->
                <section class="content">

                    <!-- Your Page Content Here -->


                    <!--##########################################################################-->
                    <div id="profile">
                        <div class="container">

                            <hr>
                            <div class="row">
                                <!-- left column -->
                                <div class="col-md-3">
                                    <div class="text-center">
                                        <img src="//placehold.it/100" class="avatar img-circle" alt="avatar">
                                        <!--          <h6>Upload a different photo...</h6>
                                                  
                                                  <input type="file" class="form-control">-->
                                    </div>
                                </div>

                                <!-- edit form column -->
                                <div class="col-md-9 personal-info">
                                    <!--        <div class="alert alert-info alert-dismissable">
                                              <a class="panel-close close" data-dismiss="alert">×</a> 
                                              <i class="fa fa-coffee"></i>
                                              This is an <strong>.alert</strong>. Use this to show important messages to the user.
                                            </div>-->
                                    <h3>Personal info</h3>

                                    <form class="form-horizontal" role="form">
                                        <div class="form-group">
                                            <label class="col-lg-3 control-label">First name:</label>
                                            <div class="col-lg-8">
                                                <input class="form-control" type="text" value="Jane">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-lg-3 control-label">Last name:</label>
                                            <div class="col-lg-8">
                                                <input class="form-control" type="text" value="Bishop">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-lg-3 control-label">Email:</label>
                                            <div class="col-lg-8">
                                                <input class="form-control" type="text" value="${user.email}">
                                            </div>
                                        </div>
                                        <!--          <div class="form-group">
                                                    <label class="col-lg-3 control-label">Time Zone:</label>
                                                    <div class="col-lg-8">
                                                      <div class="ui-select">
                                                        <select id="user_time_zone" class="form-control">
                                                          <option value="Hawaii">(GMT-10:00) Hawaii</option>
                                                          <option value="Alaska">(GMT-09:00) Alaska</option>
                                                          <option value="Pacific Time (US &amp; Canada)">(GMT-08:00) Pacific Time (US &amp; Canada)</option>
                                                          <option value="Arizona">(GMT-07:00) Arizona</option>
                                                          <option value="Mountain Time (US &amp; Canada)">(GMT-07:00) Mountain Time (US &amp; Canada)</option>
                                                          <option value="Central Time (US &amp; Canada)" selected="selected">(GMT-06:00) Central Time (US &amp; Canada)</option>
                                                          <option value="Eastern Time (US &amp; Canada)">(GMT-05:00) Eastern Time (US &amp; Canada)</option>
                                                          <option value="Indiana (East)">(GMT-05:00) Indiana (East)</option>
                                                        </select>
                                                      </div>
                                                    </div>
                                                  </div>-->
                                        <div class="form-group">
                                            <label class="col-md-3 control-label">Username:</label>
                                            <div class="col-md-8">
                                                <input class="form-control" type="text" value="janeuser">
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label class="col-md-3 control-label">Phone 1:</label>
                                            <div class="col-md-8">
                                                <input class="form-control" type="text" value="984115148">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-md-3 control-label">Phone 2: </label>
                                            <div class="col-md-8">
                                                <input class="form-control" type="text" value="">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-md-3 control-label">Team's Name:</label>
                                            <div class="col-md-8">
                                                <input class="form-control" type="text" value="janeuser">
                                            </div>
                                        </div>    
                                        <div class="form-group">
                                            <label class="col-md-3 control-label">Ready for match:</label>
                                            <div class="col-md-8">
                                                <input class="form-control" type="text" value="janeuser">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-md-3 control-label"></label>
                                            <div class="col-md-8">
                                                <input type="button" class="btn btn-primary" value="Edit">
                                                <span></span>

                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>
                        <hr>


                    </div> <!-- Profile ends -->


                    <div id="myGames">
                        <div class="table">
                            <table class="table table-bordered table-hover ">
                                <div class="center">
                                    ${date} 
                                </div>
                                <tr>
                                    <th>Time</th>
                                    <th>Booked by</th>
                                    <th>Remarks</th>
                                </tr>
                                <tr >
                                    <td class="">6-7  am</td>
                                    <td>Aj420</td>
                                    <td><p class="btn btn-sm btn-warning" >Booked</p> </td>
                                </tr>
                                <tr >
                                    <td>7-8 am</td>
                                    <td></td>
                                    <td> 
                                        <p class="btn btn-sm btn-success" >Available</p>
                                        <p class="btn btn-sm btn-success"><span class="glyphicon glyphicon-pencil"></span> Book</p>
                                    </td>
                                </tr>
                                <tr>
                                    <td>8-9 am</td>
                                    <td>Hari</td>
                                    <td> 
                                        <p class="btn btn-sm btn-danger">Cancelled</p>
                                        <p class="btn btn-sm btn-success"><span class="glyphicon glyphicon-pencil"></span> Book</p>
                                    </td>
                                </tr>
                            </table>
                        </div>
                    </div> <!-- my games table ends -->


                    <div id="fixturetoday">
                        <%@include file="../fixturetoday.jsp" %>
                    </div>






                </section><!-- /.content -->
            </div><!-- /.content-wrapper -->


            <!-- Main Footer -->
            <footer class="main-footer">
                <!-- To the right -->
                <div class="pull-right hidden-xs">
                    Anything you want
                </div>
                <!-- Default to the left -->
                <strong>Copyright &copy; 2015 <a href="#">Company</a>.</strong> All rights reserved.
            </footer>

            <!-- Control Sidebar -->
            <aside class="control-sidebar control-sidebar-dark">
                <!-- Create the tabs -->
                <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
                    <li class="active"><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a></li>
                    <li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>
                </ul>
                <!-- Tab panes -->
                <div class="tab-content">
                    <!-- Home tab content -->
                    <div class="tab-pane active" id="control-sidebar-home-tab">
                        <h3 class="control-sidebar-heading">Recent Activity</h3>
                        <ul class="control-sidebar-menu">
                            <li>
                                <a href="javascript::;">
                                    <i class="menu-icon fa fa-birthday-cake bg-red"></i>
                                    <div class="menu-info">
                                        <h4 class="control-sidebar-subheading">Langdon's Birthday</h4>
                                        <p>Will be 23 on April 24th</p>
                                    </div>
                                </a>
                            </li>
                        </ul><!-- /.control-sidebar-menu -->

                        <h3 class="control-sidebar-heading">Tasks Progress</h3>
                        <ul class="control-sidebar-menu">
                            <li>
                                <a href="javascript::;">
                                    <h4 class="control-sidebar-subheading">
                                        Custom Template Design
                                        <span class="label label-danger pull-right">70%</span>
                                    </h4>
                                    <div class="progress progress-xxs">
                                        <div class="progress-bar progress-bar-danger" style="width: 70%"></div>
                                    </div>
                                </a>
                            </li>
                        </ul><!-- /.control-sidebar-menu -->

                    </div><!-- /.tab-pane -->
                    <!-- Stats tab content -->
                    <div class="tab-pane" id="control-sidebar-stats-tab">Stats Tab Content</div><!-- /.tab-pane -->
                    <!-- Settings tab content -->
                    <div class="tab-pane" id="control-sidebar-settings-tab">
                        <form method="post">
                            <h3 class="control-sidebar-heading">General Settings</h3>
                            <div class="form-group">
                                <label class="control-sidebar-subheading">
                                    Report panel usage
                                    <input type="checkbox" class="pull-right" checked>
                                </label>
                                <p>
                                    Some information about this general settings option
                                </p>
                            </div><!-- /.form-group -->
                        </form>
                    </div><!-- /.tab-pane -->
                </div>
            </aside><!-- /.control-sidebar -->
            <!-- Add the sidebar's background. This div must be placed
                 immediately after the control sidebar -->
            <div class="control-sidebar-bg"></div>
        </div><!-- ./wrapper -->

        <!-- REQUIRED JS SCRIPTS -->

        <!-- jQuery 2.1.4 -->
        <script   src="https://code.jquery.com/jquery-2.2.4.min.js"   integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="   crossorigin="anonymous"></script>
        <!-- Bootstrap 3.3.5 -->

        <!-- AdminLTE App -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/admin-lte/2.3.3/js/app.min.js"></script>

        <!-- Optionally, you can add Slimscroll and FastClick plugins.
             Both of these plugins are recommended to enhance the
             user experience. Slimscroll is required when using the
             fixed layout. -->
    </body>
</html>
