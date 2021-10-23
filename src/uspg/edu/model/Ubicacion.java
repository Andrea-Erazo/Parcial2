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
public class Ubicacion extends Contacto{
    private String LugardeResidencia;
    private int Zona;
    private String Pais;

    public Ubicacion() {
    }

    public Ubicacion(String LugardeResidencia, int Zona, String Pais) {
        this.LugardeResidencia = LugardeResidencia;
        this.Zona = Zona;
        this.Pais = Pais;
    }
    
    public void IngresarDtos(){
        
    }

    public String getLugardeResidencia() {
        return LugardeResidencia;
    }

    public void setLugardeResidencia(String LugardeResidencia) {
        this.LugardeResidencia = LugardeResidencia;
    }

    public int getZona() {
        return Zona;
    }

    public void setZona(int Zona) {
        this.Zona = Zona;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }
    

    
   
    
    
}
