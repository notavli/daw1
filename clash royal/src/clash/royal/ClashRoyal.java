/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clash.royal;

import java.util.Scanner;

/**
 *
 * @author ahsh3509
 */
public class ClashRoyal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuántas copas tienes?");
        int copes = scanner.nextInt();
        scanner.nextLine();// Consume la línea de entrada restante una especie de separador entre esta pregunta y otra
        
        if (copes < 2000) {// Si el número de copas es menor a 2000
            System.out.println("¿Qué carta quieres Mago Electrico(m) o esbirro mega(e)?");
            char carta = scanner.next().charAt(0);
            //carta = carta.toLowerCase();//convierte en minuscula la letra introducida

            if (carta == 'm' || carta == 'M' )// Seleccion de la carta Mago Electrico
            {
                System.out.println("Has escogido Mago Electrico");
            } 
            else if ((carta == 'e' || carta == 'E' )) // Seleccion de la carta esbirro mega
            {
                System.out.println("Has escogido esbirro mega");
            } 
            else // Entrada no válida 
            {
                System.out.println("Entrada no válida");
            }
        } 
        else {// Si el número de copas es igual o mayor a 2000
            System.out.println("¿Qué carta quieres Cavallero(c) o Bandida(b)?");
            char carta = scanner.next().charAt(0);
            //carta = carta.toLowerCase();
            
            if (carta == 'c' || carta == 'C' )  // Seleccion de la carta Cavallero
            {
                System.out.println("Has escogido Cavallero");
            } 
            else if ((carta == 'b' || carta == 'B' ))  // Seleccion de la carta Bandida
            {
                System.out.println("Has escogido Bandida");
            } 
            else // Entrada no válida
            {
                System.out.println("Entrada no válida");
            }
        }

    }
    
}
