package a4_2;

public class ForSchleife2 {
	public static void sortierung(String x) {
		
		int länge = x.length();
		
		for(int i = 0; i < länge; i++ ) {		
			for(int j = 0; j <= i; j++) {
                System.out.print(x.charAt(j));
            }       
            for(int k = i + 1; k < länge; k++) {
                System.out.print(x.charAt(i));
            }     
            System.out.println();
		}
	}
}
