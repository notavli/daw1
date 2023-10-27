
package javaapplication35;

import java.util.Scanner;

/*Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad
o no. Implementa y utiliza la función:
boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario*/
public class JavaApplication35 {
    
public static void main(String[] args) {// poner siempre public o privado antes de comenzar
  Scanner sc=new Scanner(System.in);
  int edad;
  boolean mayor;
   System.out.println("cual es tu edad");
   edad=sc.nextInt();
   mayor=esmayoredad(edad);// es la funcionalidad para hacer las opereciones del boolean
   if(mayor)//mayor==true
   {
       System.out.println("eres mayor de edad");
   }
   else
   {
       System.out.println("Menor de edad");
   }
}
    public static boolean esmayoredad(int edad)//aqui haceses los calculos para saber si es mayor o menor de edad con la variable edad
    {
        if(edad>=19)
        {
            
            return true;
        }
        else
        {
            return true;
        }
    }
}
