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
public class Esfera {

    
    public static void main(String[] args) {
        float r=Float.parseFloat(JOptionPane.showInputDialog("digite el radio de la esfera"));
        calculos  cal=new calculos();
        cal.setRadio(r);
        cal.area();
        cal.volumen();
    }
    
}
