public class Point {
    /**
     * Positions x et y courante du point
     */
    private int x;
    private int y;

    /** Constructeur of an instance of Point */
    public Point(int abs, int ord) {
        x = abs;
        y = ord;
    }
    /** Methode de type « getter » */
    @Override
    public String toString() {
        return("Je suis un point "+
                "de coordonnées (" + x +","+ y + ").");
    }

    /** Methode de type « setter » */
    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
