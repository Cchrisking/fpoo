public class Main {
    public static void main(String[] args) {
        Orc c = new Orc(10);

        System.out.println ("valeur de Orc " + c.getOrc());

        c.change(20);

        System.out.println ("nouvelle valeur de Orc " +  c.getOrc());
    }
}