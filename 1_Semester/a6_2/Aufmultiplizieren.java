package a6_2;

public class Aufmultiplizieren {

	// aufgabe 2a
	public static int aufmultiplizieren(int a) {

		int c = a;

		for (int i = a - 1; i > 1; i--) {
			c = c * i;
		}
		return c;

	}
	// aufgabe 2b

	public static int aufmultiplizierenRekursion(int a) {

		if (a <= 1)
			return 1;
		else
			return aufmultiplizierenRekursion(a - 1) * a;

	}

}