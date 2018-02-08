<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <title>Client</title>
    <style>
        body {
            background-color:darkslategrey ;
            
        }
        
        h1 {
            color: darkgray ;
            font-family: sans-serif ;
            text-align: center;
            font-size: 100px;
        }
        ul{
			margin:auto ;
			margin-left:150px ;
			margin-top: 150px ;        
        
        }
      ul  li {
            display: inline-block ;
            margin: auto ;
            padding: 30px ; 
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
        a{
        text-decoration:none ;
        color: beige;
        
        }
    
 	
    	
    
    
    
    
    </style>
    </head>
        <body>
            <h1>Espace Client</h1>
            
            <ul>
			
            <li><a href="http://localhost:8080/LocationVoiture/AfficherListe">listes des voiture</a></li>    
            <li><a href="Reservation.jsp">Reserver</a></li>
            <li><a href="RechercherVoiture.jsp">Rechercher</a></li>
            <li><a href="http://localhost:8080/LocationVoiture/LogoutServlet">Logout</a></li>
            
            </ul>
            
    
        </body>
</html>