public class Methodes {
    public String concat (String s1, String s2) { return s1 + s2; }
    public boolean flag () {return 0;
    } // illegal - wrong return type
    public void piaf () { return; }
    // Programme dans la classe
    public static void main (String[] args) {
        Methodes s = new Methodes ();
        String t = s.concat("abc", "def");
        boolean b = s.flag();
        s.piaf();
    }
}
