<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Hello ${user.name}!</title>
</head>
<body>

<div>
    <fieldset>
        <legend>User info</legend>
        <form name="user">
            <input id="name" type="text" value="${user.name}"/>
            <input id="surname" type="text" value="${user.surname}"/>
            <input id="email" type="text" value="${user.email}"/>
            <br/> <br/>
            <input id="password" type="text" value="${user.password}"/>
            <input id="birthday" type="text" value="${user.birthday.toString()}"/>
            <input id="balance" type="text" value="${user.balance}"/>
        </form>
    </fieldset>
</div>

<br/> <br/>

<div>
    <fieldset>
        <legend>Orders info</legend>
        <#list user.orders as order>
            <h2>${order.date}</h2>
            <table border="2">
                <th>Name</th>
                <th>Description</th>
                <th>Price</th>
                <#list order.products as product>
                    <tr>
                        <td>${product.name}</td>
                        <td>${product.description}</td>
                        <td>${product.price}</td>
                    </tr>
                </#list>
            </table>
        </#list>
    </fieldset>
</div>
</body>
</html>
