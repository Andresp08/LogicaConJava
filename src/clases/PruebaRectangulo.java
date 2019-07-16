/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author andresf
 */
public class PruebaRectangulo {
    public static void main(String[] args) {
        
        int base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));
        
        Rectangulo figuras = new Rectangulo(base, altura);
        
        System.out.println("Area: "+ figuras.calcularArea());
        System.out.println("Perimetro: "+ figuras.calcularPerimetro());
    }
}
