<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Organizer</title>
      <link rel="stylesheet" type="text/css" href="/css/style.x83653.css"/>
</head>
<body>
<h1>Organizer</h1>
<h3>Add task to list</h3>
<form action="/add" method="post">
    <table border="1px">
        <tr>
            <th>
                <label>Priority</label>
                <input type="number" name="priorityId">
            </th>
            <th>
                <label>Description</label>
                <input type="text" name="description">
            </th>
            <th>
                <label>Date</label>
                <input type="date" name="date">
            </th>

            <th>
                <input type="submit" value="add task">
            </th>

        </tr>

    </table>
</form>
<br>
<h2>Task list(task count : ${taskSize})</h2>
<table border="1px">
    <tr>
        <th>Id</th>
        <th>Priority</th>
        <th>Task description</th>
        <th>Date</th>
        <th>Delete from list</th>
    </tr>
    <#list taskList as task>
    <tr>
        <th>${task.id}</th>
        <th>${task.priorityId}</th>
        <th>${task.description}</th>
        <th>${task.date}</th>
        <th><a href="${'/delete/'+task.id}">Delete</a></th>
    </tr>
</#list>
</table>
</body>
</html>