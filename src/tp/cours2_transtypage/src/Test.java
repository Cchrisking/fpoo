public class Test {
    public static void main(String[] args) {

        Homme jean = new Homme();
        Femme marie = new Femme();
        Femme anna = new Femme();
        marie.pacser(jean);
        marie.pacser(anna);
    }
}