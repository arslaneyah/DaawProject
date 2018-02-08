<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reserver une Voiture</title>
        <style>
        body {
        		background-color:beige ;
        
        			}
            label {
                display: block ;
                
            }
            fieldset {
               	border-radius: 20px ;
               	background-color : rgba(21, 0, 0, 0.8);
                padding: 40px 40px 40px 40px ;
				color : beige ;
                width: 200px ;
                
                margin: auto ;
                margin-top: 150px ;
                position: relative ;
                
            }
h1 { color: black ;
 font-family: 'Raleway',sans-serif;
  font-size: 62px;
   font-weight: 800;
    line-height: 72px; 
    margin: 0 0 24px;
     text-align: center;
      text-transform: uppercase; }
      label {
      font-family: 'Raleway',sans-serif;}
        
        </style>
</head>
<body>
	<form method="post" action="http://localhost:8080/LocationVoiture/ReservationServlet">
	<fieldset>
		<label>Matricule</label>
		<input name="mat" type="number">
		<label>Date de Reservation</label>
		<input name="dres" type="date">
		<label>Date de Retour</label>
		<input name="dret" type="date">
		<button type="submit">Reserver</button>
	
	
	</fieldset>
	
	
	
	
	</form>

</body>
</html>