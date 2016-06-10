<%-- 
    Document   : fixturetoday
    Created on : Jun 4, 2016, 5:13:41 PM
    Author     : user
--%>

<%@include file="header.jsp" %>

<div class="container container-fluid">
    <div id="table">

        <div class="dayTimeSelect">

            <label >Day</label>
            <div >
                <div class="select-day">
                    <select id="day" >
                        <c:forEach var="d"items="${bookings}">


                            <option>${d.dayId.day}</option> 


                        </c:forEach>
                    </select>
                </div>
            </div>




        </div>




        <table class ="table table-bordered table-hover">
            <tr>
                <th>Time</th>
                <th>Booked by</th>
                <th>Booked time</th>
                <th>Status</th>
                <th>Remarks</th>
                <th>Action</th>
            </tr>


            <c:forEach var="b" items="${bookings}">
                <tr>
                    <td>${b.getTimingId().getTime()} ${b.getTimingId().getAmPm()}</td>

                    <td>${b.bookedBy}</td>
                    <td>${b.bookedTime}</td>
                    <c:choose>
                        <c:when test="${b.status}">
                            <td>
                                <p class="btn btn-sm btn-warning" >Booked</p>
                            </td>
                        </c:when>
                        <c:otherwise>
                            <td>
                                <p class="btn btn-sm btn-success" >Available</p>
                            </td>
                        </c:otherwise>
                    </c:choose>
                    <c:choose>
                        <c:when test="${b.remarks}">
                            <td>Played</td>
                        </c:when>
                        <c:otherwise>
                            <td>Cancelled</td>
                        </c:otherwise>
                    </c:choose> 


                    <c:choose>
                        <c:when test="${b.status==true && b.remarks==true}">
                        <td>
                            <button class="btn btn-sm btn-success"><span class="glyphicon glyphicon-pencil"></span> Book</button>
                        </td>
                        </c:when>
                        <c:otherwise>
                            <td>
                                <button disabled="true" class="btn btn-sm btn-success"><span class="glyphicon glyphicon-pencil"></span> Book</button>
                        </td>
                        </c:otherwise>
                    </c:choose>
                </tr>
            </c:forEach>




        </table>

    </div>
</div>


<!--<div class="container container-fluid">
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
</div>-->



<%@include file="footer.jsp" %>
