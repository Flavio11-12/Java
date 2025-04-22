package a10_1;

public class Tageszeit {
	
	public int stunden;
	public int minuten;
	public int sekunden;
	
	
	//Konstruktor 
	public Tageszeit(int stu, int min, int sek) {
		
		//Objekte
		if(!((stu > 24) || (min > 60) || (sek > 60)) ) {
			stunden = stu;
			minuten = min;
			sekunden = sek;
		}
		else {
			System.out.println("Fehler: Ungültige Zeitangaben");
		}
	}
	
	public Tageszeit(int stu, int min) {
		
		if(!((stu > 24) || (min > 60))) {
			stunden = stu;
			minuten = min;
			sekunden = 0;
		}
		else {
			System.out.println("Fehler: Ungültige Zeitangaben");
		}
	}
	
	public int sekundenSeitMitternacht() {
		int Allesekunden = sekunden;
		Allesekunden += stunden * 3600; 
	    Allesekunden += minuten * 60; 
	    Allesekunden += sekunden;
	    return Allesekunden;
	}
	
	public boolean vormittags() {
		
		if(stunden < 12)
			return true;
		else
			return false;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(stunden);
		sb.append(":");
		sb.append(minuten);
		sb.append(":");
		sb.append(sekunden);
		return sb.toString();
	}
	
	public void vorstellen(int stu, int min, int sek) {
		sekunden += sek;
		if (sekunden >= 60) {
		    minuten += sekunden / 60; 
		    sekunden %= 60;           
		}
		minuten += min;
		if (minuten >= 60) {
		    stunden += minuten / 60;
		    minuten %= 60;           
		}
		stunden += stu;
		if (stunden >= 24) {
		    stunden %= 24;            
		}
	}
	
	public boolean istFrueherAls(Tageszeit zeitpunktx, Tageszeit zeitpunkty) {
		
		return zeitpunktx.sekundenSeitMitternacht() < zeitpunkty.sekundenSeitMitternacht(); 
			
	}
	
	public static void main(String[] args) {
		
		

	}

}
