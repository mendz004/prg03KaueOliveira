/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author ETM-00168
 */
public class PagamentoCartao implements Pagamento {
    //atributos
    private double valor;
    public PagamentoCartao() {
        this.valor = 0.0;
        
    }

    @Override
    public double calcularTotal() {
        //calcula 5% do valor e acrescenta como taxa 
  double taxa = (5.0 / 100) * this.valor;
  double valorFinal = this.valor + taxa;
  
        
        return valorFinal;
        
    }

    @Override
    public String imprimirRecibo() {
        double taxa = (5.0 / 100) * this.valor;
        double valorFinal = this.valor + taxa;
         //retorna o recibo com valor, taxa calculada e o valor final a pagar
        return "<html>" + "<strong>RECIBO CARTAO: </strong>" + 
                "<p>Valor - " + this.getValor() + "R$</p>" +
                "<p>Taxa - " + taxa + "R$</p>" +
                "Valor final - " + valorFinal + "R$" + "</html>";
        
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
    
    
}
