
package pkg5numerosprecio;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    int millas=pedirdatosentero();
    double km=millas_a_kilometres(millas);//para pedir del public de abajo
        System.out.println( "son " + km+ "km" );
    }
    public static double millas_a_kilometres(int millas){ //para hacer los calculos
      final double conversor_millas=1.6093;
      double km=millas*conversor_millas;
      
      return km;
    }
     public static int pedirdatosentero(){
     Scanner sc=new Scanner(System.in); //para pedir al usuario 
    int mostrar;
    mostrar=sc.nextInt();
     return mostrar;
     }
}
