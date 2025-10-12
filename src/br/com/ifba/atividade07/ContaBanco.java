/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07;

/**
 *
 * @author ETM-00168
 */
    public class ContaBanco {
    //atributos
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        /*status da conta ja inicializa em true (fechada)
         * e com saldo zerado
         */
        this.status = false;
        this.saldo = 0;
        
    }
    
    public void statusAtual(){
        
        System.out.println("Numero " + this.getNumConta());
        System.out.println("Nome " + this.getDonoConta());
        System.out.println("Tipo " + this.getTipoConta());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status " + this.isStatus());
        System.out.println("========================");
    }
    
     //status da conta ficara true(aberta) e com saldo disponivel
public void abrirConta(String tipo, String nome){
  
    this.setStatus(true); 
    this.setTipoConta(tipo);
    this.setDonoConta(nome);
     
    /* caso tipo de conta for "cp"
     * recebe um saldo de 150.
     */
    if("cp".equals(tipo)){
      this.setSaldo(150);
     /* caso tipo de conta for "cc"
      * recebe um saldo de 50
      */ 
    }else if("cc".equals(tipo)){
        this.setSaldo(50);
    }
    
}

public void fecharConta(){
   /*para fechar a conta 
 *usuario devera fazer um saque primeiro*/
    if(this.getSaldo() != 0){
        System.out.println("Nao e possivel fechar conta com saldo disponivel");
    }
    else {
        this.setStatus(false);
        this.setSaldo(0);
    }
}

public void depositarConta(float valorDeposito){
    
    //verifica se a conta esta aberta ou fechada
    if(this.isStatus() == false){
        System.out.println("Conta fechada, nao e posivel fazer deposito.");
    }else if(this.isStatus() == true){
   //acrescenta o valor que o usuario escolher
   this.saldo += valorDeposito;
    }
}

public void sacarConta(float valorSaque){
    
    if(this.isStatus() == false){
        System.out.println("Conta fechada, nao e posivel fazer saque.");
    }else if(this.isStatus() == true){
        

/*se o valor que deseja sacar for maior que o saldo atual
 * encerra o programa
 */
   if(valorSaque > this.saldo){
       System.out.println("Valor nao pode ser maior que o saldo atual");
       
//caso for menor ele tira do saldo atual
   }else{
        this.saldo -= valorSaque;
   }
}
}
//usuario devera informar qual tipo de conta
public void pagarMensal(String tipo){
    
   this.setTipoConta(tipo);
  //se a conta for poupanca desconta 20,00
   if("cp".equals(tipo)){
     this.saldo -= 20;  
     //se a conta for corrente desconta 12,00
   }else if("cc".equals(tipo)){
       this.saldo -= 12;
   }
    
    
}
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
   
    
}
