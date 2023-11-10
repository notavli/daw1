/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maximovalor;

import java.util.Scanner;

/**
 *
 * @author ahsh3509
 */
public class Maximovalor {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int valor1,valor2,valor3,max,maximo;
        System.out.println("ingresa valor 1");
        valor1=sc.nextInt();
        System.out.println("ingresa el valor 2");
        valor2=sc.nextInt();
        System.out.println("ingresa el valor 3");
        valor3=sc.nextInt();
        
        max= maximodos(valor1,valor2);
        maximo = maximodos(max,valor3);
        
        System.out.println("el valor mas alto es "+maximo);
        
        sc.close();
    }
    public static int maximodos(int a,int b){
        return Math.max(a,b);
    }
}
