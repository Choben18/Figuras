/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class Circulo extends Figuras implements MetodosInterface {
    private double radio;
    
    public Circulo(){
        
    }
    public void setRadio(){
        this.radio=Double.parseDouble(JOptionPane.showInputDialog(null, "Radio del circulo: "));
    }
    public void calcularArea(){
        
        super.setArea(MetodosInterface.pi*(super.elevarNumeroCuadrado(this.radio)));
    }
    public void calcularPerimetro(){
        double x = pi*3;
    }
    
}
