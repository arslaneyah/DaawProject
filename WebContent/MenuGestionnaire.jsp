<%@page import="modele.GestionVoiture"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Espace Gestionnaire</title>
    <style>
        body {
            background-color:darkslategrey ;
            
        }
        a {text-decoration: none ;
        	color:beige ;
        }
        
        h1 {
            color: darkgray ;
            font-family: sans-serif ;
            text-align: center;
            font-size: 50px;
        }
        ul{
			
			padding:10px ;
			margin-top: 150px ;
			margin-left:50px ;
			margin-right:50px ;        
        	
        }
       li {
            display: inline-block ;
            margin: auto ;
            padding: 25px ; 
            height:20px ;
            width: 150px ;
            background-color: cadetblue ;
            position: relative;
            text-align: center ;
            color:beige ;
            font-family: 'Open Sans', sans-serif;
            border-radius: 10px ;
            font-size: 20px ;
           
            
        }
        li:hover {
            background-color:coral ;
           
        }
        
</style>
</head>
<body>

<h1 align="center" >Espace Gestionnaire: <% out.print(request.getSession().getAttribute("user")) ;%></h1>
<ul>
<li><a  href="insertion.jsp">Insertion</a></li>
<li><a  href="Supression.jsp">Supression </a></li>
<li><a  href="RendreV.jsp">Rendre Voiture</a></li>
<li><a  href="Recette.jsp">Recette</a>
<li><a  href="LogoutServlet">logout</a></li>
</ul>

</body>
</html>