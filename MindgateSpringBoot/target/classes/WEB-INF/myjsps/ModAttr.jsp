<%@taglib prefix="mindgate" uri="http://java.sun.com/jsp/jstl/core"%>
Languages: ${lang}<br><br>
<ul>  
<mindgate:forEach var="i" items="${lang}">  
<li>${i}</li>  
</mindgate:forEach>  
</ul>  
