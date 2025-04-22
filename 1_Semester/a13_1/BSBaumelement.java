package a13_1;

public class BSBaumelement {
	
	public int wert;
	public BSBaumelement links;
	public BSBaumelement rechts;
	
	public BSBaumelement(int wert) {
		this.wert = wert;
		this.links = null;
		this.rechts = null;
	}
	
	public void einfügen(int wert) {
		
		if (wert < this.wert)
			if (links == null)
				links = new BSBaumelement(wert);
			else
				links.einfügen(wert);
		
		if (wert > this.wert)
			if (rechts == null)
				rechts = new BSBaumelement(wert);
			else
				rechts.einfügen(wert);
		}
	
		public void löschen(int wert) {
			
			if (wert < this.wert && links != null)
				links.löschen(wert);
			else if (wert > this.wert && rechts!= null)
				rechts.löschen(wert);
			else {
				if (links != null) {
					this.wert = links.wert;
					if (links.links == null && links.rechts == null)
						links = null;
					else
						links.löschen(wert);
				} else if (rechts != null) {
					this.wert = rechts.wert;
					if (rechts.links == null && rechts.rechts == null)
						rechts = null;
					else
						rechts.löschen(wert);
				}
			}
		}
		
		public boolean enthalten(int wert) {
			if (wert == this.wert)
				return true;
			else if (wert < this.wert) {
				return links !=null && links.enthalten(wert);
			} else {
				return rechts !=null && rechts.enthalten(wert);
			}
		}
		
		public String toString() {
			 String fertig = "";
			 String linkeSeite = (links == null) ?"" : links.toString();
			 String rechteSeite = (rechts == null) ? "" : rechts.toString();
			 
			if(rechts == null && links == null) {
				fertig = "(" + wert + ")";
			}else {
				fertig = "(" + linkeSeite + wert + rechteSeite +")";
			}
			return fertig;
		}
		
		public int summe() {
			int linkssumme = (links == null) ? 0 :links.summe();
			int rechtssumme = (rechts == null) ? 0 :rechts.summe();
			
			return wert + linkssumme + rechtssumme;
		}
		
		public int höhe() {
			int linkehöhe = (links == null) ? 0 : links.höhe(); 
			int rechtehöhe = (rechts == null) ? 0 : rechts.höhe();
			
			return 1 + Math.max(linkehöhe, rechtehöhe);
		}

}
