package modele;

public class Voiture {
private int mat ;
private String modele,marque,etat ;
private float tarif ;
public Voiture (int mat,String marque ,String modele,float tarif,String etat ){
	this.mat=mat; this.modele=modele;this.marque=marque ; this.tarif=tarif ;this.etat=etat ;
}
public void setmat(int mat){
	this.mat=mat;
}
public void setmodele(String modele){
	this.modele=modele ;
}
public String getmodele(){
	return modele ;
}
public int getmat(){
	return mat ; 
}
public void setmarque(String marque){
	this.marque=marque ;
}
public String getmarque(){
	return marque ;
}
public String getetat(){
	return etat ;
}
public float gettarif(){
	return tarif;
}
public void settarif(float f){
	tarif=f ;
}
public void setetat(String a){
	etat=a ;
}
}
