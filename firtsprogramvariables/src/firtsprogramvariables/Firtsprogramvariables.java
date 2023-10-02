/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firtsprogramvariables;

import java.util.Scanner;

/**
 *
 * @author ahsh3509
 */
public class Firtsprogramvariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m03,m04,m05,m06;
        Scanner pantalla= new Scanner (System.in);
        
        System.out.println("que nota es m03");
        m03 = pantalla.nextInt();
         System.out.println("que nota es m06");
        m06 = pantalla.nextInt();
         System.out.println("que nota es m05");
        m05 = pantalla.nextInt();
        //m03= 3;
        m04= 6;
        //m05= 6;
       // m06= 8;      
        System.out.println(m03);
       // System.out.println("nota de m05 un "+m05+ " nota de m04 un "+ m04);
        System.out.print( "nota de m03:"+m03);
   
    }
    
}
