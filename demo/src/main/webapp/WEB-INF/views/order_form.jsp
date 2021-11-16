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
			<li><a href="/" target="_blank">Homepage</a></li>
			<li><a href="orderpage" target="_blank">Order</a></li>
			<li><a href="menu" target="_blank">Menu</a></li>
			<li><a href="" target="_blank">Order History</a></li>
			<li><a herf="" target="_blank">Account</a></li>
		</ul>
	
	</nav>
</h1>
<h4>
        <form:form action="orderpage" method="post" modelAttribute="order">
            <form:label path="drinkName">Drink name:</form:label>
            <form:radiobutton path="drinkName" value="Black Coffee"/>Black Coffee
            <form:radiobutton path="drinkName" value="Latte"/>Latte
            <form:radiobutton path="drinkName" value="Cold Brew"/>Cold Brew
            <form:radiobutton path="drinkName" value="Hot Chocolate"/>Hot Chocolate
            <br/><br/>
             
            <form:label path="size">Size:</form:label>
            <form:radiobutton path="size" value="Small"/>Small
            <form:radiobutton path="size" value="Medium" /> Medium
            <form:radiobutton path="size" value="Large" />Large
            <br/>
             
             <form:label path="temp"> Hot or Cold ? </form:label>
             <form:radiobutton path="temp" value="Hot" />Hot
             <form:radiobutton path="temp" value="Cold"/>Cold
             <br/>
             
             <form:label path="milk"> Milk type: </form:label>
             <form:radiobutton path="milk" value="No Milk" />No Milk
             <form:radiobutton path="milk" value="Whole Milk"/>Whole Milk
             <form:radiobutton path="milk" value="Low-fat Milk"/>Low-fat Milk
             <form:radiobutton path="milk" value="Soy Milk"/>Soy Milk
             <form:radiobutton path="milk" value="Almond Milk"/>Almond Milk
             <br/>
             
             <form:label path="topping"> Topping: </form:label>
             <form:radiobutton path="topping" value="Whipped Cream" />Whipped Cream
             <form:radiobutton path="topping" value="Chocolate Drizzle"/>Chocolate Drizzle
             <form:radiobutton path="topping" value="Caramel Drizzle"/>Caramel Drizzle
             <br/>
             
            
                 
            <form:button>Register</form:button>
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
