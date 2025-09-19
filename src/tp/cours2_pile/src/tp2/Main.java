package tp2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author JPS
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static Pile  inverser(Pile pile) throws VideException {
        // copier la pile en paramètre dans une autre pile à dépiler dans la pile finale inversée
        Pile autre = new Pile(pile);
        Pile fin = new Pile();

        while (!autre.pileVide()) {
            fin.Empiler(autre.Depiler());
        }

        return fin;
    }

    public static void main(String[] args) {
// TODO code application logic here
        System.out.println("\u2764");

        Pile p1 = new Pile();
        Pile p2 = new Pile();
        Pile p3 = new Pile();
        Pile p4 = null;
        int rand;

        // empiler 5 nombre entiers aléatoires entre -10 et +30
        for (int i = 0; i < 5; i++) {
            rand = -10 + (int) (Math.random() * (30 + 10 + 1));
            p1.Empiler(rand);
        }

        System.out.println("Pile 1 initiale: " + p1.toString());

        // copier la pile p1 dans p4 à déppiler dans p2 pour les pairs et p3 pour les impairs

        p4 = new Pile(p1);

        for (int i = 0; i < 5; i++) {
            try {
                rand = (Integer) p4.Depiler();

                if (rand % 2 == 0) {
                    System.out.println("Empile " + rand + " --> Pile2");
                    p2.Empiler(rand);
                } else {
                    System.out.println("Empile " + rand + " --> Pile3");
                    p3.Empiler(rand);
                }
            } catch (VideException e) {
            }
        }

        // afficher les 3 piles p1, p2 et p3 dans le même ordre initial que p1
        System.out.println("Pile 1 initiale: " + p1.toString());

        try {
            p2=inverser(p2);
            System.out.println("Pile p2 finale: " + p2.toString());
        } catch (VideException e) {
        }

        try {
            p3=inverser(p3);
            System.out.println("Pile p3 finale: " + p3.toString());
        } catch (VideException e) {
        }
    }

}

