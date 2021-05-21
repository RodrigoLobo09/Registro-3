/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia7;

/**
 *
 * @author Lenovo
 */
public class Ejer1 {

  
    private String nombre ;
    private String apellidos;
    private String nom_invocador;
    private String nom_usuario;
    private String contraseña;
    
public Ejer1 (String nombre, String apellidos, String nom_invocador, String nom_usuario, String contraseña )
{
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.nom_invocador = nom_invocador;
    this.nom_usuario = nom_usuario;
    this.contraseña =  contraseña;

}

    public String getNombre() {
        return nombre;
    }

   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public String getApellidos() {
        return apellidos;
    }

   
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

   
    public String getNom_invocador() {
        return nom_invocador;
    }

   
    public void setNom_invocador(String nom_invocador) {
        this.nom_invocador = nom_invocador;
    }

   
    public String getNom_usuario() {
        return nom_usuario;
    }

   
    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    /**
     *
     * @param contraseña
     * @return
     */
    public String getContraseña(String contraseña ) {
        return contraseña;
    }
}

  
 
