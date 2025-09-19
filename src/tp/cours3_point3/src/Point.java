public class Point {
    int x, y;
    String name;

    public Point() {
        String name = null; // variable locale name
        x=0;
        y=0;
        this.name = "segado"; // attribut name autoréférencé
    }
    public Point(int x, int y) {
        this(); // appel constructeur défaut
        this.x=x;
        this.y=y;
    }

    public Point(int x, int y, String name) {
        this (x, y); // appel 2ème constructeur
        this.name = name;
    }

    public void changeName(String name) {
        this.name=name;
    }

    public Point getReferenceToMe () {
        return this; // renvoie une référence à cet objet
    }
}
