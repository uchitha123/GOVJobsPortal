<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
<div class="row clearfix">
    <div class="col-md-12 col-md-offset-4 column">
	<h3>Jobs</h3><br>
	<c:forEach items = "${jobs}" var = "job">
        <a href ="/candidates">${job.jName}</a>  
    </c:forEach>
	<!--  <a href="/candidates">Junior Software Developer</a>-->
	</div>
	</div>
</div>
<%@ include file="common/footer.jspf"%>