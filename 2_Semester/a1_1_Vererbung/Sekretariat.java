package a1_1_Vererbung;

public class Sekretariat extends Raum{
	
	public String telefonnummer;

	public Sekretariat(int raumnummer, double fleache, String telefonnummer) {
		super(raumnummer, fleache);
		this.telefonnummer = telefonnummer;
	}
	
	
}
