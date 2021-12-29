<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<p class="lead">${title}</p>
<div class="list-group">
	<c:forEach items="${success}" var="logsuccess">
		<a href="#" class="list-group-item">EmailId : ${logsuccess.email},
			Password :${logsuccess.password} </a>

	</c:forEach>

</div>
