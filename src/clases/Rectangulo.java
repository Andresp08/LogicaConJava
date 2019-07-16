/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author andresf
 */
public class Rectangulo {
    /*
    Crear una clase Rectángulo, con atributos base y altura. Crear tam-
    bién el constructor de la clase y los métodos necesarios para calcular el
    área y el perı́metro. Crear otra clase PruebaRectángulo que pruebe varios
    rectángulos y muestre por pantalla sus áreas y perı́metros
    */
    
    //atributos
    private double base;
    private double altura;
    
    //constructor
    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    //metodos
    public double calcularArea(){
        double resultado = this.base * this.altura;
        return resultado;
    }
    
    public double calcularPerimetro(){
        double resultado = (this.base * this.altura)/2;
        return resultado;
    }
    
}
