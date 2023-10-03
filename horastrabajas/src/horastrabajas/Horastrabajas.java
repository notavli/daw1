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
    double horas,hora_normal,horas_extra,salario_extra,salario_normal,salario,t_normal,impuesto,salario_impuesto,salario_sin_impuesto,salario_tope_impuesto;
    Scanner sc=new Scanner(System.in);
    System.out.print("igresa el numero de horas trabajados");
    horas=sc.nextInt();
     
    hora_normal=35;
    t_normal=20;
    salario_sin_impuesto=500;
    salario_tope_impuesto=900;
    if (horas>hora_normal)
    {
        horas_extra = horas - hora_normal;
        salario_extra = horas_extra*t_normal* 1.5;
        salario_normal= hora_normal * t_normal;
        salario = salario_extra + salario_normal;
         
        System.out.print("tu salario  es "+salario);
    }
    else
    {
        salario= horas*t_normal;
        System.out.print("tu salario  es "+salario);
    }

    if(salario>salario_tope_impuesto)
        
        salario_tope_impuesto=salario-salario_tope_impuesto;
        impuesto=  salario_tope_impuesto*0.45;
        salario_impuesto=  salario_tope_impuesto - salario_sin_impuesto;
    
    
    
    
    
    
    if(salario>salario_sin_impuesto)
    {
        salario_impuesto = salario-salario_sin_impuesto;
        impuesto=salario_impuesto*25/100;
        System.out.print("tus impuesto  son "+impuesto);
    }
    else
    {
       impuesto =0;
    }
     salario= salario-impuesto;
     System.out.print("salario bruto "+salario);
    }
    
}

