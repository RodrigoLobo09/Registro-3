/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

import java.util.Scanner;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Lenovo
 */
public class Ejer1MainTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    String nombre;
    String apellidos;
    String nom_invocador;
    String nom_usuario;
    String contraseña;
      
      Scanner teclado = new Scanner (System.in);
      
      System.out.println ("Ingresa el nombre del jugador ;");
      nombre = teclado.nextLine ();
      
      System.out.println ("Ingresa el apellido del jugador ;");
      apellidos = teclado.nextLine ();
      
      System.out.println ("Ingresa el nombre de invocador ;");
      nom_invocador = teclado.nextLine ();
     
      System.out.println ("Ingresa el monbre de usuario ;");
      nom_usuario = teclado.nextLine ();
      
      System.out.println ("Ingresa la contraseña");
      contraseña = teclado.nextLine ();
      
      String contra_hash;
      
      contra_hash = encriptar(contraseña);
      
      Ejer1 registro;
      registro = new Ejer1 (nombre, apellidos, nom_invocador, nom_usuario, contra_hash );
     
      System.out.println("Los datos de registro son:");
      System.out.println("Nombre: "+registro.getNombre());
      System.out.println("Apellidos: "+registro.getApellidos());
      System.out.println("Nombre Invocador: "+registro.getNom_invocador());
      System.out.println("Nombre Usuario: "+registro.getNom_usuario());
      System.out.println("Contraseña: "+registro.getContraseña(contra_hash));
   
      
         String contra_check;
      System.out.println (" Ingresa el password a verificar :");
      contra_check = teclado.nextLine();
      if (BCrypt.checkpw(contra_check, registro.getContraseña(contra_hash)))
      {
          System.out.println ("La contaseña es correcta");
      }else{
          System.out.println("La contaseña es incorrecta");
      }
    }
    
       public static String encriptar(String pass){
   return BCrypt.hashpw(pass, BCrypt.gensalt());    
       }
}
    
    