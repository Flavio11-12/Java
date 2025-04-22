package a3_2;
import static prog.ConsoleReader.*;
public class Pallindrom {

	public static void main(String[] args) {
		
		String s = readString();
		boolean pallindrom = true;
		
		for(int i = 0; i < s.length()/2 ; i++) {
			if(!(s.charAt(i) == s.charAt(s.length() - 1 - i))) {
				pallindrom = false;
			}
		}
		if(pallindrom) {
			System.out.println(s + " ist ein Pallindrom");
		}else {
			System.out.println(s + " ist kein Pallindrom");
		}
		
	}
}