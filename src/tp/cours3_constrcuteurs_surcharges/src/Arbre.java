public class Arbre {
    // Attribut
    private int hauteur;

    // premier constructeur par défaut
    public Arbre() {
        hauteur = 10;
    }

    // second constructeur surchargé (redéfini) qui initialise la hauteur de l’arbre avec son paramètre
    public Arbre(int h) { // constructeur avec un argument
        hauteur = h;
    }

    // Méthode qui affiche la hauteur de l’arbre
    public void afficher(){
        System.out.println ("La hauteur de l'arbre est " + hauteur);
    }

    public static void main(String[] args) {
        // Instancier un premier objet de la classe Arbre avec le premier constructeur par défaut
        Arbre a1 = new Arbre();
        // Appeler la méthode d’affichage de ce premier objet
        a1.afficher();
        // Instancier un second objet de la classe Arbre avec le second constructeur avec en paramètre une hauteur
        Arbre a2 = new Arbre(20);
        // Appeler la méthode d’affichage de ce second objet
        a2.afficher();
    }
}


