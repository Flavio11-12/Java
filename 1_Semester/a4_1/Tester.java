package a4_1;
public class Tester {

	public static void main(String[] args) {
		
		int[] x = {1,1,1,1,2,3,4,5,6};
		int teilergebnis = ArrayRechner.summieren(x);
		int ergebnis = ArrayRechner.arithmetischesmittel(x);
		System.out.println("summe: " + teilergebnis);
		System.out.println("arithmetischesmittel: " + ergebnis);

	}

}
