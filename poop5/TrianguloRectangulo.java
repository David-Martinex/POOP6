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
public class TrianguloRectangulo {
    private float co,ca,hip;
    private int alpha,betta;
    private boolean triangulo;

    public TrianguloRectangulo() {
    }
    /**
     * 
     * @param co Se menciona como debe ser llamado "co"
     * @param ca Se menciona como debe ser llamado "ca"
     * @param hip Se menciona como debe ser llamado "hip"
     * @param alpha Se menciona como debe ser llamado "alpha"
     * @param betta Se menciona como debe ser llamado "betta"
     * @param triangulo Se menciona como debe ser llamado "triangulo"
     */
    public TrianguloRectangulo(float co, float ca, float hip, int alpha, int betta, boolean triangulo) {
        this.co = co;
        this.ca = ca;
        this.hip = hip;
        this.alpha = alpha;
        this.betta = betta;
        this.triangulo = triangulo;
    }
    /**
     * 
     * @return Refresa el valor de co
     */
    public float getCo() {
        return co;
    }
    /**
     * 
     * @param co Se crea un public void para co
     */
    public void setCo(float co) {
        this.co = co;
    }
    /**
     * 
     * @return Regresa el valor de ca
     */
    public float getCa() {
        return ca;
    }
    /**
     * 
     * @param ca Se crea un public void para ca
     */
    public void setCa(float ca) {
        this.ca = ca;
    }
    /**
     * 
     * @return Regresa el valor de hip
     */
    public float getHip() {
        return hip;
    }
    /**
     * 
     * @param hip Se crea un publiv void para hip
     */
    public void setHip(float hip) {
        this.hip = hip;
    }
    /**
     * 
     * @return Se regresa el valor de alpha
     */
    public int getAlpha() {
        return alpha;
    }
    /**
     * 
     * @param alpha Se crea un public void para alpha
     */
    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
    /**
     * 
     * @return Regresa el valor de betta
     */
    public int getBetta() {
        return betta;
    }
    /**
     * 
     * @param betta Se cvrea un public void para betta
     */
    public void setBetta(int betta) {
        this.betta = betta;
    }
    /**
     * 
     * @return Regresa el valor de triangulo
     */
    public boolean isTriangulo() {
        return triangulo;
    }
    /**
     * 
     * @param triangulo Se crea un public void para triangulo
     */
    public void setTriangulo(boolean triangulo) {
        this.triangulo = triangulo;
    }
    /**
     * 
     * @return Regresa de modo de mensaje los valores de co, ca, hip, alpha, betta y triangulo
     */
    @Override
    public String toString() {
        return "TrCua{" + "C.O.=" + co + ", C.A.=" + ca + ", HIP=" + hip + ", Alpha=" + alpha + ", Betta=" + betta + ", Triangulo=" + triangulo + '}';
    }

    public TrianguloRectangulo(int betta, boolean triangulo) {
        this.betta = betta;
        this.triangulo = triangulo;
    }
}
