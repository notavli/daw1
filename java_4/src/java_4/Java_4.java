/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_4;
import java.util.Scanner;
/**
 *
 * @author ahsh3509
 */
public class Java_4 {

    /**
     * @param args the command line arguments
Dibuja un ordinograma de un programa que pide la edad por teclado 
* y nos muestra el mensaje de “eres mayor de edad” o el mensaje de “eres menor de edad”.

     */
    public static void main(String[] args) {
        int edad;
        System.out.println("cuantos años tienes");
        Scanner pantalla= new Scanner (System.in);
        edad = pantalla.nextInt();
        
        if(edad>18)
        {
         System.out.println("es mayor de edad");
        }
        else
        {
         System.out.println("es menor de edad");
        }   
        
    }
    
}
