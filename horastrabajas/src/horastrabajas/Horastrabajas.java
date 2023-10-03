/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horastrabajas;

import java.util.Scanner;

/**
 *
 * @author ahsh3509
 */
public class Horastrabajas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double horas,hora_normal,horas_extra,salario_extra,salario_normal,salario,t_normal;
    Scanner sc=new Scanner(System.in);
    System.out.print("igresa el numero de horas trabajados");
    horas=sc.nextInt();
     
    hora_normal=35;
    t_normal=20;
     
   if (horas>hora_normal)
    {
         horas_extra = horas - hora_normal;
         salario_extra = horas_extra*t_normal* 1.5;
         salario_normal= hora_normal * t_normal;
         salario = salario_extra + salario_normal;
         
         System.out.print("tu salario  es"+salario);
     }
     else
     {
         salario= horas*t_normal;
         System.out.print("tu salario  es"+salario);
     }
      
     
     
    }
    
}

