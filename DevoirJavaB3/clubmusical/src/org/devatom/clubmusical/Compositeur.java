package org.devatom.clubmusical;

public class Compositeur extends Artiste
{
	public Compositeur(String prenom, String nom, int anciennete, String style)
	{
		super(prenom, nom, anciennete, style, "Compositeur");
	}
}


/*public void composer(){
	//TODO cette méthode doit être remplacée par la méthode héritée "presenter()"
	System.out.println("Prénom Nom, je suis compositeur depuis " + this.anciennete + " ans, mon style : " + this.style);
}*/