package a1_1_Vererbung;

public class Tester {

	public static void main(String[] args) {
		
		 Sekretariat sek1 = new Sekretariat(101, 30, "01234-56789");
	     Sekretariat sek2 = new Sekretariat(202, 25, "09876-54321");
		
	     Raum[] räume = {
	    		 sek1,
		         sek2,
		         new Abstellraum(300, 10, true),
		         new Abstellraum(404, 8, false),
		         new Sekretariat(502, 25, "09376-54321"),
		         new Besprechungsraum(505, 50, 20, 2, sek1),
		         new Besprechungsraum(505, 50, 20, 2, null),
		         new Raum(606, 40) // Normaler Raum
		 };

	     // Separates Test-Objekt für einen Raum mit Abstellraum
		 Abstellraum abstellraum = new Abstellraum(700, 5, true);
		 Raum normalerRaum = new Raum(701, 20);

		 // 2. Raumplanung-Objekt erstellen
		 Raumplanung planung = new Raumplanung();

		 // 3. Test: Raum mit abschließbarem Abstellraum
		 System.out.println("Test 1: Raum mit abschließbarem Abstellraum");
		 System.out.println(planung.reaumMitAbschließbaremAbstellraum(normalerRaum, abstellraum));

		 // 4. Test: Flächensumme aller Räume
		 System.out.println("\nTest 2: Flächensumme aller Räume");
		 System.out.println("Gesamtfläche: " + planung.flächenSumme(räume));

		 // 5. Test: Flächensumme nur der Abstellräume
		 System.out.println("\nTest 3: Flächensumme aller Abstellräume");
		 System.out.println("Fläche der Abstellräume: " + planung.flächenSummeAbstellräume(räume));

		 // 6. Test: Ausgabe aller Sekretariate mit Telefonnummern
		 System.out.println("\nTest 4: Sekretariate und Telefonnummern");
		 planung.sekretariateUndTelefonnummern(räume);
		 
		 System.out.println("\nTest 5: Besprechungsräume und zugehörige Sekretariate");
	        planung.besprechungsräumeUndTelefonnummern(räume);
	}

}
