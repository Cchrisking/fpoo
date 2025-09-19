public class Main {
    public static void main(String[] args) {
        int a[]; // créer une référence vers un tableau de int
        String text[]; // créer une référence vers un tableau de références String et pas un tableau d'objets
        int[] b, c; // créer deux tableaux de int
        int d[], e;    // crée un tableau de int et un int

        a = new int[5]; // créer un tableau de 5 int
        text = new String[4]; // créer un tableau de 4 String

        System.out.println("a=" + a + " text="+ text);

        //char c[] = new char[5];
        int arrayLength = c.length;

        System.out.println("c=" + c + " taille de c="+ arrayLength);

        a = new int[4]; // a[0] == a[1] == a[2] == a[3] == 0
        String[] b = new String[4]; // b[0] == b[1] == b[2] == b[3] == null

        System.out.println("a=" + a + " b="+ b);

        for (int i=0; i<a.length; i++) {
            a[i] = 100 + i;
            b[i] = new String ("My value is " + i);
        }

        System.out.println("a=" + a + " b="+ b);

        int a[] = { 1, 40, 3, 6, 3 }; String s[] = { new String("a"), new String ("b") };

        System.out.println("a=" + a + " s="+ s);

    }
}