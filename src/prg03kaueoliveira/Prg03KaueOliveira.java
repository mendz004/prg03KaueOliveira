/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prg03kaueoliveira;

import br.com.ifba.atividade07.ContaBanco;



/**
 *
 * @author ETM-00168
 */
public class Prg03KaueOliveira {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ContaBanco cliente01 = new ContaBanco();
       cliente01.numConta = 181795;
          
       
       cliente01.abrirConta("cc", "kaue oliveira");
       cliente01.depositarConta(100);
       cliente01.sacarConta(20);
       cliente01.fecharConta();
       cliente01.statusAtual();
       
       ContaBanco cliente02 = new ContaBanco();
       cliente02.numConta = 3597461;
       
       cliente02.abrirConta("cp", "kelly patricia");
       cliente02.depositarConta(200);
       cliente02.sacarConta(350);
       cliente02.fecharConta();
       cliente02.statusAtual();
       
    }
    
}
