/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multi;

import java.util.Scanner;

/**
 *
 * @author ahsh3509
 */
public class Multi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("introduce tu numero");
        int factor1=sc.nextInt();
        multiplica(factor1);
        
    }
    public static void multiplica(int factor1){
        int mult=1;
        for( factor1=mult;mult<=10;mult++){
            System.out.println(factor1+" x "+mult+" = "+(factor1*mult));
        }
    } 
}
