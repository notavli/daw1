/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaconcarcteresenteros;

import java.util.Scanner;

/**
 *
 * @author ahsh3509
 */
public class Programaconcarcteresenteros {

    /**
     * @param args the command line arguments
     * te va pedir que clase vas (a/b/c)
     * y te va pedir la edad
     * a las clase a van los adultos
     * y a las clases b o c van los menores de edad
     * el programa tiene que comprobar si estas en la clase correcta
     */
    public static void main(String[] args) {
        int edad;
        char clases; //char es para letras
        Scanner sc=new Scanner(System.in);
        System.out.println("que clase vas");
        clases= sc.next().charAt(0); // para caracter
        System.out.println("vas a la clase"+clases);
        System.out.println("que edad tienes?");
        edad=sc.nextInt();
        System.out.println("tienes"+edad+"años");
        
        if(clases=='A' && edad>=18)
        {
            System.out.println("vas a la clase correcta");
        }
        else if (clases=='B' && edad<18)
        {
            System.out.println("vas a la clase correcta");
        }
        else if (clases=='C' && edad<18)
        {
            System.out.println("vas a la clase correcta");
        }
    }
    
}
