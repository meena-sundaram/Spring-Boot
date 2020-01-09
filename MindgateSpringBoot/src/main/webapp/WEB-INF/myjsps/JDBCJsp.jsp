<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body text=red>
<table border=5>
       <tr>
           <th>Eno</th>
           <th>Name</th>
           <th>Salary</th>
       <th>Delete??</th>
       
       </tr>
       <c:forEach items="${empList}" var="emp">
       <tr>
           <td>${emp.eno}</td>
           <td>${emp.name}</td>
           <td>${emp.salary}</td>
  <td><a href="deleteemps/${emp.eno}">DeleteRecord</a></td>      
         
          </td>
       </tr>
       </c:forEach>
 </table>
