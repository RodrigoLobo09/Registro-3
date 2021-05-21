/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia8;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class EjerExcepMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner (System.in);
      int edad;
      int año;
      System.out.println("Calculadora de cuando años cumples este 2021");
       try{
            
            System.out.println(" Ingrese en año en que nacio:");
            año = teclado.nextInt();
            edad = 2021 - año;
            System.out.println("Tu año de nacimiento fue "+ año +" este año cumples " + edad);
            }catch (InputMismatchException ex){
            System.out.println("Debe ingresar por obligacion un numero entero");
            teclado.next();
    }finally{
           
       
           System.out.println("Fin del Programa");
       }
    }
    
}
