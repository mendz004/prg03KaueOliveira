/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author ETM-00168
 */
public class Quadrado extends Forma2D{
    //atributos
    private double comprimento;
 

    //metodo construtor
    public Quadrado(double comprimento) {
        this.comprimento = comprimento;
        
    }
    
    //metodos especias
    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public double obterArea() {
        
       double area = Math.pow(this.comprimento, 2);/*area do quadrado,
                                                    *é calculado pelo valor do comprimento
                                                    *elevado por 2.
                                                    */
        
        return area; 
    }

    //metodo toString
    @Override
    public String toString() {
        return "Quadrado{" + "comprimento=" + comprimento + '}';
    }
 
 

    
    
   
}
