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
public class Persona {
    private String Nombre;
    private String Apellido;
    private Fecha fNacimiento;

    public Persona() {
    }
    /**
     * 
     * @param Nombre Se menicona como debe ser llamado "Nombre"
     * @param Apellido Se menicona como debe ser llamado "Apellido"
     * @param fNacimiento Se menicona como debe ser llamado "fNacimiento"
     */
    public Persona(String Nombre, String Apellido, Fecha fNacimiento) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fNacimiento = fNacimiento;
    }
    /**
     * 
     * @param Nombre Se menicona como debe ser llamado "Nombre" para una seguna persona
     * @param Apellido Se menicona como debe ser llamado "Apellido" para una segunda persona
     */
    public Persona(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fNacimiento = new Fecha( 3, 5, 2000);
    }
    
    
    /**
     * 
     * @return Regresa el valor de Nombre
     */
    public String getNombre() {
        return Nombre;
    }
    /**
     * 
     * @param Nombre Se menicona como debe ser llamado "Nombre" para una tercera persona
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    /**
     * 
     * @return Regresa el valor de Apellido
     */
    public String getApellido() {
        return Apellido;
    }
    /**
     * 
     * @param Apellido Se menicona como debe ser llamado "Apellido" para una tercera persona
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    /**
     * 
     * @return regresa el valor de fNacimiento
     */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }
    /**
     * 
     * @param fNacimiento Se menicona como debe ser llamado "fNacimineto" para una segunda persona
     */
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    /**
     * 
     * @return Regresa de modo de mensaje los valores de Nombre, Apellido y fNacimineto 
     */
    @Override
    public String toString() {
        return "{ Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", fNacimiento=" + fNacimiento + "}, ";
    }
  
}
