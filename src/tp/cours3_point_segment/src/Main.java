public class Main {
    public static void main(String[] args) {
        // Instancier les 2 objets suivants de la classe Point : a (12, 17) et b (14,20)
        Point a = new Point(12,17);
        Point b = new Point(14,20);
        Point c = new Point(2,5);
        Point d = new Point(-3,4);
        // Instancier un objet de la classe Segment avec les deux objets a et b précédents
        Segment s = new Segment(a, b);
        // Appeler la méthode d’affichage pour les 4 objets a, b, c et d précédents de la classe Point
        System.out.println("premier point de coordonnées=");
        a.afficher();
        System.out.println("second point de coordonnées=");
        b.afficher();
        System.out.println("premier point de translation de coordonnées=");
        c.afficher();
        System.out.println("second point de translation de coordonnées=");
        d.afficher();
        // Translater le segment s avec les objets c et d en paramètres
        s.translater(c, d);
        // Appeler la méthode d’affichage des 2 objets a et b après translation du segment s avec les objets c et d
        // en paramètres
        System.out.println("premier point après translation de coordonnées=");
        a.afficher();
        System.out.println("second point après translation de coordonnées=");
        b.afficher();
    }
}