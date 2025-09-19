public class Point {
    /** Positions x et y courante du point */
    private int x, y;

    /** Initialise une instance de Point */
    public void initialise(int abs, int ord) {
        x = abs;
        y = ord;
    }

    public void affiche() {
        System.out.println("Je suis un point "+
                "de coordonnées (" + x +","+ y + ").");
    }

    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }

}
