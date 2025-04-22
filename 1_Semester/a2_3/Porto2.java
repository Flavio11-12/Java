package a2_3;

import static prog.ConsoleReader.readInt;

public class Porto2 {

public static void main(String[] args) {
		
		int a = readInt("a");
		int b = readInt("b");
		int c = readInt("c");
		int kilo = readInt("Kilo");
		int höhe = Höheherausfinden(a,b,c);
		int länge = Längeherausfinden(a,b,c);
		int breite = Breiteherausfinden(a,b,c);
		String porto = "";
		
		System.out.println("Höhe: " + höhe);
		System.out.println("Länge: " + länge);
		System.out.println("Breite: " + breite);
		System.out.println("Kilo: " + kilo);
		
		if(höhe <= 35 && breite <= 25 && länge <= 10 && kilo <= 2) {
			 porto = "4,49€";
		}else if((höhe >= 35 && breite >= 25 && länge >= 10 && kilo >= 2)&&(höhe <= 120 && breite <= 60 && länge <= 60 && kilo <= 5)){
			 porto = "7,99€";
		}else {
			porto = "Geht nicht";
		}
		System.out.println("Porto ist: " + porto);
}
	
	private static int Höheherausfinden(int x, int y, int z){
		
		
		
		int Höhe = x;
		
		if(x > y && x > z) {
			Höhe = x;
		}
		if(y > x && y > z) {
			Höhe = y;
		}
		if(z > x && z > y) {
			Höhe = z;
		}
		return Höhe;
	}
	
	private static int Längeherausfinden(int x, int y, int z){
		
		int Länge = x;
		
		if(x < y && x < z) {
			Länge = x;
		}
		if(y < x && y < z) {
			Länge = y;
		}
		if(z < x && z < y) {
			Länge = z;
		}
		return Länge;
		
	}
	
private static int Breiteherausfinden(int x, int y, int z){
		
		int Breite = x;
		
		if((x < y && x > z) || (x > y && x < z)) {
			Breite = x;
		}else if((y < x && y > z) || (y > x && y < z)){
			Breite = y;
		}else if((z < x && z > y) || (z > x && z < y)){
			Breite = z;
		}
		
		
		return Breite;
		
	}

}
