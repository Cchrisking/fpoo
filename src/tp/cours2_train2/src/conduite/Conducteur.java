package conduite;

public class Conducteur {
    // Attributs
    public Train trainsdi ;  // objet trainsdi public de la classe conduite.Train
    String nom ;  // nom du conducteur de visibilité package par défaut
    private float salaire ; // salaire private du conducteur

    // Constructeur : instancie l’objet trainsdi, initialise le nom en paramètre
    public Conducteur(String pnom) {
        trainsdi = new Train() ;
        nom = pnom ;
    }

    public float getSalaire() { return salaire ; }  // Accesseur en lecture « getter » pour le salaire
    public void setNom(String pnom) { nom = pnom ; } // Accesseur en écriture « setter » pour le nom modifié par le paramètre

}
