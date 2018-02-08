package modele;

public class Client {
	private String nom,prenom ,mdp,id;
	private int num  ; 
	
	
	public Client (String id ,String nom,String prenom,int num,String mdp){
		this.id=id ; this.nom=nom ; this.prenom=prenom ; this.num=num ; this.mdp=mdp ;
	}
	public String getnom(){
		return nom ;
	}
	public String getid(){
		return id ;
	}
	public String getpr(){
		return prenom ; 
	}
	public int getnum(){
		return num ;
	}
	public String getmdp(){
		return mdp ;
	}

}
