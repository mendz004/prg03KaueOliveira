/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author ETM-00168
 */
public class Cubo extends Forma3D{
    //atributos
    private double comprimento;

    //metodo costrutor
    public Cubo(double comprimento) {
        this.comprimento = comprimento;
    }
    
    //metodos especiais
    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    
    @Override
    public double obterArea() {
        
        //calcula a base elevado ao expoente 2.
        double resultado = Math.pow(this.comprimento, 2);
        //calcula a area.
        double area = 6 * resultado;
        
        return area;//retorna o valor da area
    }

    @Override
    public double obterVolume() {
        //volume vai ser o valor do comprimento elevamo a 3.
        double volume = Math.pow(this.comprimento, 3);
        
        return volume;//retorna o valor do volume
    }

    //metodo toString
    @Override
    public String toString() {
        return "Cubo{" + "comprimento=" + comprimento + '}';
    }
    
    
    
}
