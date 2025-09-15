/**
 *
 * @author JP Segado
 */
public class TstPoint {
    /**
     * @param args the command line 
    arguments
     */
    public static void main(String[] args) {
        Point p = new Point();
        p.initialise(12,17);
        p.deplace(2,3);
        p.affiche();
    }
}
