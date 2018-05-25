/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Angel
 */
public class Figuras {

    private double Area;
    private double Perimetro;

    public Figuras() {

    }

    public double getArea() {
        return Area;
    }

    public double getPerimetro() {
        return Perimetro;
    }

    public void setArea(double A) {
        this.Area = A;

    }

    public void setPerimetro(double P) {
        this.Perimetro = P;
    }
    public double elevarNumeroCuadrado(double x){
        double cuadrado=x*x;
        return cuadrado;
    }
    public int elevarNumeroCuadrado(int x){
        int cuadrado=x*x;
        return cuadrado;
    }
}
