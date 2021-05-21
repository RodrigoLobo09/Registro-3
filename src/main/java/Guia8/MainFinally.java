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
public class MainFinally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado = new Scanner (System.in);
      int num;
       try{
            
            System.out.print("Ingrese un valor entero:");
            num = teclado.nextInt();
            int cuadrado = num * num;
            System.out.print("El cuadrado de  "+num+"es " + cuadrado);
            }catch (InputMismatchException ex){
            System.out.println("Debe ingresar por obligacion un numero entero");
            teclado.next();
    }finally{
           
       
           System.out.println("Se cierran los recursos");
       }
    
    }
}
