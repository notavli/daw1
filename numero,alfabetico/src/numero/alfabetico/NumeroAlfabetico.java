/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero.alfabetico;
import java.util.Scanner;
/**
 *
 * @author ahsh3509
 */
public class NumeroAlfabetico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nota;
        Scanner sc=new Scanner(System.in);
        
        System.out.print("introdusca tu nota");
        nota=sc.nextDouble();
        
        if (nota>=0 && nota<3)
        {
            System.out.print("muy deficiente");
        }   
        else if (nota<5 && nota>=3 )
        {
            System.out.print("insuficinete"); 
        }
        else if (nota<6 && nota>=5)
        {
            System.out.print("bien"); 
        }
        else if (nota<9 && nota>=6)
        {
            System.out.print("notable");   
        }
        else if (nota>=9 && nota <=10)
        {
            System.out.print("sobresaliente");
        }
        
    }
    
}
