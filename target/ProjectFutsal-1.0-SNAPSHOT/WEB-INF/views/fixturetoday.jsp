<%-- 
    Document   : fixturetoday
    Created on : Jun 4, 2016, 5:13:41 PM
    Author     : user
--%>

<%@include file="header.jsp" %>
<div class="container">

    <div class="container container-fluid">
        <div id="table">

            <!--            <div class="dayTimeSelect">
            
                            <label >Day</label>
                            <div >
                                <div class="select-day">
                                    <select id="day" >
            <c:forEach var="d"items="${days}">


                <option>${d.day}</option> 


            </c:forEach>
        </select>
    </div>
</div>




</div>-->



            <table id="table" class ="table table-bordered table-hover">
                <tr>
                    <th>Time</th>
                    <th>Booked by </th>
                    <th>Booked time</th>
                    <th>Status</th>
                    <th>Action </th>

                </tr>


                <c:forEach var="t"  items="${timings}">
                    <%--<c:forEach var="b" items="${t.bookingList}">--%>

                    <tr>
                        <td id="time">${t.time} ${t.amPm}</td>
                        <td>

                            <c:forEach var="b" items="${t.bookingList}">
                                <c:choose>

                                    <c:when test="${t.time == b.timingId.time}">
                                        <c:out value="${b.bookedBy}"/>
                                    </c:when>

                                </c:choose>
                            </c:forEach>

                            <c:if test="${t.bookingList.isEmpty() }">
<!--                                <img src="${URL}/static/img/available.gif" alt=""/>   -->
                            </c:if>
                        </td>
                        <td>
                            <c:forEach var="b" items="${t.bookingList}">
                                <c:if test="${t.time == b.timingId.time}">
                                    <c:out value="${b.bookedTime}"/>
                                </c:if>   
                            </c:forEach>
                            <c:if test="${t.bookingList.isEmpty() }">



                            </c:if>
                        </td>
                        <td>
                            <c:forEach var="b" items="${t.bookingList}">
                                <c:if test="${t.time == b.timingId.time}">

                                    <p class="btn btn-sm btn-warning" >Booked</p>

                                </c:if>   
                            </c:forEach>
                            <c:if test="${t.bookingList.isEmpty() }">

                                <p class="btn btn-sm btn-success" >Available</p>
                            </c:if>
                        </td>

                        <td>
                            <c:forEach var="b" items="${t.bookingList}">
                                <c:if test="${b.status}">
                                    <button disabled="true" class="btn btn-sm btn-success"><span class="glyphicon glyphicon-pencil"></span> Book</button>
                                </c:if>   
                            </c:forEach>
                            <c:if test="${t.bookingList.isEmpty() }">

                                <a href="javascript:void(0)" id="bookBtn" class="btn btn-sm btn-success" ><span class="glyphicon glyphicon-pencil"></span> Book</a>

                            </c:if>
                        </td>



                    </c:forEach>




            </table>

        </div>
        
        <div id="book-form" style="display:none">
            
            <h1>Add Booking Information!</h1>



                <form role="form" id="form">
                    <div class="form-group">
                        <label >Time</label>
                        <input value="${t.time}" type="text" class="form-control" required="required" id="firstName" placeholder="First Name">
                    </div>
                    <div class="form-group">
                        <label >Last Name</label>
                        <input name="lastName" type="text" class="form-control" required="required" id="lastName" placeholder="Last Name">
                    </div>
                    <div class="form-group">
                        <label >Address</label>
                        <input name="address" type="text" class="form-control" required="required" id="address" placeholder="Address">
                    </div>
                    <div class="form-group">
                        <label >Contact</label>
                        <input name="contact" type="text" class="form-control" required="required" id="contact" placeholder="Contact">
                    </div>
                    <div class="checkbox">
                        <label > <input type="checkbox" name="status" id="status"/>Status </label>

                    </div>


                    <a href="javascript:void(0)" class="btn btn-default btn-danger" id="back-btn">Back</a>
                    <button type="submit" class="btn btn-default btn-success" id="save-btn">Save</button>
            
        </div>
    </div>
</div>

<script>
    $(document).on("ready",function(){
        $("#bookBtn").on("click", function () {
            $("#table").hide();
            
            $("#book-form").slideToggle();
        });
        $("#back-btn").on("click", function () {

                    $("#book-form").slideToggle('auto', function () {
                        $("#table").show();
                    });

                });
    });
   

</script>

<%@include file="footer.jsp" %>
