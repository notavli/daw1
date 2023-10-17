/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numeroale;

import java.util.Scanner;
/**
 *
 * @author ahsh3509
 */
public class NewClass {
    public static void main(String[] args) {
        int min=1,max=20,range=max-min+1,list,numAleatorio=0,numUser,intentos=1;
        String estado;
        Scanner sc = new Scanner(System.in);
       
        for(list=min;list<max;list++)
        {
         numAleatorio = (int)(Math.random()*range)+min;
        }
        System.out.print("Adivina el numero que ha generado el ordenador: ");
        numUser=sc.nextInt();
        do
        {
         intentos++;
         if(numUser>numAleatorio)
         {
          estado=("mayor");
         }
         else
         {
          estado=("menor");
         }
         System.out.println("El numero introducido es "+estado+" al del ordenador");
         System.out.print("Intentalo de nuevo: ");
         numUser=sc.nextInt();
        }while(!(numUser==numAleatorio));
       
        System.out.println("Has adivinado el numero despues de "+intentos+" intentos.");
    }
}
    

