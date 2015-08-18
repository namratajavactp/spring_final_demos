<%@ include file="include.jsp" %>
<%@ taglib uri="/WEB-INF/spring.tld" prefix="spring" %>
<html>
<body>
<form method="post">

<br>Enter username:
<spring:bind path="user.username">
<input type="text" name="username" value="<c:out value="${status.value}"/>">
<i><c:out value="${status.errorMessage}"/></i>
</spring:bind>

<br>Enter password:
<spring:bind path="user.password">
<input type="text" name="password" value="<c:out value="${status.value}"/>">
<i><c:out value="${status.errorMessage}"/></i>
</spring:bind>
<br>
<input type="submit" value="Login">
</form>
</body>
</html>