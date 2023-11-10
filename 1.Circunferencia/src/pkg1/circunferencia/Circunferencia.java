/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1.circunferencia;

import java.util.Scanner;

public class Circunferencia {

    public static void main(String[] args) {
    double longitud,radio,area;
    int escoger=menu();
     System.out.println("opcion escogida"+escoger);
     if(escoger==1)
     {
            radio=pideRadio();
            longitud=circunferencia(escoger);
            System.out.println("longitud es "+longitud);
     }
     else if(escoger==2)
     {
          radio=pideRadio();
          area=area(radio);
          System.out.println("area es"+area);
     }
   }
    public static  int menu(){
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Circunferencia");
        System.out.println("2.Área");
        int escoger;
        do
        {
            System.out.println("escoge la opcione 1/2");
            escoger=sc.nextByte();
        }while(escoger<=0 || escoger >2);
        return escoger;
    } 
    public static double pideRadio() {
        Scanner sc=new Scanner(System.in);
        double radio;
        do{
          System.out.println("introduce un radio");  
          System.out.println("tene qu eser positivo");
            radio=sc.nextDouble();
        }while(radio<=0);
        return radio;
    }
    public static  double  circunferencia(double r){
        final double pi=3.14;
        double longitud=pi*r*2;
        return longitud;
    }
    public static double area(double r){
         final double pi=3.14;
        double area;
        area=r*r*pi;
        return area;
    }
}
