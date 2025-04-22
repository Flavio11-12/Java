package a2_2;
import static prog.ConsoleReader.*;
public class Porto {

	public static void main(String[] args) {
		
		int x = readInt("a");
		int y = readInt("b");
		int z = readInt("c");
		int k = readInt("Kilo");
		String porto = "";
		
		if(x <= 35 && y <= 25 && z <= 10 && k <= 2) {
			 porto = "4,49€";
		}else if(x <= 120 && y <= 60 && z <= 60 && k <= 5){
			 porto = "7,99€";
		}else {
			porto = "Geht nicht";
		}
		System.out.println("Porto ist: " + porto);

	}
	
}