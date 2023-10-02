/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meses;

import java.util.Scanner;

/**
 *
 * @author ahsh3509
 */
public class Meses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner lec = new Scanner(System.in);
    char caracter;
    System.out.println("teclea un carácter: ");
    caracter=lec.next().charAt(0);
    
    switch(caracter)
    {
     case 'e':
     case 'E':
     System.out.println("enero");
     break;
     case 'f':
     System.out.println("febrero");
     break;
     case 'm':
     System.out.println("marzo");
     break;
     case 'a':
     System.out.println("abril");
     break;
     default:
       System.out.println("dia no valido.");
    }
    }
    
}
