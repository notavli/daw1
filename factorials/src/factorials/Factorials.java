/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorials;

import java.util.Scanner;

/**
 *
 * @author ahsh3509
 */
public class Factorials {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("pon unu numero y te calculare subfactorial");
        int valor=sc.nextInt();
        int total_facorial=factorial(valor);
        System.out.println("es "+total_facorial);
        
    }
    public static int factorial(int numero)
    {
        if (numero==1)
        {
            return 1;
        }
        else if(numero==0){
            return 1;
        }
        else if(numero>1)
        {
            int calculo =numero *factorial(numero-1);
            
          return calculo;
        }
        return 0;
    }
}
