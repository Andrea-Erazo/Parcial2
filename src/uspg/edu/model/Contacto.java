/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu.model;

import uspg.edu.Implement.Iprintinformation;

/**
 *
 * @author Usuario
 */
public class Contacto implements Iprintinformation {
    private String nombre;
    private String apellidos;
    private int ID;
    private int telefono;
    private String Direccion;
   

    public Contacto() {
    }

    public Contacto(String nombre, String apellidos, int ID, int telefono, String Direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ID = ID;
        this.telefono = telefono;
        this.Direccion = Direccion;
    }
    
    public void IngresarDatos(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.apellidos = Apellidos;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }



        
    }
    
            
    
