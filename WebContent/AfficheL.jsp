<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
   import=" controle.AfficherListe"
import= "modele.GestionVoiture"
import= "modele.Voiture"
import="java.util.ArrayList"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Afficher Liste des Voitures</title>
    <style type="text/css">
     body {
            background-color:#003355 ;
            background-image : url(pic2.jpg) ;
            background-repeat: no-repeat;
            background-size: cover;
            
        
        }
    table {
    	margin: auto ;
    	margin-top: 200px ;
    	border-spacing:0 ;
    	border-radius: 20px ;
    	position: relative ;
    }
   table td{
    width :120px ;
    text-align : center ;
  	border-color: rgba(255, 255,255, 0.6);
  

    background-color: rgba(255, 255, 255, 0.8);
    }
    table th{
    
      	border-color: rgba(255, 255,255, 0.6);
    background-color: rgba(255, 255, 255, 0.8);
    }
    th, tr, td{
    	
    	border: 1px solid ;
    	    
    }

    
    
    
    </style>

</head>
<body>
<%!int i; %>
	<table>
	<tr>
	<th >Marque</th>
	<th>Modele</th>
	<th>Matricule</th>
	<th>Tarif</th>
	<th>Etat</th>
	</tr>
	
	<% for (i=0;i<GestionVoiture.Affichertt().size();i++){
		out.println("<tr>");
		out.println("<td>"+GestionVoiture.Affichertt().get(i).getmarque()+"</td>");
		out.println("<td>"+GestionVoiture.Affichertt().get(i).getmodele()+"</td>");
		out.println("<td>"+GestionVoiture.Affichertt().get(i).getmat()+"</td>");
		out.println("<td>"+GestionVoiture.Affichertt().get(i).gettarif()+"</td>");
		out.println("<td>"+GestionVoiture.Affichertt().get(i).getetat()+"</td>");
		out.println("</tr>");
	}
	
	
	%>
	
	
	
	
	</table>

</body>
</html>