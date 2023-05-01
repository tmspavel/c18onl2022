<#-- textInput macro for html input -->
<#macro formInput id type="text" value="">
    <input id="${id}" type="text" value="${value}">
</#macro>


<#-- table macro for html table -->
<#macro table id rows>
<table id="${id}" border="2">
    <#list ['Name', 'Description', 'Price'] as x>
        <th>${x}</th>
    </#list>
    <#list rows as row>
        <tr>
            <td>${row.name}</td>
            <td>${row.description}</td>
            <td>${row.price}</td>
        </tr>
    </#list>
</table>
</#macro>
