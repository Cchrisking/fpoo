public class Train
{
    // attributs
    public int vitesse ;
    public int marche ;

    public Train() { vitesse=0 ; marche=0 ; } // Constructeur par défaut sans paramètre

    public void stopper() { }  // Méthode

    public static void main (String [] argv) { // Un programme principal dans la classe Train
        Train trainsdi  = new Train();  // l’objet trainsdi est instancié à partir du constructeur
        trainsdi.stopper();  // appeler la méthode stopper par le biais de l’objet trainsdi

// afficher la vitesse et la marche de l’objet trainsdi
        System.out.println("Vitesse du trainsdi = "+trainsdi.vitesse) ;
        System.out.println("Marche du trainsdi = "+trainsdi.marche) ;
    }
}
