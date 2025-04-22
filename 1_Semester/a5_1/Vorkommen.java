package a5_1;
public class Vorkommen {
	
	public static void zähler(String x) {
		
		for(int i = 0; i < x.length(); i++) {

			int häufigkeit = 0;
			
			for(int j = 0; j < x.length(); j++){
				
				if (x.charAt(j) == x.charAt(i)) {
                    häufigkeit++;
                }
			}
			System.out.println(x.charAt(i) + " " + häufigkeit);
		}
	}
}
