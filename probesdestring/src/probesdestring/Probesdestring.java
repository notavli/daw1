
package probesdestring;

import java.util.Scanner;

/**
 *
 * @author ahsh3509
 */
public class Probesdestring {

    public static void main(String[] args) {
     char letra;
     String frase="hola";
     String frase2;
      Scanner sc=new Scanner(System.in);
      letra=frase.charAt(2);
        System.out.println(letra+"-"+frase);
        System.out.println("pon una frase y la reptire");
       frase=sc.nextLine();
        System.out.println("dime una posicion");
        int pos=sc.nextInt();
        letra=frase.charAt(pos);
       System.out.println("->"+letra+"-"+frase);
       
       System.out.println("pon una segunda frase y la reptire");
       sc.nextLine();
       frase2=sc.nextLine();
       if(frase.equals(frase2)){
           System.out.println("iguales");
       }
       else{
           System.out.println("son diferents");
       }
    }
    
}
