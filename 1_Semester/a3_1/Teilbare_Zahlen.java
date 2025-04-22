package a3_1;
import static prog.ConsoleReader.readIntArray;
public class Teilbare_Zahlen {

	public static void main(String[] args) {
		
		int x[] = readIntArray();
		
		for(int i = 0; i < x.length ; i++) {
			if(x[i] % 3 == 0) {
				System.out.println(x[i]);
			}
		}
	}

}
