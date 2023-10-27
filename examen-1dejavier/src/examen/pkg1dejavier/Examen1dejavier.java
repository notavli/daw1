
package examen.pkg1dejavier;

import java.util.Scanner;


public class Examen1dejavier {

         public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            char temporadabaixa='x';
            char temporadaalta='t';
            char jubilat='j';
            char adult='a';
            double precio;
            final double descuento;
            double preciofinal;
            char entrada;
            char temporada;
            
            System.out.println("Ingrese el preu de la entrada");
            precio=sc.nextDouble();
            
            System.out.println("Ingresa el tipus de la entrada (a) Adult o (j)Jubilat");
            entrada=sc.next().charAt(0);
            
            System.out.println("Ingresa la temporada (x)Temporada baixa o (t)Temporada alta");
            temporada=sc.next().charAt(0);
            
            if(entrada=='a'){//En aquesta part començarem amb Adult i calcular els preus de les seves entrades farem el mateix per el jubilat
                if(temporada=='x'){//donem la condicio de temporada baixa
                descuento=0.05;//donem valor a la variable descuento
                preciofinal=precio-(precio*descuento);//calculem el preu final de l'entrada
                System.out.println("La entrad con descuento = " +preciofinal);//Fem print del preu de l'entrada
                }else if (temporada=='t'){
                descuento=0.1;
                preciofinal=precio-(precio*descuento);
                    System.out.println("La entrad con descuento = " +preciofinal);
                }
            
            }else if (entrada=='j'){//En aquesta part començarem amb Jubilat i calcular els preus de les seves entrades
                if(temporada=='x'){
                descuento=0.15;
                preciofinal=precio-(precio*descuento);
                System.out.println("La entrad con descuento = " +preciofinal);
                }else if (temporada=='t'){
                descuento=0.1;
                preciofinal=precio-(precio*descuento);
                System.out.println("La entrad con descuento = " +preciofinal);
                }
                
            }else{
                System.out.println("Datos introducidos erroneos introduce 'a' o 'j' para los tipos de entradas");//Aqui si no hem introduit be les dades ens apareixera aquest error
            }        
                
                
    }
    
}
