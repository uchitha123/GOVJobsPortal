<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
<div class="row clearfix">
    <div class="col-md-6 col-md-offset-4 column">
    <h3> Candidates </h3>
	<table class="table table-striped">		
	 	<c:forEach items = "${candidates}" var = "candidate">
		 <tr>
             <td><a href ="/candidateDetails?cid=${candidate.cId}">${candidate.fName} ${candidate.lName}</a></td>  
         </tr>
	    </c:forEach>	
	</table>
	</div>
	</div>
</div>
<%@ include file="common/footer.jspf"%>