/** Classe permettant d’utiliser la fonction Scanner **/
import java.util.Scanner;
public class SaisieClavier{
    public static void main (String [] args){
/** Déclaration d’un nouvel objet de Scanner **/
        Scanner clavier = new Scanner(System.in);
/** Lecture de la chaine de caractère **/
        System.out.print("Entrez votre nom :"); String nom = clavier.nextLine();
        System.out.println("Bonjour "  + nom); // sans format et avec saut de ligne
/** Lecture et affichage d’un entier **/
        int entier = clavier.nextInt();
        System.out.println("La valeur saisie est " + entier);
/** Fermeture de l’objet de Scanner **/
        clavier.close() ;
    }
}
