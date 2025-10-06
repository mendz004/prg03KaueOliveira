/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06.view;

/**
 *
 * @author ETM-00168
 */
public class fatorial {
    //cria atributos
    private int  numero = 0;
    private int fatorial = 1;
    private String formula = "";
    
   public void setValor(int n){
        numero = n;
        int f = 1;
        String s = "";
        for(int i = n; i > 1;i--){
            f *= i;
            s += i + " x ";
        }
        s += "1 = ";
        fatorial = f;
        formula = s;
    }
    public int getFatorial() {
        return fatorial;
    }
     public String  getFormula(){
        return formula;
        
    }
}
