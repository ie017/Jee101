<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form align="center" action="HelloServlet" method="post">
    <h1><%= "Do same math!" %></h1>
    <label>first nmbr :</label>
    <input type="text" name="a" required/>
    <label>second nmbr :</label>
    <input type="text" name="b" required/>
    <br/>
    <br/>
    <input value="Get result" type="submit"/>
</form>
</body>
</html>