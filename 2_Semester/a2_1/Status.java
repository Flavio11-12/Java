package a2_1;

public enum Status {
	Krankenpflegerin,
	Krankenpfleger;
	
	public String ansprache(String vorname, String nachname) {
		switch(this) {
		case Krankenpflegerin: return "Krankenpflegerin " + vorname + " " + nachname;
        case Krankenpfleger: return "Krankenpfleger " + vorname + " " + nachname;
        default: return "Nicht angegeben " + vorname + " " + nachname;
		}
	}
}
