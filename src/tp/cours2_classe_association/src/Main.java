public class Main {
    public static void main(String[] args) {

        Homme h1 = new Homme();
        Femme f1 = new Femme ();
        Homme h2 = new Homme();
        Femme f2 = new Femme();
        Mariage m1 = new Mariage ("01/01/2024","Nice", h1, f2);
        Mariage m2 = new Mariage ("01/01/2024","Paris", h2, f1);
    }}