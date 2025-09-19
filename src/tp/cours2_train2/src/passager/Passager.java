package passager;
import conduite.*;
public class Passager {
    public static void main (String [] argv) {
        Conducteur jp = new Conducteur("segado"); // Instancie l’objet jp de la classe conduite.Conducteur grâce à son constructeur
        jp.setNom("Mister Java") ; // Modifier la valeur de l’attribut package nom de jp avec la procédure setNom
        System.out.println("salaire de jp = "+jp.getSalaire()) ; // Accéder au salaire privé de jp avec la fonction getSalaire
        jp.trainsdi.stopper() ; // le conducteur jp stoppe le trainsdi public grâce à sa méthode public stopper

// Afficher la valeur de l’attribut public vitesse qui se trouve dans l’attribut public trainsdi de jp
        System.out.println("vitesse du train de jp = "+jp.trainsdi.vitesse) ;

        jp.salaire = 9999.99 ; // Modifier le salaire privé de jp : illegal !!!
        System.out.println("Nom de jp secret dans le package = "+jp.nom) ; // Afficher le nom (package) de jp : illegal !!!

    }
}
