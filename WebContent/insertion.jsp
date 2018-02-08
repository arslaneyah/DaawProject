<html>
<head>
    <title>Insertion Voiture</title>
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
    	<form method="post" action="/LocationVoiture/InsertionServlet">
            
        <fieldset>
    <div>
        <label>Numéro Immatriculation :</label>
        <input type="number" name="mat">
         <label>Marque :</label>
         <input type="text" name="marque">
        <label>Modele :</label>
         <input type="text" name="model">
        <label>Tarif/jour :</label>
         <input type="number" name="tarif">
        
        <label>etat :</label>
        <SELECT name="etat">
            <OPTION></OPTION>
        <OPTION value="Réservé">Résérvé</OPTION>
        <OPTION value="Libre">Libre</OPTION>    
        
        </SELECT>
            
        <button type="submit">insérer</button>
        
        </div>
    
    
        
        
        </fieldset>
  	  </form>
    
    </body>



</html>