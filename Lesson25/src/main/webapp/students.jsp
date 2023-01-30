<%@ page import="java.util.ArrayList" %>
<%@ page import="com.tms.model.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Students List</title>
</head>
<body>
<h1>Displaying Students List</h1>
<table border="1">
    <caption>Таблица студентов</caption>
    <tr>
        <th>Имя</th>
        <th>Возраст</th>
        <th>Курс</th>
    </tr>
    <%
        ArrayList<Student> students = (ArrayList<Student>) request.getAttribute("data");
        for (Student student : students) {
    %>
    <tr>
        <td><%=student.getName()%>
        </td>
        <td><%=student.getAge()%>
        </td>
        <td><%=student.getCourse()%>
        </td>
    </tr>
    <%}%>
</table>

</body>
</html>
