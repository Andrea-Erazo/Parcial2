/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu.model;

/**
 *
 * @author Usuario
 */
public class NumeroTelefonico extends Contacto {
 private String Cuidad;
 private String Direccion;
 private int NumerodeCasa;
 private String pais;

    public NumeroTelefonico() {
    }

    public NumeroTelefonico(String Cuidad, String Direccion, int NumerodeCasa, String pais) {
        this.Cuidad = Cuidad;
        this.Direccion = Direccion;
        this.NumerodeCasa = NumerodeCasa;
        this.pais = pais;
    }
    
    public void IngresarDatos(){
        
    }

    public String getCuidad() {
        return Cuidad;
    }

    public void setCuidad(String Cuidad) {
        this.Cuidad = Cuidad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getNumerodeCasa() {
        return NumerodeCasa;
    }

    public void setNumerodeCasa(int NumerodeCasa) {
        this.NumerodeCasa = NumerodeCasa;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
 
 
 
    
}
