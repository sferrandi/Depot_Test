package org.devatom.clubmusical;

public abstract class Artiste
{
	private String nom, prenom, style, role;
	private int temps;
	
	public Artiste(String prenom, String nom, int anciennete, String style, String role)
	{
		this.prenom = prenom;
		this.nom = nom;
		this.style = style;
		this.role = role;
		this.temps = anciennete;

	}
	
	
	public String presenter()
	{
		return this.nom+" "+this.prenom+", je suis "+ this.role+" depuis " + this.temps + " ans, mon style : " + this.style;
	}
	
	
	
	public String getPrenom()
	{
		return this.prenom;
	}
	
	
	
	public void setPrenom(String prenom)
	{
		this.prenom = prenom;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	

	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	
	
	public String getStyle()
	{
		return this.style;
	}
	
	
	
	public void setStyle(String style)
	{
		this.style = style;
	}
	
	
	
	public String getRole()
	{
		return this.role;
	}
	
	
	
	public void setRole(String role)
	{
		this.role = role;
	}
	
	
	
	public int getAnciennete()
	{
		return this.temps;
	}
	
	
	
	public void setAnciennete(int anciennete)
	{
		this.temps = anciennete;
	}

}
