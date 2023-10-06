/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgwhile.pkgdo;

/**
 *
 * @author ahsh3509
 */
public class WhileDo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=1;
        
        do{
            System.out.println("contador ->"+ cont);
            ++cont;//cont=cont+1
            
        }while(cont<=10);
        System.out.println("final");
        
    }
    
}
