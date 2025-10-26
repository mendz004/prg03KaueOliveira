/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author ETM-00168
 */
public class main {
    
    public static void main(String[] args) {
        
        //criando o array
        Forma[] formas = new Forma[6];
        //adicionando os objetos de diferentes subclasses
        formas[0] =  new Circulo(5.0);
        formas[1] = new Quadrado(4.0);
        formas[2] = new Triangulo(3.0, 6.0);
        formas[3] = new Esfera(7.0);
        formas[4] = new Cubo(8.0);
        formas[5] = new Piramide(2.0, 3.0, 5.0);
        
        // array para exibir as informações
        for(Forma forma : formas){
             // Se for bidimensional, converta e chame obterArea()
            System.out.println(forma.toString());
             //instanceof para determinar o tipo de cada forma
            if(forma instanceof Forma2D){
                System.out.println("Area: " + ((Forma2D) forma).obterArea());
       
        }else if (forma instanceof Forma3D){
            // Se for tridimensional, converta e chame obterArea() e obterVolume()
                System.out.println("Area: " + ((Forma3D) forma).obterArea());
                System.out.println("Volume: " + ((Forma3D) forma).obterVolume());
        }
            System.out.println();
    }
    }
}