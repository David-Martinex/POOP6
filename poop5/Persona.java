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

    public Persona(String Nombre, String Apellido, Fecha fNacimiento) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fNacimiento = fNacimiento;
    }

    public Persona(String Nombre, String Apellido) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.fNacimiento = new Fecha( 3, 5, 2000);
    }
    
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    @Override
    public String toString() {
        return "{ Persona{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", fNacimiento=" + fNacimiento + "}, ";
    }
  
}
