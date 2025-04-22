package a3_1;

import static prog.ConsoleReader.readString;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DateiAusgabe {
	
	public static void DateiLesen(){
		String line;
    	int Zeile = 0;
		String a = readString();
        try (BufferedReader reader = new BufferedReader(
			new InputStreamReader(
			DateiAusgabe.class.getResourceAsStream(a), "utf8"));) {
        	while ((line = reader.readLine()) != null) {
        		Zeile++;
        	    System.out.println(line);   	   
        	}
        	 System.out.println("Zeilen: " + Zeile);
		}catch(Exception e) {
			System.out.println("Datei \"" + a + "\" wurde nicht gefunden "  + e);
		}
	}
}
