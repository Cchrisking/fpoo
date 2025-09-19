package transport;

public class Train {
    /** Attributs : numero et vitesse */
    public int numero, vitesse;

    /*
     * Constructeur qui initialise le numero et la vitesse du train avec leurs paramètres
     * @params : vitesse et numero
     */
    public Train( int n, int v) {
        numero=n;
        vitesse=v;
    }

    /*
     * Méthode qui augmente la vitesse de celle indiquée en paramètre
     * @params : vitesse augmentée
     */
    public void augmenter(int v) {
        this.vitesse += v;
    }

    /*
     *
     */
    public void afficher() {
        System.out.println("Numero et vitesse du train : " + numero +" , "+ vitesse + ".");
    }
}