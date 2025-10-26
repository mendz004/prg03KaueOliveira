/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author ETM-00168
 */
public class Esfera extends Forma3D {
    //atributos
    private double raio;

    //metodo construtor
    public Esfera(double raio) {
        this.raio = raio;
    }

    
    @Override
    public double obterArea() {
        
        double pi = 3.14;//pega o valor de pi
        double r = Math.pow(this.raio, 2);/*variavel R, e calculado por:
                                           * valor do raio elevado a 2
                                           */
        double area = (4 * pi) * r;//area é calculado por 4 vezes pi, vezes R
        
        return area;//retorna o valor da area
    }

    @Override
    public double obterVolume() {
        
        double pi = 3.14;
        double r = Math.pow(this.raio, 3);/*variavel R, e calculado por:
                                           * valor do raio elevado a 3
                                           */
        
        double area = ((4 / 3) * pi) * r;/*area é calculado por 4 dividido por 3,
                                          *vezes valor de pi.
                                          */
        
        return area;
    }
    
    //metodos especiais
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    //metodo toString
    @Override
    public String toString() {
        return "Esfera{" + "raio=" + raio + '}';
    }

   
   
}
