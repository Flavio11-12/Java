package a5_2;
public class TeilStringPosition {
	
	public static void teilStringPosition(String string, String teilString) {
		
		System.out.println("x = " + string);
		System.out.println("y = " + teilString);
		
	for (int i = 0; i < string.length(); i++) {
		boolean gefunden = true;
		for(int j = 0; j < teilString.length(); j++) {
			if(string.charAt(i+j) != teilString.charAt(j)) {
			gefunden = false;
			}
		}
		if (gefunden)
			System.out.println(i);
		}
			System.out.println("-1");
	}
}
