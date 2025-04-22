package a11_1;

import a11_1.Listenelement;

public class Listenelement {
	
	public int wert;
	public Listenelement nachfolger;
	
	public Listenelement(int wert) {
		this.wert = wert;
		nachfolger = null;
	}
	
	public Listenelement(int wert, Listenelement nachfolger) {
		this.wert = wert;
		this.nachfolger = nachfolger;
	}
	
	public String toString() {
		if(nachfolger == null) {
			return wert + ";" ;
		}
		return wert + ", " + nachfolger.toString();
		
	}
	public int summe() {
		if(nachfolger == null) {
			return wert ;
		}
		return wert + nachfolger.summe();
	}
	
	public void addieren(int zahl) {
		wert += zahl;
		if (nachfolger != null)
			nachfolger.addieren(zahl); 
	}
	
	public void entfernenRechts() {
		if (nachfolger != null && nachfolger.nachfolger != null) {
			nachfolger = null;
		}else if(nachfolger != null) {
			nachfolger.entfernenRechts();
			
		}
	}
	
	public void anhängen(Listenelement anderesElement) {
	
		if(nachfolger == null) {
			nachfolger = anderesElement;
		}else {
			nachfolger.anhängen(anderesElement);
		}
	}
}

