/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroale;

import java.util.Scanner;

/**
 *
 * @author ahsh3509
 */
public class Numeroale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero_aleatorio;
    int numero_contador=0;
    int intentos;
    numero_aleatorio = (int) (Math.random()*20+1);
    System.out.println(numero_aleatorio);
        System.out.println("andivina el numero "+"tenes 5 intentos");
        
        do{
            System.out.println("numero contador"+numero_contador);
            System.out.print("Introduce el número que creas posible: ");
            intentos=sc.nextInt();
           if(numero_aleatorio<intentos){
               System.out.println("es mayor el numero aletorio");
           } 
           else {
            System.out.println("es mayor el numero de inetentos");
        }
  

        }while(numero_aleatorio!=intentos);
    }

}
