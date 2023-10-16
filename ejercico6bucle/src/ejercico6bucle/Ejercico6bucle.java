/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercico6bucle;
import java.util.Scanner;
/**
 *
 * @author ahsh3509
 */
public class Ejercico6bucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       int  num,vuelta;
       vuelta=0;
       boolean negativo=false; //para mostar que negativo signifac false
       do{
         vuelta++;//suma
         num=sc.nextByte();
         while(num==0){// es para comunicar que puesto un 0
             System.out.println("el numero que has puesto es nulo");
             System.out.println("introduce otro numero");
             num = sc.nextInt();
         }     
       if(num<0){
              negativo=true;
          }
       }while(vuelta<10);//siempre hay que cerrar el do 
       if(negativo==true)
       {
           System.out.println("se ha introduciod un numero negativo");
       }
    } 
    
}
