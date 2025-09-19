public class StaticTest {
    public static int i = 10; // membres de classe statique
    public int j = 20; // membres d’’instance
    final String NOM = "Segado"; // membre constante

    public static void incrementer() { i++; } // méthode statique

    public static void main (String args[]) {
        System.out.println (StaticTest.i); // résultat : 10
        System.out.println (StaticTest.j); // illegal
        StaticTest.incrementer(); System.out.println (StaticTest.i); // résultat : 11
        StaticTest s1 = new StaticTest(); StaticTest s2 = new StaticTest();
        StaticTest.i=1; System.out.println (StaticTest.i); // résultat : 1
        s2.i++; System.out.println (s1.i); // résultat : 2
        System.out.println (s2.i); // résultat : 2

        s1.j++; System.out.println (s1.j); // résultat : 21
        System.out.println (s2.j); // résultat : 20
        System.out.println (s1.NOM); // résultat : ″Segado″
        System.out.println (s2.NOM); // résultat : ″Segado″
        s1.NOM="Java"; // illegal
    }
}
