package a2_1;

public class Krankenpfleger extends Mitarbeiter{
	
	Status status;
	public Krankenpfleger(String vorname, String nachname, int personalnummer, int gehalt) {
		super(vorname, nachname, personalnummer, gehalt);
	}

	public String getAnsprache() {
        return status.ansprache(super.vorname, super.nachname);
    }
	
	public String formloseAnsprache() {
	    if (this.anrede != null && this.vorname != null) {
	        return this.anrede.ansprache() + this.vorname;
	    } else {
	        return "Unbekannt";
	    }
	}
}
