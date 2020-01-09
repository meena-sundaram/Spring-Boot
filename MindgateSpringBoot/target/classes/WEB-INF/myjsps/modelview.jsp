<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<h1>
		<ul>
			<c:forEach var="listValue" items="${lists}">
				<li>${listValue}</li>
			</c:forEach>
		</ul>
