/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcualr_iva;

import java.util.Scanner;

/**
 *
 * @author ahsh3509
 */
public class Calcualr_iva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      for(int i=1; i<=5; i++){
          System.out.println("ingresa el precio"+i);
          double precio=sc.nextDouble();
          double precioConIVA=precioConIVA(precio);
          System.out.println("precio con iva"+ precioConIVA);
      }
    }
    public static double precioConIVA(double precio){
        double iva =0.21;
        return precio*(1+iva);
    }
}
