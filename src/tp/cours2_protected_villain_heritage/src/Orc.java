public class Orc extends Villain {
    private int j;

    public Orc(int j) {
        super(j);
        this.j = j;
    }

    public void change(int x) {
        set(x);
    }

    public int getOrc() {
        return this.read();
    }
}
