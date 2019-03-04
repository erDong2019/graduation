<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>
<table border="1" width="400px" class="tab" cellpadding="0" cellspacing="0">
    <tr>
        <th>商品名称</th>
        <th>商品价格</th>
        <th>操作</th>
    </tr>
    <c:forEach var="pro" items="${proList}">
        <tr style="text-align:center;width: 98%;border: 0px">
            <td>${pro.name}</td>
            <td>￥${pro.price}</td>
            <%--<td>--%>
                <%--<a href="views/update.jsp?id=${pro.id}&name=${pro.name}&price=${pro.price}">编辑</a>--%>
                <%--<a href='product/deleteById/${pro.id}'>删除</a>--%>
            <%--</td>--%>
        </tr>
    </c:forEach>
</table>
</body>
</html>
