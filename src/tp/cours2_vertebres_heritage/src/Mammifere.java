// la sous-classe spécialisée Mammifere hérite des propriétés de la super-classe Vertebres
public class Mammifere extends Vertebres {
    // constructeur
    public Mammifere () { super(30) ; } // appel du 2ème constructeur de Vertebres
    // programme de test
    public static void main(String [] args) {
        Vertebres v1 = new Vertebres (); // nombre de vertèbres inconnu
        Vertebres v2 = new Vertebres (10); // nombre = 10
        Mammifere m = new Mammifere (); // nombre =30
    }
}
