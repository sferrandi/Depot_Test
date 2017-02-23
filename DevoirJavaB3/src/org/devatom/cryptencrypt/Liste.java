package org.devatom.cryptencrypt;

public class Liste {
	private Cellule tete;
	private int size;
	
	public Liste(){
		this.tete = null;
		this.size = 0;
	}
	
	private Liste(Liste liste){
		this();
		if (liste.size > 0){
			Cellule cellParcours = liste.tete;
			this.add(new Cellule(cellParcours));
			while (cellParcours.hasNext()){
				cellParcours = cellParcours.next();
				this.add(new Cellule(cellParcours));
			}
		}
	}
	
	public Liste(Liste liste, int decallage){
		this(liste);
		if (decallage < 0) { decallage = 0; }
		if (decallage >= this.size) { decallage = this.size - 1; }
		
		for (int i = 0; i < decallage; i++){
			Cellule cellToMove = this.get(this.size - 1);
			cellToMove.setNext(this.tete);
			this.tete.setPrevious(cellToMove);
			cellToMove.previous().setNext(null);
			this.tete = cellToMove;
		}
	}
	
	public void populate(){
		String strPopulate = "aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZ -_:/1234567890.";
		for (int i = 0; i < strPopulate.length(); i++){
			this.add(new Cellule(strPopulate.charAt(i)));
		}
	}
	
	public void add(Cellule cellule){
		if (this.size == 0){
			this.tete = cellule;
		}else{
			this.get(this.size - 1).setNext(cellule);
			cellule.setPrevious(this.get(this.size - 1));
		}
		this.size++;
	}
	
	public void insert(Cellule cellule, int position){
		if (position < 0){ position = 0; }
		this.get(position).setPrevious(cellule);
		cellule.setNext(this.get(position));
		if (position == 0){
			this.tete = cellule;
		}
	}

	public Cellule get(int indice){
		if (indice >= 0){
			if (indice <= this.size){
				Cellule celparcours = this.tete;
				int i = 0;
				while (i < indice){
					celparcours = celparcours.next();
					i++;
				}
				return celparcours;
			}else{
				return null;
			}
		}else{
			return null;
		}
	}
	
	public int find(char charAt) {
		int retVal = 0, idx = 0;
		boolean trouve = false;
		while (!trouve){
			trouve = (this.get(idx).getData() == charAt);
			if (trouve) { 
				retVal = idx;
			}
			idx++;
		}
		return retVal;
	}
	
	@Override
	public String toString() {
		String retVal = "";
		if (this.size > 0){
			Cellule celparcours = this.tete;
			retVal += celparcours.getData() + "|";
			
			while (celparcours.hasNext()){
				celparcours = celparcours.next();
				retVal += celparcours.getData() + "|";
			}
			
			if (retVal.length() > 1){
				retVal = retVal.substring(0, retVal.length() - 1);
			}
		}
		return retVal;
	}
}
