package org.devatom.clubmusical;

public class Guitariste extends Artiste
{
	public Guitariste(String prenom, String nom, int anciennete, String style)
	{
		super(prenom, nom, anciennete, style, "Guitariste");
	}
}

/*public void gratter(){
	//TODO cette méthode doit être remplacée par la méthode héritée "presenter()"
	System.out.println("Prénom Nom, je suis guitariste depuis " + this.anciennete + " ans, mon style : " + this.style);
}*/