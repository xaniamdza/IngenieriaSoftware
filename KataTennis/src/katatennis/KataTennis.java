package katatennis;

import is.ico.fesa.tennis.Tennis;

public class KataTennis {

    public static void main(String[] args) {
        System.out.println("***********************************************");
        System.out.println("                  KATA TENNIS                  ");
        System.out.println("***********************************************");
        
        Tennis tennis = new Tennis();
        tennis.jugarTennis();
        tennis.ganadorFinal();
      


    }

}
