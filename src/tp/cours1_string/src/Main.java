public class Main {
    public static void main(String[] args) {
        String chaine1 = "Mister Java" ;
        String chaine2 = new String ("Mister Java") ; // équivalent à la première initialisation
        String chaine3 = chaine2 ; // chaine3 référence la même chaîne que chaine2
        String chainevide1 = "" ; // initialise une chaîne vide (pas d’espace entre les guillemets)
        String chainevide2 = new String() ; // équivalent à l’initialisation précédente

        System.out.println("chaine1="+chaine1+" chaine2="+chaine2+" chainevide1="+chainevide1+" chainevide2="+chainevide2);

        int i = Integer.parseInt(chaine1); // convertit la chaine en nombre de type int
        System.out.println("i="+i);

        float f = Float.parseFloat(chaine1); // convertit la chaine en nombre de type float
        System.out.println("f="+f);

        int n = 123;
        String ch = String.valueOf(n);   // ch = "123"
        System.out.println("ch="+ch);
    }
}