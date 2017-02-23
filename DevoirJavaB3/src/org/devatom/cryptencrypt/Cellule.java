package org.devatom.cryptencrypt;

public class Cellule {
	private Cellule previous, next;
	private Character data;
	
	public Cellule(){
		this.previous = null;
		this.next = null;
	}
	
	public Cellule(Character data){
		this();
		this.data = data;
	}
	
	public Cellule(Cellule cell){
		this();
		this.data = cell.data;
		this.previous = cell.previous;
		this.next = cell.next;
	}
	
	public Cellule(Cellule previous, Character data){
		this.previous = previous;
		if (previous.hasNext()){
			this.next = previous.next();
		}
		this.data = data;
	}
	
	public Character getData(){ return this.data; }
	public void setData(Character data) { this.data = data; }
		
	public boolean hasNext(){ return (this.next != null); }
	public boolean hasPrevious(){ return (this.previous != null); }
	
	public Cellule next(){ return this.next; }
	public Cellule previous(){ return this.previous; }
	public void setNext(Cellule next) { 
		this.next = next; 
	}
	public void setPrevious(Cellule prev) { 
		this.previous = prev; 
	}
}
