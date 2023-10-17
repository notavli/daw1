/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numero.randoms;

import java.util.Scanner;

/**
 *
 * @author ahsh3509
 */
public class NumeroRandoms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
    int numeroAleatorio;
    int intento;
    int contador = 3;
    // Obtención de número aleatorio
    numeroAleatorio = (int) (Math.random()*20+1);
    System.out.println("Intenta adivinar un número aleatorio entre el 1 y 20. "
        + "Tienes 3 intentos.");
    //System.out.println(numeroAleatorio); sirve para mostrar un numero aletorio
    // Realización del ciclo do-while
    do {
      System.out.println("Número contador: " + contador);
      System.out.print("Introduce el número que creas posible: ");
        intento = scanner.nextInt();
      if (intento > numeroAleatorio) {
        System.out.println(" es menor, te quedan "
            + (contador-1) + " intentos: ");
      } else if (intento < numeroAleatorio){
        System.out.println(" es mayor, te quedan "
            + (contador-1) + " intentos: ");
      } else {
        System.out.print("¡es el numero correcto! "+ numeroAleatorio + " era el número que estabas "
            + "buscando, has necesitado " + (10 - (contador-1)) +" intentos.");
      }
      contador--;
    } while (intento != numeroAleatorio && contador > 0);
    if (contador == 0) {
      System.out.println("Has perdido. El numero aleatorio era " + numeroAleatorio);
    }
    }
    
}
