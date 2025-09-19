public class Main {
    public static void main(String[] args) {
// tableau 2D avec taille fixe
        int [][] tab = {{ 11, 12, 13 }, { 21, 22, 23 }, { 31, 32, 33 }};

// tableau 2D avec vecteurs de taille
        int [][] tab2 = new int[3][];

        System.out.println("longueur="+tab2.length);

        for (int i=0; i<tab2.length; i++)
        {
            tab2[i] = new int[(int)(Math.random()*10)];
            System.out.println("longueur i="+tab2[i].length);
        }


// parcours d'un tableau MD avec vecteurs

        for (int i=0; i<tab2.length; i++)
            for (int j=0; j<tab2[i].length; j++) {
                tab2[i][j] = i*j;
                System.out.println(tab2[i][j]);
            }
    }
}