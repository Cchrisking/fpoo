package individu;
import transport.*;

public class Passager extends Personne {
    public Train t;
    private int resa;


    /*
     * Constructeur qui initialise le nom de la personne par héritage, sa resa et son train en paramètres
     * @params : nom, resa et train
     */
    public Passager(String pnom, int presa, Train ptrain) {
        super(pnom) ;
        resa = presa;
        t = ptrain;
    }

    /*
     * Méthode qui affiche le nom, reservation du passager et son numero de Train.
     */
    public void afficher() {
        System.out.println("Passager :");
        super.afficher();
        System.out.println("réservation et numéro de train :" + resa + " ," + t.numero);
    }
}
