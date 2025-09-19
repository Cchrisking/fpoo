public class Music2 {
    public static void tune(Instrument i) { // argument polymorphe
        i.play(Note.MIDDLE_C);   // appel polymorphe
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Stringed violin = new Stringed();
        Brass frenchHorn = new Brass();
        tune(flute); // Pas d'upcast
        tune(violin);
        tune(frenchHorn);
    }

}
