package a2_1;

public class GesetzlichVersicherter extends Kunde{

	String krankenkasse;

	public GesetzlichVersicherter(String vorname, String nachname, Arzt behandelnderArzt, String krankenkasse) {
		super(vorname, nachname, behandelnderArzt);
		this.krankenkasse = krankenkasse;
	}
}
