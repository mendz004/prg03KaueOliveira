/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author ETM-00168
 */
public class PagamentoDinheiro implements Pagamento{
    //atributos
   private double valor;

  
    public PagamentoDinheiro() {
        this.valor = 0.0;
        
    }
    @Override
    public double calcularTotal() {
        //calcula 10% de desconto do valor total 
        double valorDesconto = (10.0 / 100.0) * this.valor;
        double valorFinal = this.valor - valorDesconto;
      
      return valorFinal;
       
    }

    @Override
    public String imprimirRecibo() {
        
        double valorDesconto = (10.0 / 100.0) * this.valor;
        double valorFinal = this.valor - valorDesconto;
        
        //retorna recibo dinheiro, com valor inicial, o desconto e o valor final
        return "<html>" + "<strong>RECIBO DINHEIRO: </strong>" + 
                "<p>Valor: " + this.getValor() + "R$</p>" +
                "<p>Desconto - " + valorDesconto + "R$</p>"  +
                " Valor Final - " + valorFinal + "R$" + "</html>";
                
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
    

    
    
   
}
