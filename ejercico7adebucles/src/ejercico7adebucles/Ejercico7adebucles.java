/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercico7adebucles;

import java.util.Scanner;

/**
 *que pida numero hatsa que pongas -1 alfinal tiene que mostrar la suma de todo los numero introduios
 *
 */
public class Ejercico7adebucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int num,suma;
    suma=0;
     do{
        System.out.println("introduce el numero");
        num=sc.nextByte();
     if(suma!=-1)//condicion para que sea desigual
      {
        suma=suma+num;
      }
        System.out.println(""+suma);
      }while(num!=-1);
        System.out.println("la suma total es"+suma);
      
    }
   }
    

