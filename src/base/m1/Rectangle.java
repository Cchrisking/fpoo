package base.m1;

public class Rectangle {
    double largeur;
    double hauteur;
    double surface;
    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    public double getLargeur() {
        return largeur;
    }
    public double getHauteur() {
        return hauteur;
    }
    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }
    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }
    public void surface() {
        this.surface = largeur * hauteur;
    }
    public double getSurface() {
        return surface;
    }
}
