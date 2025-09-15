package tp3.conduite;

import transport.*;
import individu.*;

public class Main {
    public static void main(String[] args) {
        // Instancier un objet de la classe Train avec une vitesse et un numéro de train en paramètres
        Train t = new Train(50, 300);

        // Instancier un tableau de 3 objets de la classe Passager du package individu dont leur nom
        // leur réservation sont en paramètres, choisis en libre arbitre, ainsi que l’objet instancié
        // de la classe Train
        Passager voyageurs[] = new Passager[3];
        voyageurs[0] = new Passager("baligh", 10, t);
        voyageurs[1] = new Passager("palasi", 120, t);
        voyageurs[2] = new Passager("segado", 350, t);

        // Instancier un tableau de 2 objets de la classe Conducteur du package individu dont leur nom,
        // leur salaire sont en paramètres, choisis en libre arbitre, ainsi que l’objet instancié de la
        // classe Train.
        Conducteur drivers[] = new Conducteur[2];
        drivers[0] = new Conducteur ("boss", 2500.75f, t);
        drivers[1] = new Conducteur ("chef", 3000.67f, t);

        // Appeler la méthode qui affiche le numéro et vitesse de l’objet instancié de la classe Train
        t.afficher();

        // Appeler la méthode qui affiche les attributs du tableau des 3 objets instanciés de la classe
        // Passager : leur nom, réservation et numéro de train
        for(int i=0; i<voyageurs.length; i++) {
            voyageurs[i].afficher();
        }

        // Appeler la méthode qui affiche les attributs du tableau des 2 objets instanciés de la classe Conducteur :
        // leur nom, salaire et numéro de train
        for(int i=0; i<drivers.length; i++) {
            drivers[i].afficher();
        }
    }
}