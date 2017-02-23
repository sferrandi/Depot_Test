package org.devatom.clubmusical;

public class Bassiste extends Artiste
{
	
	public Bassiste(String prenom, String nom, int anciennete, String style)
	{
		super(prenom, nom, anciennete, style, "Bassiste");
	}
}



/*public void gratter(){
	//TODO cette méthode doit être remplacée par la méthode héritée "presenter()"
	System.out.println("Prénom Nom, je suis bassiste depuis " + this.anciennete + " ans, mon style : " + this.style);
}*/