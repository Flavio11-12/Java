package a2_1;

public class Mitarbeiter extends Person{
	
	public int personalnummer;
	public int gehalt;
	
	public Mitarbeiter(String vorname, String nachname, int personalnummer, int gehalt) {
		super(vorname, nachname);
		this.personalnummer = personalnummer;
		this.gehalt = gehalt;
	}
}
