<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
   import=" controle.RechVoiture"
import= "modele.GestionVoiture"
import= "modele.Voiture"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<% Voiture v=(Voiture)session.getAttribute("rst"); %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Afficher Voiture</title>
    <style type="text/css">
     body {
            background-color:#003355 ;
            background-image : url(637990904.jpg) ;
            background-repeat: no-repeat;
            background-size: cover;
            
        
        }
    table {
    	margin: auto ;
    	margin-top: 200px ;
    	border-collapse: collapse;
    	position: relative ;
    }
   table td{
    width :120px ;
    text-align : center ;
  	border-color: rgba(255, 255,255, 0.3);
    background-color: rgba(255, 255, 255, 0.3);
    }
    table th{
      	border-color: rgba(255, 255,255, 0.3);
    background-color: rgba(255, 255, 255, 0.3);
    }
    th, tr, td{
    	
    	border: 1px solid ;
    	    
    }

    
    
    
    </style>

</head>
<body>
	<table>
	<tr>
	<th >Marque</th>
	<th>Modele</th>
	<th>Matricule</th>
	<th>Tarif</th>
	<th>Etat</th>
	</tr>
	<tr>
	<td><%out.print(v.getmarque()); %></td>
	<td><%out.print(v.getmodele()); %></td>
	<td><%out.print(v.getmat()); %></td>
	<td><%out.print(v.gettarif()); %></td>
	<td><%out.print(v.getetat()); %></td>
	
	
	</tr>
	
	
	</table>

</body>
</html>