//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.or

import base.m1.Rectangle;

public class FPoo {
    public static void main(String[] args) {
      Rectangle rec1= new Rectangle(4, 6);
      Rectangle rec2= new Rectangle(4, 6);
      if(rec1.equals(rec2)){
        System.out.println("rectangle rec1 est egale à rec2");
      }
    }
}