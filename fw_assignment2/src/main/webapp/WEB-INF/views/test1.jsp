<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Company</title>
 
    <!-- ë°ìí ì¹ ë§ë¤ê¸° -->
    <!-- 1. ëª¨ë°ì¼ì© css -->
    <link rel="stylesheet" href="/main/resources/css/test1_2.css" media="(max-width:600px)">
 
    <!-- 2. ë°ì¤í¬íì© ì¸ë¶ ì¤íì¼ìí¸ ì ì© -->
    <link rel="stylesheet" href="/main/resources/css/test1_1.css" media="(min-width:600px)">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	

</head>
<body>
    
    <div id="page">
 
        <header>
            <div id="logo">
                <img src="/main/resources/image/logo.png" alt="Logo">
            </div>

            <div id="top_menu">
                <a href="#">HOME</a> | 
                <a href="#">NOTICE</a> |
<!--                 <a href="#">LOGIN</a> | -->
                <a href="#">JOIN</a> | 
                <form action = "/main/result.do" method = "post">	
                		ID <input class="login" name = "id" id="id"> PW <input type="password" name = "pwd" class="login" id="pwd"> 
                		<button type="submit" id="login_btn">LOGIN</button>
             	</form>
            </div>
 
            <nav>
                <ul>
                    <li><a href="#">COMPANY</a></li>
                    <li><a href="#">PRODUCT</a></li>
                    <li><a href="#">CUSTOMER</a></li>
                    <li><a href="#">SERVICE</a></li>
                    <li><a href="#">RECRUIT</a></li>
                </ul>
            </nav>
 
        </header>
 
        <article id="content">
            <section id="main">
                <img id="main_img" src="/main/resources/image/main_img.png" alt="main img" >
            </section>
            <section>
                <ul id="banner">
                    <li><a href="#"><img src="/main/resources/image/banner1.png" alt="banner1"></a></li>
                    <li><a href="#"><img src="/main/resources/image/banner2.png" alt="banner2"></a></li>
                </ul>
 
            </section>
            <section>
            	<div th:text="${message}"></div>
            </section>
 
        </article>
 
        <footer>
            <img id="address_img" src="/main/resources/image/address.png" alt="address">
        </footer>
 
    </div>
</body>
</html>