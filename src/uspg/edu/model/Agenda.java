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
public class Agenda {
    private int numerodePagina;
    private String mes;
    private String año;
    private String dia;

    public Agenda() {
    }

    public Agenda(int numerodePagina, String mes, String año, String dia) {
        this.numerodePagina = numerodePagina;
        this.mes = mes;
        this.año = año;
        this.dia = dia;
    }

    public int getNumerodePagina() {
        return numerodePagina;
    }

    public void setNumerodePagina(int numerodePagina) {
        this.numerodePagina = numerodePagina;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
  
    
    
}
