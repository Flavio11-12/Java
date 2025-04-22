package a2_1;

public enum Rang {
	ASSISTENZARZT,
	FACHARZT,
	OBERARZT,
	LEITENDER_OBERARZT,
	CHEFARZT,
	DIREKTOR;
	
	public String ansprache(String vorname, String nachname) {
		switch(this) {
		case ASSISTENZARZT: return "Assistenzarzt " + vorname + " " + nachname;
        case FACHARZT: return "Facharzt " + vorname + " " + nachname;
        case OBERARZT: return "Oberarzt " + vorname + " " + nachname;
        case LEITENDER_OBERARZT: return "Leitender Oberarzt " + vorname + " " + nachname;
        case CHEFARZT: return "Chefarzt " + vorname + " " + nachname;
        case DIREKTOR: return "Direktor " + vorname + " " + nachname;
        default: return "Nicht angegeben " + vorname + " " + nachname;
		}
	}
}
