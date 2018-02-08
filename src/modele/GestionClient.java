package modele;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class GestionClient {
	private static ArrayList<Client> clients=new ArrayList<Client>();
	public static int insclient(Client c){

		String url = "jdbc:mysql://localhost:3306/gestionvoiture" ;
		Connection con= null ;
		try{
			Class.forName("com.mysql.jdbc.Driver");
	        con = DriverManager.getConnection(url,"root","");
	        Statement requete = con.createStatement();
	        int resultat = requete.executeUpdate("INSERT INTO `client` (`Identifiant`, `Nom`, `Prenom`,`Telephone`,`Mot de Passe`) VALUES ('"+c.getid()+"', '"+c.getnom()+"', '"+c.getpr()+"', '"+c.getnum()+"' , '"+c.getmdp()+"');" );
			return resultat ;
		}catch (Exception e){System.out.println("Exception probleme"); e.printStackTrace(); return 0 ;}

		
	}
	public static Client rechercher(String id){
		int num=0; String nom=null,prenom=null,idf=null, pass=null; 
		String url = "jdbc:mysql://localhost:3306/gestionvoiture";
		   Connection con = null;
	       ArrayList res= new ArrayList() ;
		   try{
			   
			  Class.forName("com.mysql.jdbc.Driver");
			   //Connection à la base de données
		        con = DriverManager.getConnection(url,"root","");
		        Statement requete = con.createStatement();
		        ResultSet resultat = requete.executeQuery("SELECT * FROM `client` WHERE `Identifiant` = '"+id+"'");
		      if (resultat.next()){
		    	  nom=resultat.getString("Nom");
		    	  prenom=resultat.getString("Prenom");
		    	  idf=resultat.getString("Identifiant");
		    	  num=resultat.getInt("Telephone");
		    	  pass=resultat.getString("Mot de Passe");
			      
		      }

		      

		   } catch(Exception e) { System.out.println("Exception problem");e.printStackTrace();};
		      Client v=new Client(idf,nom,prenom,num,pass);
		      return v ;
		        }
	public static void main (String[]args){
		
		
		//System.out.println(rechercher("flen123","flen7895").getnom());
	}

}
