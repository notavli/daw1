/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication27;

/**
 *
 * @author ahsh3509
 */
public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("voy a generar numeros aleatorios del 1 al 100");
        int max=20;
        int min=1;
        int range=max-min+1;
        System.out.println("valor maxim"+max);
        System.out.println("valor minim"+min);
        System.out.println("rango valor"+range);
        int aleatorio=(int)(Math.random()*range) +min;
        
        System.out.println("numero generado--->"+aleatorio);
    }
    
}
