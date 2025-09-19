public class Personne implements Client, Employe, Sportif {
    // implémenter toutes les méthodes des interfaces
    public void commander () { System.out.println("je commande") ;}
    public void acheter() { System.out.println("j’achète") ;}
    public void travailler() { System.out.println("je travaille") ;}
    public void jouer() { System.out.println("je joue") ;}
}
