public class Configuration {
    // Attributs publics
    public Ecran unEcran ;
    public Clavier unClavier ;
    public Disque unDisque ;

    // constructeur
    public Configuration (Ecran e, Clavier c, Disque d)  {
        unEcran = e ;
        unClavier = c;
        unDisque = d;
    }
    // Programme
    public static void main (String[] argv) {  // instancier les objets indépendants
        Ecran unEcran = new Ecran ();
        Clavier unClavier = new Clavier ();
        Disque unDisque = new Disque ();

        // relier ces 3 objets à une Configuration
        Configuration maConfig = null ;
        maConfig = new Configuration (unEcran, unClavier, unDisque) ;
    }
}
