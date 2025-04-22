package a3_1;

public class Exeption_übung {

	public static int f(int[] x) throws Exception {
		for(int i = 0; i + 1 < x.length; i++) {
			if(x[i] > x[i+1]) {
				return x[i];
			}
		}
		throw new Exception();
	}
}
