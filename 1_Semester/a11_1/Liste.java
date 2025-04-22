package a11_1;

import a11_1.Listenelement;

public class Liste {
	
	public Listenelement erstesElement;
	
	public int Arraylänge;
	public int speicher;
	
	public Liste() {
		
	}
	
	public Liste(Listenelement erstesElement) {
		this.erstesElement = erstesElement;
	}
	
	public void hinzufügen(int wert) {
		Listenelement h = erstesElement;
		erstesElement = new Listenelement(wert);
		Arraylänge++;
		speicher = wert;
		erstesElement.nachfolger = h;
	}
	
	public void entfernen() {
		if (erstesElement != null)
		erstesElement = erstesElement.nachfolger;
	}
	
	public String toString() {
		if(erstesElement == null)
			return "-";
		
		return erstesElement.toString();
	}
		public int summe(){
		
		if(erstesElement == null)
			return 0;
		return erstesElement.summe();
	}
	
	public void addiere(int summant) {
		if (erstesElement != null)
			erstesElement.addieren(summant);
		
	}
	
	public void entfernenRechts() {
		
		if (erstesElement == null) {
			return;
		}else {
			erstesElement.entfernenRechts();
		}
	}
	
	public void annhängen(Liste andereListe) {
		
		if(erstesElement == null) {
			erstesElement = andereListe.erstesElement;
			
		}else if(andereListe.erstesElement != null) {
			erstesElement.anhängen(andereListe.erstesElement);
		}
	}
	
	public int [] toArray() {
		int[] x = new int[Arraylänge];
		
		for(int i = 0; i < x.length; i++) {
			x[i] = speicher;
			System.out.print(x[i] + " ");
		}
		return x;
	}
	
}