package individu;

public class Personne {
    protected String nom;

    /*
     * Constructeur qui initialise le nom de la personne avec son paramètre
     * @params : nom
     */
    public Personne(String pnom) {
        nom = pnom ;
    }

    /*
     * Méthode qui affiche le nom de la personne
     */
    public void afficher() {
        System.out.println("Nom de la personne :" + nom);
    }
}
