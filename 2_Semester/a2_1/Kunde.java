package a2_1;

public class Kunde extends Person{

	Arzt behandelnderArzt;

	public Kunde(String vorname, String nachname, Arzt behandelnderArzt) {
		super(vorname, nachname);
		this.behandelnderArzt = behandelnderArzt;
	}
	
	public boolean arztRangHoeherAlsBei(Kunde x) {
		return this.behandelnderArzt.rangHoeherAls(x.behandelnderArzt);
	}
	
}
