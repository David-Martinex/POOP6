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
public class Circulo{
    static double PI = Math.PI;    
    private double radio;
    private String color;

    /**
     * Se Imprime el mensaje con el que da aviso que se ha creado nuestro nuevo circulo
     */
    public Circulo()
    {
        System.out.println("Se a creado el circulo");
    }
    
    /**
     * 
     * @param radio El circulo toma los valores del radio para su creacion
     */
    public Circulo( double radio )
    {
        this.radio = radio;
        System.out.println("Se a creado el circulo");
    }
    
    /**
     * 
     * @return radio Regresa el valor del Radio
     */
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    /**
     * @return Regresa un mensaje donde imprime todos los datos de nuestro circulo
     */
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", color=" + color + '}';
    }

    /**
     * @return 2*PI*radio que es el calculo del perimetro del circulo
     */
    public double prerimetro(){
        return 2* PI * radio;
    }
    /**
    * Regresa el nuevo valor que puede tener la Area del Circulo
    */
    public double area(){
        return PI * radio * radio;
    }
    
}
