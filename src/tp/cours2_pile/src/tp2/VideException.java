/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

/**
 *
 * @author JPS
 */
public class VideException extends Exception{
    private String msg;
    public VideException (String msg)  {
        this.msg=msg;
    }

    @Override
    public String getMessage(){
        return msg;
    }

    public void afficher() {
        System.out.println(msg);
    }
}
