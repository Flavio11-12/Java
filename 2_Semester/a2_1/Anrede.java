package a2_1;

public enum Anrede {
	Herr,
	Frau;
	
	public String ansprache() {
		switch(this) {
		case Herr: return "Herr "; 
		case Frau: return "Frau ";
		default: return "nicht angegeben ";
		}
	}
}
