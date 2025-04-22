package a1_6;

public class Zweierpotenzen {
	public static void main(String[] args) {
		int x = 1;
		int i = 0;
		while (x <= 8) {
			System.out.println(i + " : " + x);
			x = x * 2;
			i = i+1;
		}
	}
}