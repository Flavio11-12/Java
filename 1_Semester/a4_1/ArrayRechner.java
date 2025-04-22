package a4_1;
public class ArrayRechner {
	
	public static int arithmetischesmittel(int[] x) {
		return summieren(x) / x.length;
	}
	
	public static int summieren (int[] a) {
		int summe = 0;
		for(int i = 0; i < a.length; i++) {
			summe = summe +a[i];
		}
		return summe;
	}

}
