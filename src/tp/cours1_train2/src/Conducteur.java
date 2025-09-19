public class Conducteur
{   // objet trainsdi de la classe Train
    public static Train trainsdi ;
    public static void main (String [] argv) {
        trainsdi  = new Train();  // l’objet trainsdi est instancié

        // l’objet trainsdi envoie le message à la méthode réceptrice stopper
        trainsdi.stopper();

// afficher la vitesse de l’objet trainsdi
        System.out.println("Vitesse du trainsdi = "+trainsdi.vitesse) ;
    }
}
