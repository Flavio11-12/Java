package a2_1;

public class PrivatVersicherter extends Kunde{

	public String iban;
	public String bic;
	
	public PrivatVersicherter(String vorname, String nachname, Arzt behandelnderArzt, String iban, String bic) {
		super(vorname, nachname, behandelnderArzt);
		this.iban = iban;
		this.bic = bic;
	}
	
	
}
