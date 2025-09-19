public class Villain {
    private int i;

    public Villain(int i) { this.i = i; }
    public int read() { return i; } 	// accès à tous
    protected void set(int i) { this.i = i; } // accès restreint aux classes héritières
}
