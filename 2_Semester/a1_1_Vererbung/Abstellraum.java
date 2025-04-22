package a1_1_Vererbung;

public class Abstellraum extends Raum{
	
	public boolean abschließbar;
	public Abstellraum(int raumnummer, double fleache, boolean abschließbar) {
		super(raumnummer, fleache);
		this.abschließbar = abschließbar;
	}
}
