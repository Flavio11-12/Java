package a13_1;

public class BSBaum {
	public BSBaumelement wurzel;
	
	public BSBaum() {
		wurzel = null;
	}
	
	public void einfügen(int wert) {
		if (wurzel == null)
			wurzel = new BSBaumelement(wert);
		else
			wurzel.einfügen(wert);
	}
	
	public void löschen(int wert) {
		if (wurzel != null)
			wurzel.löschen(wert);
	}
	
	public boolean enthalten(int wert) {
		if (wurzel == null)
			return false;
		else
			return wurzel.enthalten(wert);
	}
	
	public String toString() {
		if (wurzel == null) {
			return "()";
        } else {
            return wurzel.toString();
        }
	}
	
	public int summe() {
		if (wurzel == null) {
			return 0;
		}else {
			return wurzel.summe();
		}
	}
	
	public int höhe() {
		if (wurzel == null) {
			return 0;
		}else {
			return wurzel.höhe();
		}
	}
	
	
}