<%@include file="header.jsp" %>


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
          
         
          
          <%@include file="userprofile.jsp" %>
         
          
          

        </section><!-- /.content -->
      </div><!-- /.content-wrapper -->

<%@include file="footer.jsp" %>



<!DOCTYPE html>
<!--<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello ${user.username}</h1>

       
    </body>
</html>-->
