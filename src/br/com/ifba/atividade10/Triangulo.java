/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author ETM-00168
 */
public class Triangulo extends Forma2D{
    //atributos
    private double comprimento;
    private double altura;

    //metodo construtor
    public Triangulo(double comprimento, double altura) {
        this.comprimento = comprimento;
        this.altura = altura;
    }

    //metodos especias 
    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double obterArea() {
        
        double area = (this.comprimento * this.altura)  / 2;/*area do triangulo,
                                                             *é calculado por:
                                                             *comprimento vezes altura,
                                                             *dividido por 2
                                                             */
        
        return area;
    }

    //metodo toString
    @Override
    public String toString() {
        return "Triangulo{" + "comprimento=" + comprimento + ", altura=" + altura + '}';
    }
    
    
    
    
}
