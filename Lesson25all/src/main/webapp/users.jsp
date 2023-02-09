<%@ page import="com.teachmeskills.model.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Users</h1>
<table>
    <tr>
        <th>Name</th>
    </tr>
    <tbody>
    <%
        PrintWriter writer = response.getWriter();
        List<User> users = (List<User>) request.getAttribute("users");
//        System.out.println(users);
        if (users != null && !users.isEmpty()) {
            users.stream()
                 .forEach(user -> writer.println("<tr><td>" + user.getName() + "</td></tr>"));
        }
    %>
    <% for (User user : users) {%>
    <tr>
        <td>
            <%=user.getName()%>
        </td>
    </tr>
    <%} %>
    </tbody>
</table>
</body>
</html>
