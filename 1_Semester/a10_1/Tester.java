package a10_1;

public class Tester {

	public static void main(String[] args) {
		
		Tageszeit ta = new Tageszeit(12,50,1);
		ta.vorstellen(2,10,9);
		System.out.println("Sekunden seit Mitternacht (ta1): " + ta.sekundenSeitMitternacht());
	    System.out.println("Ist ta1 vormittags? " + ta.vormittags());
	    System.out.println("ta1 als String: " + ta.toString());
	    
	    Tageszeit ta2 = new Tageszeit(12,70,1);
		ta2.vorstellen(2,10,9);
		System.out.println("Sekunden seit Mitternacht (ta1): " + ta2.sekundenSeitMitternacht());
	    System.out.println("Ist ta1 vormittags? " + ta2.vormittags());
	    System.out.println("ta1 als String: " + ta2.toString());
	}

}
