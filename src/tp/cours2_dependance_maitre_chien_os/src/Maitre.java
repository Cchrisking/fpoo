public class Maitre {
    public static void main(String[] args) {
        // Instancier l’objet unOs de la classe Os et l’objet leChien de la classe Chien
        Os unOs = new Os() ;
        Chien leChien = new Chien() ;

        // le maître donne unOs à manger à leChien
        leChien.manger (unOs) ;
    }
}