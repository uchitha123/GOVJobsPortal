<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
<div class="row clearfix">
    <div class="col-md-8 col-md-offset-4 column">	
	<p> <font color="red"> ${errorMessage }</font></p>
	    <form action ="/search" method="POST" class="form-inline">
			<div class="form-group">
				<div class="input-group">
		 			<input name = "searchValue" type = "text" placeholder="By candidate name or ID" class="form-control inputclass"/>		
		 		</div>
		 	</div>
		  		<input type= "submit" class= "btn btn-primary" value="Search"/>
		</form>		
	</div>
	</div>
</div>
<%@ include file="common/footer.jspf"%>