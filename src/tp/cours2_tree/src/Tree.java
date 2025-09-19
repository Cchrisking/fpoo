public class Tree {
    int height;    // variable d’instance

    Tree() { // constructeur par défaut
        height = 10;
        System.out.println("I'm a default tree of " + height + "m");
    }

    Tree(int height) { // constructeur avec un argument
        this.height = height;   // copier l’argument dans l’attribut
        System.out.println ("I'm a tree " + height + "m tall");
    }
}
