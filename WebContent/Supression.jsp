<html>
<head>
    <title>Suppression voiture</title>
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
    <fieldset>
    <form method="post" action="/LocationVoiture/Supression">
    
    <label>Immatriculation du modele a supprimer :</label>
        <input name="mat" type="number">
        <button type="submit">Supprimer</button>     
    </form>
    </fieldset>
    </body>


</html>