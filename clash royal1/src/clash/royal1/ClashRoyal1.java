/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clash.royal1;

import java.util.Scanner;

/**
 *
 * @author ahsh3509
 */
public class ClashRoyal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int dia;
    Scanner sc=new Scanner(System.in);
    System.out.println("pon un numero del 1 al 7");
    dia=sc.nextInt();
    switch(dia)
    {
     case 0:
     System.out.println("1 es lunes.");
     break;
     case 1:
     System.out.println("marte.");
     break;
     case 2:
     System.out.println("miercoles.");
     break;
     case 3:
     System.out.println("jueves");
     break;
     case 4:
     System.out.println("viernes");
     break; 
     default:
       System.out.println("dia no valido.");
    }
    
 }
}
