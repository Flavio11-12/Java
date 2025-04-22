package a2_1;

public class Tester {
	public static void main(String[] args) {
        // === Ärzte ===
        Arzt arzt1 = new Arzt("Max", "Müller", 1001, 6000, 123, Rang.OBERARZT);
        arzt1.anrede = Anrede.Herr;

        Arzt arzt2 = new Arzt("Lisa", "Schulz", 1002, 6200, 124, Rang.FACHARZT);
        arzt2.anrede = Anrede.Frau;

        System.out.println("Arzt 1 Ansprache: " + arzt1.getAnsprache());
        System.out.println("Arzt 2 Ansprache: " + arzt2.getAnsprache());
        System.out.println("Hat Arzt1 einen höheren Rang als Arzt2? " + arzt1.rangHoeherAls(arzt2));
        System.out.println();

        // === Krankenpfleger ===
        Krankenpfleger pfleger1 = new Krankenpfleger("Anna", "Schmidt", 2001, 2800);
        pfleger1.status = Status.Krankenpflegerin;
        pfleger1.anrede = Anrede.Frau;

        Krankenpfleger pfleger2 = new Krankenpfleger("Tom", "Becker", 2002, 2700);
        pfleger2.status = Status.Krankenpfleger;
        pfleger2.anrede = Anrede.Herr;

        System.out.println("Pflegerin Ansprache: " + pfleger1.getAnsprache());
        System.out.println("Pflegerin formlose Ansprache: " + pfleger1.formloseAnsprache());

        System.out.println("Pfleger Ansprache: " + pfleger2.getAnsprache());
        System.out.println("Pfleger formlose Ansprache: " + pfleger2.formloseAnsprache());
        System.out.println();

        // === Gesetzlich Versicherter ===
        GesetzlichVersicherter versicherter = new GesetzlichVersicherter("Joshua", "Aleth", arzt1, "AOK");
        System.out.println("Versichert bei: " + versicherter.krankenkasse);
        System.out.println();

        // === Kunden ===
        Kunde kunde1 = new Kunde("Paul", "Maier", arzt1);
        kunde1.anrede = Anrede.Herr;

        Kunde kunde2 = new Kunde("Emma", "Schneider", arzt2);
        kunde2.anrede = Anrede.Frau;

        System.out.println("Kunde 1: " + kunde1.anrede.ansprache() + kunde1.vorname + " " + kunde1.nachname);
        System.out.println("Kunde 1 - Behandelnder Arzt: " + kunde1.behandelnderArzt.getAnsprache());

        System.out.println("Kunde 2: " + kunde2.anrede.ansprache() + kunde2.vorname + " " + kunde2.nachname);
        System.out.println("Kunde 2 - Behandelnder Arzt: " + kunde2.behandelnderArzt.getAnsprache());

        System.out.println("Hat Kunde1 einen behandelnden Arzt mit höherem Rang als Kunde2? " +
                kunde1.arztRangHoeherAlsBei(kunde2));

        System.out.println("Hat Kunde2 einen behandelnden Arzt mit höherem Rang als Kunde1? " +
                kunde2.arztRangHoeherAlsBei(kunde1));
    }
}
