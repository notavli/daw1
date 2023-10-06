/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author ahsh3509
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=1;
        
        //while(cont<=10)
       //{
          // System.out.println("contador ->"+cont);
        //   cont=cont +1;
      // }
        
        
        boolean end = false;
        cont =1;
        while(!end)
        {
            System.out.println("contador ->"+cont); 
            cont =cont +1;
            if (cont>10)
            {
                end= true;
            }
        }
    }
    
}
