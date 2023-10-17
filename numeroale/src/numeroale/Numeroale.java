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
    int aletario=1;
    int intentos=0;
    int list;
    int min=1;
    int max=10;
    int range=max-min+1;
    numero_aleatorio = (int) (Math.random()*20+1);
    System.out.println(numero_aleatorio);
        System.out.println("andivina el numero ");
     for(intentos=min;intentos<max;intentos++)
        {
         intentos = (int)(Math.random()*range)+min;
        }
        do{
             System.out.println("tines : " + aletario);
            intentos++;
            System.out.print("Introduce el número que creas posible: ");
            intentos=sc.nextInt();
           if(numero_aleatorio<intentos){
               System.out.println("es mayor te quedan "+ (aletario) + " intentos: ");
           } 
           else if (numero_aleatorio>intentos){
            System.out.println("es menor"+ (aletario) + " intentos: ");
        }
           else {
        System.out.print("¡CORRECTO! "+numero_aleatorio  + " era el número que estabas "
            + "buscando, has necesitado " + (10 - (aletario-1)) +" intentos.");
  

        }while(intentos != numero_aleatorio && aletario > 0);
        System.out.println("Has adivinado el numero despues de "+aletario+" intentos.");
        if (aletario == 0) {
      System.out.println("Has perdido. El numero aleatorio era " + numero_aleatorio);
        }
        }
       


