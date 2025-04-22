package a2_1;

public class Arzt extends Mitarbeiter{

	int buerozimmernummer;
	Rang rang;
	public Arzt(String vorname, String nachname, int personalnummer, int gehalt, int buerozimmernummer, Rang rang) {
		super(vorname, nachname, personalnummer, gehalt);
		this.buerozimmernummer = buerozimmernummer;
		this.rang = rang;
	}

	public String getAnsprache() {
        return rang.ansprache(super.vorname, super.nachname);
    }
	
	public boolean rangHoeherAls(Arzt x) {
		return this.rang.ordinal() > x.rang.ordinal();
	}
	
}
