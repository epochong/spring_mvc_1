
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%--c:前缀--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" align="center">
    <tr>
        <td>userID</td>
        <td>userName</td>
    </tr>

    <c:forEach items="${userInfoList}" var="myItems">
       <tr>
           <td>${myItems.userid}</td>
           <td>${myItems.username}</td>
       </tr>
    </c:forEach>

</table>
</body>
</html>
