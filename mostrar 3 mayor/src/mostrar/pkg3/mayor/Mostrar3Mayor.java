/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mostrar.pkg3.mayor;
import java.util.Scanner;
/**
 *
 * @author ahsh3509
 */
public class Mostrar3Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double num1,num2,num3;
       Scanner sc =new Scanner(System.in);
       
       System.out.print("introdusca num1");
       num1=sc.nextDouble();
       System.out.print("introdusca num2");
       num2=sc.nextDouble();
       System.out.print("introdusca num3");
       num3=sc.nextDouble();
       
       if(num1>num2 && num1>num3)
       {
         System.out.print("el num1 es mayor");
       }
        if (num2>num1 && num2>num3) 
       {
         System.out.print("el num2 es mayor");
       }
        if (num3>num1 && num3>num2)
       {
        System.out.print("el num3 es mayor");
       }    
     }
    }