package a1_1_Vererbung;

public class Besprechungsraum extends Raum{

	public int sitzplätze;
	public int beamer;
	public Sekretariat sekretariat;
	
	
	public Besprechungsraum(int raumnummer, double fleache, int sitzplätze, int beamer, Sekretariat sekretariat) {
		super(raumnummer, fleache);
		this.beamer = beamer;
		this.sitzplätze = sitzplätze;
		this.beamer = beamer;
		this.sekretariat = sekretariat;
		
	}
	
	
}
