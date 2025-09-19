/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

import java.util.ArrayList;

/**
 *
 * @author JPS
 */
public class Pile {

    private Liste maListe;

    public Pile(){
        this.maListe = new Liste();
    }

    // constructeur par copie
    public Pile(Pile p){
        this();
        ArrayList<Object> arraylist = p.maListe.getList();
        for(int i=0; i<arraylist.size(); i++) {
            Object o = arraylist.get(i);
            maListe.Ajouter(o);
        }
    }

    public Liste getList(){
        return this.maListe;
    }

    public void Empiler(Object element){
        this.getList().Dernier(); // on part de la dernière position
        this.getList().Ajouter(element); // on ajoute l'objet
    }

    public Object Depiler() throws VideException{
        this.getList().Dernier(); // on va au dernier
        return this.getList().Supprimer(); // on la supprime et on la récupère
    }

    @Override
    public String toString(){
        return this.getList().toString();
    }

    public boolean pileVide() {
        return maListe.listeVide();
    }
}
