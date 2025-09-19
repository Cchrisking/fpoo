package tp.cours4_classe_abstraite.src;

public class Enseignants extends Personnels {
    public void travailler(int heures) {
        nb_heures=heures;
        System.out.println("nombre d’heures de cours = "+nb_heures);
    }
}
