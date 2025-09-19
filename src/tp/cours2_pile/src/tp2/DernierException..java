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
class DernierException extends Exception {
     private String msg;

     public DernierException (String msg)  {
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