/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop5;

/**
 *
 * @author David Martinez
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;
    /**
     * Se dan contenido a los objetos dia, mes y anio
     */
    public Fecha() {
        this.dia = 13;
        this.mes = 5;
        this.anio = 2001;
    }
    /**
     * 
     * @param dia Se le indica como se debe llamar "dia"
     * @param mes Se le indica como se debe llamar "mes"
     * @param anio Se le indica como se debe llamar "anio"
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    /**
     * 
     * @return Regresa el valor de dia
     */
    public int getDia() {
        return dia;
    }
    /**
     * 
     * @return Regresa el valor de mes
     */
    public int getMes() {
        return mes;
    }
    /**
     * 
     * @return Regresa el valor de anio
     */
    public int getAnio() {
        return anio;
    }
    /**
     * 
     * @param dia Se crea el setDia
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
    /**
     * 
     * @param mes Se crea el SetMes
     */
    public void setMes(int mes) {
        this.mes = mes;
    }
    /**
     * 
     * @param anio Se crea el setAnio
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * 
     * @return Regresa de forma de mensaje la informacion de dia, mes y anio
     */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", a\u00f1o=" + anio + '}';
    }
    
}
