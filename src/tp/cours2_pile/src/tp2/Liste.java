package tp2;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JPS
 */
public class Liste {

    private  ArrayList<Object> arraylist;
    private int pos = 0; // attribut qui détermine la position dans la liste

    /**
     * contructeur
     */
    public Liste() {
        arraylist = new ArrayList<Object>();
        pos = 0;
    }

    public Liste(ArrayList<Object> l) {
        this.arraylist = l;
    }

    public ArrayList getList() {
        return arraylist;
    }

    public void Premier() {
        pos=0;
    }

    public void Dernier() {
        if (arraylist.isEmpty()) {
            pos=0;
        } else {
            pos=arraylist.size();
        }
    }

    public Object Suivant() throws VideException, DernierException {
        Object o = null;
        if (arraylist.isEmpty()) {
            throw new VideException("Error : List Empty");

        } else if (arraylist.size() == pos+1) {
            throw new DernierException("Error : already have the last position");

        } else {
            pos++; // avancer la position
            o = arraylist.get(pos); // récupérer l'objet à cette position
        }

        return o;
    }

    public Object Supprimer() throws VideException {
        Object o = null;
        if (arraylist.isEmpty()) {
            throw new VideException("Error : List Empty");
        } else {
            pos--;
            o = arraylist.remove(pos);// récupérer et supprimer l'objet à cette position
        }
        return o;
    }

    public void Ajouter(Object e) {
        arraylist.add(pos, e); // ajouter l'objet à la position courante
        pos++;
    }

    /**
     *
     * @return list
     */
    @Override
    public String toString() {
        return arraylist.toString();
    }

    public boolean listeVide() {
        return arraylist.isEmpty();
    }

}
