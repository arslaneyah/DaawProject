package modele;
import java.time.LocalDate;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


import controle.AfficherListe;

public class GestionVoiture {
	private static ArrayList<Voiture> voitures=new ArrayList<Voiture>() ;
	
	
	public static ArrayList<Voiture> rechercher(int mat){
		ArrayList<Voiture> av= new ArrayList();
		int matr=0; String model=null,marque=null,etat=null ;float trf=0; 
		String url = "jdbc:mysql://localhost:3306/gestionvoiture";
		   Connection con = null;
	       ArrayList res= new ArrayList() ;
		   try{
			   
			  Class.forName("com.mysql.jdbc.Driver");
			   //Connection à la base de données
		        con = DriverManager.getConnection(url,"root","");
		        Statement requete = con.createStatement();
		        ResultSet resultat = requete.executeQuery("Select* FROM voiture Where Matricule="+mat );
		      while (resultat.next()){
		    	  matr=resultat.getInt("Matricule");
		    	  model=resultat.getString("Modele");
		    	  marque=resultat.getString("Marque");
		    	  trf=resultat.getFloat("Tarif");
		    	  etat=resultat.getString("Etat");
			      
		      }

		      

		   } catch(Exception e) { System.out.println("Exception problem");e.printStackTrace();};
		      Voiture v=new Voiture(matr,marque,model,trf,etat);
		      av.add(v);
		      return av ;
		        }
	
