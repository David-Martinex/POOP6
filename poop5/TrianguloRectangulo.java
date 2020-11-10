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

    public TrianguloRectangulo(float co, float ca, float hip, int alpha, int betta, boolean triangulo) {
        this.co = co;
        this.ca = ca;
        this.hip = hip;
        this.alpha = alpha;
        this.betta = betta;
        this.triangulo = triangulo;
    }

    public float getCo() {
        return co;
    }

    public void setCo(float co) {
        this.co = co;
    }

    public float getCa() {
        return ca;
    }

    public void setCa(float ca) {
        this.ca = ca;
    }

    public float getHip() {
        return hip;
    }

    public void setHip(float hip) {
        this.hip = hip;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public int getBetta() {
        return betta;
    }

    public void setBetta(int betta) {
        this.betta = betta;
    }

    public boolean isTriangulo() {
        return triangulo;
    }

    public void setTriangulo(boolean triangulo) {
        this.triangulo = triangulo;
    }

    @Override
    public String toString() {
        return "TrCua{" + "C.O.=" + co + ", C.A.=" + ca + ", HIP=" + hip + ", Alpha=" + alpha + ", Betta=" + betta + ", Triangulo=" + triangulo + '}';
    }

    public TrianguloRectangulo(int betta, boolean triangulo) {
        this.betta = betta;
        this.triangulo = triangulo;
    }
}

