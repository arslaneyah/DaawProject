<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="modele.GestionVoiture"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>recette du jour</title>
<style type="text/css">
        body {
    
            background-image : url(pic3.jpg) ;
            background-repeat: no-repeat;
            background-size: cover;
            
        
        }
        h1 { color: beige ;
 font-family: 'Raleway',sans-serif;
  font-size: 62px;
   font-weight: 800;
    line-height: 72px; 
    margin: 0 0 24px;
     text-align: center;
      text-transform: uppercase; }
      label {
      font-family: 'Raleway',sans-serif;}
      div{
      background-color: rgba(54, 0, 0, 0.6);
      border-radius: 20px ;
      }
        
        </style>
</head>
<body>
<div>
<h1>La recette du jour =  <%out.print(GestionVoiture.recetteJ()); %> DA</h1>
</div>
</body>
</html>