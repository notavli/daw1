/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication25;

import java.util.Scanner;

/**
 *
 * @author ahsh3509
 */
public class JavaApplication25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int nota;
        Scanner sc=new Scanner(System.in);
    boolean puesto_10=false;
    
    do{
        System.out.println("pon una nota");
        nota=sc.nextInt();
        if(nota==10){
            puesto_10=true;
        }
    }while(nota!=-1);
        if(puesto_10=true){
            System.out.println("has puesto algun 10");
        }
    }
    
}
