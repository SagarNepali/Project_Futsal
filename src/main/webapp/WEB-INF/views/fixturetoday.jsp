<%-- 
    Document   : fixturetoday
    Created on : Jun 4, 2016, 5:13:41 PM
    Author     : user
--%>

<%@include file="header.jsp" %>
<div class="container container-fluid">
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
</div>



<%@include file="footer.jsp" %>
