package org.devatom.clubmusical;

public class Batteur extends Artiste
{
	public Batteur(String prenom, String nom, int anciennete, String style)
	{
		super(prenom, nom, anciennete, style, "Batteur");
	}
}


	
	/*public void battre(){
		//TODO cette méthode doit être remplacée par la méthode héritée "presenter()"
		System.out.println("Prénom Nom, je suis batteur depuis " + this.anciennete + " ans, mon style : " + this.style);*/