	public static int insvoiture(Voiture v){
		//voitures.add(v);
		String url = "jdbc:mysql://localhost:3306/gestionvoiture";
		   Connection con = null;
	       ArrayList res= new ArrayList() ;
		   try{
			   
			  Class.forName("com.mysql.jdbc.Driver");
			   //Connection à la base de données
		        con = DriverManager.getConnection(url,"root","");
		        Statement requete = con.createStatement();
		        int resultat = requete.executeUpdate("INSERT INTO `voiture` (`Marque`, `Modele`, `Matricule`,`Tarif`,`Etat`) VALUES ('"+v.getmarque()+"', '"+v.getmodele()+"', '"+v.getmat()+"', '"+v.gettarif()+"' , '"+v.getetat()+"');" );
		        return resultat ;
	} catch(Exception e) { System.out.println("Exception problem");e.printStackTrace(); return 0 ;}}
	
	
	public static ArrayList<Voiture> getv(){
		return voitures;
	}
	public static void suppvoiture(int mat){
		String url = "jdbc:mysql://localhost:3306/gestionvoiture";
		   Connection con = null;
	       ArrayList res= new ArrayList() ;
		   try{
			   
			  Class.forName("com.mysql.jdbc.Driver");
			   //Connection à la base de données
		        con = DriverManager.getConnection(url,"root","");
		        Statement requete = con.createStatement();
		        int resultat = requete.executeUpdate("DELETE FROM `voiture` WHERE `Matricule` ="+mat );
		
	} catch(Exception e) { System.out.println("Exception problem");e.printStackTrace();};
	}
	public static ArrayList<Voiture> Affichertt(){
		ArrayList<Voiture> av= new ArrayList();
		int matr=0; String model=null,marque=null,etat=null ;float trf=0; 
		String url = "jdbc:mysql://localhost:3306/gestionvoiture";
		   Connection con = null;
	       ArrayList res= new ArrayList() ;
		   try{
			   
			  Class.forName("com.mysql.jdbc.Driver");
			   //Connection à la base de données
		        con = DriverManager.getConnection(url,"root","");
		        Statement requete = con.createStatement();
		        ResultSet resultat = requete.executeQuery("Select* FROM voiture ;");
		      while (resultat.next()){
		    	  matr=resultat.getInt("Matricule");
		    	  model=resultat.getString("Modele");
		    	  marque=resultat.getString("Marque");
		    	  trf=resultat.getFloat("Tarif");
		    	  etat=resultat.getString("Etat");
			      Voiture v=new Voiture(matr,marque,model,trf,etat);
			      av.add(v);
		      }

		      

		   } catch(Exception e) { System.out.println("Exception problem");e.printStackTrace();};

		      return av ;
		        }
		public static boolean reserver(int mat, LocalDate dres ,LocalDate dret,String id ){
			 String etat=null ; LocalDate date=null; 
			
			String url = "jdbc:mysql://localhost:3306/gestionvoiture";
			 Connection con = null;
		       ArrayList res= new ArrayList() ;
			   try{
				   int nbrj=dret.getDayOfMonth()-dres.getDayOfMonth();
				   int prix =0;
					 
						   Class.forName("com.mysql.jdbc.Driver");
			        con = DriverManager.getConnection(url,"root","");
			        Statement requete = con.createStatement();
			        ResultSet resultat = requete.executeQuery("Select `Tarif`,`Etat` FROM voiture Where Matricule="+mat );
			        if(resultat.next()){
			        	etat=resultat.getString("Etat");
			        	prix=resultat.getInt("Tarif")*nbrj ;
			        }
			       ResultSet resultat2 = requete.executeQuery("Select `Date de retour` FROM reserver Where Matricule="+mat);
			        if(resultat2.next()){
			        	date =resultat.getDate("Date de retour").toLocalDate();
			        	
			        }
			        if(etat.equals("Libre")||(dres.isAfter(date))){
			        	int upd =requete.executeUpdate("INSERT INTO `reserver` (`idClient`, `Date de location`, `Date de retour`, `Matricule` ,`Prix`) VALUES ('"+id+"', '"+dres+"', '"+dret+"', '"+mat+"', '"+prix+"'); ");
			        	upd=requete.executeUpdate("UPDATE `voiture` SET `Etat` = 'Réservé' WHERE `voiture`.`Matricule` ="+mat);
			        	return true ;
			        }else
			        	return false ; 
		}catch(Exception e) { System.out.println("Exception problem");e.printStackTrace();return false;}}
public static boolean rendreV(int mat){ 
	
	String url = "jdbc:mysql://localhost:3306/gestionvoiture";
	   Connection con = null;
	   try{ 
		   
		  Class.forName("com.mysql.jdbc.Driver");
		   //Connection à la base de données
	        con = DriverManager.getConnection(url,"root","");
	        Statement requete= con.createStatement();
	        ResultSet rst=requete.executeQuery("SELECT `Matricule` From `reserver` WHERE Matricule="+mat );
	        if(rst.next()){
	        int upd = requete.executeUpdate("UPDATE `voiture` SET `Etat` = 'Libre' WHERE `Matricule`="+mat);
			upd=requete.executeUpdate("DELETE FROM `reserver` WHERE `Matricule` ="+mat);
			return true ;}
	        else return false ;
}catch (Exception e){ e.printStackTrace();return false ;}}

public static int recetteJ(){
	LocalDate date = LocalDate.now();
	String url = "jdbc:mysql://localhost:3306/gestionvoiture";
	String rq ="SELECT `Matricule` FROM `reserver` WHERE `Date de location`="+date ;
	   Connection con = null;
	   try{
		   
		  Class.forName("com.mysql.jdbc.Driver");
		   //Connection à la base de données
	        con = DriverManager.getConnection(url,"root","");
	        Statement requete=con.createStatement();
	        ResultSet rst=requete.executeQuery("SELECT `Prix` From `reserver` WHERE `Date de location`= '"+LocalDate.now()+"'" );
	        int rec=0 ;
	        while (rst.next()){
	        	rec=+rst.getInt("Prix");
	        //	System.out.println("hhhh");
	        }
	        return rec ;
	   
	   }catch(Exception e){ e.printStackTrace(); return -99 ; }
}
	public static void main(String []args){
		//System.out.println(AfficherListe.getv(0).getmodele());
		/*LocalDate d= LocalDate.now();
		boolean b=reserver(2569,d,d.plusDays(1),"flen123");
		System.out.println(b);*/
	System.out.println(recetteJ());
	
	}
	
	}


	

