/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2_javier;

import java.util.Scanner;

/**
 *
 * @author ahsh3509
 */
public class Ex2_javier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 //Objecte scanner per poder demanar a l'usuari les dades
        Scanner sc=new Scanner(System.in);
        //a partir d'aqui comencem les variables
        double totalarea=0;
        char respuesta;
        double ample;
        double llarg;
        double area;
        do{//bucle que demanara a l'usuari les dades per introduir 
            System.out.println("Introdueix el llarg de l'habitació : ");
            llarg= sc.nextDouble();
            sc.nextLine();
            System.out.println("Introdueix l'amplada de l'habitació :");
            ample=sc.nextDouble();
            sc.nextLine();
            //A partir d'aqui comencen les operacion necessaries per saber l'are de l'habitacio i l'area total del pis
            area=ample*llarg;
            totalarea=totalarea+area;
            //Preguntem a l'usuari si la casa te mes habitacións depenen de la resposta continuara preguntan o no
            System.out.println("Te mes habitacions? (s)Per SI (n) per NO");
            respuesta=sc.next().charAt(0);
        }while (!(respuesta=='n'));//La condicio per a que continui es que la resposta donada sigui diferent a n (NO) no controlo els boolean i si introdueixis qualsevol altre lletra et donara com a valid per continuar
        System.out.println("La casa te "+totalarea+" metres quadrats");//operacio que printara l'area total del pis/casa
    }
    
}
