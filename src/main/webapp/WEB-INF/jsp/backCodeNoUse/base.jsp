<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>charitybuzz</title>

<style type="text/css">
* {
	 margin:0;
	 padding:0;
}
body {
	//background:#cfedcd;
	font-size:12px;
}
ul {
	list-style-type:none;
}
#container {
	margin: 0 auto;
    text-align: left;
    width: 988px;
    margin-top:20px;
}
#header {
	background-color: green;
	margin-bottom:20px;
}
#header #logo {
    width: 500px;
	//background-color: yellow;
}
#header #logIn {
	//background-color: red;
	height:150px;
	margin:0 120px;
}
#page {
	background-color: blue;
}
#nav {
	width: 500px;
	float: left;
}
#nav ul {
	background:#fff ;
	color:green;
	height:30px;
	line-height:30px;
	text-align:left;
	background-color: pink;
}
#nav ul li {
	display:inline;
}
#nav ul li a {
	text-decoration:none;
	color:green;
}
#nav ul li a:hover {
	color:#f60;
}
#social {
	width: 400px;
	float: right;
}
#social ul {
	background:#fff ;
	color:green;
	height:30px;
	line-height:30px;
	text-align:left;
	background-color: orange;
}
#social ul li {
	display:inline;
}
#social ul li a {
	text-decoration:none;
	color:green;
}
#social ul li a:hover {
	color:#f60;
}
#HomePageOnly {
	clear: both;
	background-color: #BBB;
}




#sidebar {
	height:300px;
	width: 300px;
	float:left;
	background-color: #CCC;
}
#mainRight {
	height:300px;
	width: 650px;
	float:right;
	background-color: #CCC;
}
#liveAuctions {
	height:300px;
	width: 650px;
	float:left;
	background-color: #CCC;
}
#itemsClosing {
	height:300px;
	width: 300px;
	float:right;
	background-color: #CCC;
}

#footer {
	clear: both;
}




</style>
</head>
<body>
	<div id="container">
		<div id="header">
			<span id="logo">
				<a href="http://www.charitybuzz.com/"><img width="470" height="67" src="http://assets3.charitybuzz.com/assets/c6fb8a079/images/logo-high-res-retina.png" alt="Charitybuzz Logo"/></a>
			</span>
			<span id="logIn">
				<input type="button" id="btnLogin" value="btnLogin"/>
				<input type="button" id="Register" value="Register"/>
				<input type="text" id="Search" value="Search"/>
			</span>
		</div>
		<div id="page">
			<div id="boxContent">
				<div id="nav">
					<ul>
						<li>Home</li>
						<li>Auctions</li>
						<li>Blog</li>
						<li>Testimonials</li>
						<li>Contact Us</li>
						<li>Dream Big NEW</li>
					</ul>
				</div>
				<div id="social">
					<ul>
						<li>F</li>
						<li>T</li>
						<li>F</li>
						<li>T</li>
						<li>F</li>
						<li>T</li>
					</ul>
				</div>
				<div id="HomePageOnly-top">
					<div id="sidebar">sidebar</div>
					<div id="mainRight">mainRight</div>
				</div>
				<div id="HomePageOnly-down">
					<div id="liveAuctions">liveAuctions</div>
					<div id="itemsClosing">itemsClosing</div>
				</div>
			</div>
			<div id="footer">footer</div>
		</div>
	</div>
</body>
</html>