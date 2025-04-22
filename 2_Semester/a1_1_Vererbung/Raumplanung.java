package a1_1_Vererbung;

public class Raumplanung{
	
	
	public boolean reaumMitAbschließbaremAbstellraum(Raum r, Abstellraum a){
		return (r.fleache > a.fleache) && a.abschließbar;

	}
	
	public double flächenSumme(Raum[] r) {
		double summe = 0;
		for(int i = 0; i < r.length; i++) {
			summe += r[i].fleache; 
		}
		return summe;
	}
	
	public double flächenSummeAbstellräume(Raum[] x) {
		
		double summe = 0;
		for(int i = 0; i < x.length; i++) {
			if(x[i] instanceof Abstellraum) {
				summe += x[i].fleache; 
			}
		}
		return summe;
	}
	
	public void sekretariateUndTelefonnummern(Raum[] x) {
		
		for(int i = 0; i < x.length; i++) {
			if(x[i] instanceof Sekretariat) {
				Sekretariat sekretariat = (Sekretariat) x[i];
				System.out.println(x[i].raumnummer + " , " + sekretariat.telefonnummer);
			}
		}
		
	}
	
	public void besprechungsräumeUndTelefonnummern(Raum[] x) {
		
		for(int i = 0; i < x.length; i++) {
			if(x[i] instanceof Besprechungsraum) {
				Besprechungsraum besprechungsraum = (Besprechungsraum) x[i];
				if(besprechungsraum.sekretariat != null) {
					System.out.println(x[i].raumnummer + " , " + besprechungsraum.sekretariat.telefonnummer);
				}
			}
		}
	}
	
}
