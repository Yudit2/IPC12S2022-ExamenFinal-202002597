/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalparcial;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FinalParcial {

    public static void main(String[] args) throws IOException {
      Scanner teclado=new Scanner(System.in);
      boolean salir=false;
      int opcion;
      while(!salir){

        
         System.out.println("");
         System.out.println("\033[36m----Bienvenido----");
         System.out.println("\033[35m1)EJERCICIO 1");
         System.out.println("\033[35m2)EJERCICIO 2");
         System.out.println("\033[35m3)EJERCICIO 3");
         System.out.println("\033[35m4)SALIR");   
         System.out.println("Seleccione una opcion: ");
         opcion= teclado.nextInt();
         
         
         switch (opcion){             
             case 1:
                 
                 int num1;
                 int num2;
             System.out.println("Ingrese primer número: ");
             num1=teclado.nextInt();
             System.out.println("Ingrese segundo número: ");
             num2=teclado.nextInt();
             if (num1>num2){
                 System.out.println(num1+"Es mayor que "+num2);
                 
             }
             else{
                 System.out.println(num2+"Es mayor que "+num1);
             }
             
                 
                 
                 break;
                
                 
             case 2:
                
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           boolean bolfin = false;
          do { System.out.println("Ingresar un número Impar");
            System.out.print("Numero impar: ");
            String st_base = br.readLine();
            int int_base = Integer.parseInt(st_base);
            int int_media = int_base / 2;
            int base = int_base;
            int media = int_media;
            int posicion_inicio_x = 0;
            int posicion_inicio_y = media;
            int posicion_final_y = media;
            int fila = 0;
            int columna = 0;
            if (base % 2 != 0) {
                for (int i = 0; i < media + 1; i++) {
                    for (int j = 0; j < base; j++) {
                        if (i == posicion_inicio_x && j == posicion_inicio_y) {
                            for (int k = posicion_inicio_y; k < posicion_final_y + 1; k++) {
                                System.out.print("*");
                            }
                            posicion_inicio_x = i + 1;
                            posicion_inicio_y = j - 1;
                            posicion_final_y++;
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
                bolfin = false;
            } else {
                System.out.println(" Ingrese numero impar");
                bolfin = true;
            }
        } while (true == bolfin);


                 }
                 
                 
                 
      
               
                 
           
               case 3:
              int matriz

               break;
        
                            
              
             
             
                         }
         
         

            }
    
}

        
