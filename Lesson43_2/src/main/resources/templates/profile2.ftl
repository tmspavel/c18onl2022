<#import "/spring.ftl" as spring/>
<#import "profile_macros.ftl" as ui/>
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
            <@ui.formInput id="name" value="${user.name}"/>
            <@ui.formInput id="surname" value="${user.surname}"/>
            <@ui.formInput id="email" value="${user.email}"/>
            <br/> <br/>
            <@ui.formInput id="password" value="${user.password}"/>
            <@ui.formInput id="birthday" value="${user.birthday.toString()}"/>
            <@ui.formInput id="balance" value="${user.balance}"/>
        </form>
    </fieldset>
</div>

<br/> <br/>

<div>
    <fieldset>
        <legend>Orders info</legend>
        <#list user.orders as order>
            <h2>${order.date}</h2>
            <@ui.table id="orders" rows=order.products/>
        </#list>
    </fieldset>
</div>
</body>
</html>