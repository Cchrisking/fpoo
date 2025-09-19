public class Entrepot {
    public Article[] stock ; // stock est un tableau d’objets constitués d’articles

    // constructeur
    public Entrepot () { }

    // méthode
    public void stocker(Article unArticle) {
    stock.add(unArticle);
  }
}
