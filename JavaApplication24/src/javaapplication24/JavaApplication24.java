/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication24;
import java.util.Scanner;
/**
 *
 * @author ahsh3509
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char caracter;
         Scanner sc=new Scanner(System.in);
         System.out.println("introduce letra minuscula o mayuscula");
         caracter= sc.next().charAt(0);
         
         switch (caracter){
             
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
               System.out.println("es en minuscula");
               break; 
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
               System.out.println("es en mayuscula");
               break;
            default:
              System.out.println(" es consonat");
         }
    
    }
    
}
