/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fechametodos;

import java.util.Scanner;

/**
 *
 * @author ahsh3509
 */
public class Fechametodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int dia,mes,anyo;
     boolean mes1,dia1,anyo1;
     
        System.out.println("dime un dia");
        dia=sc.nextInt();
        System.out.println("dime un mes");
        mes=sc.nextInt();
        System.out.println("dime un anyo");
        anyo=sc.nextInt();
        
        dia1=validadia(dia);
        mes1=valimes(mes);
        anyo1=valianyo(anyo);
        
        if(dia1&&mes1&&anyo1){
         System.out.println("fecha correcta");   
        }
        else{
            System.out.println("fecha incorrecta");
        }
        
    }
    public static boolean validadia(int dia){
    
      if(dia>=1 && dia<=31)
        {
          return true;
        }
     else 
        {
          return false;
        }
    }
    public static boolean valimes(int mes){
        if(mes>=1 && mes<=12)
        {
          return true;
        }
        else
        {
          return false;   
        }
    }
    public static boolean valianyo(int anyo){
        if(anyo>=1900)
        {
          return true;
        }
        else
        {
          return false;
        }
            
        
    }
}
