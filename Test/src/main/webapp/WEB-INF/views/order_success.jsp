<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Success</title>
<style type="text/css">
    span {
        display: inline-block;
        width: 200px;
        text-align: left;
    }
</style>
</head>
<body>
    <div align="center">
        <h2>Order Succeeded!</h2>
        <span>Drink name:</span><span>${ord.drinkName}</span><br/>
        <span>Size:</span><span>${ord.size}</span><br/>
        <span>Hot or Cold:</span><span>${ord.temp}</span><br/>
        <span>Milk type:</span><span>${ord.milk}</span><br/>
        <span>Topping:</span><span>${ord.topping}</span><br/>
        <span>Price: $</span><span>${ord.price}</span><br/>
        <a href="/">Return to Homepage</a>
    </div>
</body>
</html>
