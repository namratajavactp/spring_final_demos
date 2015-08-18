<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1>Person page</h1>
<p>This is Person page</p> 
<form:form method="POST" commandname="person-entity" action="process-person.html">
<table>
    <tbody><tr>
        <td><form:label path="firstName">Name:</form:label></td>
        <td><form:input path="firstName"></form:input></td>
    </tr>
    <tr>
        <td><form:label path="age">Age:</form:label></td>
        <td><form:input path="age"></form:input></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit">
        </td>
        <td></td>
        <td></td>
    </tr>
</tbody></table>  
</form:form>

