
package org.devatom.clubmusical;

import java.util.ArrayList;

public class ClubMusical {
    public String nom;
    public String president;
    ArrayList<Artiste> artistes;
    

    public ClubMusical(){
        this.nom = "";
        this.artistes = new ArrayList<Artiste>();
    }
    


	public void add(Artiste artiste)
	{
		this.artistes.add(artiste);
	}
	
	
    }
}

/*public void afficher(){
    System.out.println("Le club " + this.nom + " dirigé par " + this.directeur + " accueille :");
    for (Artiste artiste : this.artistes){
        System.out.println(artiste.presenter());
    }*/