/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coche;

import javax.swing.JOptionPane;

/**
 *
 * @author andresf
 */
public class PruebaCoche {

    public static String matricula;
    public static String matriculaAComprobar;
    public static String matriculaActual;

    public static void main(String[] args) {

        int opcion;
        //Atributos
        String color, marca;
        int modelo, numCaballos, numPuertas;

        do {
            color = JOptionPane.showInputDialog(null, "Ingresa el color del auto");
            color = color.toLowerCase(); //minuscula
            matricula = JOptionPane.showInputDialog(null, "Ingresa la matricula del auto");
            matricula = matricula.toUpperCase();

            //objeto
            Coche coche = new Coche(color, matricula);

            //invocar los metodos
            coche.informacionCoche();

            //cambiar el color del coche
            matriculaAComprobar = JOptionPane.showInputDialog(null, "Ingresa la Matricula del auto a cambiar");
            matriculaActual = coche.obtenerMatricula();

            if (verificarMatricula()) {
                String nuevoColor = JOptionPane.showInputDialog(null, "Ingresa el nuevo color del auto");
                coche.modificarColor(matriculaAComprobar, nuevoColor);
            } else {
                JOptionPane.showMessageDialog(null, "NO se encontró la matricula Ingresada, intente Nuevamente");
            }

            //opcion
            opcion = JOptionPane.showConfirmDialog(null, "Quieres un nuevo auto?");
        } while (opcion == JOptionPane.YES_OPTION);
    }

    //metodo
    public static boolean verificarMatricula() {
        if (matriculaAComprobar.equalsIgnoreCase(matriculaActual)) {
            return true;
        } else {
            return false;
        }
    }
}
