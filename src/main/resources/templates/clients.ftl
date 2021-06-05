<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <meta charset="UTF-8">
    <title>Rooms</title>
</head>
<body>
<table class="table table-dark table-hover table table-bordered border-success" align="center" style="width: 1000px;">
    <tr align="center">
        <th>Code</th>
        <th>FitstName</th>
        <th>LastName</th>
        <th>FatherName</th>
        <th>Address</th>
        <th>FoneNumber</th>
        <th>Delete</th>
    </tr>
    <#list clients as client>
        <tr align="center">
            <td>${client.code}</td>
            <td>${client.firstname}</td>
            <td>${client.lastname}</td>
            <td>${client.fathersname}</td>
            <td>${client.address}</td>
            <td>${client.fonenumber}</td>
            <td><button><a href="/ui/rooms/delete/${client.code}">Delete </a></button></td>
        </tr>
    </#list>
</table>
<center><button><a href="/index.html">Return</a></button></center>
</body>
</html>