/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author ETM-00168
 */
public class Piramide extends Forma3D {
    //atributos
    private double comprimento;
    private double altura;
    private double largura;

    //metodo construtor
    public Piramide(double comprimento, double altura, double latgura) {
        
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = latgura;
    }

    //metodos especiais
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

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }
    
   
    @Override
    public double obterArea() {
        
        double areaBase = this.comprimento * this.largura;//calcula base da piramide
        double areaLateral = ((this.comprimento * this.altura) / 2) * 4;//calcula a area de todos os lados
        
        double areaPiramide = areaBase + areaLateral;/*area da piramide,
                                                      *è calculada pela area da base,
                                                      * somado da area dos lados.
                                                      */
        
        return areaPiramide;
    }

    @Override
    public double obterVolume() {
        
        double areaBase = this.comprimento * this.largura;//calcula area da base da piramide
        
        double volumePiramide = (areaBase * this.altura) / 3;/*volume é calculado por:
                                                              *area da base vezes altura,
                                                              *dividido por 3
        */
        
        return volumePiramide;
        
    }

    //metodo toString
    @Override
    public String toString() {
        return "Piramide{" + "comprimento=" + comprimento + ", altura=" + altura + ", largura=" + largura + '}';
    }
    
    
    
}