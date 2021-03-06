<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Form</title>

<link href="css/layout.css" rel="stylesheet"/>
</head>
<body>
<h1>Order page
	<nav>
		<!-- links to each page-->
		<ul>
			<li><a href="/">Homepage</a></li>
			<li><a href="orderpage">Order</a></li>
			<li><a href="menu">Menu</a></li>
			<li><a href="">Order History</a></li>
			<li><a herf="">Account</a></li>
		</ul>
	
	</nav>
</h1>
<h4>
        <form:form action="orderpage" method="post" modelAttribute="order">
            <form:label path="drinkName">Drink name:</form:label><br/>
            <form:radiobutton path="drinkName" value="Black Coffee"/>Black Coffee - $4.25<br/>
            <form:radiobutton path="drinkName" value="Latte"/>Latte- $4.50 <br/>
            <form:radiobutton path="drinkName" value="Cold Brew"/>Cold Brew - $4.75 <br/>
            <form:radiobutton path="drinkName" value="Hot Chocolate"/>Hot Chocolate - $4.25 <br/> 
            <br/>
             
            <form:label path="size">Size:</form:label><br/>
            <form:radiobutton path="size" value="Small"/>Small <br/>
            <form:radiobutton path="size" value="Medium" /> Medium - add $0.50 <br/>
            <form:radiobutton path="size" value="Large" />Large - add $1.00 <br/>
            <br/>
             
             <form:label path="temp"> Hot or Cold ? </form:label><br/>
             <form:radiobutton path="temp" value="Hot" />Hot &ensp; &ensp;
        	<form:radiobutton path="temp" value="Cold"/>Cold <br/>
             <br/>
             
             <form:label path="milk"> Milk type: </form:label><br/>
             <form:radiobutton path="milk" value="No Milk" />No Milk <br/>
             <form:radiobutton path="milk" value="Whole Milk"/>Whole Milk<br/>
             <form:radiobutton path="milk" value="Low-fat Milk"/>Low-fat Milk<br/>
             <form:radiobutton path="milk" value="Soy Milk"/>Soy Milk - add $0.20 <br/>
             <form:radiobutton path="milk" value="Almond Milk"/>Almond Milk - add $0.20 <br/>
             <br/>
             
             <form:label path="topping"> Topping (No extra cost): </form:label> <br/>
             <form:checkbox path="topping" value="Whipped Cream" />Whipped Cream &ensp;
             <form:checkbox path="topping" value="Chocolate Drizzle"/>Chocolate Drizzle &ensp;
             <form:checkbox path="topping" value="Caramel Drizzle"/>Caramel Drizzle <br/>
             <br/>
            <form:button>Order</form:button>
        </form:form>
    </h4>
    <footer>
	<h3>
		We hope you visit us, and get some coffee!
		
		<h2>
		Phone: (012)123-4567
		</h2>
	</h3>
	
</footer>
</body>
</html>
