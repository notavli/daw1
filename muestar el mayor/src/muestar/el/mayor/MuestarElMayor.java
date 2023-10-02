/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muestar.el.mayor;
import java.util.Scanner;
/**
 *
 * @author ahsh3509
 */
public class MuestarElMayor {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int num1,num2;
       
        Scanner pantalla= new Scanner (System.in);
        System.out.println("pon valor1 ");
        num1 = pantalla.nextInt();
        System.out.println("pon valor2 ");
        num2 = pantalla.nextInt();
        
        if(num1==num2)
        {
         System.out.println("son iguales");
        }
        else
         { if (num1>num2)
        {
        System.out.println("es mayor"+num1);
        }
        else {
       System.out.println("es menor"+num1);
             
         }

       }
    }
    
    

