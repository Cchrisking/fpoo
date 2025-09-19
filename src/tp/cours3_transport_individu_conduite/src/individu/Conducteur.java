package individu;
import transport.Train;

public class Conducteur extends individu.Personne {
    public Train t;
    private float salaire;

    /*
     * Constructeur qui initialise le nom de la personne par héritage,sson salaire et son train en paramètres
     * @params : nom, salaire et train
     */
    public Conducteur(String pnom, float psalaire, Train ptrain) {
        super(pnom) ;
        salaire = psalaire;
        t = ptrain;
    }

    /*
     * Méthode qui affiche le nom, salaire du conducteur et son numero de Train.
     */
    public void afficher() {
        System.out.println("Conducteur :");
        super.afficher();
        System.out.println("salaire et numéro de train :" + salaire + " ," + t.numero);
    }
}
