/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author ETM-00168
 */
public class PagamentoPix implements Pagamento{
    //atributos
    private double valor;
    
    public PagamentoPix() {
        this.valor = 0.0;
        
        
    }

    @Override
    public double calcularTotal() {
        /*calcula 2% do valor e o usuario recebe como cashback
         * o valor do cashback desconta no valor do produto
         */
        double cashback = (2.0 / 100) * this.valor;
        double valorFinal = this.valor - cashback;
 
        return valorFinal;
        
    }

    @Override
    public String imprimirRecibo() {
        
        double cashback = (2.0 / 100) * this.valor;
        double valorFinal = this.valor - cashback;
         /*retorna recibo pix, como o valor inicial, o valor do cashback
          *e o valor final descontando o cashback do usuario.
          */
        return "<html>" + "<strong>RECIBO PIX: </strong> "  +
                "<p>Valor - " + this.getValor() + " R$</p>"  +
                "<p>Cashback - " + cashback + " R$</p>" +
                " Valor Final - " + valorFinal + " R$" + "</html>";
        
        
    }
    
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
           
    }

    
    
}
