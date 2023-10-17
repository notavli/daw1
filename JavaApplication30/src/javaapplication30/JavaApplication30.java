
package javaapplication30;

import java.util.Scanner;
public class JavaApplication30 {

    public static void main(String[] args) {
           int num=0;
           int intentos=0;
           int suma=0;
           //int max = 20;
          // int min = 1;
           //int range = max - min + 1;
          Scanner sc = new Scanner(System.in);
        
        do{
            suma=suma+num;
            intentos++;
            System.out.println("Pon un numero ");
            num=sc.nextInt();
            if(num>=0){
              System.out.println("es postiu");   
            }else if (num<=0){
                System.out.println(" has puesto " + intentos + "numeros");
            }
            
        }while(num!=0);
            
        System.out.println(" fi"+ suma);
    }
    
}
