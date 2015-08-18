<%@ include file="include.jsp" %>
<html><head><title><fmt:message key="productpage.title" /></title></head>
<body>
<h1><fmt:message key="productpage.heading" /></h1>
Date: <c:out value="${model.now}" />
<h3>products listing</h3>
<c:forEach items="${model.products}" var="prod">
	<c:out value="${prod.getName()}" /><i><c:out value="${prod.price}" /></i><br><br>
</c:forEach>
</body>
</html>