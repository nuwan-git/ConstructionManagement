<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath }"/>
<html>
<head>
<%@ page isELIgnored="false" %>
<title>Online Shopping</title>
</head>
<body>

${contextRoot} says - ${msg}
</body>
</html>