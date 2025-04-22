package a13_1;

public class Tester {

	public static void main(String[] args) {
	
		BSBaum baum = new BSBaum();

        // Test: Einfügen von Werten
        baum.einfügen(3);
        baum.einfügen(1);
        baum.einfügen(5);
        baum.einfügen(11);
        baum.einfügen(19);
        
        System.out.println(baum.toString());
        System.out.println(baum.summe());
        System.out.println(baum.höhe());

	}

}
