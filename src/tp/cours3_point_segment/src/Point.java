public class Point {
    /** Attributs : coordonnées du point */
    private int x, y;

    /*
     * Constructeur qui initialise les coordonnées du point avec les paramètres
     * @params : 2 coordonnées
     */
    public Point (int abs, int ord) {
        x = abs;
        y = ord;
    }

    /*qq
     * Méthode qui affiche les coordonnées du point
     */
    public void afficher() {

      System.out.println("Je suis un point de coordonnées (" + x +","+ y + ").");
    }

    /*
    *  Méthode qui translate les coordonnées du point, avec 2 paramètres de valeurs de translation
    *  @params : 2 coordonnées de translation
    */
    public void translater(int dx, int dy) {
        x += dx;
        y += dy;
    }

    /*
     * Getter pour l'abscise x
     */
    public int getX() {
        return x;
    }
    /*
     * Getter pour l'ordonnée y
     */
    public int getY() {
        return y;
    }
}
