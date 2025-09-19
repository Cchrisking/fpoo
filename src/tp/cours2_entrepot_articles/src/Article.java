public class Article {
    public Entrepot unEntrepot ; // unEntrepot est un objet unique de la classe Entrepot
    // constructeur
    public Article () { }

    // Un programme principal dans la classe Article
    public static void main (String [] argv) {
        // Instancier l’objet unEntrepot de la classe Entrepot
        Entrepot unEntrepot = new Entrepot () ;
        // Instancier l’objet unArticle de la classe Article
        Article unArticle = new Article () ;
        // unArticle est stocké dans unEntrepot
        unEntrepot.stocker(unArticle) ;
    }
}
