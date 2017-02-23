package org.devatom.clubmusical;

public class Chanteur extends Artiste
{
	public Chanteur(String prenom, String nom, int anciennete, String style)
	{
		super(prenom, nom, anciennete, style, "Chanteur");
	}
}


/*public void chanter(){
	//TODO cette méthode doit être remplacée par la méthode héritée "presenter()"
	System.out.println("Prénom Nom, je suis chanteur depuis " + this.anciennete + " ans, mon style : " + this.style);
} */