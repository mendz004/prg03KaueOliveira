/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author ETM-00168
 */
public class Circulo extends  Forma2D {
    //atributos
    private double raio;

    //metodo construtor 
    public Circulo(double raio) {
        this.raio = raio;
    }

   //metodos especiais 
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

//metodo obter area
    @Override
    public double obterArea() {
        
        double pi = 3.14;//pega o valor de pi
        double r = Math.pow(this.raio, 2);//variavel R vai receber valor do raio elevado a 2 
        double area = pi * r;//area vai ser o calculo de pi vezes r.
        
        return area;//retorna o valor da area
        
    }

    //metodo construtor
    @Override
    public String toString() {
        return "Circulo{" + "raio=" + raio + '}';
    }
   
    

}
