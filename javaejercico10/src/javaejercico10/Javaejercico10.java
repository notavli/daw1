/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaejercico10;

/**
 *
 * @author ahsh3509
 */
public class Javaejercico10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int cont;
      int sumas_impares=0,suma_pares=0;
       
       for(cont=100;cont<=200;cont++){
           if(cont%2==0){
               suma_pares=suma_pares+cont;
           }
           else{
               sumas_impares=sumas_impares+cont;
           }
       }
        System.out.println("impares"+sumas_impares);
        System.out.println("pares"+suma_pares);
    }
    
    
}
