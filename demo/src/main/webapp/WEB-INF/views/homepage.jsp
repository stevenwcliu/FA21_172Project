<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
<head>
<!--<meta charset="utf-8">-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Homepage</title>
	
<link href="css/layout.css" rel="stylesheet"/>
	
</head>

<body>
<!-- page heading -->
<h1>Coffee Shop 
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
<div class="slideshow">
<div class= "slideAnimation fade">
	<img src="img/latte.jpg" style= "width:100%">
</div>
	
<div class= "slideAnimation fade">
	<img src="img/Hot-Chocolate.jpg" style= "width:100%">
</div>
	
<div class= "slideAnimation fade">
	<img src="img/black coffee.jpg" style= "width:100%">
</div>
	
<a class="prev" onclick="nextImage(-1)">&#8826;</a>
<a class="next" onclick="nextImage(1)">&#8827;</a>
	
</div>
<br>
	
<script>
var imageNum =1;
showImage(imageNum);

function nextImage(n){
	showImage(imageNum += n);
}

function currentImage(n){
	showImage(imageNum = n);
}

function showImage(n){
	var i;
	var slides = document.getElementsByClassName("slideAnimation");
	if(n > slides.length) {imageNum = 1}
	if(n < 1) {imageNum = slides.length}
	for(i=0; i < slides.length; i++){
		slides[i].style.display = "none";
	}
	slides[imageNum-1].style.display = "block";
}
</script>
	
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
