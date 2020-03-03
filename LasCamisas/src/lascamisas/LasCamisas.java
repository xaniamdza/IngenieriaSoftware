/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lascamisas;

import is.ico.fesa.camisa.Camisa;

/**
 *
 * @author Xania Mendoza
 */
public class LasCamisas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("                     TIENDA DE CAMISAS                           ");
        System.out.println("------------------------------------------------------------");
        System.out.println("id   -          Descripcion                 -    Precio");
        System.out.println("1    -   Camisa de manga corta              -    $190");
        System.out.println("2    -   Camisa casual de manga larga       -    $230");
        System.out.println("3    -   Camisa formal de manga larga       -    $310");
        System.out.println("------------------------------------------------------------");
        
        Camisa camisa = new Camisa();
        camisa.venderCamisa();
        camisa.hacerDescuento();
        
    }
    
}
