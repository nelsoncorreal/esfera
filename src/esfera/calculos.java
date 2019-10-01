/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esfera;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Cifuentes
 */
public class calculos {
    public float radio;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }
    
    public void area(){
        float area;
        area=(float) (4*Math.PI*Math.pow(radio, 2));
        JOptionPane.showMessageDialog(null,"el area de la esfera es : "+area);
    
    }
    public void volumen(){
        float volumen;
        volumen=(float) ((4*Math.PI*Math.pow(radio, 3))/3);
        JOptionPane.showMessageDialog(null,"el volumen de la esfera es : "+volumen);
    }
}
