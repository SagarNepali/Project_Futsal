<%-- 
    Document   : index
    Created on : Jun 2, 2016, 3:04:45 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="URL" value="${pageContext.request.contextPath}"/>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- Latest compiled and minified CSS -->
        <link href="${URL}/static/bootstrap/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="${URL}/static/bootstrap/bootstrap.min.js" type="text/javascript"></script>
        

        <!-- Optional theme -->
        <link href="${URL}/static/bootstrap/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="${URL}/static/bootstrap/Carousel.css" rel="stylesheet" type="text/css"/>
        <script src="${URL}/static/jquery/jquery-2.2.3.min.js" type="text/javascript"></script>
        <!-- Latest compiled and minified JavaScript -->
        



        <title>JSP Page</title>
        
        
    </head>

    <body>

        <div class="navbar-wrapper">
            <div class="container">
           

                <nav class="navbar navbar-inverse navbar-default navbar-static-top" role="navigation">
                   
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand" href="${URL}">ProjectFUTSAL</a>
                        </div>
                        <div id="navbar" class="navbar-collapse collapse">
                            <ul class="nav navbar-nav pull-right">
                                <li class="active"><a href="${URL}">Home</a></li>
                                <li><a href="#about">Book</a></li>
                                <li><a href="${URL}/fixturetoday">Today's Schedule</a></li>
                                <li><a href="#contact">Contact</a></li>
                                <li><a href="${URL}/login">Login</a></li>

                            </ul>
                        </div>
                   
                </nav>

            
        </div>
                                
                                <div class="container">

       

       