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
public class Coche {

    //atributos
    private String color;
    private String marca;
    private int modelo;
    private int numCaballos;
    private int numPuertas;
    private String matricula;

    //Constructor
//    public Coche(String color, String marca, int modelo, int numCaballos, int numPuertas, 
//            String matricula) {
//        this.color = color;
//        this.marca = marca;
//        this.modelo = modelo;
//        this.numCaballos = numCaballos;
//        this.numPuertas = numPuertas;
//        this.matricula = matricula;
//    }
    public Coche(String color, String matricula) {
        this.color = color;
        this.marca = "rotwailer";
        this.modelo = 2021;
        this.numCaballos = 1460;
        this.numPuertas = 5;
        this.matricula = matricula;
    }

    //Metodos
    public void informacionCoche() {
        System.out.println("Color: " + color + " Marca: " + marca + " Modelo: " + modelo
                + " Caballos: " + numCaballos + " Puertas: " + numPuertas + " Matricula: " + matricula);
    }

    public void modificarColor(String nuevaMatricula, String nuevoColor) {
        //guardar la matricula que viene establecida para luego comparar
        String matriculaActual = obtenerMatricula();

        //if (nuevaMatricula.equalsIgnoreCase(matriculaActual)) {
            this.color = nuevoColor;
            informacionCoche();
//        } else {
//            JOptionPane.showMessageDialog(null, "NO se encontró la matricula Ingresada, intente Nuevamente");
//        }
    }

    public String obtenerMatricula() {
        return this.matricula;
    }
}
