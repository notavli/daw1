/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2.pkgdo.pkgwhile;
import java.util.Scanner;
/**
 *
 * @author ahsh3509
 */
public class Ejemplo2DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Scanner sc=new Scanner(System.in);
      /*  do{
            System.out.println("pon valor , (-1 para terminar ..");
            numero= sc.nextByte();
            System.out.println("has intruido"+ numero );
        }while(numero!=-1);
        System.out.println("mismo bucle pero con variable boolean");*/   
    
        boolean end =false;
        do{
            System.out.println("pon valor , (-1 para terminar ..");
            numero= sc.nextByte();
            if(numero==-1)
            {
                end= true;
            }        
        } while(end==false);
        
        
        
    }
    
}
