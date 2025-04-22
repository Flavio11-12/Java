package a4_1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ausdrücke_auswerten {

	public static int auswerten(String x) {
	
		StringTokenizer st = new StringTokenizer(x, "+- ");
		
		ArrayList<Integer> zahlen = new ArrayList<>();

        while (st.hasMoreTokens()) {
            int zahl = Integer.parseInt(st.nextToken());
            zahlen.add(zahl);
        }

        // Beispiel: alle Zahlen ausgeben
        for (int z : zahlen) {
            System.out.println(z);
        }
        
		return 0;
	} 
}
