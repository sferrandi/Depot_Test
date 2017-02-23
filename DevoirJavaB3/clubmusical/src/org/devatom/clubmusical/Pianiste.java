package org.devatom.clubmusical;

public class Pianiste extends Artiste
{
	public Pianiste(String prenom, String nom, int anciennete, String style)
	{
		super(prenom, nom, anciennete, style, "Pianiste");
	}
}


/*public class Pianiste {
	public String nom, prenom, style;
	public int anciennete;
	
	public void pianoter(){
		//TODO cette méthode doit être remplacée par la méthode héritée "presenter()"
		System.out.println("Prénom Nom, je suis pianiste depuis " + this.anciennete + " ans, mon style : " + this.style);
	}
}*/