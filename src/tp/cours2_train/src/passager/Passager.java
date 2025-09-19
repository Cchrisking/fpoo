package passager;
import conduite.*;
public class Passager {
    public static void main (String [] argv) {
        Conducteur jp = new Conducteur("segado"); // Instancie l’objet jp de la classe conduite.Conducteur grâce à son constructeur
        System.out.println("Nom de jp secret dans le package = "+jp.nom) ; // illegal !!!
        System.out.println("salaire de jp secret partout = "+jp.salaire) ; // illegal !!!
        jp.trainsdi.stopper() ; // le conducteur jp stoppe le trainsdi public grâce à sa méthode public stopper

// Afficher la valeur de l’attribut public vitesse qui se trouve dans l’attribut public trainsdi de jp
        System.out.println("vitesse du train de jp = "+jp.trainsdi.vitesse) ;
    }
}
