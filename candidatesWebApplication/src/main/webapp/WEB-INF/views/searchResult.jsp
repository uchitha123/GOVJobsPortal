<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
<div class="row clearfix">
    <div class="col-md-6 col-md-offset-4 column">	
	<h3>Search result</h3>
	<p> <font color="red"> ${errorMessage }</font></p>
		<table class="table">
			 <c:forEach items = "${candidateList}" var = "candidate">
				 		 <tr>
			                    <td>Name</td>
			                    <td>${candidate.fName} ${candidate.lName}</td>    
			             </tr>
			             <tr>
			                    <td>Role</td>
			                    <td>${candidate.currentRole}</td>    
			             </tr> 
			              <tr>
			                    <td>Email</td>
			                    <td>${candidate.email}</td>    
			             </tr> 
			                <tr>
			                    <td>Mobile</td>
			                    <td>${candidate.mobile}</td>    
			             </tr>
			              <tr>
			                    <td>Github</td>
			                    <td>${candidate.github}</td>    
			             </tr>  
			             <tr>
			                    <td>Education</td>
			                    <td>${candidate.educationDescription}</td>    
			             </tr>
			             <tr>
			                    <td>WorkExperience </td>
			                    <td>${candidate.workDescription}</td>    
			             </tr> 
		     </c:forEach>      
		</table>
		<a class="btn btn-default" href = "/search">Back</a>
	</div>
</div>
</div>
<%@ include file="common/footer.jspf"%>