public class Segment {
    /** Attributs : définition des 2 points du segment */
    public Point p1, p2;

    /*
     * Constructeur qui initialise les 2 points du segment avec les 2 points en paramètres
     * @params : 2 points
     */
    public Segment (Point point1, Point point2) {
        p1 = point1;
        p2 = point2;
    }

    /*
     * Méthode qui affiche les coordonnées des 2 points du segment
     */
    public void afficher() {
        p1.afficher();
        p2.afficher();
    }

    /*
     *  Méthode qui translate les coordonnées des 2 points du segment, avec 2 points comme paramètres de translation
     *  @params 2 points de translation
     */
    public void translater (Point point1, Point point2) {
        p1.translater(point1.getX(), point1.getY());
        p2.translater(point2.getX(), point2.getY());
    }
}
